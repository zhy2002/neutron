package zhy2002.examples.lodgement.gen.node;

import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import jsinterop.annotations.*;
import java.math.BigDecimal;
import javax.inject.*;
import zhy2002.neutron.di.*;
import java.util.*;
import zhy2002.examples.lodgement.gen.rule.*;
import zhy2002.examples.lodgement.gen.di.*;
import java.util.List;

public class OwnershipNode extends ObjectUiNode<OwnershipListNode<?>> {

    private OwnershipNodeChildFactory childFactory;
    private OwnershipNodeComponent component;

    @Inject
    public OwnershipNode(@Owner OwnershipListNode<?> parent, @ChildName String name) {
        super(parent, name);
    }

    @Override
    public final Class<?> getConcreteClass() {
    return OwnershipNode.class;
    }

    @Inject
    void receiveNodeProvider(OwnershipNodeChildProvider provider) {
        childFactory = provider.createFactory(this);
    }

    @Inject
    void createComponent(OwnershipNodeComponent.Builder builder) {
        this.component = builder.setOwnershipNodeModule(new OwnershipNodeModule(this)).build();
    }

    private RuleProvider<OwnershipNode> getRuleProvider() {
        return component.getOwnershipNodeRuleProvider();
    }

    @Override
    protected void initializeState() {
        getRuleProvider().initializeState(this);
    }

    @Override
    protected void createRules(List<UiNodeRule<?>> createdRules) {
        getRuleProvider().createRules(createdRules);
    }

    @JsMethod
    public ApplicantReferenceNode getApplicantReferenceNode() {
        return (ApplicantReferenceNode)getChildByName("applicantReferenceNode");
    }

    @JsMethod
    public OwnershipPercentageNode getOwnershipPercentageNode() {
        return (OwnershipPercentageNode)getChildByName("ownershipPercentageNode");
    }

    @JsMethod
    public AverageFlagNode getAverageFlagNode() {
        return (AverageFlagNode)getChildByName("averageFlagNode");
    }

    @Override
    protected List<UiNode<?>> createChildren() {
        List<UiNode<?>> children = super.createChildren();
        setChildNodeIdentity("applicantReferenceNode");
        children.add(childFactory.createApplicantReferenceNode());
        setChildNodeIdentity("ownershipPercentageNode");
        children.add(childFactory.createOwnershipPercentageNode());
        setChildNodeIdentity("averageFlagNode");
        children.add(childFactory.createAverageFlagNode());
        setChildNodeIdentity(null);
        return children;
    }

}
