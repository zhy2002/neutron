package zhy2002.examples.lodgement.gen.node;

import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import jsinterop.annotations.*;
import java.math.BigDecimal;
import javax.inject.*;
import javax.validation.constraints.NotNull;
import java.util.*;
import zhy2002.examples.lodgement.gen.rule.*;

public abstract class BaseTrustNode<P extends ParentUiNode<?>> extends ObjectUiNode<P> {
    private BaseTrustNodeChildFactory childFactory;

    public BaseTrustNode(@NotNull P parent, String name) {
        super(parent, name);
    }

    @Inject
    void receiveNodeProvider(BaseTrustNodeChildProvider provider) {
        childFactory = provider.createFactory(this);
    }

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

    @Override
    protected List<UiNode<?>> createChildren() {
        List<UiNode<?>> children = super.createChildren();
        setChildNodeIdentity("trustNameNode");
        children.add(childFactory.createTrustNameNode());
        setChildNodeIdentity("trustRegistrationDateNode");
        children.add(childFactory.createTrustRegistrationDateNode());
        setChildNodeIdentity("trustTypeNode");
        children.add(childFactory.createTrustTypeNode());
        setChildNodeIdentity("trustCountryNode");
        children.add(childFactory.createTrustCountryNode());
        setChildNodeIdentity("trustAddressNode");
        children.add(childFactory.createTrustAddressNode());
        setChildNodeIdentity("trustIndustryNode");
        children.add(childFactory.createTrustIndustryNode());
        setChildNodeIdentity("trustSettlorNotRequiredReasonNode");
        children.add(childFactory.createTrustSettlorNotRequiredReasonNode());
        setChildNodeIdentity("trustBeneficiaryListNode");
        children.add(childFactory.createTrustBeneficiaryListNode());
        setChildNodeIdentity("trustSettlorListNode");
        children.add(childFactory.createTrustSettlorListNode());
        setChildNodeIdentity("trustBeneficialOwnerListNode");
        children.add(childFactory.createTrustBeneficialOwnerListNode());
        setChildNodeIdentity("trustBeneficiaryClassListNode");
        children.add(childFactory.createTrustBeneficiaryClassListNode());
        setChildNodeIdentity(null);
        return children;
    }

}
