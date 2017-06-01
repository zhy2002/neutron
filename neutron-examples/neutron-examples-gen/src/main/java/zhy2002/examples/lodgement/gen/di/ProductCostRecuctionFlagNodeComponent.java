package zhy2002.examples.lodgement.gen.di;
import dagger.Subcomponent;
import zhy2002.neutron.di.ComponentScope;
import zhy2002.examples.lodgement.gen.node.*;
import zhy2002.neutron.RuleProvider;
import java.util.*;


@ComponentScope
@Subcomponent(modules = {ProductCostRecuctionFlagNodeModule.class})
public interface ProductCostRecuctionFlagNodeComponent {

    List<RuleProvider<ProductCostRecuctionFlagNode>> provideRuleProviders();


    @Subcomponent.Builder
    interface Builder {

        Builder setProductCostRecuctionFlagNodeModule(ProductCostRecuctionFlagNodeModule module);

        ProductCostRecuctionFlagNodeComponent build();
    }

}
