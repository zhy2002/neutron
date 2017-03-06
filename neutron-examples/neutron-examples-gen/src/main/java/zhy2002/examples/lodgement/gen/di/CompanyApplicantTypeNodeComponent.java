package zhy2002.examples.lodgement.gen.di;
import dagger.Subcomponent;
import zhy2002.examples.lodgement.gen.*;
import zhy2002.examples.lodgement.gen.node.*;

@CompanyApplicantTypeNodeScope
@Subcomponent(modules = {CompanyApplicantTypeNodeModule.class})
public interface CompanyApplicantTypeNodeComponent {

    CompanyApplicantTypeNodeRuleProvider getCompanyApplicantTypeNodeRuleProvider();

    @Subcomponent.Builder
    interface Builder {

        Builder setCompanyApplicantTypeNodeModule(CompanyApplicantTypeNodeModule module);

        CompanyApplicantTypeNodeComponent build();
    }
}
