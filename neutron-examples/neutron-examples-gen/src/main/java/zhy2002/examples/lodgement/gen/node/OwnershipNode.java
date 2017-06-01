package zhy2002.examples.lodgement.gen.node;

import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import zhy2002.examples.lodgement.gen.di.OwnershipNodeComponent;
import jsinterop.annotations.*;
import java.math.BigDecimal;
import javax.inject.*;
import zhy2002.neutron.di.*;
import java.util.*;
import zhy2002.examples.lodgement.gen.rule.*;
import zhy2002.examples.lodgement.gen.di.*;
import java.util.List;


public class OwnershipNode extends ObjectUiNode<OwnershipListNode<?>> {

    @Inject
    public OwnershipNode(@Owner OwnershipListNode<?> parent) {
        super(parent);
    }

    @Override
    public final Class<?> getConcreteClass() {
    return OwnershipNode.class;
    }

    protected final OwnershipNodeComponent getComponent() {
        return component;
    }


    private OwnershipNodeComponent component;

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

    //region children getters

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

    //endregion
    @Override
    protected List<UiNode<?>> createChildren() {
        List<UiNode<?>> children = super.createChildren();
        setChildNodeIdentity("applicantReferenceNode");
        children.add(getComponent().createApplicantReferenceNode());
        setChildNodeIdentity("ownershipPercentageNode");
        children.add(getComponent().createOwnershipPercentageNode());
        setChildNodeIdentity("averageFlagNode");
        children.add(getComponent().createAverageFlagNode());
        setChildNodeIdentity(null);
        return children;
    }

}
