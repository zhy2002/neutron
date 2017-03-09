package zhy2002.examples.lodgement.gen.di;
import dagger.Subcomponent;
import zhy2002.examples.lodgement.gen.*;
import zhy2002.examples.lodgement.gen.node.*;
import zhy2002.neutron.RuleProvider;
import java.util.*;

@ProductTotalLvrNodeScope
@Subcomponent(modules = {ProductTotalLvrNodeModule.class})
public interface ProductTotalLvrNodeComponent {

    ProductTotalLvrNodeRuleProvider getProductTotalLvrNodeRuleProvider();
    Map<String, RuleProvider<ProductTotalLvrNode>> getInstanceRuleProviders();

    @Subcomponent.Builder
    interface Builder {

        Builder setProductTotalLvrNodeModule(ProductTotalLvrNodeModule module);

        ProductTotalLvrNodeComponent build();
    }
}
