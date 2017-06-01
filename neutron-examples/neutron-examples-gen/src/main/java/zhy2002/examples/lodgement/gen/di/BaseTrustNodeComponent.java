package zhy2002.examples.lodgement.gen.di;
import dagger.Subcomponent;
import zhy2002.neutron.di.ComponentScope;
import zhy2002.examples.lodgement.gen.node.*;
import zhy2002.neutron.RuleProvider;

public interface BaseTrustNodeComponent {

    TrustNameNode createTrustNameNode();
    TrustRegistrationDateNode createTrustRegistrationDateNode();
    TrustTypeNode createTrustTypeNode();
    TrustCountryNode createTrustCountryNode();
    TrustAddressNode createTrustAddressNode();
    TrustIndustryNode createTrustIndustryNode();
    TrustSettlorNotRequiredReasonNode createTrustSettlorNotRequiredReasonNode();
    TrustBeneficiaryListNode createTrustBeneficiaryListNode();
    TrustSettlorListNode createTrustSettlorListNode();
    TrustBeneficialOwnerListNode createTrustBeneficialOwnerListNode();
    TrustBeneficiaryClassListNode createTrustBeneficiaryClassListNode();

}
