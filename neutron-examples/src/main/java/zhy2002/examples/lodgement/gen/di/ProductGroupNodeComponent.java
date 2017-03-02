package zhy2002.examples.lodgement.gen.di;
import dagger.Subcomponent;
import zhy2002.examples.lodgement.gen.*;
import zhy2002.examples.lodgement.gen.rule.*;

@ProductGroupNodeScope
@Subcomponent(modules = {ProductGroupNodeModule.class})
public interface ProductGroupNodeComponent {

    ProductGroupNodeRuleProvider getProductGroupNodeRuleProvider();

    @Subcomponent.Builder
    interface Builder {

        Builder setProductGroupNodeModule(ProductGroupNodeModule module);

        ProductGroupNodeComponent build();
    }
}
