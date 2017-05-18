package zhy2002.examples.lodgement.gen.node;

import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import jsinterop.annotations.*;
import java.math.BigDecimal;
import javax.inject.*;
import javax.validation.constraints.NotNull;
import java.util.*;
import zhy2002.examples.lodgement.gen.rule.*;
import zhy2002.examples.lodgement.gen.di.*;
import java.util.List;

public class CreditCardNode extends ObjectUiNode<CreditCardListNode> {

    private CreditCardNodeChildFactory childFactory;

    @Inject
    void receiveNodeProvider(CreditCardNodeChildProvider provider) {
        childFactory = provider.createFactory(this);
    }

    @Override
    public final Class<?> getConcreteClass() {
        return CreditCardNode.class;
    }

    private CreditCardNodeComponent component;

    @Inject
    void createComponent(CreditCardNodeComponent.Builder builder) {
        this.component = builder.setCreditCardNodeModule(new CreditCardNodeModule(this)).build();
    }

    private RuleProvider<CreditCardNode> getRuleProvider() {
        return component.getCreditCardNodeRuleProvider();
    }

    @Override
    protected void initializeState() {
        getRuleProvider().initializeState(this);
    }

    @Override
    protected void createRules(List<UiNodeRule<?>> createdRules) {
        getRuleProvider().createRules(createdRules);
    }


    public CreditCardNode(@NotNull CreditCardListNode parent, String name) {
        super(parent, name);
    }

    @JsMethod
    public CreditCardTypeNode getCreditCardTypeNode() {
        return (CreditCardTypeNode)getChildByName("creditCardTypeNode");
    }

    @JsMethod
    public CreditCardAmountOwingNode getCreditCardAmountOwingNode() {
        return (CreditCardAmountOwingNode)getChildByName("creditCardAmountOwingNode");
    }

    @JsMethod
    public CreditCardLimitAmountNode getCreditCardLimitAmountNode() {
        return (CreditCardLimitAmountNode)getChildByName("creditCardLimitAmountNode");
    }

    @JsMethod
    public CreditCardMonthlyRepaymentNode getCreditCardMonthlyRepaymentNode() {
        return (CreditCardMonthlyRepaymentNode)getChildByName("creditCardMonthlyRepaymentNode");
    }

    @JsMethod
    public CreditCardClearingFlagNode getCreditCardClearingFlagNode() {
        return (CreditCardClearingFlagNode)getChildByName("creditCardClearingFlagNode");
    }

    @JsMethod
    public CreditCardBreakCostNode getCreditCardBreakCostNode() {
        return (CreditCardBreakCostNode)getChildByName("creditCardBreakCostNode");
    }

    @JsMethod
    public CreditCardLenderNameNode getCreditCardLenderNameNode() {
        return (CreditCardLenderNameNode)getChildByName("creditCardLenderNameNode");
    }

    @JsMethod
    public CreditCardOwnershipListNode getOwnershipListNode() {
        return (CreditCardOwnershipListNode)getChildByName("ownershipListNode");
    }

    @Override
    protected List<UiNode<?>> createChildren() {
        List<UiNode<?>> children = super.createChildren();
        setChildNodeIdentity("creditCardTypeNode");
        children.add(childFactory.createCreditCardTypeNode());
        setChildNodeIdentity("creditCardAmountOwingNode");
        children.add(childFactory.createCreditCardAmountOwingNode());
        setChildNodeIdentity("creditCardLimitAmountNode");
        children.add(childFactory.createCreditCardLimitAmountNode());
        setChildNodeIdentity("creditCardMonthlyRepaymentNode");
        children.add(childFactory.createCreditCardMonthlyRepaymentNode());
        setChildNodeIdentity("creditCardClearingFlagNode");
        children.add(childFactory.createCreditCardClearingFlagNode());
        setChildNodeIdentity("creditCardBreakCostNode");
        children.add(childFactory.createCreditCardBreakCostNode());
        setChildNodeIdentity("creditCardLenderNameNode");
        children.add(childFactory.createCreditCardLenderNameNode());
        setChildNodeIdentity("ownershipListNode");
        children.add(childFactory.createOwnershipListNode());
        setChildNodeIdentity(null);
        return children;
    }

}
