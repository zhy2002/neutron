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


    public LiabilitiesNode(@NotNull FinancialPositionNode parent, String name) {
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
