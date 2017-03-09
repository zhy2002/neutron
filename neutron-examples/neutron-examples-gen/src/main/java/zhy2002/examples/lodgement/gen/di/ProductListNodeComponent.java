package zhy2002.examples.lodgement.gen.di;
import dagger.Subcomponent;
import zhy2002.examples.lodgement.gen.*;
import zhy2002.examples.lodgement.gen.node.*;
import zhy2002.neutron.RuleProvider;
import java.util.*;

@ProductListNodeScope
@Subcomponent(modules = {ProductListNodeModule.class})
public interface ProductListNodeComponent {

    ProductListNodeRuleProvider getProductListNodeRuleProvider();
    Map<String, RuleProvider<ProductListNode>> getInstanceRuleProviders();

    @Subcomponent.Builder
    interface Builder {

        Builder setProductListNodeModule(ProductListNodeModule module);

        ProductListNodeComponent build();
    }
}
