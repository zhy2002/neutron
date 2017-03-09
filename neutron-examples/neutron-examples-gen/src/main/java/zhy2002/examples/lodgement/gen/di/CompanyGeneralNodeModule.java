package zhy2002.examples.lodgement.gen.di;
import dagger.*;
import javax.inject.*;
import zhy2002.examples.lodgement.gen.node.*;
import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import zhy2002.neutron.di.*;
import java.util.*;


@Module
public class CompanyGeneralNodeModule {

    private final CompanyGeneralNode owner;

    public CompanyGeneralNodeModule(CompanyGeneralNode owner) {
        this.owner = owner;
    }

    @Provides @CompanyGeneralNodeScope @Owner CompanyGeneralNode provideCompanyGeneralNode() {
        return owner;
    }

    @Provides @CompanyGeneralNodeScope @Owner ObjectUiNode<?> provideObjectUiNode() {
        return owner;
    }

    @Provides @CompanyGeneralNodeScope @Owner ParentUiNode<?> provideParentUiNode() {
        return owner;
    }

    @Provides @CompanyGeneralNodeScope @Owner UiNode<?> provideUiNode() {
        return owner;
    }

    @Provides @CompanyGeneralNodeScope CompanyNode provideCompanyNode() {
        return owner.getParent();
    }

    @Provides @CompanyGeneralNodeScope
    Map<String, RuleProvider<CompanyGeneralNode>> provideInstanceProviders(
        Provider<CompanyNodeChildProvider.CompanyGeneralNodeRuleProvider> companyGeneralNodeRuleProvider
    ) {
        Map<String, RuleProvider<CompanyGeneralNode>> result = new HashMap<>();
        result.put("companyGeneralNode", companyGeneralNodeRuleProvider.get());
        return result;
    }
}