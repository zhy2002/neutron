package zhy2002.examples.lodgement.gen.di;
import dagger.Subcomponent;
import zhy2002.neutron.di.ComponentScope;
import zhy2002.examples.lodgement.gen.node.*;
import zhy2002.neutron.RuleProvider;
import java.util.*;

@ComponentScope
@Subcomponent(modules = {CompanyApplicantTypeNodeModule.class})
public interface CompanyApplicantTypeNodeComponent {

    RuleProvider<CompanyApplicantTypeNode> getCompanyApplicantTypeNodeRuleProvider();
    Map<String, RuleProvider<CompanyApplicantTypeNode>> getInstanceRuleProviders();

    @Subcomponent.Builder
    interface Builder {

        Builder setCompanyApplicantTypeNodeModule(CompanyApplicantTypeNodeModule module);

        CompanyApplicantTypeNodeComponent build();
    }
}
