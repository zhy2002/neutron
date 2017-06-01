package zhy2002.examples.lodgement.gen.di;
import dagger.Subcomponent;
import zhy2002.neutron.di.ComponentScope;
import zhy2002.examples.lodgement.gen.node.*;
import zhy2002.neutron.RuleProvider;
import java.util.*;

@ComponentScope
@Subcomponent(modules = {ProductConsolidationFlagNodeModule.class})
public interface ProductConsolidationFlagNodeComponent {


    RuleProvider<ProductConsolidationFlagNode> getProductConsolidationFlagNodeRuleProvider();
    Map<String, RuleProvider<ProductConsolidationFlagNode>> getInstanceRuleProviders();

    @Subcomponent.Builder
    interface Builder {

        Builder setProductConsolidationFlagNodeModule(ProductConsolidationFlagNodeModule module);

        ProductConsolidationFlagNodeComponent build();
    }

}
