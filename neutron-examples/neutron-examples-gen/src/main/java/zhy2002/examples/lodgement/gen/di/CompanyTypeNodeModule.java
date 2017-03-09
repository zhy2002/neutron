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

    @Provides @CompanyTypeNodeScope @Owner CompanyTypeNode provideCompanyTypeNode() {
        return owner;
    }

    @Provides @CompanyTypeNodeScope @Owner StringUiNode<?> provideStringUiNode() {
        return owner;
    }

    @Provides @CompanyTypeNodeScope @Owner LeafUiNode<?,?> provideLeafUiNode() {
        return owner;
    }

    @Provides @CompanyTypeNodeScope @Owner UiNode<?> provideUiNode() {
        return owner;
    }

    @Provides @CompanyTypeNodeScope CompanyGeneralNode provideCompanyGeneralNode() {
        return owner.getParent();
    }

    @Provides @CompanyTypeNodeScope
    Map<String, RuleProvider<CompanyTypeNode>> provideInstanceProviders(
        Provider<CompanyGeneralNodeChildProvider.CompanyTypeNodeRuleProvider> companyTypeNodeRuleProvider
    ) {
        Map<String, RuleProvider<CompanyTypeNode>> result = new HashMap<>();
        result.put("companyTypeNode", companyTypeNodeRuleProvider.get());
        return result;
    }
}