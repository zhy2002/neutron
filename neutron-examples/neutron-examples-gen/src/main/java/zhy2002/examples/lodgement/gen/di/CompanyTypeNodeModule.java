package zhy2002.examples.lodgement.gen.di;
import dagger.*;
import javax.inject.*;
import zhy2002.examples.lodgement.gen.node.*;
import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import zhy2002.neutron.di.*;
import java.util.*;


@Module
public class CompanyTypeNodeModule {

    private final CompanyTypeNode owner;

    public CompanyTypeNodeModule(CompanyTypeNode owner) {
        this.owner = owner;
    }

    @Provides @ComponentScope @Owner CompanyTypeNode provideCompanyTypeNode() {
        return owner;
    }

    @Provides @ComponentScope @Owner StringUiNode<?> provideStringUiNode() {
        return owner;
    }

    @Provides @ComponentScope @Owner LeafUiNode<?,?> provideLeafUiNode() {
        return owner;
    }

    @Provides @ComponentScope @Owner UiNode<?> provideUiNode() {
        return owner;
    }

    @Provides @ComponentScope CompanyGeneralNode provideCompanyGeneralNode() {
        return owner.getParent();
    }

    @Provides @ComponentScope
    RuleProvider<CompanyTypeNode> provideRuleProvider(Provider<CompanyTypeNodeRuleProvider> provider) {
        return provider.get();
    }

    @Provides @ComponentScope
    Map<String, RuleProvider<CompanyTypeNode>> provideInstanceProviderMap(
        Provider<CompanyGeneralNodeChildProvider.CompanyTypeNodeRuleProvider> companyTypeNodeRuleProvider
    ) {
        Map<String, RuleProvider<CompanyTypeNode>> result = new HashMap<>();
        result.put("companyTypeNode", companyTypeNodeRuleProvider.get());
        return result;
    }
}