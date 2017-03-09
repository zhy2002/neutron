package zhy2002.examples.lodgement.gen.di;
import dagger.Subcomponent;
import zhy2002.examples.lodgement.gen.*;
import zhy2002.examples.lodgement.gen.node.*;
import zhy2002.neutron.RuleProvider;
import java.util.*;

@CompanyApplicantTypeNodeScope
@Subcomponent(modules = {CompanyApplicantTypeNodeModule.class})
public interface CompanyApplicantTypeNodeComponent {

    CompanyApplicantTypeNodeRuleProvider getCompanyApplicantTypeNodeRuleProvider();
    Map<String, RuleProvider<CompanyApplicantTypeNode>> getInstanceRuleProviders();

    @Subcomponent.Builder
    interface Builder {

        Builder setCompanyApplicantTypeNodeModule(CompanyApplicantTypeNodeModule module);

        CompanyApplicantTypeNodeComponent build();
    }
}
