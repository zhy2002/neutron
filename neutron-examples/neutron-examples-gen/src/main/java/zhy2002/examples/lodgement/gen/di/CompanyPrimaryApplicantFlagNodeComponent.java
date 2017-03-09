package zhy2002.examples.lodgement.gen.di;
import dagger.Subcomponent;
import zhy2002.examples.lodgement.gen.*;
import zhy2002.examples.lodgement.gen.node.*;
import zhy2002.neutron.RuleProvider;
import java.util.*;

@CompanyPrimaryApplicantFlagNodeScope
@Subcomponent(modules = {CompanyPrimaryApplicantFlagNodeModule.class})
public interface CompanyPrimaryApplicantFlagNodeComponent {

    CompanyPrimaryApplicantFlagNodeRuleProvider getCompanyPrimaryApplicantFlagNodeRuleProvider();
    Map<String, RuleProvider<CompanyPrimaryApplicantFlagNode>> getInstanceRuleProviders();

    @Subcomponent.Builder
    interface Builder {

        Builder setCompanyPrimaryApplicantFlagNodeModule(CompanyPrimaryApplicantFlagNodeModule module);

        CompanyPrimaryApplicantFlagNodeComponent build();
    }
}
