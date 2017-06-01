package zhy2002.examples.lodgement.gen.di;
import dagger.*;
import javax.inject.*;
import zhy2002.examples.lodgement.gen.node.*;
import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import zhy2002.neutron.di.*;
import java.util.*;


@Module
public class CompanyContactNodeModule {

    private final CompanyContactNode owner;

    public CompanyContactNodeModule(CompanyContactNode owner) {
        this.owner = owner;
    }

    @Provides @ComponentScope @Owner CompanyContactNode provideCompanyContactNode() {
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
    RuleProvider<CompanyContactNode> provideRuleProvider(Provider<CompanyContactNodeRuleProvider> provider) {
        return provider.get();
    }

    @Provides @ComponentScope
    Map<String, RuleProvider<CompanyContactNode>> provideInstanceProviderMap(
        Provider<CompanyNodeChildProvider.CompanyContactNodeRuleProvider> companyContactNodeRuleProvider
    ) {
        Map<String, RuleProvider<CompanyContactNode>> result = new HashMap<>();
        result.put("companyContactNode", companyContactNodeRuleProvider.get());
        return result;
    }
}