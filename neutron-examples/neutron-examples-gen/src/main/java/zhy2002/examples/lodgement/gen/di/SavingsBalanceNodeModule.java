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
public class SavingsBalanceNodeModule {

    private final SavingsBalanceNode owner;

    public SavingsBalanceNodeModule(SavingsBalanceNode owner) {
        this.owner = owner;
    }

    @Provides @ComponentScope @Owner SavingsBalanceNode provideSavingsBalanceNode() {
        return owner;
    }

    @Provides @ComponentScope @Owner BaseCurrencyNode<?> provideBaseCurrencyNode() {
        return owner;
    }

    @Provides @ComponentScope @Owner BigDecimalUiNode<?> provideBigDecimalUiNode() {
        return owner;
    }

    @Provides @ComponentScope @Owner LeafUiNode<?,?> provideLeafUiNode() {
        return owner;
    }

    @Provides @ComponentScope @Owner UiNode<?> provideUiNode() {
        return owner;
    }

    @Provides @ComponentScope SavingsAccountNode provideSavingsAccountNode() {
        return owner.getParent();
    }

    @Provides @Named("SavingsBalanceNodeRuleProvider") @IntoMap @StringKey(NeutronConstants.PLACEHOLDER_RULE_PROVIDER)
    RuleProvider<SavingsBalanceNode> providePlaceholderRuleProvider() {
        return null;
    }

    @Provides @Named("SavingsBalanceNodeRuleProvider") @IntoMap @StringKey(NeutronConstants.TYPE_RULE_PROVIDER)
    RuleProvider<SavingsBalanceNode> provideTypeRuleProvider(SavingsBalanceNodeRuleProvider provider) {
        return provider;
    }

        @Provides @Named("SavingsBalanceNodeRuleProvider") @IntoMap @StringKey("savingsBalanceNode")
        RuleProvider<SavingsBalanceNode> provideSavingsBalanceNodeChildRuleProvider(
            SavingsAccountNodeChildProvider.SavingsBalanceNodeRuleProvider provider
        ) {
            return provider;
        }


    @Provides @ComponentScope
    List<RuleProvider<SavingsBalanceNode>> provideRuleProviders(
        @Named("SavingsBalanceNodeRuleProvider")  Map<String, Provider<RuleProvider<SavingsBalanceNode>>> ruleProviderProviderMap
    ) {
        String[] potentialRuleProviderKeys = {NeutronConstants.TYPE_RULE_PROVIDER, owner.getName()};
        return RuleProvider.extractRuleProviders(potentialRuleProviderKeys, ruleProviderProviderMap);
    }
}