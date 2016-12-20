package zhy2002.neutron;

import jsinterop.annotations.JsMethod;

import javax.validation.constraints.NotNull;

/**
 * A UiNode which cannot have children.
 */
public abstract class LeafUiNode<P extends ParentUiNode<?>, T> extends UiNode<P> {

    protected LeafUiNode(@NotNull P parent, @NotNull String name) {
        super(parent, name);

        setRequired(false);
    }

    protected LeafUiNode(@NotNull AbstractUiNodeContext context) {
        super(context);

        setRequired(false);
    }

    protected void setValueInternal(T value) {
        super.setStateValueInternal(PredefinedEventSubjects.VALUE, value);
    }

    protected T getValueInternal() {
        return super.getStateValueInternal(PredefinedEventSubjects.VALUE);
    }

    @JsMethod
    public T getValue() {
        return getStateValue(PredefinedEventSubjects.VALUE);
    }

    protected void setValue(Class<T> valueClass, T value) {
        setStateValue(PredefinedEventSubjects.VALUE, valueClass, value);
    }

    public abstract void setValue(T value);

    public void setRequired(Boolean required) {
        this.setStateValue(PredefinedEventSubjects.REQUIRED, Boolean.class, required);
    }

    @JsMethod
    public Boolean getRequired() {
        Boolean result = getStateValue(PredefinedEventSubjects.REQUIRED);
        return result == null ? Boolean.FALSE : result;
    }

    public String getRequiredMessage() {
        return getStateValue(PredefinedEventSubjects.REQUIRED_MESSAGE);
    }

    public void setRequiredMessage(String message) {
        setStateValue(PredefinedEventSubjects.REQUIRED_MESSAGE, String.class, message);
    }

    public boolean hasValue() {
        return getValue() != null;
    }


}
