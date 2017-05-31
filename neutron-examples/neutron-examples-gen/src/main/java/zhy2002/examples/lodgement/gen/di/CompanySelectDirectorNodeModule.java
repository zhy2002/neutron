package zhy2002.examples.lodgement.gen.di;
import dagger.*;
import javax.inject.*;
import zhy2002.examples.lodgement.gen.node.*;
import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import zhy2002.neutron.di.*;
import java.util.*;


@Module
public class CompanySelectDirectorNodeModule {

    private final CompanySelectDirectorNode owner;

    public CompanySelectDirectorNodeModule(CompanySelectDirectorNode owner) {
        this.owner = owner;
    }

    @Provides @ComponentScope @Owner CompanySelectDirectorNode provideCompanySelectDirectorNode() {
        return owner;
    }

    @Provides @ComponentScope @Owner SelectRelatedPersonListNode<?> provideSelectRelatedPersonListNode() {
        return owner;
    }

    @Provides @ComponentScope @Owner ListUiNode<?,?> provideListUiNode() {
        return owner;
    }

    @Provides @ComponentScope @Owner ParentUiNode<?> provideParentUiNode() {
        return owner;
    }

    @Provides @ComponentScope @Owner UiNode<?> provideUiNode() {
        return owner;
    }

    @Provides @ComponentScope CompanyGeneralNode provideCompanyGeneralNode() {
        return owner.getParent();
    }

    @Provides @ComponentScope
    RuleProvider<CompanySelectDirectorNode> provideRuleProvider(Provider<CompanySelectDirectorNodeRuleProvider> provider) {
        return provider.get();
    }

    @Provides @ComponentScope
    Map<String, RuleProvider<CompanySelectDirectorNode>> provideInstanceProviderMap(
        Provider<CompanyGeneralNodeChildProvider.CompanySelectDirectorNodeRuleProvider> companySelectDirectorNodeRuleProvider
    ) {
        Map<String, RuleProvider<CompanySelectDirectorNode>> result = new HashMap<>();
        result.put("companySelectDirectorNode", companySelectDirectorNodeRuleProvider.get());
        return result;
    }
}