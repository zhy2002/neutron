package zhy2002.examples.lodgement.gen.di;
import dagger.Subcomponent;
import zhy2002.examples.lodgement.gen.*;
import zhy2002.examples.lodgement.gen.node.*;
import zhy2002.neutron.RuleProvider;
import java.util.*;

@CompanyTelephoneNodeScope
@Subcomponent(modules = {CompanyTelephoneNodeModule.class})
public interface CompanyTelephoneNodeComponent {

    CompanyTelephoneNodeRuleProvider getCompanyTelephoneNodeRuleProvider();
    Map<String, RuleProvider<CompanyTelephoneNode>> getInstanceRuleProviders();

    @Subcomponent.Builder
    interface Builder {

        Builder setCompanyTelephoneNodeModule(CompanyTelephoneNodeModule module);

        CompanyTelephoneNodeComponent build();
    }
}
