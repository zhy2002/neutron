package zhy2002.neutron.node;

import jsinterop.annotations.JsType;
import zhy2002.neutron.LeafUiNode;
import zhy2002.neutron.ParentUiNode;

import javax.validation.constraints.NotNull;

@JsType
public class BooleanUiNode<P extends ParentUiNode<?>> extends LeafUiNode<P, Boolean> {

    protected BooleanUiNode(@NotNull P parent, @NotNull String name) {
        super(parent, name);

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

    @Override
    public Class<Boolean> getValueClass() {
        return Boolean.class;
    }
}
