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

    @Provides @ComponentScope @Owner CompanyTrustNode provideCompanyTrustNode() {
        return owner;
    }

    @Provides @ComponentScope @Owner BaseTrustNode<?> provideBaseTrustNode() {
        return owner;
    }

    @Provides @ComponentScope @Owner ObjectUiNode<?> provideObjectUiNode() {
        return owner;
    }

    @Provides @ComponentScope @Owner ParentUiNode<?> provideParentUiNode() {
        return owner;
    }

    @Provides @ComponentScope @Owner UiNode<?> provideUiNode() {
        return owner;
    }

    @Provides @ChildName String provideChildName() {
        return owner.getContext().getNodeIdentity().getName();
    }

    @Provides @ComponentScope CompanyNode provideCompanyNode() {
        return owner.getParent();
    }

    @Provides @ComponentScope
    RuleProvider<CompanyTrustNode> provideRuleProvider(Provider<CompanyTrustNodeRuleProvider> provider) {
        return provider.get();
    }

    @Provides @ComponentScope
    Map<String, RuleProvider<CompanyTrustNode>> provideInstanceProviderMap(
        Provider<CompanyNodeChildProvider.CompanyTrustNodeRuleProvider> companyTrustNodeRuleProvider
    ) {
        Map<String, RuleProvider<CompanyTrustNode>> result = new HashMap<>();
        result.put("companyTrustNode", companyTrustNodeRuleProvider.get());
        return result;
    }
}