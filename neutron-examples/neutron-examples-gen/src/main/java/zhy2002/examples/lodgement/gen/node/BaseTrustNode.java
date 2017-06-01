package zhy2002.examples.lodgement.gen.node;

import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import zhy2002.examples.lodgement.gen.di.BaseTrustNodeComponent;
import jsinterop.annotations.*;
import java.math.BigDecimal;
import javax.inject.*;
import zhy2002.neutron.di.*;
import java.util.*;
import zhy2002.examples.lodgement.gen.rule.*;


public abstract class BaseTrustNode<P extends ParentUiNode<?>> extends ObjectUiNode<P> {

    public BaseTrustNode(P parent) {
        super(parent);
    }

    protected abstract BaseTrustNodeComponent getComponent();


    //region children getters

    @JsMethod
    public TrustNameNode getTrustNameNode() {
        return (TrustNameNode)getChildByName("trustNameNode");
    }

    @JsMethod
    public TrustRegistrationDateNode getTrustRegistrationDateNode() {
        return (TrustRegistrationDateNode)getChildByName("trustRegistrationDateNode");
    }

    @JsMethod
    public TrustTypeNode getTrustTypeNode() {
        return (TrustTypeNode)getChildByName("trustTypeNode");
    }

    @JsMethod
    public TrustCountryNode getTrustCountryNode() {
        return (TrustCountryNode)getChildByName("trustCountryNode");
    }

    @JsMethod
    public TrustAddressNode getTrustAddressNode() {
        return (TrustAddressNode)getChildByName("trustAddressNode");
    }

    @JsMethod
    public TrustIndustryNode getTrustIndustryNode() {
        return (TrustIndustryNode)getChildByName("trustIndustryNode");
    }

    @JsMethod
    public TrustSettlorNotRequiredReasonNode getTrustSettlorNotRequiredReasonNode() {
        return (TrustSettlorNotRequiredReasonNode)getChildByName("trustSettlorNotRequiredReasonNode");
    }

    @JsMethod
    public TrustBeneficiaryListNode getTrustBeneficiaryListNode() {
        return (TrustBeneficiaryListNode)getChildByName("trustBeneficiaryListNode");
    }

    @JsMethod
    public TrustSettlorListNode getTrustSettlorListNode() {
        return (TrustSettlorListNode)getChildByName("trustSettlorListNode");
    }

    @JsMethod
    public TrustBeneficialOwnerListNode getTrustBeneficialOwnerListNode() {
        return (TrustBeneficialOwnerListNode)getChildByName("trustBeneficialOwnerListNode");
    }

    @JsMethod
    public TrustBeneficiaryClassListNode getTrustBeneficiaryClassListNode() {
        return (TrustBeneficiaryClassListNode)getChildByName("trustBeneficiaryClassListNode");
    }

    //endregion
    @Override
    protected List<UiNode<?>> createChildren() {
        List<UiNode<?>> children = super.createChildren();
        setChildNodeIdentity("trustNameNode");
        children.add(getComponent().createTrustNameNode());
        setChildNodeIdentity("trustRegistrationDateNode");
        children.add(getComponent().createTrustRegistrationDateNode());
        setChildNodeIdentity("trustTypeNode");
        children.add(getComponent().createTrustTypeNode());
        setChildNodeIdentity("trustCountryNode");
        children.add(getComponent().createTrustCountryNode());
        setChildNodeIdentity("trustAddressNode");
        children.add(getComponent().createTrustAddressNode());
        setChildNodeIdentity("trustIndustryNode");
        children.add(getComponent().createTrustIndustryNode());
        setChildNodeIdentity("trustSettlorNotRequiredReasonNode");
        children.add(getComponent().createTrustSettlorNotRequiredReasonNode());
        setChildNodeIdentity("trustBeneficiaryListNode");
        children.add(getComponent().createTrustBeneficiaryListNode());
        setChildNodeIdentity("trustSettlorListNode");
        children.add(getComponent().createTrustSettlorListNode());
        setChildNodeIdentity("trustBeneficialOwnerListNode");
        children.add(getComponent().createTrustBeneficialOwnerListNode());
        setChildNodeIdentity("trustBeneficiaryClassListNode");
        children.add(getComponent().createTrustBeneficiaryClassListNode());
        setChildNodeIdentity(null);
        return children;
    }

}
