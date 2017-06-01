package zhy2002.examples.lodgement.gen.di;
import dagger.*;
import javax.inject.*;
import zhy2002.examples.lodgement.gen.node.*;
import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import zhy2002.neutron.di.*;
import java.util.*;


@Module
public class CompanyDescriptionNodeModule {

    private final CompanyDescriptionNode owner;

    public CompanyDescriptionNodeModule(CompanyDescriptionNode owner) {
        this.owner = owner;
    }

    @Provides @ComponentScope @Owner CompanyDescriptionNode provideCompanyDescriptionNode() {
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
    RuleProvider<CompanyDescriptionNode> provideRuleProvider(Provider<CompanyDescriptionNodeRuleProvider> provider) {
        return provider.get();
    }

    @Provides @ComponentScope
    Map<String, RuleProvider<CompanyDescriptionNode>> provideInstanceProviderMap(
        Provider<CompanyGeneralNodeChildProvider.CompanyDescriptionNodeRuleProvider> companyDescriptionNodeRuleProvider
    ) {
        Map<String, RuleProvider<CompanyDescriptionNode>> result = new HashMap<>();
        result.put("companyDescriptionNode", companyDescriptionNodeRuleProvider.get());
        return result;
    }
}