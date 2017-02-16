package zhy2002.neutron;

import zhy2002.neutron.data.NodeReference;
import zhy2002.neutron.util.NeutronEventSubjects;

import javax.validation.constraints.NotNull;

public abstract class ReferenceObjectUiNode<R extends UiNode<?>, P extends ParentUiNode<?>> extends ObjectUiNode<P> {

    private R referencedNode;

    protected ReferenceObjectUiNode(@NotNull P parent, @NotNull String name) {
        super(parent, name);
    }

    public NodeReference getNodeReference() {
        return getStateValue(NeutronEventSubjects.NODE_REFERENCE);
    }

    public void setNodeReference(NodeReference nodeReference) {
        setStateValue(NeutronEventSubjects.NODE_REFERENCE, NodeReference.class, nodeReference);
    }

    public R getReferencedNode() {
        return referencedNode;
    }

    public void setReferencedNode(R referencedNode) {
        this.referencedNode = referencedNode;
    }
}
