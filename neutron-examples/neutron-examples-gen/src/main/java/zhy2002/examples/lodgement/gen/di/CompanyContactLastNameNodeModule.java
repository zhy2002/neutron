package zhy2002.examples.lodgement.gen.di;
import dagger.*;
import javax.inject.*;
import zhy2002.examples.lodgement.gen.node.*;
import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import zhy2002.neutron.di.*;
import java.util.*;


@Module
public class CompanyContactLastNameNodeModule {

    private final CompanyContactLastNameNode owner;

    public CompanyContactLastNameNodeModule(CompanyContactLastNameNode owner) {
        this.owner = owner;
    }

    @Provides @CompanyContactLastNameNodeScope @Owner CompanyContactLastNameNode provideCompanyContactLastNameNode() {
        return owner;
    }

    @Provides @CompanyContactLastNameNodeScope @Owner StringUiNode<?> provideStringUiNode() {
        return owner;
    }

    @Provides @CompanyContactLastNameNodeScope @Owner LeafUiNode<?,?> provideLeafUiNode() {
        return owner;
    }

    @Provides @CompanyContactLastNameNodeScope @Owner UiNode<?> provideUiNode() {
        return owner;
    }

    @Provides @CompanyContactLastNameNodeScope CompanyContactNode provideCompanyContactNode() {
        return owner.getParent();
    }

    @Provides @CompanyContactLastNameNodeScope
    RuleProvider<CompanyContactLastNameNode> provideRuleProvider(Provider<CompanyContactLastNameNodeRuleProvider> provider) {
        return provider.get();
    }

    @Provides @CompanyContactLastNameNodeScope
    Map<String, RuleProvider<CompanyContactLastNameNode>> provideInstanceProviderMap(
        Provider<CompanyContactNodeChildProvider.CompanyContactLastNameNodeRuleProvider> companyContactLastNameNodeRuleProvider
    ) {
        Map<String, RuleProvider<CompanyContactLastNameNode>> result = new HashMap<>();
        result.put("companyContactLastNameNode", companyContactLastNameNodeRuleProvider.get());
        return result;
    }
}