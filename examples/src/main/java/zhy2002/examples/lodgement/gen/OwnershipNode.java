package zhy2002.examples.lodgement.gen;

import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import zhy2002.neutron.data.*;
import zhy2002.neutron.util.*;
import jsinterop.annotations.*;
import javax.inject.*;
import javax.validation.constraints.NotNull;
import java.util.*;
import java.math.*;
import zhy2002.examples.lodgement.data.*;

public class OwnershipNode extends ObjectUiNode<OwnershipListNode<?>>
{
    private ApplicantReferenceNode applicantReferenceNode;
    private OwnershipPercentageNode ownershipPercentageNode;
    private AverageFlagNode averageFlagNode;

    private OwnershipNodeChildFactory childFactory;

    @Inject
    void receiveNodeProvider(OwnershipNodeChildProvider provider) {
        childFactory = provider.createFactory(this);
    }

    @Override
    public final Class<?> getConcreteClass() {
        return OwnershipNode.class;
    }

    public OwnershipNode(OwnershipListNode parent, String name) {
        super(parent, name);
    }

    @JsMethod
    public ApplicantReferenceNode getApplicantReferenceNode() {
        return applicantReferenceNode;
    }

    @JsMethod
    public OwnershipPercentageNode getOwnershipPercentageNode() {
        return ownershipPercentageNode;
    }

    @JsMethod
    public AverageFlagNode getAverageFlagNode() {
        return averageFlagNode;
    }

    @Override
    protected List<UiNode<?>> createChildren() {
        List<UiNode<?>> children = super.createChildren();
        applicantReferenceNode = childFactory.createApplicantReferenceNode();
        children.add(applicantReferenceNode);
        ownershipPercentageNode = childFactory.createOwnershipPercentageNode();
        children.add(ownershipPercentageNode);
        averageFlagNode = childFactory.createAverageFlagNode();
        children.add(averageFlagNode);
        return children;
    }

}
