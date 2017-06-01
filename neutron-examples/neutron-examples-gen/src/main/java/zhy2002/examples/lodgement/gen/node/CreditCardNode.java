package zhy2002.examples.lodgement.gen.node;

import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import zhy2002.examples.lodgement.gen.di.CreditCardNodeComponent;
import jsinterop.annotations.*;
import java.math.BigDecimal;
import javax.inject.*;
import zhy2002.neutron.di.*;
import java.util.*;
import zhy2002.examples.lodgement.gen.rule.*;
import zhy2002.examples.lodgement.gen.di.*;
import java.util.List;

public class CreditCardNode extends ObjectUiNode<CreditCardListNode> {

    @Inject
    public CreditCardNode(@Owner CreditCardListNode parent, @ChildName String name) {
        super(parent, name);
    }

    @Override
    public final Class<?> getConcreteClass() {
    return CreditCardNode.class;
    }

    protected final CreditCardNodeComponent getComponent() {
        return component;
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

    //region children getters

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

    //endregion
    @Override
    protected List<UiNode<?>> createChildren() {
        List<UiNode<?>> children = super.createChildren();
        setChildNodeIdentity("creditCardTypeNode");
        children.add(getComponent().createCreditCardTypeNode());
        setChildNodeIdentity("creditCardAmountOwingNode");
        children.add(getComponent().createCreditCardAmountOwingNode());
        setChildNodeIdentity("creditCardLimitAmountNode");
        children.add(getComponent().createCreditCardLimitAmountNode());
        setChildNodeIdentity("creditCardMonthlyRepaymentNode");
        children.add(getComponent().createCreditCardMonthlyRepaymentNode());
        setChildNodeIdentity("creditCardClearingFlagNode");
        children.add(getComponent().createCreditCardClearingFlagNode());
        setChildNodeIdentity("creditCardBreakCostNode");
        children.add(getComponent().createCreditCardBreakCostNode());
        setChildNodeIdentity("creditCardLenderNameNode");
        children.add(getComponent().createCreditCardLenderNameNode());
        setChildNodeIdentity("ownershipListNode");
        children.add(getComponent().createOwnershipListNode());
        setChildNodeIdentity(null);
        return children;
    }

}
