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
public class MortgqageUnpaidBalanceNodeModule {

    private final MortgqageUnpaidBalanceNode owner;

    public MortgqageUnpaidBalanceNodeModule(MortgqageUnpaidBalanceNode owner) {
        this.owner = owner;
    }

    @Provides @ComponentScope @Owner MortgqageUnpaidBalanceNode provideMortgqageUnpaidBalanceNode() {
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

    @Provides @ComponentScope ExistingMortgageNode provideExistingMortgageNode() {
        return owner.getParent();
    }

    @Provides @Named("MortgqageUnpaidBalanceNodeRuleProvider") @IntoMap @StringKey(NeutronConstants.PLACEHOLDER_RULE_PROVIDER)
    RuleProvider<MortgqageUnpaidBalanceNode> providePlaceholderRuleProvider() {
        return null;
    }

    @Provides @Named("MortgqageUnpaidBalanceNodeRuleProvider") @IntoMap @StringKey(NeutronConstants.TYPE_RULE_PROVIDER)
    RuleProvider<MortgqageUnpaidBalanceNode> provideTypeRuleProvider(MortgqageUnpaidBalanceNodeRuleProvider provider) {
        return provider;
    }


    @Provides @ComponentScope
    List<RuleProvider<MortgqageUnpaidBalanceNode>> provideRuleProviders(
        @Named("MortgqageUnpaidBalanceNodeRuleProvider")  Map<String, Provider<RuleProvider<MortgqageUnpaidBalanceNode>>> ruleProviderProviderMap
    ) {
        String[] potentialRuleProviderKeys = {NeutronConstants.TYPE_RULE_PROVIDER, owner.getName()};
        return RuleProvider.extractRuleProviders(potentialRuleProviderKeys, ruleProviderProviderMap);
    }
}