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

    @Provides @ComponentScope @Owner CompanyIndustryNode provideCompanyIndustryNode() {
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

    @Provides @ChildName String provideChildName() {
        return owner.getContext().getNodeIdentity().getName();
    }

    @Provides @ComponentScope CompanyGeneralNode provideCompanyGeneralNode() {
        return owner.getParent();
    }

    @Provides @ComponentScope
    RuleProvider<CompanyIndustryNode> provideRuleProvider(Provider<CompanyIndustryNodeRuleProvider> provider) {
        return provider.get();
    }

    @Provides @ComponentScope
    Map<String, RuleProvider<CompanyIndustryNode>> provideInstanceProviderMap(
        Provider<CompanyGeneralNodeChildProvider.CompanyIndustryNodeRuleProvider> companyIndustryNodeRuleProvider
    ) {
        Map<String, RuleProvider<CompanyIndustryNode>> result = new HashMap<>();
        result.put("companyIndustryNode", companyIndustryNodeRuleProvider.get());
        return result;
    }
}