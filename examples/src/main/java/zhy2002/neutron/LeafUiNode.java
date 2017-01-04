package zhy2002.neutron;

import jsinterop.annotations.JsMethod;
import zhy2002.neutron.util.NeutronEventSubjects;

import javax.validation.constraints.NotNull;
import java.util.List;

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
        super.setStateValueInternal(NeutronEventSubjects.VALUE, value);
    }

    protected T getValueInternal() {
        return super.getStateValueInternal(NeutronEventSubjects.VALUE);
    }

    @JsMethod
    public T getValue() {
        return getStateValue(NeutronEventSubjects.VALUE);
    }

    protected void setValue(Class<T> valueClass, T value) {
        setStateValue(NeutronEventSubjects.VALUE, valueClass, value);
    }

    public abstract void setValue(T value);

    public void setRequired(Boolean required) {
        this.setStateValue(NeutronEventSubjects.REQUIRED, Boolean.class, required);
    }

    @JsMethod
    public Boolean getRequired() {
        Boolean result = getStateValue(NeutronEventSubjects.REQUIRED);
        return result == null ? Boolean.FALSE : result;
    }

    public String getRequiredMessage() {
        return getStateValue(NeutronEventSubjects.REQUIRED_MESSAGE, "Value is required");
    }

    public void setRequiredMessage(String message) {
        setStateValue(NeutronEventSubjects.REQUIRED_MESSAGE, String.class, message);
    }

    @JsMethod
    public boolean hasValue() {
        return getValue() != null;
    }

    @JsMethod
    public T getCopyOfValue() {
        throw new NotImplementedException();
    }

    public abstract Class<T> getValueClass();

    @Override
    protected void createRules(List<UiNodeRule<?>> createdRules) {
        super.createRules(createdRules);

        UiNodeContext<?> context = getContext();
        createdRules.add(context.createUiNodeRule(LeafValueRequiredValidationRule.class, this));
    }
}
