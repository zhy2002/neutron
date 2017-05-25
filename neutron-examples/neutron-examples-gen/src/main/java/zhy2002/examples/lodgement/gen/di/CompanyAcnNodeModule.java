package zhy2002.examples.lodgement.gen.di;
import dagger.*;
import javax.inject.*;
import zhy2002.examples.lodgement.gen.node.*;
import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import zhy2002.neutron.di.*;
import java.util.*;


@Module
public class CompanyAcnNodeModule {

    private final CompanyAcnNode owner;

    public CompanyAcnNodeModule(CompanyAcnNode owner) {
        this.owner = owner;
    }

    @Provides @CompanyAcnNodeScope @Owner CompanyAcnNode provideCompanyAcnNode() {
        return owner;
    }

    @Provides @CompanyAcnNodeScope @Owner StringUiNode<?> provideStringUiNode() {
        return owner;
    }

    @Provides @CompanyAcnNodeScope @Owner LeafUiNode<?,?> provideLeafUiNode() {
        return owner;
    }

    @Provides @CompanyAcnNodeScope @Owner UiNode<?> provideUiNode() {
        return owner;
    }

    @Provides @CompanyAcnNodeScope CompanyGeneralNode provideCompanyGeneralNode() {
        return owner.getParent();
    }

    @Provides @CompanyAcnNodeScope
    RuleProvider<CompanyAcnNode> provideRuleProvider(Provider<CompanyAcnNodeRuleProvider> provider) {
        return provider.get();
    }

    @Provides @CompanyAcnNodeScope
    Map<String, RuleProvider<CompanyAcnNode>> provideInstanceProviderMap(
        Provider<CompanyGeneralNodeChildProvider.CompanyAcnNodeRuleProvider> companyAcnNodeRuleProvider
    ) {
        Map<String, RuleProvider<CompanyAcnNode>> result = new HashMap<>();
        result.put("companyAcnNode", companyAcnNodeRuleProvider.get());
        return result;
    }
}