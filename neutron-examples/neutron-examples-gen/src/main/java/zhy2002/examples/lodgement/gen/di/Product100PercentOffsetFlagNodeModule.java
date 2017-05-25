package zhy2002.examples.lodgement.gen.di;
import dagger.*;
import javax.inject.*;
import zhy2002.examples.lodgement.gen.node.*;
import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import zhy2002.neutron.di.*;
import java.util.*;


@Module
public class Product100PercentOffsetFlagNodeModule {

    private final Product100PercentOffsetFlagNode owner;

    public Product100PercentOffsetFlagNodeModule(Product100PercentOffsetFlagNode owner) {
        this.owner = owner;
    }

    @Provides @Product100PercentOffsetFlagNodeScope @Owner Product100PercentOffsetFlagNode provideProduct100PercentOffsetFlagNode() {
        return owner;
    }

    @Provides @Product100PercentOffsetFlagNodeScope @Owner BooleanUiNode<?> provideBooleanUiNode() {
        return owner;
    }

    @Provides @Product100PercentOffsetFlagNodeScope @Owner LeafUiNode<?,?> provideLeafUiNode() {
        return owner;
    }

    @Provides @Product100PercentOffsetFlagNodeScope @Owner UiNode<?> provideUiNode() {
        return owner;
    }

    @Provides @Product100PercentOffsetFlagNodeScope ProductFeaturesNode provideProductFeaturesNode() {
        return owner.getParent();
    }

    @Provides @Product100PercentOffsetFlagNodeScope
    RuleProvider<Product100PercentOffsetFlagNode> provideRuleProvider(Provider<Product100PercentOffsetFlagNodeRuleProvider> provider) {
        return provider.get();
    }

    @Provides @Product100PercentOffsetFlagNodeScope
    Map<String, RuleProvider<Product100PercentOffsetFlagNode>> provideInstanceProviderMap(
        Provider<ProductFeaturesNodeChildProvider.Product100PercentOffsetFlagNodeRuleProvider> product100PercentOffsetFlagNodeRuleProvider
    ) {
        Map<String, RuleProvider<Product100PercentOffsetFlagNode>> result = new HashMap<>();
        result.put("product100PercentOffsetFlagNode", product100PercentOffsetFlagNodeRuleProvider.get());
        return result;
    }
}