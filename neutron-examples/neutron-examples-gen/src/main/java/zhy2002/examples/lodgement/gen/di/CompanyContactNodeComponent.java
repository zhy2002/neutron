package zhy2002.examples.lodgement.gen.di;
import dagger.Subcomponent;
import zhy2002.neutron.di.ComponentScope;
import zhy2002.examples.lodgement.gen.node.*;
import zhy2002.neutron.RuleProvider;
import java.util.*;

@ComponentScope
@Subcomponent(modules = {CompanyContactNodeModule.class})
public interface CompanyContactNodeComponent {

    CompanyContactFirstNameNode createCompanyContactFirstNameNode();
    CompanyContactLastNameNode createCompanyContactLastNameNode();
    CompanyTelephoneNode createWorkPhoneNode();
    CompanyTelephoneNode createFaxNumberNode();
    CompanyMobileNumberNode createCompanyMobileNumberNode();
    CompanyEmailNode createCompanyEmailNode();
    CompanyAddressNode createRegisteredAddressNode();
    CompanyAddressNode createPostalAddressNode();
    CompanyAddressNode createTradingAddressNode();
    CompanyAddressNode createPrincipalPlaceAddressNode();

    RuleProvider<CompanyContactNode> getCompanyContactNodeRuleProvider();
    Map<String, RuleProvider<CompanyContactNode>> getInstanceRuleProviders();

    @Subcomponent.Builder
    interface Builder {

        Builder setCompanyContactNodeModule(CompanyContactNodeModule module);

        CompanyContactNodeComponent build();
    }

}
