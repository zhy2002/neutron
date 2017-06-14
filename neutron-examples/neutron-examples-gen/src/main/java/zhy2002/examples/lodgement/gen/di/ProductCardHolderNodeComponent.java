package zhy2002.examples.lodgement.gen.di;
import dagger.Subcomponent;
import zhy2002.neutron.di.ComponentScope;
import zhy2002.examples.lodgement.gen.node.*;
import zhy2002.neutron.RuleProvider;
import java.util.*;


@ComponentScope
@Subcomponent(modules = {ProductCardHolderNodeModule.class})
public interface ProductCardHolderNodeComponent {

    List<RuleProvider<ProductCardHolderNode>> provideRuleProviders();

    productCardHolderNameNode createproductCardHolderNameNode();
    ProductRewardsProgramNode createProductRewardsProgramNode();
    ProductRewardsMembershipNode createProductRewardsMembershipNode();

    @Subcomponent.Builder
    interface Builder {

        Builder setProductCardHolderNodeModule(ProductCardHolderNodeModule module);

        ProductCardHolderNodeComponent build();
    }

}
