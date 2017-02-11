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

public class LiabilitiesNode extends ObjectUiNode<FinancialPositionNode>
{
    private CreditCardListNode creditCardListNode;
    private LoanListNode loanListNode;
    private OtherLiabilityListNode otherLiabilityListNode;

    private LiabilitiesNodeChildFactory childFactory;

    @Inject
    void receiveNodeProvider(LiabilitiesNodeChildProvider provider) {
        childFactory = provider.createFactory(this);
    }

    @Inject
    void receiveClassRegistry(ClassRegistryImpl classRegistry) {
        UiNodeConfig<LiabilitiesNode> config = classRegistry.getUiNodeConfig(LiabilitiesNode.class, getName());
        if (config != null) {
            this.setStatusListener(new ConfigBindingNodeStatusListener<>(this, config));
        }
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
