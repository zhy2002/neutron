package zhy2002.examples.lodgement.gen.di;
import dagger.Subcomponent;
import zhy2002.neutron.di.ComponentScope;
import zhy2002.examples.lodgement.gen.node.*;
import zhy2002.neutron.RuleProvider;
import java.util.*;

@ComponentScope
@Subcomponent(modules = {CompanyRegistrationStateNodeModule.class})
public interface CompanyRegistrationStateNodeComponent {


    RuleProvider<CompanyRegistrationStateNode> getCompanyRegistrationStateNodeRuleProvider();
    Map<String, RuleProvider<CompanyRegistrationStateNode>> getInstanceRuleProviders();

    @Subcomponent.Builder
    interface Builder {

        Builder setCompanyRegistrationStateNodeModule(CompanyRegistrationStateNodeModule module);

        CompanyRegistrationStateNodeComponent build();
    }

}
