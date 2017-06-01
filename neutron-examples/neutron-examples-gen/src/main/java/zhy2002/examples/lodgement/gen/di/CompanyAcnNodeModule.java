package zhy2002.examples.lodgement.gen.di;
import dagger.*;
import javax.inject.*;
import zhy2002.examples.lodgement.gen.node.*;
import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import zhy2002.neutron.di.*;
import java.util.*;


@Module
public class CompanyAcnNodeModule {

    private final CompanyAcnNode owner;

    public CompanyAcnNodeModule(CompanyAcnNode owner) {
        this.owner = owner;
    }

    @Provides @ComponentScope @Owner CompanyAcnNode provideCompanyAcnNode() {
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
        return owner.getContext().getNameOfNodeBeingCreated();
    }

    @Provides @ComponentScope CompanyGeneralNode provideCompanyGeneralNode() {
        return owner.getParent();
    }

    @Provides @ComponentScope
    RuleProvider<CompanyAcnNode> provideRuleProvider(Provider<CompanyAcnNodeRuleProvider> provider) {
        return provider.get();
    }

    @Provides @ComponentScope
    Map<String, RuleProvider<CompanyAcnNode>> provideInstanceProviderMap(
        Provider<CompanyGeneralNodeChildProvider.CompanyAcnNodeRuleProvider> companyAcnNodeRuleProvider
    ) {
        Map<String, RuleProvider<CompanyAcnNode>> result = new HashMap<>();
        result.put("companyAcnNode", companyAcnNodeRuleProvider.get());
        return result;
    }
}