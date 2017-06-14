package zhy2002.examples.lodgement.gen.di;
import dagger.*;
import dagger.multibindings.*;
import javax.inject.*;
import zhy2002.examples.lodgement.gen.node.*;
import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import zhy2002.neutron.di.*;
import zhy2002.neutron.config.NeutronConstants;
import java.util.*;


@Module
public class ExpenseOwnershipListNodeModule {

    private final ExpenseOwnershipListNode owner;

    public ExpenseOwnershipListNodeModule(ExpenseOwnershipListNode owner) {
        this.owner = owner;
    }

    @Provides @ComponentScope @Owner ExpenseOwnershipListNode provideExpenseOwnershipListNode() {
        return owner;
    }

    @Provides @ComponentScope @Owner OwnershipListNode<?> provideOwnershipListNode() {
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

    @Provides @ComponentScope ExpenseNode provideExpenseNode() {
        return owner.getParent();
    }

    @Provides @Named("ExpenseOwnershipListNodeRuleProvider") @IntoMap @StringKey(NeutronConstants.PLACEHOLDER_RULE_PROVIDER)
    RuleProvider<ExpenseOwnershipListNode> providePlaceholderRuleProvider() {
        return null;
    }

    @Provides @Named("ExpenseOwnershipListNodeRuleProvider") @IntoMap @StringKey(NeutronConstants.TYPE_RULE_PROVIDER)
    RuleProvider<ExpenseOwnershipListNode> provideTypeRuleProvider(ExpenseOwnershipListNodeRuleProvider provider) {
        return provider;
    }


    @Provides @ComponentScope
    List<RuleProvider<ExpenseOwnershipListNode>> provideRuleProviders(
        @Named("ExpenseOwnershipListNodeRuleProvider")  Map<String, Provider<RuleProvider<ExpenseOwnershipListNode>>> ruleProviderProviderMap
    ) {
        String[] potentialRuleProviderKeys = {NeutronConstants.TYPE_RULE_PROVIDER, owner.getName(), owner.getName() + "-test"};
        return RuleProvider.extractRuleProviders(potentialRuleProviderKeys, ruleProviderProviderMap);
    }
}