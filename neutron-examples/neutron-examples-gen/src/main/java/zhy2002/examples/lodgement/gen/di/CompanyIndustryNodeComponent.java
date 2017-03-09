package zhy2002.examples.lodgement.gen.di;
import dagger.Subcomponent;
import zhy2002.examples.lodgement.gen.*;
import zhy2002.examples.lodgement.gen.node.*;
import zhy2002.neutron.RuleProvider;
import java.util.*;

@CompanyIndustryNodeScope
@Subcomponent(modules = {CompanyIndustryNodeModule.class})
public interface CompanyIndustryNodeComponent {

    CompanyIndustryNodeRuleProvider getCompanyIndustryNodeRuleProvider();
    Map<String, RuleProvider<CompanyIndustryNode>> getInstanceRuleProviders();

    @Subcomponent.Builder
    interface Builder {

        Builder setCompanyIndustryNodeModule(CompanyIndustryNodeModule module);

        CompanyIndustryNodeComponent build();
    }
}
