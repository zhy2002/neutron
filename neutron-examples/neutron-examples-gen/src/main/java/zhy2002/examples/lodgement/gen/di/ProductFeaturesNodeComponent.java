package zhy2002.examples.lodgement.gen.di;
import dagger.Subcomponent;
import zhy2002.examples.lodgement.gen.node.*;
import zhy2002.neutron.RuleProvider;
import java.util.*;

@ProductFeaturesNodeScope
@Subcomponent(modules = {ProductFeaturesNodeModule.class})
public interface ProductFeaturesNodeComponent {

    RuleProvider<ProductFeaturesNode> getProductFeaturesNodeRuleProvider();
    Map<String, RuleProvider<ProductFeaturesNode>> getInstanceRuleProviders();

    @Subcomponent.Builder
    interface Builder {

        Builder setProductFeaturesNodeModule(ProductFeaturesNodeModule module);

        ProductFeaturesNodeComponent build();
    }
}
