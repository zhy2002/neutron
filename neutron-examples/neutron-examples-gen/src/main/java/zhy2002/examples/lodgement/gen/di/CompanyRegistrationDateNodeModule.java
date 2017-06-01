package zhy2002.examples.lodgement.gen.di;
import dagger.*;
import javax.inject.*;
import zhy2002.examples.lodgement.gen.node.*;
import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import zhy2002.neutron.di.*;
import java.util.*;


@Module
public class CompanyRegistrationDateNodeModule {

    private final CompanyRegistrationDateNode owner;

    public CompanyRegistrationDateNodeModule(CompanyRegistrationDateNode owner) {
        this.owner = owner;
    }

    @Provides @ComponentScope @Owner CompanyRegistrationDateNode provideCompanyRegistrationDateNode() {
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

    @Provides @ComponentScope CompanyGeneralNode provideCompanyGeneralNode() {
        return owner.getParent();
    }

    @Provides @ComponentScope
    RuleProvider<CompanyRegistrationDateNode> provideRuleProvider(Provider<CompanyRegistrationDateNodeRuleProvider> provider) {
        return provider.get();
    }

    @Provides @ComponentScope
    Map<String, RuleProvider<CompanyRegistrationDateNode>> provideInstanceProviderMap(
        Provider<CompanyGeneralNodeChildProvider.CompanyRegistrationDateNodeRuleProvider> companyRegistrationDateNodeRuleProvider
    ) {
        Map<String, RuleProvider<CompanyRegistrationDateNode>> result = new HashMap<>();
        result.put("companyRegistrationDateNode", companyRegistrationDateNodeRuleProvider.get());
        return result;
    }
}