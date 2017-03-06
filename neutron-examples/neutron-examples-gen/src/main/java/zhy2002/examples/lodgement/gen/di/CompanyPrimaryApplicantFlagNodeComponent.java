package zhy2002.examples.lodgement.gen.di;
import dagger.Subcomponent;
import zhy2002.examples.lodgement.gen.*;
import zhy2002.examples.lodgement.gen.node.*;

@CompanyPrimaryApplicantFlagNodeScope
@Subcomponent(modules = {CompanyPrimaryApplicantFlagNodeModule.class})
public interface CompanyPrimaryApplicantFlagNodeComponent {

    CompanyPrimaryApplicantFlagNodeRuleProvider getCompanyPrimaryApplicantFlagNodeRuleProvider();

    @Subcomponent.Builder
    interface Builder {

        Builder setCompanyPrimaryApplicantFlagNodeModule(CompanyPrimaryApplicantFlagNodeModule module);

        CompanyPrimaryApplicantFlagNodeComponent build();
    }
}
