package zhy2002.examples.lodgement.gen.di;
import dagger.Subcomponent;
import zhy2002.examples.lodgement.gen.node.*;
import zhy2002.neutron.RuleProvider;
import java.util.*;

@CompanyRegistrationDateNodeScope
@Subcomponent(modules = {CompanyRegistrationDateNodeModule.class})
public interface CompanyRegistrationDateNodeComponent {

    RuleProvider<CompanyRegistrationDateNode> getCompanyRegistrationDateNodeRuleProvider();
    Map<String, RuleProvider<CompanyRegistrationDateNode>> getInstanceRuleProviders();

    @Subcomponent.Builder
    interface Builder {

        Builder setCompanyRegistrationDateNodeModule(CompanyRegistrationDateNodeModule module);

        CompanyRegistrationDateNodeComponent build();
    }
}
