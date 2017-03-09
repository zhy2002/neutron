package zhy2002.examples.lodgement.gen.di;
import dagger.*;
import javax.inject.*;
import zhy2002.examples.lodgement.gen.node.*;
import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import zhy2002.neutron.di.*;
import java.util.*;


@Module
public class CompanyAbnNodeModule {

    private final CompanyAbnNode owner;

    public CompanyAbnNodeModule(CompanyAbnNode owner) {
        this.owner = owner;
    }

    @Provides @CompanyAbnNodeScope @Owner CompanyAbnNode provideCompanyAbnNode() {
        return owner;
    }

    @Provides @CompanyAbnNodeScope @Owner StringUiNode<?> provideStringUiNode() {
        return owner;
    }

    @Provides @CompanyAbnNodeScope @Owner LeafUiNode<?,?> provideLeafUiNode() {
        return owner;
    }

    @Provides @CompanyAbnNodeScope @Owner UiNode<?> provideUiNode() {
        return owner;
    }

    @Provides @CompanyAbnNodeScope CompanyGeneralNode provideCompanyGeneralNode() {
        return owner.getParent();
    }

    @Provides @CompanyAbnNodeScope
    Map<String, RuleProvider<CompanyAbnNode>> provideInstanceProviders(
        Provider<CompanyGeneralNodeChildProvider.CompanyAbnNodeRuleProvider> companyAbnNodeRuleProvider
    ) {
        Map<String, RuleProvider<CompanyAbnNode>> result = new HashMap<>();
        result.put("companyAbnNode", companyAbnNodeRuleProvider.get());
        return result;
    }
}