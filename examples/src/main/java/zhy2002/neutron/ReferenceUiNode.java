package zhy2002.neutron;

import jsinterop.annotations.JsMethod;
import zhy2002.neutron.data.NodeReference;
import zhy2002.neutron.util.NeutronEventSubjects;

import javax.inject.Inject;
import javax.validation.constraints.NotNull;
import java.util.List;

public abstract class ReferenceUiNode<P extends ParentUiNode<?>> extends LeafUiNode<P, NodeReference> {

    protected ReferenceUiNode(@NotNull P parent, @NotNull String name) {
        super(parent, name);
    }

    @JsMethod
    public NodeReference getNodeReference() {
        return getStateValue(NeutronEventSubjects.NODE_REFERENCE);
    }

    @JsMethod
    public void setNodeReference(NodeReference nodeReference) {
        setStateValue(NeutronEventSubjects.NODE_REFERENCE, NodeReference.class, nodeReference);
    }

    @JsMethod
    public UiNode<?> getReferencedNode() {
        return getContext().getNodeFinder().findNodeByReference(getNodeReference());
    }

    @Inject
    ReferenceUiNodeRuleProvider ruleProvider;

    @Override
    protected void createRules(List<UiNodeRule<?>> createdRules) {
        super.createRules(createdRules);

        createdRules.addAll(ruleProvider.createRules(this));
    }

}
