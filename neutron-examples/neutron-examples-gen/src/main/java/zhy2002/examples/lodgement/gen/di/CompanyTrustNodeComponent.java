package zhy2002.examples.lodgement.gen.di;
import dagger.Subcomponent;
import zhy2002.examples.lodgement.gen.node.*;
import zhy2002.neutron.RuleProvider;
import java.util.*;

@CompanyTrustNodeScope
@Subcomponent(modules = {CompanyTrustNodeModule.class})
public interface CompanyTrustNodeComponent {

    RuleProvider<CompanyTrustNode> getCompanyTrustNodeRuleProvider();
    Map<String, RuleProvider<CompanyTrustNode>> getInstanceRuleProviders();

    @Subcomponent.Builder
    interface Builder {

        Builder setCompanyTrustNodeModule(CompanyTrustNodeModule module);

        CompanyTrustNodeComponent build();
    }
}
