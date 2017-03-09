package zhy2002.examples.lodgement.gen.di;
import dagger.Subcomponent;
import zhy2002.examples.lodgement.gen.*;
import zhy2002.examples.lodgement.gen.node.*;
import zhy2002.neutron.RuleProvider;
import java.util.*;

@CompanyMobileNumberNodeScope
@Subcomponent(modules = {CompanyMobileNumberNodeModule.class})
public interface CompanyMobileNumberNodeComponent {

    CompanyMobileNumberNodeRuleProvider getCompanyMobileNumberNodeRuleProvider();
    Map<String, RuleProvider<CompanyMobileNumberNode>> getInstanceRuleProviders();

    @Subcomponent.Builder
    interface Builder {

        Builder setCompanyMobileNumberNodeModule(CompanyMobileNumberNodeModule module);

        CompanyMobileNumberNodeComponent build();
    }
}
