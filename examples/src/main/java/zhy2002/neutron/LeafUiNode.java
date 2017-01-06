package zhy2002.neutron;

import jsinterop.annotations.JsMethod;
import zhy2002.neutron.rule.LeafValueRequiredValidationRule;
import zhy2002.neutron.util.NeutronEventSubjects;

import javax.validation.constraints.NotNull;
import java.util.List;

/**
 * A UiNode which cannot have children.
 */
public abstract class LeafUiNode<P extends ParentUiNode<?>, T> extends UiNode<P> {

    protected LeafUiNode(@NotNull P parent, @NotNull String name) {
        super(parent, name);

        init();
    }

    /**
     * Changes made in the init method will become a part of the
     * pre-state.
     */
    private void init() {
        setRequired(false);
    }

    @JsMethod
    public T getValue() {
        return getStateValue(NeutronEventSubjects.VALUE);
    }

    protected final void setValue(Class<T> valueClass, T value) {
        setStateValue(NeutronEventSubjects.VALUE, valueClass, value);
    }

    public abstract void setValue(T value);

    @Override
    public boolean hasValue() {
        return getValue() != null;
    }

    @Override
    protected void setStateValueInternal(String key, Object value) {
        super.setStateValueInternal(key, value);
        if(NeutronEventSubjects.VALUE.equals(key)) {
            setHasValue(hasValue());
        }
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
