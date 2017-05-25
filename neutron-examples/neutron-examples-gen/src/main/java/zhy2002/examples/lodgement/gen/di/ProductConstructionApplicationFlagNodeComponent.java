package zhy2002.examples.lodgement.gen.di;
import dagger.Subcomponent;
import zhy2002.examples.lodgement.gen.node.*;
import zhy2002.neutron.RuleProvider;
import java.util.*;

@ProductConstructionApplicationFlagNodeScope
@Subcomponent(modules = {ProductConstructionApplicationFlagNodeModule.class})
public interface ProductConstructionApplicationFlagNodeComponent {

    RuleProvider<ProductConstructionApplicationFlagNode> getProductConstructionApplicationFlagNodeRuleProvider();
    Map<String, RuleProvider<ProductConstructionApplicationFlagNode>> getInstanceRuleProviders();

    @Subcomponent.Builder
    interface Builder {

        Builder setProductConstructionApplicationFlagNodeModule(ProductConstructionApplicationFlagNodeModule module);

        ProductConstructionApplicationFlagNodeComponent build();
    }
}
