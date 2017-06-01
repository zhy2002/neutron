package zhy2002.examples.lodgement.gen.di;
import dagger.*;
import javax.inject.*;
import zhy2002.examples.lodgement.gen.node.*;
import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import zhy2002.neutron.di.*;
import java.util.*;


@Module
public class ExistingMortgageListNodeModule {

    private final ExistingMortgageListNode owner;

    public ExistingMortgageListNodeModule(ExistingMortgageListNode owner) {
        this.owner = owner;
    }

    @Provides @ComponentScope @Owner ExistingMortgageListNode provideExistingMortgageListNode() {
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

    @Provides @ComponentScope UsageNode provideUsageNode() {
        return owner.getParent();
    }

    @Provides @ComponentScope
    RuleProvider<ExistingMortgageListNode> provideRuleProvider(Provider<ExistingMortgageListNodeRuleProvider> provider) {
        return provider.get();
    }

    @Provides @ComponentScope
    Map<String, RuleProvider<ExistingMortgageListNode>> provideInstanceProviderMap(
        Provider<UsageNodeChildProvider.ExistingMortgageListNodeRuleProvider> existingMortgageListNodeRuleProvider
    ) {
        Map<String, RuleProvider<ExistingMortgageListNode>> result = new HashMap<>();
        result.put("existingMortgageListNode", existingMortgageListNodeRuleProvider.get());
        return result;
    }
}