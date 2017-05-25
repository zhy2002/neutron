package zhy2002.examples.lodgement.gen.di;
import dagger.Subcomponent;
import zhy2002.examples.lodgement.gen.node.*;
import zhy2002.neutron.RuleProvider;
import java.util.*;

@CompanyTypeNodeScope
@Subcomponent(modules = {CompanyTypeNodeModule.class})
public interface CompanyTypeNodeComponent {

    RuleProvider<CompanyTypeNode> getCompanyTypeNodeRuleProvider();
    Map<String, RuleProvider<CompanyTypeNode>> getInstanceRuleProviders();

    @Subcomponent.Builder
    interface Builder {

        Builder setCompanyTypeNodeModule(CompanyTypeNodeModule module);

        CompanyTypeNodeComponent build();
    }
}
