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
public class MortgageBorrowerRateNodeModule {

    private final MortgageBorrowerRateNode owner;

    public MortgageBorrowerRateNodeModule(MortgageBorrowerRateNode owner) {
        this.owner = owner;
    }

    @Provides @ComponentScope @Owner MortgageBorrowerRateNode provideMortgageBorrowerRateNode() {
        return owner;
    }

    @Provides @ComponentScope @Owner BasePercentageNode<?> provideBasePercentageNode() {
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

    @Provides @Named("MortgageBorrowerRateNodeRuleProvider") @IntoMap @StringKey(NeutronConstants.PLACEHOLDER_RULE_PROVIDER)
    RuleProvider<MortgageBorrowerRateNode> providePlaceholderRuleProvider() {
        return null;
    }

    @Provides @Named("MortgageBorrowerRateNodeRuleProvider") @IntoMap @StringKey(NeutronConstants.TYPE_RULE_PROVIDER)
    RuleProvider<MortgageBorrowerRateNode> provideTypeRuleProvider(MortgageBorrowerRateNodeRuleProvider provider) {
        return provider;
    }


    @Provides @ComponentScope
    List<RuleProvider<MortgageBorrowerRateNode>> provideRuleProviders(
        @Named("MortgageBorrowerRateNodeRuleProvider")  Map<String, Provider<RuleProvider<MortgageBorrowerRateNode>>> ruleProviderProviderMap
    ) {
        String[] potentialRuleProviderKeys = {NeutronConstants.TYPE_RULE_PROVIDER, owner.getName()};
        return RuleProvider.extractRuleProviders(potentialRuleProviderKeys, ruleProviderProviderMap);
    }
}