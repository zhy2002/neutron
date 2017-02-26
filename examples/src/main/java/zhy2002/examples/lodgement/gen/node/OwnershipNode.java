package zhy2002.examples.lodgement.gen.node;

import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import jsinterop.annotations.*;
import javax.inject.*;
import javax.validation.constraints.NotNull;
import java.util.*;
import zhy2002.examples.lodgement.gen.rule.*;
import zhy2002.examples.lodgement.gen.di.*;


public class OwnershipNode extends ObjectUiNode<OwnershipListNode<?>> {

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

    private OwnershipNodeComponent component;

    @Inject
    void createComponent(OwnershipNodeComponent.Builder builder) {
        this.component = builder.setOwnershipNodeModule(new OwnershipNodeModule(this)).build();
    }

    @Override
    protected OwnershipNodeRuleProvider getRuleProvider() {
        return component.getOwnershipNodeRuleProvider();
    }

    public OwnershipNode(@NotNull OwnershipListNode parent, String name) {
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
