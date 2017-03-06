package zhy2002.examples.lodgement.gen.di;
import dagger.Subcomponent;
import zhy2002.examples.lodgement.gen.*;
import zhy2002.examples.lodgement.gen.node.*;

@ProductsNodeScope
@Subcomponent(modules = {ProductsNodeModule.class})
public interface ProductsNodeComponent {

    ProductsNodeRuleProvider getProductsNodeRuleProvider();

    @Subcomponent.Builder
    interface Builder {

        Builder setProductsNodeModule(ProductsNodeModule module);

        ProductsNodeComponent build();
    }
}
