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
    private BasePrivacyNodeChildFactory childFactory;

    public BasePrivacyNode(@NotNull P parent, String name) {
        super(parent, name);
    }

    @Inject
    void receiveNodeProvider(BasePrivacyNodeChildProvider provider) {
        childFactory = provider.createFactory(this);
    }

    @JsMethod
    public CreditCheckFlagNode getCreditCheckFlagNode() {
        return (CreditCheckFlagNode)getChildByName("creditCheckFlagNode");
    }

    @JsMethod
    public ThirdPartyDisclosureFlagNode getThirdPartyDisclosureFlagNode() {
        return (ThirdPartyDisclosureFlagNode)getChildByName("thirdPartyDisclosureFlagNode");
    }

    @JsMethod
    public LegalActionNode getLegalActionNode() {
        return (LegalActionNode)getChildByName("legalActionNode");
    }

    @JsMethod
    public CreditHistoryListNode getCreditHistoryListNode() {
        return (CreditHistoryListNode)getChildByName("creditHistoryListNode");
    }

    @Override
    protected List<UiNode<?>> createChildren() {
        List<UiNode<?>> children = super.createChildren();
        setChildNodeIdentity("creditCheckFlagNode");
        children.add(childFactory.createCreditCheckFlagNode());
        setChildNodeIdentity("thirdPartyDisclosureFlagNode");
        children.add(childFactory.createThirdPartyDisclosureFlagNode());
        setChildNodeIdentity("legalActionNode");
        children.add(childFactory.createLegalActionNode());
        setChildNodeIdentity("creditHistoryListNode");
        children.add(childFactory.createCreditHistoryListNode());
        setChildNodeIdentity(null);
        return children;
    }

}
