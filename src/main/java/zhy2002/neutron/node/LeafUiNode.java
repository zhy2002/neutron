package zhy2002.neutron.node;

import zhy2002.neutron.UiNodeContext;

import javax.validation.constraints.NotNull;
import java.io.Serializable;

/**
 * A UiNode which cannot have children.
 */
public abstract class LeafUiNode<P extends ParentUiNode<?>, T extends Serializable/*todo Or json serializable */> extends UiNode<P> {

    protected LeafUiNode(@NotNull P parent, @NotNull String name) {
        super(parent, name);
    }

    protected LeafUiNode(@NotNull UiNodeContext context) {
        super(context);
    }

    protected void setValueInternal(T value) {
        super.setStateValueInternal(DefaultUiNodeStateKeys.VALUE, value);
    }

    protected T getValueInternal() {
        return super.getStateValueInternal(DefaultUiNodeStateKeys.VALUE);
    }

    public T getValue() {
        return getStateValue(DefaultUiNodeStateKeys.VALUE);
    }

    public T getValue(T defaultValue) {
        T result = getValue();
        return result == null ? defaultValue : result;
    }

    public void setValue(T value) {
        setStateValue(DefaultUiNodeStateKeys.VALUE, value);
    }

}
