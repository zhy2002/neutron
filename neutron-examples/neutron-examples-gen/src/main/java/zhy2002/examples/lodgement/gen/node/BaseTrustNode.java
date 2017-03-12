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

    private TrustNameNode trustNameNode;
    private TrustRegistrationDateNode trustRegistrationDateNode;
    private TrustTypeNode trustTypeNode;
    private TrustCountryNode trustCountryNode;
    private TrustAddressNode trustAddressNode;
    private TrustIndustryNode trustIndustryNode;
    private TrustSettlorNotRequiredReasonNode trustSettlorNotRequiredReasonNode;
    private TrustBeneficiaryListNode trustBeneficiaryListNode;
    private TrustSettlorListNode trustSettlorListNode;
    private TrustBeneficialOwnerListNode trustBeneficialOwnerListNode;
    private TrustBeneficiaryClassListNode trustBeneficiaryClassListNode;

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
        return trustNameNode;
    }

    @JsMethod
    public TrustRegistrationDateNode getTrustRegistrationDateNode() {
        return trustRegistrationDateNode;
    }

    @JsMethod
    public TrustTypeNode getTrustTypeNode() {
        return trustTypeNode;
    }

    @JsMethod
    public TrustCountryNode getTrustCountryNode() {
        return trustCountryNode;
    }

    @JsMethod
    public TrustAddressNode getTrustAddressNode() {
        return trustAddressNode;
    }

    @JsMethod
    public TrustIndustryNode getTrustIndustryNode() {
        return trustIndustryNode;
    }

    @JsMethod
    public TrustSettlorNotRequiredReasonNode getTrustSettlorNotRequiredReasonNode() {
        return trustSettlorNotRequiredReasonNode;
    }

    @JsMethod
    public TrustBeneficiaryListNode getTrustBeneficiaryListNode() {
        return trustBeneficiaryListNode;
    }

    @JsMethod
    public TrustSettlorListNode getTrustSettlorListNode() {
        return trustSettlorListNode;
    }

    @JsMethod
    public TrustBeneficialOwnerListNode getTrustBeneficialOwnerListNode() {
        return trustBeneficialOwnerListNode;
    }

    @JsMethod
    public TrustBeneficiaryClassListNode getTrustBeneficiaryClassListNode() {
        return trustBeneficiaryClassListNode;
    }

    @Override
    protected List<UiNode<?>> createChildren() {
        List<UiNode<?>> children = super.createChildren();
        trustNameNode = childFactory.createTrustNameNode();
        children.add(trustNameNode);
        trustRegistrationDateNode = childFactory.createTrustRegistrationDateNode();
        children.add(trustRegistrationDateNode);
        trustTypeNode = childFactory.createTrustTypeNode();
        children.add(trustTypeNode);
        trustCountryNode = childFactory.createTrustCountryNode();
        children.add(trustCountryNode);
        trustAddressNode = childFactory.createTrustAddressNode();
        children.add(trustAddressNode);
        trustIndustryNode = childFactory.createTrustIndustryNode();
        children.add(trustIndustryNode);
        trustSettlorNotRequiredReasonNode = childFactory.createTrustSettlorNotRequiredReasonNode();
        children.add(trustSettlorNotRequiredReasonNode);
        trustBeneficiaryListNode = childFactory.createTrustBeneficiaryListNode();
        children.add(trustBeneficiaryListNode);
        trustSettlorListNode = childFactory.createTrustSettlorListNode();
        children.add(trustSettlorListNode);
        trustBeneficialOwnerListNode = childFactory.createTrustBeneficialOwnerListNode();
        children.add(trustBeneficialOwnerListNode);
        trustBeneficiaryClassListNode = childFactory.createTrustBeneficiaryClassListNode();
        children.add(trustBeneficiaryClassListNode);
        return children;
    }

}
