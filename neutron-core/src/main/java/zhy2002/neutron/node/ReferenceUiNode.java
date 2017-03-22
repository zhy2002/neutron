package zhy2002.neutron.node;

import jsinterop.annotations.JsMethod;
import zhy2002.neutron.LeafUiNode;
import zhy2002.neutron.ParentUiNode;
import zhy2002.neutron.UiNode;

import javax.validation.constraints.NotNull;

import static zhy2002.neutron.util.NeutronEventSubjects.REMOVE_EMPTY;

public abstract class ReferenceUiNode<P extends ParentUiNode<?>> extends LeafUiNode<P, String> {

    protected ReferenceUiNode(@NotNull P parent, @NotNull String name) {
        super(parent, name);
    }

    @JsMethod
    public UiNode<?> getReferencedNode() {
        return getContext().getNodeFinder().findNodeByPath(getValue());
    }

    @Override
    public Class<String> getValueClass() {
        return String.class;
    }

    @JsMethod
    @Override
    public final String getValue() {
        return super.getValue();
    }

    @JsMethod
    @Override
    public final void setValue(String value) {
        super.setValue(String.class, value);
    }

    public final boolean isRemoveEmpty() {
        Boolean result = getStateValueInternal(REMOVE_EMPTY);
        return result != null && result;
    }

    public final void setRemoveEmpty(boolean value) {
        setStateValueInternal(REMOVE_EMPTY, value);
    }

}
