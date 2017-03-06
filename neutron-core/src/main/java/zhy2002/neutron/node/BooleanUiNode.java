package zhy2002.neutron.node;

import jsinterop.annotations.JsType;
import zhy2002.neutron.LeafUiNode;
import zhy2002.neutron.ParentUiNode;
import zhy2002.neutron.UiNodeRule;
import zhy2002.neutron.util.NeutronEventSubjects;

import javax.inject.Inject;
import javax.validation.constraints.NotNull;
import java.util.List;

@JsType
public abstract class BooleanUiNode<P extends ParentUiNode<?>> extends LeafUiNode<P, Boolean> {

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

    public Boolean getFixedValue() {
        return getStateValue(NeutronEventSubjects.FIXED_VALUE);
    }

    public void setFixedValue(Boolean fixedValue) {
        setStateValue(NeutronEventSubjects.FIXED_VALUE, Boolean.class, fixedValue);
    }

    @Override
    public Class<Boolean> getValueClass() {
        return Boolean.class;
    }

}
