package zhy2002.examples.lodgement.gen.di;
import dagger.Subcomponent;
import zhy2002.neutron.di.ComponentScope;
import zhy2002.examples.lodgement.gen.node.*;
import zhy2002.neutron.RuleProvider;
import java.util.*;

@ComponentScope
@Subcomponent(modules = {CompanyTelephoneNodeModule.class})
public interface CompanyTelephoneNodeComponent {


    RuleProvider<CompanyTelephoneNode> getCompanyTelephoneNodeRuleProvider();
    Map<String, RuleProvider<CompanyTelephoneNode>> getInstanceRuleProviders();

    @Subcomponent.Builder
    interface Builder {

        Builder setCompanyTelephoneNodeModule(CompanyTelephoneNodeModule module);

        CompanyTelephoneNodeComponent build();
    }

}
