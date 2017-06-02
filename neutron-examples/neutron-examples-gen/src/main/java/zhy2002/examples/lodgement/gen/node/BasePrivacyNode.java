package zhy2002.examples.lodgement.gen.node;

import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import zhy2002.examples.lodgement.gen.di.BasePrivacyNodeComponent;
import jsinterop.annotations.*;
import java.math.BigDecimal;
import javax.inject.*;
import zhy2002.neutron.di.*;
import java.util.*;
import zhy2002.examples.lodgement.gen.rule.*;


public abstract class BasePrivacyNode<P extends ParentUiNode<?>> extends ObjectUiNode<P> {

    protected BasePrivacyNode(P parentProfileNodeInfo) {
        super(parentProfileNodeInfo);
    }

    protected abstract BasePrivacyNodeComponent getComponent();


    //region children getters

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

    //endregion
    @Override
    protected List<UiNode<?>> createChildren() {
        List<UiNode<?>> children = super.createChildren();
        setChildNodeIdentity("creditCheckFlagNode");
        children.add(getComponent().createCreditCheckFlagNode());
        setChildNodeIdentity("thirdPartyDisclosureFlagNode");
        children.add(getComponent().createThirdPartyDisclosureFlagNode());
        setChildNodeIdentity("legalActionNode");
        children.add(getComponent().createLegalActionNode());
        setChildNodeIdentity("creditHistoryListNode");
        children.add(getComponent().createCreditHistoryListNode());
        setChildNodeIdentity(null);
        return children;
    }

}
