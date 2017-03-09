package zhy2002.examples.lodgement.gen.di;
import dagger.*;
import javax.inject.*;
import zhy2002.examples.lodgement.gen.node.*;
import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import zhy2002.neutron.di.*;
import java.util.*;


@Module
public class CompanyPrivacyNodeModule {

    private final CompanyPrivacyNode owner;

    public CompanyPrivacyNodeModule(CompanyPrivacyNode owner) {
        this.owner = owner;
    }

    @Provides @CompanyPrivacyNodeScope @Owner CompanyPrivacyNode provideCompanyPrivacyNode() {
        return owner;
    }

    @Provides @CompanyPrivacyNodeScope @Owner BasePrivacyNode<?> provideBasePrivacyNode() {
        return owner;
    }

    @Provides @CompanyPrivacyNodeScope @Owner ObjectUiNode<?> provideObjectUiNode() {
        return owner;
    }

    @Provides @CompanyPrivacyNodeScope @Owner ParentUiNode<?> provideParentUiNode() {
        return owner;
    }

    @Provides @CompanyPrivacyNodeScope @Owner UiNode<?> provideUiNode() {
        return owner;
    }

    @Provides @CompanyPrivacyNodeScope CompanyNode provideCompanyNode() {
        return owner.getParent();
    }

    @Provides @CompanyPrivacyNodeScope
    Map<String, RuleProvider<CompanyPrivacyNode>> provideInstanceProviders(
        Provider<CompanyNodeChildProvider.CompanyPrivacyNodeRuleProvider> companyPrivacyNodeRuleProvider
    ) {
        Map<String, RuleProvider<CompanyPrivacyNode>> result = new HashMap<>();
        result.put("companyPrivacyNode", companyPrivacyNodeRuleProvider.get());
        return result;
    }
}