package zhy2002.examples.lodgement.gen.di;
import dagger.Subcomponent;
import zhy2002.examples.lodgement.gen.*;
import zhy2002.examples.lodgement.gen.node.*;
import zhy2002.neutron.RuleProvider;
import java.util.*;

@CompanyTrustNodeScope
@Subcomponent(modules = {CompanyTrustNodeModule.class})
public interface CompanyTrustNodeComponent {

    CompanyTrustNodeRuleProvider getCompanyTrustNodeRuleProvider();
    Map<String, RuleProvider<CompanyTrustNode>> getInstanceRuleProviders();

    @Subcomponent.Builder
    interface Builder {

        Builder setCompanyTrustNodeModule(CompanyTrustNodeModule module);

        CompanyTrustNodeComponent build();
    }
}
