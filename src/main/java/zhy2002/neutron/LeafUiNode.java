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

    protected LeafUiNode(@NotNull UiNodeContextImpl context) {
        super(context);

        setRequired(false);
    }

    protected void setValueInternal(T value) {
        super.setStateValueInternal(PredefinedUiNodeStateKeys.VALUE, value);
    }

    protected T getValueInternal() {
        return super.getStateValueInternal(PredefinedUiNodeStateKeys.VALUE);
    }

    public T getValue() {
        return getStateValue(PredefinedUiNodeStateKeys.VALUE);
    }

    protected void setValue(Class<T> valueClass, T value) {
        setStateValue(PredefinedUiNodeStateKeys.VALUE, valueClass, value);
    }

    public abstract void setValue(T value);

    public void setRequired(Boolean required) {
        this.setStateValue(PredefinedUiNodeStateKeys.REQUIRED, Boolean.class, required);
    }

    @JsMethod
    public Boolean getRequired() {
        return getStateValue(PredefinedUiNodeStateKeys.REQUIRED);
    }


}
