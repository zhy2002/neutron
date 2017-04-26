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

    private CreditCardTypeNode creditCardTypeNode;
    private CreditCardAmountOwingNode creditCardAmountOwingNode;
    private CreditCardLimitAmountNode creditCardLimitAmountNode;
    private CreditCardMonthlyRepaymentNode creditCardMonthlyRepaymentNode;
    private CreditCardClearingFlagNode creditCardClearingFlagNode;
    private CreditCardBreakCostNode creditCardBreakCostNode;
    private CreditCardLenderNameNode creditCardLenderNameNode;
    private CreditCardOwnershipListNode ownershipListNode;

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
        return creditCardTypeNode;
    }

    @JsMethod
    public CreditCardAmountOwingNode getCreditCardAmountOwingNode() {
        return creditCardAmountOwingNode;
    }

    @JsMethod
    public CreditCardLimitAmountNode getCreditCardLimitAmountNode() {
        return creditCardLimitAmountNode;
    }

    @JsMethod
    public CreditCardMonthlyRepaymentNode getCreditCardMonthlyRepaymentNode() {
        return creditCardMonthlyRepaymentNode;
    }

    @JsMethod
    public CreditCardClearingFlagNode getCreditCardClearingFlagNode() {
        return creditCardClearingFlagNode;
    }

    @JsMethod
    public CreditCardBreakCostNode getCreditCardBreakCostNode() {
        return creditCardBreakCostNode;
    }

    @JsMethod
    public CreditCardLenderNameNode getCreditCardLenderNameNode() {
        return creditCardLenderNameNode;
    }

    @JsMethod
    public CreditCardOwnershipListNode getOwnershipListNode() {
        return ownershipListNode;
    }

    @Override
    protected List<UiNode<?>> createChildren() {
        List<UiNode<?>> children = super.createChildren();
        creditCardTypeNode = childFactory.createCreditCardTypeNode();
        children.add(creditCardTypeNode);
        creditCardAmountOwingNode = childFactory.createCreditCardAmountOwingNode();
        children.add(creditCardAmountOwingNode);
        creditCardLimitAmountNode = childFactory.createCreditCardLimitAmountNode();
        children.add(creditCardLimitAmountNode);
        creditCardMonthlyRepaymentNode = childFactory.createCreditCardMonthlyRepaymentNode();
        children.add(creditCardMonthlyRepaymentNode);
        creditCardClearingFlagNode = childFactory.createCreditCardClearingFlagNode();
        children.add(creditCardClearingFlagNode);
        creditCardBreakCostNode = childFactory.createCreditCardBreakCostNode();
        children.add(creditCardBreakCostNode);
        creditCardLenderNameNode = childFactory.createCreditCardLenderNameNode();
        children.add(creditCardLenderNameNode);
        ownershipListNode = childFactory.createOwnershipListNode();
        children.add(ownershipListNode);
        return children;
    }

}
