package zhy2002.examples.lodgement.gen.di;
import dagger.Subcomponent;
import zhy2002.examples.lodgement.gen.*;
import zhy2002.examples.lodgement.gen.node.*;

@ProductCostRecuctionFlagNodeScope
@Subcomponent(modules = {ProductCostRecuctionFlagNodeModule.class})
public interface ProductCostRecuctionFlagNodeComponent {

    ProductCostRecuctionFlagNodeRuleProvider getProductCostRecuctionFlagNodeRuleProvider();

    @Subcomponent.Builder
    interface Builder {

        Builder setProductCostRecuctionFlagNodeModule(ProductCostRecuctionFlagNodeModule module);

        ProductCostRecuctionFlagNodeComponent build();
    }
}
