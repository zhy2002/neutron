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
public class ExpenseDescriptionNodeModule {

    private final ExpenseDescriptionNode owner;

    public ExpenseDescriptionNodeModule(ExpenseDescriptionNode owner) {
        this.owner = owner;
    }

    @Provides @ComponentScope @Owner ExpenseDescriptionNode provideExpenseDescriptionNode() {
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

    @Provides @ComponentScope ExpenseNode provideExpenseNode() {
        return owner.getParent();
    }

    @Provides @Named("ExpenseDescriptionNodeRuleProvider") @IntoMap @StringKey(NeutronConstants.PLACEHOLDER_RULE_PROVIDER)
    RuleProvider<ExpenseDescriptionNode> providePlaceholderRuleProvider() {
        return null;
    }

    @Provides @Named("ExpenseDescriptionNodeRuleProvider") @IntoMap @StringKey(NeutronConstants.TYPE_RULE_PROVIDER)
    RuleProvider<ExpenseDescriptionNode> provideTypeRuleProvider(ExpenseDescriptionNodeRuleProvider provider) {
        return provider;
    }


    @Provides @ComponentScope
    List<RuleProvider<ExpenseDescriptionNode>> provideRuleProviders(
        @Named("ExpenseDescriptionNodeRuleProvider")  Map<String, Provider<RuleProvider<ExpenseDescriptionNode>>> ruleProviderProviderMap
    ) {
        String[] potentialRuleProviderKeys = {NeutronConstants.TYPE_RULE_PROVIDER, owner.getName()};
        return RuleProvider.extractRuleProviders(potentialRuleProviderKeys, ruleProviderProviderMap);
    }
}