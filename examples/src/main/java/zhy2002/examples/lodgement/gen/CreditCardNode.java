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
import zhy2002.examples.lodgement.gen.rule.*;
import zhy2002.examples.lodgement.gen.di.*;

public class CreditCardNode extends ObjectUiNode<CreditCardListNode> {

    private CreditCardTypeNode creditCardTypeNode;
    private CreditCardAmountOwingNode creditCardAmountOwingNode;
    private CreditCardLimitAmountNode creditCardLimitAmountNode;
    private CreditCardMonthlyRepaymentNode creditCardMonthlyRepaymentNode;
    private CreditCardClearingFlagNode creditCardClearingFlagNode;
    private CreditCardBreakCostNode creditCardBreakCostNode;
    private CreditCardLenderNameNode creditCardLenderNameNode;

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

    @Override
    protected CreditCardNodeRuleProvider getRuleProvider() {
        return component.getCreditCardNodeRuleProvider();
    }

    public CreditCardNode(CreditCardListNode parent, String name) {
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
        return children;
    }

}
