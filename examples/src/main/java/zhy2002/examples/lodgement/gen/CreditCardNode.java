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

public class CreditCardNode extends ObjectUiNode<CreditCardListNode>
{
    private CreditCardTypeNode creditCardTypeNode;
    private CreditCardAmountOwingNode creditCardAmountOwingNode;
    private CreditCardLimitAmount creditCardLimitAmount;
    private CreditCardMonthlyRepayment creditCardMonthlyRepayment;
    private CreditCardClearingFlagNode creditCardClearingFlagNode;
    private CreditCardBreakCostNode creditCardBreakCostNode;
    private CreditCardLenderNameNode creditCardLenderNameNode;

    private CreditCardNodeChildFactory childFactory;

    @Inject
    void receiveProviders(CreditCardNodeChildProvider provider) {
        childFactory = provider.createFactory(this);
    }

    @Inject
    void receiveClassRegistry(ClassRegistryImpl classRegistry) {
        UiNodeConfig<CreditCardNode> config = classRegistry.getUiNodeConfig(CreditCardNode.class, getName());
        if (config != null) {
            this.setStatusListener(new ConfigBindingNodeStatusListener<>(this, config));
        }
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
    public CreditCardLimitAmount getCreditCardLimitAmount() {
        return creditCardLimitAmount;
    }

    @JsMethod
    public CreditCardMonthlyRepayment getCreditCardMonthlyRepayment() {
        return creditCardMonthlyRepayment;
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
        creditCardLimitAmount = childFactory.createCreditCardLimitAmount();
        children.add(creditCardLimitAmount);
        creditCardMonthlyRepayment = childFactory.createCreditCardMonthlyRepayment();
        children.add(creditCardMonthlyRepayment);
        creditCardClearingFlagNode = childFactory.createCreditCardClearingFlagNode();
        children.add(creditCardClearingFlagNode);
        creditCardBreakCostNode = childFactory.createCreditCardBreakCostNode();
        children.add(creditCardBreakCostNode);
        creditCardLenderNameNode = childFactory.createCreditCardLenderNameNode();
        children.add(creditCardLenderNameNode);
        return children;
    }



}
