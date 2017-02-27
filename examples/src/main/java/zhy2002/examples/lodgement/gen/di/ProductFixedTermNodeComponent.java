package zhy2002.examples.lodgement.gen.di;
import dagger.Subcomponent;
import zhy2002.examples.lodgement.gen.*;
import zhy2002.examples.lodgement.gen.rule.*;

@ProductFixedTermNodeScope
@Subcomponent(modules = {ProductFixedTermNodeModule.class})
public interface ProductFixedTermNodeComponent {

    ProductFixedTermNodeRuleProvider getProductFixedTermNodeRuleProvider();

    @Subcomponent.Builder
    interface Builder {

        Builder setProductFixedTermNodeModule(ProductFixedTermNodeModule module);

        ProductFixedTermNodeComponent build();
    }
}
