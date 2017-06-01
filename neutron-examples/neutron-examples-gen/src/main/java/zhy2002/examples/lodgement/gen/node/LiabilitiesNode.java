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

public class LiabilitiesNode extends ObjectUiNode<FinancialPositionNode> {

    private LiabilitiesNodeChildFactory childFactory;
    private LiabilitiesNodeComponent component;

    @Inject
    public LiabilitiesNode(@Owner FinancialPositionNode parent, @ChildName String name) {
        super(parent, name);
    }

    @Override
    public final Class<?> getConcreteClass() {
    return LiabilitiesNode.class;
    }

    @Inject
    void receiveNodeProvider(LiabilitiesNodeChildProvider provider) {
        childFactory = provider.createFactory(this);
    }

    @Inject
    void createComponent(LiabilitiesNodeComponent.Builder builder) {
        this.component = builder.setLiabilitiesNodeModule(new LiabilitiesNodeModule(this)).build();
    }

    private RuleProvider<LiabilitiesNode> getRuleProvider() {
        return component.getLiabilitiesNodeRuleProvider();
    }

    @Override
    protected void initializeState() {
        getRuleProvider().initializeState(this);
        getInstanceRuleProvider().initializeState(this);
    }

    @Override
    protected void createRules(List<UiNodeRule<?>> createdRules) {
        getRuleProvider().createRules(createdRules);
        getInstanceRuleProvider().createRules(createdRules);
    }

    private RuleProvider<LiabilitiesNode> getInstanceRuleProvider() {
        return component.getInstanceRuleProviders().get(this.getName());
    }

    @JsMethod
    public CreditCardListNode getCreditCardListNode() {
        return (CreditCardListNode)getChildByName("creditCardListNode");
    }

    @JsMethod
    public LoanListNode getLoanListNode() {
        return (LoanListNode)getChildByName("loanListNode");
    }

    @JsMethod
    public OtherLiabilityListNode getOtherLiabilityListNode() {
        return (OtherLiabilityListNode)getChildByName("otherLiabilityListNode");
    }

    @Override
    protected List<UiNode<?>> createChildren() {
        List<UiNode<?>> children = super.createChildren();
        setChildNodeIdentity("creditCardListNode");
        children.add(childFactory.createCreditCardListNode());
        setChildNodeIdentity("loanListNode");
        children.add(childFactory.createLoanListNode());
        setChildNodeIdentity("otherLiabilityListNode");
        children.add(childFactory.createOtherLiabilityListNode());
        setChildNodeIdentity(null);
        return children;
    }

}
