package zhy2002.examples.lodgement.gen.node;

import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import jsinterop.annotations.*;
import java.math.BigDecimal;
import javax.inject.*;
import javax.validation.constraints.NotNull;
import java.util.*;
import zhy2002.examples.lodgement.gen.rule.*;


public abstract class BasePrivacyNode<P extends ParentUiNode<?>> extends ObjectUiNode<P> {

    private CreditCheckFlagNode creditCheckFlagNode;
    private ThirdPartyDisclosureFlagNode thirdPartyDisclosureFlagNode;
    private LegalActionNode legalActionNode;
    private CreditHistoryListNode creditHistoryListNode;

    private BasePrivacyNodeChildFactory childFactory;

    @Inject
    void receiveNodeProvider(BasePrivacyNodeChildProvider provider) {
        childFactory = provider.createFactory(this);
    }


    public BasePrivacyNode(@NotNull P parent, String name) {
        super(parent, name);
    }

    @JsMethod
    public CreditCheckFlagNode getCreditCheckFlagNode() {
        return creditCheckFlagNode;
    }

    @JsMethod
    public ThirdPartyDisclosureFlagNode getThirdPartyDisclosureFlagNode() {
        return thirdPartyDisclosureFlagNode;
    }

    @JsMethod
    public LegalActionNode getLegalActionNode() {
        return legalActionNode;
    }

    @JsMethod
    public CreditHistoryListNode getCreditHistoryListNode() {
        return creditHistoryListNode;
    }

    @Override
    protected List<UiNode<?>> createChildren() {
        List<UiNode<?>> children = super.createChildren();
        creditCheckFlagNode = childFactory.createCreditCheckFlagNode();
        children.add(creditCheckFlagNode);
        thirdPartyDisclosureFlagNode = childFactory.createThirdPartyDisclosureFlagNode();
        children.add(thirdPartyDisclosureFlagNode);
        legalActionNode = childFactory.createLegalActionNode();
        children.add(legalActionNode);
        creditHistoryListNode = childFactory.createCreditHistoryListNode();
        children.add(creditHistoryListNode);
        return children;
    }

}
