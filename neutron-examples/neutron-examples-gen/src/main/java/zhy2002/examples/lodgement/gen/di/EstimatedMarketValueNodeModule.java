package zhy2002.examples.lodgement.gen.di;
import dagger.*;
import javax.inject.*;
import zhy2002.examples.lodgement.gen.node.*;
import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import zhy2002.neutron.di.*;
import java.util.*;


@Module
public class EstimatedMarketValueNodeModule {

    private final EstimatedMarketValueNode owner;

    public EstimatedMarketValueNodeModule(EstimatedMarketValueNode owner) {
        this.owner = owner;
    }

    @Provides @EstimatedMarketValueNodeScope @Owner EstimatedMarketValueNode provideEstimatedMarketValueNode() {
        return owner;
    }

    @Provides @EstimatedMarketValueNodeScope @Owner BigDecimalUiNode<?> provideBigDecimalUiNode() {
        return owner;
    }

    @Provides @EstimatedMarketValueNodeScope @Owner LeafUiNode<?,?> provideLeafUiNode() {
        return owner;
    }

    @Provides @EstimatedMarketValueNodeScope @Owner UiNode<?> provideUiNode() {
        return owner;
    }

    @Provides @EstimatedMarketValueNodeScope PropertyNode providePropertyNode() {
        return owner.getParent();
    }

    @Provides @EstimatedMarketValueNodeScope
    RuleProvider<EstimatedMarketValueNode> provideRuleProvider(Provider<EstimatedMarketValueNodeRuleProvider> provider) {
        return provider.get();
    }

    @Provides @EstimatedMarketValueNodeScope
    Map<String, RuleProvider<EstimatedMarketValueNode>> provideInstanceProviderMap(
        Provider<PropertyNodeChildProvider.EstimatedMarketValueNodeRuleProvider> estimatedMarketValueNodeRuleProvider
    ) {
        Map<String, RuleProvider<EstimatedMarketValueNode>> result = new HashMap<>();
        result.put("estimatedMarketValueNode", estimatedMarketValueNodeRuleProvider.get());
        return result;
    }
}