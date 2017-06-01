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

    @Provides @ComponentScope @Owner CompanyPrivacyNode provideCompanyPrivacyNode() {
        return owner;
    }

    @Provides @ComponentScope @Owner BasePrivacyNode<?> provideBasePrivacyNode() {
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
        return owner.getContext().getNameOfNodeBeingCreated();
    }

    @Provides @ComponentScope CompanyNode provideCompanyNode() {
        return owner.getParent();
    }

    @Provides @ComponentScope
    RuleProvider<CompanyPrivacyNode> provideRuleProvider(Provider<CompanyPrivacyNodeRuleProvider> provider) {
        return provider.get();
    }

    @Provides @ComponentScope
    Map<String, RuleProvider<CompanyPrivacyNode>> provideInstanceProviderMap(
        Provider<CompanyNodeChildProvider.CompanyPrivacyNodeRuleProvider> companyPrivacyNodeRuleProvider
    ) {
        Map<String, RuleProvider<CompanyPrivacyNode>> result = new HashMap<>();
        result.put("companyPrivacyNode", companyPrivacyNodeRuleProvider.get());
        return result;
    }
}