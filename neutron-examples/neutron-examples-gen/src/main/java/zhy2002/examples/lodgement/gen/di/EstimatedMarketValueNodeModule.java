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
public class EstimatedMarketValueNodeModule {

    private final EstimatedMarketValueNode owner;

    public EstimatedMarketValueNodeModule(EstimatedMarketValueNode owner) {
        this.owner = owner;
    }

    @Provides @ComponentScope @Owner EstimatedMarketValueNode provideEstimatedMarketValueNode() {
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

    @Provides @ComponentScope PropertyNode providePropertyNode() {
        return owner.getParent();
    }

    @Provides @Named("EstimatedMarketValueNodeRuleProvider") @IntoMap @StringKey(NeutronConstants.PLACEHOLDER_RULE_PROVIDER)
    RuleProvider<EstimatedMarketValueNode> providePlaceholderRuleProvider() {
        return null;
    }

    @Provides @Named("EstimatedMarketValueNodeRuleProvider") @IntoMap @StringKey(NeutronConstants.TYPE_RULE_PROVIDER)
    RuleProvider<EstimatedMarketValueNode> provideTypeRuleProvider(EstimatedMarketValueNodeRuleProvider provider) {
        return provider;
    }

        @Provides @Named("EstimatedMarketValueNodeRuleProvider") @IntoMap @StringKey("estimatedMarketValueNode")
        RuleProvider<EstimatedMarketValueNode> provideEstimatedMarketValueNodeChildRuleProvider(
            PropertyNodeChildProvider.EstimatedMarketValueNodeRuleProvider provider
        ) {
            return provider;
        }


    @Provides @ComponentScope
    List<RuleProvider<EstimatedMarketValueNode>> provideRuleProviders(
        @Named("EstimatedMarketValueNodeRuleProvider")  Map<String, Provider<RuleProvider<EstimatedMarketValueNode>>> ruleProviderProviderMap
    ) {
        String[] potentialRuleProviderKeys = {NeutronConstants.TYPE_RULE_PROVIDER, owner.getName()};
        return RuleProvider.extractRuleProviders(potentialRuleProviderKeys, ruleProviderProviderMap);
    }
}