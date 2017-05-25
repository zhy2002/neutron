package zhy2002.examples.lodgement.gen.di;
import dagger.*;
import javax.inject.*;
import zhy2002.examples.lodgement.gen.node.*;
import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import zhy2002.neutron.di.*;
import java.util.*;


@Module
public class CompanyIndustryNodeModule {

    private final CompanyIndustryNode owner;

    public CompanyIndustryNodeModule(CompanyIndustryNode owner) {
        this.owner = owner;
    }

    @Provides @CompanyIndustryNodeScope @Owner CompanyIndustryNode provideCompanyIndustryNode() {
        return owner;
    }

    @Provides @CompanyIndustryNodeScope @Owner StringUiNode<?> provideStringUiNode() {
        return owner;
    }

    @Provides @CompanyIndustryNodeScope @Owner LeafUiNode<?,?> provideLeafUiNode() {
        return owner;
    }

    @Provides @CompanyIndustryNodeScope @Owner UiNode<?> provideUiNode() {
        return owner;
    }

    @Provides @CompanyIndustryNodeScope CompanyGeneralNode provideCompanyGeneralNode() {
        return owner.getParent();
    }

    @Provides @CompanyIndustryNodeScope
    RuleProvider<CompanyIndustryNode> provideRuleProvider(Provider<CompanyIndustryNodeRuleProvider> provider) {
        return provider.get();
    }

    @Provides @CompanyIndustryNodeScope
    Map<String, RuleProvider<CompanyIndustryNode>> provideInstanceProviderMap(
        Provider<CompanyGeneralNodeChildProvider.CompanyIndustryNodeRuleProvider> companyIndustryNodeRuleProvider
    ) {
        Map<String, RuleProvider<CompanyIndustryNode>> result = new HashMap<>();
        result.put("companyIndustryNode", companyIndustryNodeRuleProvider.get());
        return result;
    }
}