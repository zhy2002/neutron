package zhy2002.neutron;

import jsinterop.annotations.JsType;

import javax.validation.constraints.NotNull;

@JsType
public class BooleanUiNode<P extends ParentUiNode<?>> extends LeafUiNode<P, Boolean> {

    protected BooleanUiNode(@NotNull P parent, @NotNull String name) {
        super(parent, name);

        init();
    }

    protected BooleanUiNode(@NotNull AbstractUiNodeContext context) {
        super(context);

        init();
    }

    private void init() {
        setValue(false);
    }

    @Override
    public final Boolean getValue() {
        return super.getValue();
    }

    @Override
    public final void setValue(Boolean value) {
        setValue(Boolean.class, value);
    }
}
