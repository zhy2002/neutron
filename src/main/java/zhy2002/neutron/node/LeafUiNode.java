package zhy2002.neutron.node;

import jsinterop.annotations.JsMethod;
import zhy2002.neutron.UiNodeContext;

import javax.validation.constraints.NotNull;

/**
 * A UiNode which cannot have children.
 */
public abstract class LeafUiNode<P extends ParentUiNode<?>, T> extends UiNode<P> {

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

    @JsMethod
    public T getValue() {
        return getStateValue(DefaultUiNodeStateKeys.VALUE);
    }

    public T getValue(T defaultValue) {
        T result = getValue();
        return result == null ? defaultValue : result;
    }

    @JsMethod
    public void setValue(T value) {
        setStateValue(DefaultUiNodeStateKeys.VALUE, value);
    }

}
