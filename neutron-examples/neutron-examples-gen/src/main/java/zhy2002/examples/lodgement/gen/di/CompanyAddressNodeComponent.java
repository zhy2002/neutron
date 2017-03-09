package zhy2002.examples.lodgement.gen.di;
import dagger.Subcomponent;
import zhy2002.examples.lodgement.gen.*;
import zhy2002.examples.lodgement.gen.node.*;
import zhy2002.neutron.RuleProvider;
import java.util.*;

@CompanyAddressNodeScope
@Subcomponent(modules = {CompanyAddressNodeModule.class})
public interface CompanyAddressNodeComponent {

    CompanyAddressNodeRuleProvider getCompanyAddressNodeRuleProvider();
    Map<String, RuleProvider<CompanyAddressNode>> getInstanceRuleProviders();

    @Subcomponent.Builder
    interface Builder {

        Builder setCompanyAddressNodeModule(CompanyAddressNodeModule module);

        CompanyAddressNodeComponent build();
    }
}
