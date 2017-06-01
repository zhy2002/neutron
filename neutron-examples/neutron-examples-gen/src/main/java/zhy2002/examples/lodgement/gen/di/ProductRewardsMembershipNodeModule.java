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

    @Provides @ComponentScope @Owner ProductRewardsMembershipNode provideProductRewardsMembershipNode() {
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
    RuleProvider<ProductRewardsMembershipNode> provideRuleProvider(Provider<ProductRewardsMembershipNodeRuleProvider> provider) {
        return provider.get();
    }

    @Provides @ComponentScope
    Map<String, RuleProvider<ProductRewardsMembershipNode>> provideInstanceProviderMap(
        Provider<ProductCardHolderNodeChildProvider.ProductRewardsMembershipNodeRuleProvider> productRewardsMembershipNodeRuleProvider
    ) {
        Map<String, RuleProvider<ProductRewardsMembershipNode>> result = new HashMap<>();
        result.put("productRewardsMembershipNode", productRewardsMembershipNodeRuleProvider.get());
        return result;
    }
}