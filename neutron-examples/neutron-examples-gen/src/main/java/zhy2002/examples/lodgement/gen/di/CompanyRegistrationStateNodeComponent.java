package zhy2002.examples.lodgement.gen.di;
import dagger.Subcomponent;
import zhy2002.examples.lodgement.gen.*;
import zhy2002.examples.lodgement.gen.node.*;
import zhy2002.neutron.RuleProvider;
import java.util.*;

@CompanyRegistrationStateNodeScope
@Subcomponent(modules = {CompanyRegistrationStateNodeModule.class})
public interface CompanyRegistrationStateNodeComponent {

    CompanyRegistrationStateNodeRuleProvider getCompanyRegistrationStateNodeRuleProvider();
    Map<String, RuleProvider<CompanyRegistrationStateNode>> getInstanceRuleProviders();

    @Subcomponent.Builder
    interface Builder {

        Builder setCompanyRegistrationStateNodeModule(CompanyRegistrationStateNodeModule module);

        CompanyRegistrationStateNodeComponent build();
    }
}
