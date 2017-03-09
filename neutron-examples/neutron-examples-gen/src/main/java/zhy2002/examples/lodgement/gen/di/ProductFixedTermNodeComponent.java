package zhy2002.examples.lodgement.gen.di;
import dagger.Subcomponent;
import zhy2002.examples.lodgement.gen.*;
import zhy2002.examples.lodgement.gen.node.*;
import zhy2002.neutron.RuleProvider;
import java.util.*;

@ProductFixedTermNodeScope
@Subcomponent(modules = {ProductFixedTermNodeModule.class})
public interface ProductFixedTermNodeComponent {

    ProductFixedTermNodeRuleProvider getProductFixedTermNodeRuleProvider();
    Map<String, RuleProvider<ProductFixedTermNode>> getInstanceRuleProviders();

    @Subcomponent.Builder
    interface Builder {

        Builder setProductFixedTermNodeModule(ProductFixedTermNodeModule module);

        ProductFixedTermNodeComponent build();
    }
}
