package zhy2002.examples.lodgement.gen.di;
import dagger.Subcomponent;
import zhy2002.neutron.di.ComponentScope;
import zhy2002.examples.lodgement.gen.node.*;
import zhy2002.neutron.RuleProvider;
import java.util.*;


@ComponentScope
@Subcomponent(modules = {CompanyPrimaryApplicantFlagNodeModule.class})
public interface CompanyPrimaryApplicantFlagNodeComponent {

    List<RuleProvider<CompanyPrimaryApplicantFlagNode>> provideRuleProviders();


    @Subcomponent.Builder
    interface Builder {

        Builder setCompanyPrimaryApplicantFlagNodeModule(CompanyPrimaryApplicantFlagNodeModule module);

        CompanyPrimaryApplicantFlagNodeComponent build();
    }

}
