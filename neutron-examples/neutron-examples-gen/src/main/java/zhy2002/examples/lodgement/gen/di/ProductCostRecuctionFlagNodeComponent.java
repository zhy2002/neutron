package zhy2002.examples.lodgement.gen.di;
import dagger.Subcomponent;
import zhy2002.neutron.di.ComponentScope;
import zhy2002.examples.lodgement.gen.node.*;
import zhy2002.neutron.RuleProvider;
import java.util.*;

@ComponentScope
@Subcomponent(modules = {ProductCostRecuctionFlagNodeModule.class})
public interface ProductCostRecuctionFlagNodeComponent {

    RuleProvider<ProductCostRecuctionFlagNode> getProductCostRecuctionFlagNodeRuleProvider();
    Map<String, RuleProvider<ProductCostRecuctionFlagNode>> getInstanceRuleProviders();

    @Subcomponent.Builder
    interface Builder {

        Builder setProductCostRecuctionFlagNodeModule(ProductCostRecuctionFlagNodeModule module);

        ProductCostRecuctionFlagNodeComponent build();
    }
}
