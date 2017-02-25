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

public class LiabilitiesNode extends ObjectUiNode<FinancialPositionNode> {

    private CreditCardListNode creditCardListNode;
    private LoanListNode loanListNode;
    private OtherLiabilityListNode otherLiabilityListNode;

    private LiabilitiesNodeChildFactory childFactory;

    @Inject
    void receiveNodeProvider(LiabilitiesNodeChildProvider provider) {
        childFactory = provider.createFactory(this);
    }

    @Override
    public final Class<?> getConcreteClass() {
        return LiabilitiesNode.class;
    }

    private LiabilitiesNodeComponent component;

    @Inject
    void createComponent(LiabilitiesNodeComponent.Builder builder) {
        this.component = builder.setLiabilitiesNodeModule(new LiabilitiesNodeModule(this)).build();
    }

    @Override
    protected LiabilitiesNodeRuleProvider getRuleProvider() {
        return component.getLiabilitiesNodeRuleProvider();
    }

    public LiabilitiesNode(FinancialPositionNode parent, String name) {
        super(parent, name);
    }

    @JsMethod
    public CreditCardListNode getCreditCardListNode() {
        return creditCardListNode;
    }

    @JsMethod
    public LoanListNode getLoanListNode() {
        return loanListNode;
    }

    @JsMethod
    public OtherLiabilityListNode getOtherLiabilityListNode() {
        return otherLiabilityListNode;
    }

    @Override
    protected List<UiNode<?>> createChildren() {
        List<UiNode<?>> children = super.createChildren();
        creditCardListNode = childFactory.createCreditCardListNode();
        children.add(creditCardListNode);
        loanListNode = childFactory.createLoanListNode();
        children.add(loanListNode);
        otherLiabilityListNode = childFactory.createOtherLiabilityListNode();
        children.add(otherLiabilityListNode);
        return children;
    }

}
