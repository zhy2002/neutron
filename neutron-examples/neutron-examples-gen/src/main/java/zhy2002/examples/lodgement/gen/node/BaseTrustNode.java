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

    @Inject
    void receiveNodeProvider(BaseTrustNodeChildProvider provider) {
        childFactory = provider.createFactory(this);
    }


    public BaseTrustNode(@NotNull P parent, String name) {
        super(parent, name);
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
        children.add(childFactory.createTrustNameNode());
        children.add(childFactory.createTrustRegistrationDateNode());
        children.add(childFactory.createTrustTypeNode());
        children.add(childFactory.createTrustCountryNode());
        children.add(childFactory.createTrustAddressNode());
        children.add(childFactory.createTrustIndustryNode());
        children.add(childFactory.createTrustSettlorNotRequiredReasonNode());
        children.add(childFactory.createTrustBeneficiaryListNode());
        children.add(childFactory.createTrustSettlorListNode());
        children.add(childFactory.createTrustBeneficialOwnerListNode());
        children.add(childFactory.createTrustBeneficiaryClassListNode());
        return children;
    }

}
