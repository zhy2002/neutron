package zhy2002.examples.lodgement.gen.di;
import dagger.Subcomponent;
import zhy2002.examples.lodgement.gen.*;
import zhy2002.examples.lodgement.gen.node.*;
import zhy2002.neutron.RuleProvider;
import java.util.*;

@ProductCostRecuctionFlagNodeScope
@Subcomponent(modules = {ProductCostRecuctionFlagNodeModule.class})
public interface ProductCostRecuctionFlagNodeComponent {

    ProductCostRecuctionFlagNodeRuleProvider getProductCostRecuctionFlagNodeRuleProvider();
    Map<String, RuleProvider<ProductCostRecuctionFlagNode>> getInstanceRuleProviders();

    @Subcomponent.Builder
    interface Builder {

        Builder setProductCostRecuctionFlagNodeModule(ProductCostRecuctionFlagNodeModule module);

        ProductCostRecuctionFlagNodeComponent build();
    }
}
