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

    @Provides @ComponentScope @Owner CompanyGeneralNode provideCompanyGeneralNode() {
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
    RuleProvider<CompanyGeneralNode> provideRuleProvider(Provider<CompanyGeneralNodeRuleProvider> provider) {
        return provider.get();
    }

    @Provides @ComponentScope
    Map<String, RuleProvider<CompanyGeneralNode>> provideInstanceProviderMap(
        Provider<CompanyNodeChildProvider.CompanyGeneralNodeRuleProvider> companyGeneralNodeRuleProvider
    ) {
        Map<String, RuleProvider<CompanyGeneralNode>> result = new HashMap<>();
        result.put("companyGeneralNode", companyGeneralNodeRuleProvider.get());
        return result;
    }
}