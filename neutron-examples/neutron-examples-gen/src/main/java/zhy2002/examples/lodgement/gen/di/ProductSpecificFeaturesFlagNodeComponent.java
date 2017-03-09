package zhy2002.examples.lodgement.gen.di;
import dagger.Subcomponent;
import zhy2002.examples.lodgement.gen.*;
import zhy2002.examples.lodgement.gen.node.*;
import zhy2002.neutron.RuleProvider;
import java.util.*;

@ProductSpecificFeaturesFlagNodeScope
@Subcomponent(modules = {ProductSpecificFeaturesFlagNodeModule.class})
public interface ProductSpecificFeaturesFlagNodeComponent {

    ProductSpecificFeaturesFlagNodeRuleProvider getProductSpecificFeaturesFlagNodeRuleProvider();
    Map<String, RuleProvider<ProductSpecificFeaturesFlagNode>> getInstanceRuleProviders();

    @Subcomponent.Builder
    interface Builder {

        Builder setProductSpecificFeaturesFlagNodeModule(ProductSpecificFeaturesFlagNodeModule module);

        ProductSpecificFeaturesFlagNodeComponent build();
    }
}
