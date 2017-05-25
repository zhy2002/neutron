package zhy2002.examples.lodgement.gen.di;
import dagger.*;
import javax.inject.*;
import zhy2002.examples.lodgement.gen.node.*;
import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import zhy2002.neutron.di.*;
import java.util.*;


@Module
public class CompanyListNodeModule {

    private final CompanyListNode owner;

    public CompanyListNodeModule(CompanyListNode owner) {
        this.owner = owner;
    }

    @Provides @CompanyListNodeScope @Owner CompanyListNode provideCompanyListNode() {
        return owner;
    }

    @Provides @CompanyListNodeScope @Owner ListUiNode<?,?> provideListUiNode() {
        return owner;
    }

    @Provides @CompanyListNodeScope @Owner ParentUiNode<?> provideParentUiNode() {
        return owner;
    }

    @Provides @CompanyListNodeScope @Owner UiNode<?> provideUiNode() {
        return owner;
    }

    @Provides @CompanyListNodeScope ApplicationNode provideApplicationNode() {
        return owner.getParent();
    }

    @Provides @CompanyListNodeScope
    RuleProvider<CompanyListNode> provideRuleProvider(Provider<CompanyListNodeRuleProvider> provider) {
        return provider.get();
    }

    @Provides @CompanyListNodeScope
    Map<String, RuleProvider<CompanyListNode>> provideInstanceProviderMap(
        Provider<ApplicationNodeChildProvider.CompanyListNodeRuleProvider> companyListNodeRuleProvider
    ) {
        Map<String, RuleProvider<CompanyListNode>> result = new HashMap<>();
        result.put("companyListNode", companyListNodeRuleProvider.get());
        return result;
    }
}