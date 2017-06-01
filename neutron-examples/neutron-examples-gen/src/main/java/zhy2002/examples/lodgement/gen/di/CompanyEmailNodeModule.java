package zhy2002.examples.lodgement.gen.di;
import dagger.*;
import javax.inject.*;
import zhy2002.examples.lodgement.gen.node.*;
import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import zhy2002.neutron.di.*;
import java.util.*;


@Module
public class CompanyEmailNodeModule {

    private final CompanyEmailNode owner;

    public CompanyEmailNodeModule(CompanyEmailNode owner) {
        this.owner = owner;
    }

    @Provides @ComponentScope @Owner CompanyEmailNode provideCompanyEmailNode() {
        return owner;
    }

    @Provides @ComponentScope @Owner EmailNode<?> provideEmailNode() {
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

    @Provides @ComponentScope CompanyContactNode provideCompanyContactNode() {
        return owner.getParent();
    }

    @Provides @ComponentScope
    RuleProvider<CompanyEmailNode> provideRuleProvider(Provider<CompanyEmailNodeRuleProvider> provider) {
        return provider.get();
    }

    @Provides @ComponentScope
    Map<String, RuleProvider<CompanyEmailNode>> provideInstanceProviderMap(
        Provider<CompanyContactNodeChildProvider.CompanyEmailNodeRuleProvider> companyEmailNodeRuleProvider
    ) {
        Map<String, RuleProvider<CompanyEmailNode>> result = new HashMap<>();
        result.put("companyEmailNode", companyEmailNodeRuleProvider.get());
        return result;
    }
}