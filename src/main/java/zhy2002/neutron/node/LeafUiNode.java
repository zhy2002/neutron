package zhy2002.neutron.node;

import zhy2002.neutron.UiNodeContext;

import javax.validation.constraints.NotNull;
import java.io.Serializable;

/**
 * A UiNode which cannot have children.
 */
public abstract class LeafUiNode<P extends ParentUiNode<?>, T extends Serializable/*todo Or json serializable */> extends UiNode<P> {

    public static final String VALUE_KEY = "value";

    protected LeafUiNode(@NotNull P parent, @NotNull String name) {
        super(parent, name);
    }

    protected LeafUiNode(@NotNull UiNodeContext context) {
        super(context);
    }

    protected void setValueInternal(T value) {
        super.setStateValueInternal(VALUE_KEY, value);
    }

    protected T getValueInternal() {
        return super.getStateValueInternal(VALUE_KEY);
    }

    public T getValue() {
        return getValueInternal();
    }

    public T getValue(T defaultValue) {
        T result = getValue();
        return result == null ? defaultValue : result;
    }

    public void setValue(T value) {
        setValueInternal(value);
    }
}
