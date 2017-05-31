package zhy2002.examples.lodgement.gen.di;
import dagger.*;
import javax.inject.*;
import zhy2002.examples.lodgement.gen.node.*;
import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import zhy2002.neutron.di.*;
import java.util.*;


@Module
public class CompanyRegistrationStateNodeModule {

    private final CompanyRegistrationStateNode owner;

    public CompanyRegistrationStateNodeModule(CompanyRegistrationStateNode owner) {
        this.owner = owner;
    }

    @Provides @ComponentScope @Owner CompanyRegistrationStateNode provideCompanyRegistrationStateNode() {
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

    @Provides @ComponentScope CompanyGeneralNode provideCompanyGeneralNode() {
        return owner.getParent();
    }

    @Provides @ComponentScope
    RuleProvider<CompanyRegistrationStateNode> provideRuleProvider(Provider<CompanyRegistrationStateNodeRuleProvider> provider) {
        return provider.get();
    }

    @Provides @ComponentScope
    Map<String, RuleProvider<CompanyRegistrationStateNode>> provideInstanceProviderMap(
        Provider<CompanyGeneralNodeChildProvider.CompanyRegistrationStateNodeRuleProvider> companyRegistrationStateNodeRuleProvider
    ) {
        Map<String, RuleProvider<CompanyRegistrationStateNode>> result = new HashMap<>();
        result.put("companyRegistrationStateNode", companyRegistrationStateNodeRuleProvider.get());
        return result;
    }
}