package zhy2002.examples.lodgement.gen.di;
import dagger.*;
import dagger.multibindings.*;
import javax.inject.*;
import zhy2002.examples.lodgement.gen.node.*;
import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import zhy2002.neutron.di.*;
import java.util.*;
import zhy2002.neutron.util.NeutronConstants;


@Module
public class ExpenseNodeModule {

    private final ExpenseNode owner;

    public ExpenseNodeModule(ExpenseNode owner) {
        this.owner = owner;
    }

    @Provides @ComponentScope @Owner ExpenseNode provideExpenseNode() {
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

    @Provides @ComponentScope ExpenseListNode provideExpenseListNode() {
        return owner.getParent();
    }

    @Provides @Named("ExpenseNodeRuleProvider") @IntoMap @StringKey(NeutronConstants.PLACEHOLDER_RULE_PROVIDER)
    RuleProvider<ExpenseNode> providePlaceholderRuleProvider() {
        return null;
    }

    @Provides @Named("ExpenseNodeRuleProvider") @IntoMap @StringKey(NeutronConstants.TYPE_RULE_PROVIDER)
    RuleProvider<ExpenseNode> provideTypeRuleProvider(ExpenseNodeRuleProvider provider) {
        return provider;
    }


    @Provides @ComponentScope
    List<RuleProvider<ExpenseNode>> provideRuleProviders(
        @Named("ExpenseNodeRuleProvider")  Map<String, Provider<RuleProvider<ExpenseNode>>> ruleProviderProviderMap
    ) {
        String[] potentialRuleProviderKeys = {NeutronConstants.TYPE_RULE_PROVIDER, owner.getName()};
        return RuleProvider.extractRuleProviders(potentialRuleProviderKeys, ruleProviderProviderMap);
    }
}