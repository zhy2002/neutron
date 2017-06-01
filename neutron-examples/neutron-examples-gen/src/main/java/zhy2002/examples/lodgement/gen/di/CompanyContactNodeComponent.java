package zhy2002.examples.lodgement.gen.di;
import dagger.Subcomponent;
import zhy2002.neutron.di.ComponentScope;
import zhy2002.examples.lodgement.gen.node.*;
import zhy2002.neutron.RuleProvider;
import java.util.*;


@ComponentScope
@Subcomponent(modules = {CompanyContactNodeModule.class})
public interface CompanyContactNodeComponent {

    List<RuleProvider<CompanyContactNode>> provideRuleProviders();

    CompanyContactFirstNameNode createCompanyContactFirstNameNode();
    CompanyContactLastNameNode createCompanyContactLastNameNode();
    CompanyTelephoneNode createCompanyTelephoneNode();
    CompanyMobileNumberNode createCompanyMobileNumberNode();
    CompanyEmailNode createCompanyEmailNode();
    CompanyAddressNode createCompanyAddressNode();

    @Subcomponent.Builder
    interface Builder {

        Builder setCompanyContactNodeModule(CompanyContactNodeModule module);

        CompanyContactNodeComponent build();
    }

}
