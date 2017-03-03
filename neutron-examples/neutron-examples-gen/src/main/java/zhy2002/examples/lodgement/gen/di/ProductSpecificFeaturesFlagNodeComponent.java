package zhy2002.examples.lodgement.gen.di;
import dagger.Subcomponent;
import zhy2002.examples.lodgement.gen.*;
import zhy2002.examples.lodgement.gen.rule.*;

@ProductSpecificFeaturesFlagNodeScope
@Subcomponent(modules = {ProductSpecificFeaturesFlagNodeModule.class})
public interface ProductSpecificFeaturesFlagNodeComponent {

    ProductSpecificFeaturesFlagNodeRuleProvider getProductSpecificFeaturesFlagNodeRuleProvider();

    @Subcomponent.Builder
    interface Builder {

        Builder setProductSpecificFeaturesFlagNodeModule(ProductSpecificFeaturesFlagNodeModule module);

        ProductSpecificFeaturesFlagNodeComponent build();
    }
}
