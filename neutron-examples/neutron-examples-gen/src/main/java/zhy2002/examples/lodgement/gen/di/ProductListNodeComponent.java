package zhy2002.examples.lodgement.gen.di;
import dagger.Subcomponent;
import zhy2002.examples.lodgement.gen.*;
import zhy2002.examples.lodgement.gen.rule.*;

@ProductListNodeScope
@Subcomponent(modules = {ProductListNodeModule.class})
public interface ProductListNodeComponent {

    ProductListNodeRuleProvider getProductListNodeRuleProvider();

    @Subcomponent.Builder
    interface Builder {

        Builder setProductListNodeModule(ProductListNodeModule module);

        ProductListNodeComponent build();
    }
}
