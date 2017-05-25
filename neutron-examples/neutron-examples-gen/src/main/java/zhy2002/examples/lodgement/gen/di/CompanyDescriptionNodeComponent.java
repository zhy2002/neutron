package zhy2002.examples.lodgement.gen.di;
import dagger.Subcomponent;
import zhy2002.examples.lodgement.gen.node.*;
import zhy2002.neutron.RuleProvider;
import java.util.*;

@CompanyDescriptionNodeScope
@Subcomponent(modules = {CompanyDescriptionNodeModule.class})
public interface CompanyDescriptionNodeComponent {

    RuleProvider<CompanyDescriptionNode> getCompanyDescriptionNodeRuleProvider();
    Map<String, RuleProvider<CompanyDescriptionNode>> getInstanceRuleProviders();

    @Subcomponent.Builder
    interface Builder {

        Builder setCompanyDescriptionNodeModule(CompanyDescriptionNodeModule module);

        CompanyDescriptionNodeComponent build();
    }
}
