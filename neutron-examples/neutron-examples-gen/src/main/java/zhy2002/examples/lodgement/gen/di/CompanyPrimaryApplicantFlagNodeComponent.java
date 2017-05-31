package zhy2002.examples.lodgement.gen.di;
import dagger.Subcomponent;
import zhy2002.neutron.di.ComponentScope;
import zhy2002.examples.lodgement.gen.node.*;
import zhy2002.neutron.RuleProvider;
import java.util.*;

@ComponentScope
@Subcomponent(modules = {CompanyPrimaryApplicantFlagNodeModule.class})
public interface CompanyPrimaryApplicantFlagNodeComponent {

    RuleProvider<CompanyPrimaryApplicantFlagNode> getCompanyPrimaryApplicantFlagNodeRuleProvider();
    Map<String, RuleProvider<CompanyPrimaryApplicantFlagNode>> getInstanceRuleProviders();

    @Subcomponent.Builder
    interface Builder {

        Builder setCompanyPrimaryApplicantFlagNodeModule(CompanyPrimaryApplicantFlagNodeModule module);

        CompanyPrimaryApplicantFlagNodeComponent build();
    }
}
