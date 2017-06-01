package zhy2002.examples.lodgement.gen.di;
import dagger.Subcomponent;
import zhy2002.neutron.di.ComponentScope;
import zhy2002.examples.lodgement.gen.node.*;
import zhy2002.neutron.RuleProvider;
import java.util.*;


@ComponentScope
@Subcomponent(modules = {CompanyAddressNodeModule.class})
public interface CompanyAddressNodeComponent extends AddressNodeComponent {

    List<RuleProvider<CompanyAddressNode>> provideRuleProviders();


    @Subcomponent.Builder
    interface Builder {

        Builder setCompanyAddressNodeModule(CompanyAddressNodeModule module);

        CompanyAddressNodeComponent build();
    }

}
