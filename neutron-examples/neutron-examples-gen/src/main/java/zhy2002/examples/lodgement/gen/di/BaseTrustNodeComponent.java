package zhy2002.examples.lodgement.gen.di;
import dagger.Subcomponent;
import zhy2002.neutron.di.ComponentScope;
import zhy2002.examples.lodgement.gen.node.*;
import zhy2002.neutron.RuleProvider;
import java.util.*;


public interface BaseTrustNodeComponent {


    TrustTypeNode createTrustTypeNode();
    TrustNameNode createTrustNameNode();
    TrustRegistrationDateNode createTrustRegistrationDateNode();
    TrustCountryNode createTrustCountryNode();
    TrustAddressNode createTrustAddressNode();
    TrustSettlorNotRequiredReasonNode createTrustSettlorNotRequiredReasonNode();
    TrustIndustryNode createTrustIndustryNode();
    TrustBeneficiaryListNode createTrustBeneficiaryListNode();
    TrustSettlorListNode createTrustSettlorListNode();
    TrustBeneficialOwnerListNode createTrustBeneficialOwnerListNode();
    TrustBeneficiaryClassListNode createTrustBeneficiaryClassListNode();

}
