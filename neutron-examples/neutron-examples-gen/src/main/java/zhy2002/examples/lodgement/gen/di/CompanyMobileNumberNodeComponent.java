package zhy2002.examples.lodgement.gen.di;
import dagger.Subcomponent;
import zhy2002.neutron.di.ComponentScope;
import zhy2002.examples.lodgement.gen.node.*;
import zhy2002.neutron.RuleProvider;
import java.util.*;

@ComponentScope
@Subcomponent(modules = {CompanyMobileNumberNodeModule.class})
public interface CompanyMobileNumberNodeComponent {


    RuleProvider<CompanyMobileNumberNode> getCompanyMobileNumberNodeRuleProvider();
    Map<String, RuleProvider<CompanyMobileNumberNode>> getInstanceRuleProviders();

    @Subcomponent.Builder
    interface Builder {

        Builder setCompanyMobileNumberNodeModule(CompanyMobileNumberNodeModule module);

        CompanyMobileNumberNodeComponent build();
    }

}
