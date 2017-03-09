package zhy2002.examples.lodgement.gen.di;
import dagger.Subcomponent;
import zhy2002.examples.lodgement.gen.*;
import zhy2002.examples.lodgement.gen.node.*;
import zhy2002.neutron.RuleProvider;
import java.util.*;

@CompanyTypeNodeScope
@Subcomponent(modules = {CompanyTypeNodeModule.class})
public interface CompanyTypeNodeComponent {

    CompanyTypeNodeRuleProvider getCompanyTypeNodeRuleProvider();
    Map<String, RuleProvider<CompanyTypeNode>> getInstanceRuleProviders();

    @Subcomponent.Builder
    interface Builder {

        Builder setCompanyTypeNodeModule(CompanyTypeNodeModule module);

        CompanyTypeNodeComponent build();
    }
}
