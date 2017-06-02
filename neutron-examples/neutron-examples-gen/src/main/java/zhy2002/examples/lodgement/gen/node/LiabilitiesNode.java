package zhy2002.examples.lodgement.gen.node;

import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import zhy2002.examples.lodgement.gen.di.LiabilitiesNodeComponent;
import jsinterop.annotations.*;
import java.math.BigDecimal;
import javax.inject.*;
import zhy2002.neutron.di.*;
import java.util.*;
import zhy2002.examples.lodgement.gen.rule.*;
import zhy2002.examples.lodgement.gen.di.*;
import java.util.List;


public class LiabilitiesNode extends ObjectUiNode<FinancialPositionNode> {

    @Inject
    protected LiabilitiesNode(@Owner FinancialPositionNode parentProfileNodeInfo) {
        super(parentProfileNodeInfo);
    }

    @Override
    public final Class<?> getConcreteClass() {
    return LiabilitiesNode.class;
    }

    protected final LiabilitiesNodeComponent getComponent() {
        return component;
    }


    private LiabilitiesNodeComponent component;

    @Inject
    void createComponent(LiabilitiesNodeComponent.Builder builder) {
        this.component = builder.setLiabilitiesNodeModule(new LiabilitiesNodeModule(this)).build();
    }

    @Override
    protected void initializeState() {
        this.component.provideRuleProviders().forEach(provider -> provider.initializeState(this));
    }

    @Override
    protected void createRules(List<UiNodeRule<?>> createdRules) {
        this.component.provideRuleProviders().forEach(provider -> provider.createRules(createdRules));
    }

    //region children getters

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

    //endregion
    @Override
    protected List<UiNode<?>> createChildren() {
        List<UiNode<?>> children = super.createChildren();
        setChildNodeIdentity("creditCardListNode");
        children.add(getComponent().createCreditCardListNode());
        setChildNodeIdentity("loanListNode");
        children.add(getComponent().createLoanListNode());
        setChildNodeIdentity("otherLiabilityListNode");
        children.add(getComponent().createOtherLiabilityListNode());
        setChildNodeIdentity(null);
        return children;
    }

}
