package zhy2002.examples.lodgement.gen.di;
import dagger.Subcomponent;
import zhy2002.examples.lodgement.gen.*;
import zhy2002.examples.lodgement.gen.rule.*;

@ProductCardHodlerNameNodeScope
@Subcomponent(modules = {ProductCardHodlerNameNodeModule.class})
public interface ProductCardHodlerNameNodeComponent {

    ProductCardHodlerNameNodeRuleProvider getProductCardHodlerNameNodeRuleProvider();

    @Subcomponent.Builder
    interface Builder {

        Builder setProductCardHodlerNameNodeModule(ProductCardHodlerNameNodeModule module);

        ProductCardHodlerNameNodeComponent build();
    }
}
