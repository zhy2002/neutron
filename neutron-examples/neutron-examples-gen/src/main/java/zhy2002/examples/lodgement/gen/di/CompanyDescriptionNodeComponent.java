package zhy2002.examples.lodgement.gen.di;
import dagger.Subcomponent;
import zhy2002.examples.lodgement.gen.*;
import zhy2002.examples.lodgement.gen.node.*;
import zhy2002.neutron.RuleProvider;
import java.util.*;

@CompanyDescriptionNodeScope
@Subcomponent(modules = {CompanyDescriptionNodeModule.class})
public interface CompanyDescriptionNodeComponent {

    CompanyDescriptionNodeRuleProvider getCompanyDescriptionNodeRuleProvider();
    Map<String, RuleProvider<CompanyDescriptionNode>> getInstanceRuleProviders();

    @Subcomponent.Builder
    interface Builder {

        Builder setCompanyDescriptionNodeModule(CompanyDescriptionNodeModule module);

        CompanyDescriptionNodeComponent build();
    }
}
