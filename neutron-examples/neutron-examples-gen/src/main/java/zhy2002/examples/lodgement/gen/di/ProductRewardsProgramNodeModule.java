package zhy2002.examples.lodgement.gen.di;
import dagger.*;
import javax.inject.*;
import zhy2002.examples.lodgement.gen.node.*;
import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import zhy2002.neutron.di.*;
import java.util.*;


@Module
public class ProductRewardsProgramNodeModule {

    private final ProductRewardsProgramNode owner;

    public ProductRewardsProgramNodeModule(ProductRewardsProgramNode owner) {
        this.owner = owner;
    }

    @Provides @ComponentScope @Owner ProductRewardsProgramNode provideProductRewardsProgramNode() {
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

    @Provides @ChildName String provideChildName() {
        return owner.getContext().getNameOfNodeBeingCreated();
    }

    @Provides @ComponentScope ProductCardHolderNode provideProductCardHolderNode() {
        return owner.getParent();
    }

    @Provides @ComponentScope
    RuleProvider<ProductRewardsProgramNode> provideRuleProvider(Provider<ProductRewardsProgramNodeRuleProvider> provider) {
        return provider.get();
    }

    @Provides @ComponentScope
    Map<String, RuleProvider<ProductRewardsProgramNode>> provideInstanceProviderMap(
        Provider<ProductCardHolderNodeChildProvider.ProductRewardsProgramNodeRuleProvider> productRewardsProgramNodeRuleProvider
    ) {
        Map<String, RuleProvider<ProductRewardsProgramNode>> result = new HashMap<>();
        result.put("productRewardsProgramNode", productRewardsProgramNodeRuleProvider.get());
        return result;
    }
}