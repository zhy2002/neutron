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
public class MortgageLimitAmountNodeModule {

    private final MortgageLimitAmountNode owner;

    public MortgageLimitAmountNodeModule(MortgageLimitAmountNode owner) {
        this.owner = owner;
    }

    @Provides @ComponentScope @Owner MortgageLimitAmountNode provideMortgageLimitAmountNode() {
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

    @Provides @Named("MortgageLimitAmountNodeRuleProvider") @IntoMap @StringKey(NeutronConstants.PLACEHOLDER_RULE_PROVIDER)
    RuleProvider<MortgageLimitAmountNode> providePlaceholderRuleProvider() {
        return null;
    }

    @Provides @Named("MortgageLimitAmountNodeRuleProvider") @IntoMap @StringKey(NeutronConstants.TYPE_RULE_PROVIDER)
    RuleProvider<MortgageLimitAmountNode> provideTypeRuleProvider(MortgageLimitAmountNodeRuleProvider provider) {
        return provider;
    }


    @Provides @ComponentScope
    List<RuleProvider<MortgageLimitAmountNode>> provideRuleProviders(
        @Named("MortgageLimitAmountNodeRuleProvider")  Map<String, Provider<RuleProvider<MortgageLimitAmountNode>>> ruleProviderProviderMap
    ) {
        String[] potentialRuleProviderKeys = {NeutronConstants.TYPE_RULE_PROVIDER, owner.getName()};
        return RuleProvider.extractRuleProviders(potentialRuleProviderKeys, ruleProviderProviderMap);
    }
}