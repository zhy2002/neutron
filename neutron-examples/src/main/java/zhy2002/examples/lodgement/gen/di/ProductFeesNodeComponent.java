package zhy2002.examples.lodgement.gen.di;
import dagger.Subcomponent;
import zhy2002.examples.lodgement.gen.*;
import zhy2002.examples.lodgement.gen.rule.*;

@ProductFeesNodeScope
@Subcomponent(modules = {ProductFeesNodeModule.class})
public interface ProductFeesNodeComponent {

    ProductFeesNodeRuleProvider getProductFeesNodeRuleProvider();

    @Subcomponent.Builder
    interface Builder {

        Builder setProductFeesNodeModule(ProductFeesNodeModule module);

        ProductFeesNodeComponent build();
    }
}
