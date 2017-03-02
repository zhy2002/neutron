package zhy2002.examples.lodgement.gen.di;
import dagger.Subcomponent;
import zhy2002.examples.lodgement.gen.*;
import zhy2002.examples.lodgement.gen.rule.*;

@ProductCardHolderNodeScope
@Subcomponent(modules = {ProductCardHolderNodeModule.class})
public interface ProductCardHolderNodeComponent {

    ProductCardHolderNodeRuleProvider getProductCardHolderNodeRuleProvider();

    @Subcomponent.Builder
    interface Builder {

        Builder setProductCardHolderNodeModule(ProductCardHolderNodeModule module);

        ProductCardHolderNodeComponent build();
    }
}
