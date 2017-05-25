package zhy2002.examples.lodgement.gen.di;
import dagger.Subcomponent;
import zhy2002.examples.lodgement.gen.node.*;
import zhy2002.neutron.RuleProvider;
import java.util.*;

@ProductGroupNodeScope
@Subcomponent(modules = {ProductGroupNodeModule.class})
public interface ProductGroupNodeComponent {

    RuleProvider<ProductGroupNode> getProductGroupNodeRuleProvider();
    Map<String, RuleProvider<ProductGroupNode>> getInstanceRuleProviders();

    @Subcomponent.Builder
    interface Builder {

        Builder setProductGroupNodeModule(ProductGroupNodeModule module);

        ProductGroupNodeComponent build();
    }
}
