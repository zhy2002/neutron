package zhy2002.examples.lodgement.gen.di;
import dagger.Subcomponent;
import zhy2002.examples.lodgement.gen.node.*;
import zhy2002.neutron.RuleProvider;
import java.util.*;

@CompanyPrivacyNodeScope
@Subcomponent(modules = {CompanyPrivacyNodeModule.class})
public interface CompanyPrivacyNodeComponent {

    RuleProvider<CompanyPrivacyNode> getCompanyPrivacyNodeRuleProvider();
    Map<String, RuleProvider<CompanyPrivacyNode>> getInstanceRuleProviders();

    @Subcomponent.Builder
    interface Builder {

        Builder setCompanyPrivacyNodeModule(CompanyPrivacyNodeModule module);

        CompanyPrivacyNodeComponent build();
    }
}
