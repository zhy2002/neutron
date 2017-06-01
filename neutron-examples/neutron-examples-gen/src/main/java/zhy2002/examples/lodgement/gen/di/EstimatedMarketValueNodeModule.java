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

    @Provides @ComponentScope
    RuleProvider<EstimatedMarketValueNode> provideRuleProvider(Provider<EstimatedMarketValueNodeRuleProvider> provider) {
        return provider.get();
    }

    @Provides @ComponentScope
    Map<String, RuleProvider<EstimatedMarketValueNode>> provideInstanceProviderMap(
        Provider<PropertyNodeChildProvider.EstimatedMarketValueNodeRuleProvider> estimatedMarketValueNodeRuleProvider
    ) {
        Map<String, RuleProvider<EstimatedMarketValueNode>> result = new HashMap<>();
        result.put("estimatedMarketValueNode", estimatedMarketValueNodeRuleProvider.get());
        return result;
    }
}