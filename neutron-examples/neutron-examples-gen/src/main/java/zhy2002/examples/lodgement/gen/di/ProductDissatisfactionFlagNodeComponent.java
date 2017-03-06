package zhy2002.examples.lodgement.gen.di;
import dagger.Subcomponent;
import zhy2002.examples.lodgement.gen.*;
import zhy2002.examples.lodgement.gen.node.*;

@ProductDissatisfactionFlagNodeScope
@Subcomponent(modules = {ProductDissatisfactionFlagNodeModule.class})
public interface ProductDissatisfactionFlagNodeComponent {

    ProductDissatisfactionFlagNodeRuleProvider getProductDissatisfactionFlagNodeRuleProvider();

    @Subcomponent.Builder
    interface Builder {

        Builder setProductDissatisfactionFlagNodeModule(ProductDissatisfactionFlagNodeModule module);

        ProductDissatisfactionFlagNodeComponent build();
    }
}
