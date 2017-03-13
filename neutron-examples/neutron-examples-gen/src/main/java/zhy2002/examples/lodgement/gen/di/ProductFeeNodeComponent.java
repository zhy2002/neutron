package zhy2002.examples.lodgement.gen.di;
import dagger.Subcomponent;
import zhy2002.examples.lodgement.gen.*;
import zhy2002.examples.lodgement.gen.node.*;

@ProductFeeNodeScope
@Subcomponent(modules = {ProductFeeNodeModule.class})
public interface ProductFeeNodeComponent {

    ProductFeeNodeRuleProvider getProductFeeNodeRuleProvider();

    @Subcomponent.Builder
    interface Builder {

        Builder setProductFeeNodeModule(ProductFeeNodeModule module);

        ProductFeeNodeComponent build();
    }
}
