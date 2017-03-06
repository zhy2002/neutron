package zhy2002.examples.lodgement.gen.di;
import dagger.Subcomponent;
import zhy2002.examples.lodgement.gen.*;
import zhy2002.examples.lodgement.gen.node.*;

@ProductFeaturesNodeScope
@Subcomponent(modules = {ProductFeaturesNodeModule.class})
public interface ProductFeaturesNodeComponent {

    ProductFeaturesNodeRuleProvider getProductFeaturesNodeRuleProvider();

    @Subcomponent.Builder
    interface Builder {

        Builder setProductFeaturesNodeModule(ProductFeaturesNodeModule module);

        ProductFeaturesNodeComponent build();
    }
}
