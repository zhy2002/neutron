package zhy2002.neutron;

import javax.validation.constraints.NotNull;

/**
 * A UiNode which cannot have children.
 */
public abstract class LeafUiNode<P extends ParentUiNode<?>, T> extends UiNode<P> {

    protected LeafUiNode(@NotNull P parent, @NotNull String name) {
        super(parent, name);
    }

    protected LeafUiNode(@NotNull UiNodeContextImpl context) {
        super(context);
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

}
