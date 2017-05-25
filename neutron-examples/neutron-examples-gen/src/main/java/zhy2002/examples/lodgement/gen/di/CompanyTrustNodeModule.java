package zhy2002.examples.lodgement.gen.di;
import dagger.*;
import javax.inject.*;
import zhy2002.examples.lodgement.gen.node.*;
import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import zhy2002.neutron.di.*;
import java.util.*;


@Module
public class CompanyTrustNodeModule {

    private final CompanyTrustNode owner;

    public CompanyTrustNodeModule(CompanyTrustNode owner) {
        this.owner = owner;
    }

    @Provides @CompanyTrustNodeScope @Owner CompanyTrustNode provideCompanyTrustNode() {
        return owner;
    }

    @Provides @CompanyTrustNodeScope @Owner BaseTrustNode<?> provideBaseTrustNode() {
        return owner;
    }

    @Provides @CompanyTrustNodeScope @Owner ObjectUiNode<?> provideObjectUiNode() {
        return owner;
    }

    @Provides @CompanyTrustNodeScope @Owner ParentUiNode<?> provideParentUiNode() {
        return owner;
    }

    @Provides @CompanyTrustNodeScope @Owner UiNode<?> provideUiNode() {
        return owner;
    }

    @Provides @CompanyTrustNodeScope CompanyNode provideCompanyNode() {
        return owner.getParent();
    }

    @Provides @CompanyTrustNodeScope
    RuleProvider<CompanyTrustNode> provideRuleProvider(Provider<CompanyTrustNodeRuleProvider> provider) {
        return provider.get();
    }

    @Provides @CompanyTrustNodeScope
    Map<String, RuleProvider<CompanyTrustNode>> provideInstanceProviderMap(
        Provider<CompanyNodeChildProvider.CompanyTrustNodeRuleProvider> companyTrustNodeRuleProvider
    ) {
        Map<String, RuleProvider<CompanyTrustNode>> result = new HashMap<>();
        result.put("companyTrustNode", companyTrustNodeRuleProvider.get());
        return result;
    }
}