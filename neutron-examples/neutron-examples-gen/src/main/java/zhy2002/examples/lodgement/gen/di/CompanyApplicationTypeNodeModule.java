package zhy2002.examples.lodgement.gen.di;
import dagger.*;
import javax.inject.*;
import zhy2002.examples.lodgement.gen.node.*;
import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import zhy2002.neutron.di.*;
import java.util.*;


@Module
public class CompanyApplicationTypeNodeModule {

    private final CompanyApplicationTypeNode owner;

    public CompanyApplicationTypeNodeModule(CompanyApplicationTypeNode owner) {
        this.owner = owner;
    }

    @Provides @ComponentScope @Owner CompanyApplicationTypeNode provideCompanyApplicationTypeNode() {
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
    RuleProvider<CompanyApplicationTypeNode> provideRuleProvider(Provider<CompanyApplicationTypeNodeRuleProvider> provider) {
        return provider.get();
    }

    @Provides @ComponentScope
    Map<String, RuleProvider<CompanyApplicationTypeNode>> provideInstanceProviderMap(
        Provider<CompanyGeneralNodeChildProvider.CompanyApplicationTypeNodeRuleProvider> companyApplicationTypeNodeRuleProvider
    ) {
        Map<String, RuleProvider<CompanyApplicationTypeNode>> result = new HashMap<>();
        result.put("companyApplicationTypeNode", companyApplicationTypeNodeRuleProvider.get());
        return result;
    }
}