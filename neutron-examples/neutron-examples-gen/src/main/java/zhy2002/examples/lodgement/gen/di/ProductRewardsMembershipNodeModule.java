package zhy2002.examples.lodgement.gen.di;
import dagger.*;
import javax.inject.*;
import zhy2002.examples.lodgement.gen.node.*;
import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import zhy2002.neutron.di.*;
import java.util.*;


@Module
public class ProductRewardsMembershipNodeModule {

    private final ProductRewardsMembershipNode owner;

    public ProductRewardsMembershipNodeModule(ProductRewardsMembershipNode owner) {
        this.owner = owner;
    }

    @Provides @ProductRewardsMembershipNodeScope @Owner ProductRewardsMembershipNode provideProductRewardsMembershipNode() {
        return owner;
    }

    @Provides @ProductRewardsMembershipNodeScope @Owner StringUiNode<?> provideStringUiNode() {
        return owner;
    }

    @Provides @ProductRewardsMembershipNodeScope @Owner LeafUiNode<?,?> provideLeafUiNode() {
        return owner;
    }

    @Provides @ProductRewardsMembershipNodeScope @Owner UiNode<?> provideUiNode() {
        return owner;
    }

    @Provides @ProductRewardsMembershipNodeScope ProductCardHolderNode provideProductCardHolderNode() {
        return owner.getParent();
    }

    @Provides @ProductRewardsMembershipNodeScope
    Map<String, RuleProvider<ProductRewardsMembershipNode>> provideInstanceProviders(
        Provider<ProductCardHolderNodeChildProvider.ProductRewardsMembershipNodeRuleProvider> productRewardsMembershipNodeRuleProvider
    ) {
        Map<String, RuleProvider<ProductRewardsMembershipNode>> result = new HashMap<>();
        result.put("productRewardsMembershipNode", productRewardsMembershipNodeRuleProvider.get());
        return result;
    }
}