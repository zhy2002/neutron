package zhy2002.examples.lodgement.gen.di;
import dagger.Subcomponent;
import zhy2002.neutron.di.ComponentScope;
import zhy2002.examples.lodgement.gen.node.*;
import zhy2002.neutron.RuleProvider;
import java.util.*;

@ComponentScope
@Subcomponent(modules = {CompanyPrivacyNodeModule.class})
public interface CompanyPrivacyNodeComponent extends BasePrivacyNodeComponent {


    RuleProvider<CompanyPrivacyNode> getCompanyPrivacyNodeRuleProvider();
    Map<String, RuleProvider<CompanyPrivacyNode>> getInstanceRuleProviders();

    @Subcomponent.Builder
    interface Builder {

        Builder setCompanyPrivacyNodeModule(CompanyPrivacyNodeModule module);

        CompanyPrivacyNodeComponent build();
    }

}
