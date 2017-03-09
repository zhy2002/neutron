package zhy2002.examples.lodgement.gen.di;
import dagger.Subcomponent;
import zhy2002.examples.lodgement.gen.*;
import zhy2002.examples.lodgement.gen.node.*;
import zhy2002.neutron.RuleProvider;
import java.util.*;

@ProductsNodeScope
@Subcomponent(modules = {ProductsNodeModule.class})
public interface ProductsNodeComponent {

    ProductsNodeRuleProvider getProductsNodeRuleProvider();
    Map<String, RuleProvider<ProductsNode>> getInstanceRuleProviders();

    @Subcomponent.Builder
    interface Builder {

        Builder setProductsNodeModule(ProductsNodeModule module);

        ProductsNodeComponent build();
    }
}
