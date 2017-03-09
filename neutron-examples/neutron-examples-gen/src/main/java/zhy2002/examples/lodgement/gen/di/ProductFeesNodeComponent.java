package zhy2002.examples.lodgement.gen.di;
import dagger.Subcomponent;
import zhy2002.examples.lodgement.gen.*;
import zhy2002.examples.lodgement.gen.node.*;
import zhy2002.neutron.RuleProvider;
import java.util.*;

@ProductFeesNodeScope
@Subcomponent(modules = {ProductFeesNodeModule.class})
public interface ProductFeesNodeComponent {

    ProductFeesNodeRuleProvider getProductFeesNodeRuleProvider();
    Map<String, RuleProvider<ProductFeesNode>> getInstanceRuleProviders();

    @Subcomponent.Builder
    interface Builder {

        Builder setProductFeesNodeModule(ProductFeesNodeModule module);

        ProductFeesNodeComponent build();
    }
}
