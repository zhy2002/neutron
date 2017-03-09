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

    @Provides @CompanyEmailNodeScope @Owner CompanyEmailNode provideCompanyEmailNode() {
        return owner;
    }

    @Provides @CompanyEmailNodeScope @Owner EmailNode<?> provideEmailNode() {
        return owner;
    }

    @Provides @CompanyEmailNodeScope @Owner StringUiNode<?> provideStringUiNode() {
        return owner;
    }

    @Provides @CompanyEmailNodeScope @Owner LeafUiNode<?,?> provideLeafUiNode() {
        return owner;
    }

    @Provides @CompanyEmailNodeScope @Owner UiNode<?> provideUiNode() {
        return owner;
    }

    @Provides @CompanyEmailNodeScope CompanyContactNode provideCompanyContactNode() {
        return owner.getParent();
    }

    @Provides @CompanyEmailNodeScope
    Map<String, RuleProvider<CompanyEmailNode>> provideInstanceProviders(
        Provider<CompanyContactNodeChildProvider.CompanyEmailNodeRuleProvider> companyEmailNodeRuleProvider
    ) {
        Map<String, RuleProvider<CompanyEmailNode>> result = new HashMap<>();
        result.put("companyEmailNode", companyEmailNodeRuleProvider.get());
        return result;
    }
}