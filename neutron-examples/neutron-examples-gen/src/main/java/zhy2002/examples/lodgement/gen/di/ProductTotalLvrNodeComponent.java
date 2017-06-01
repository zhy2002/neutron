package zhy2002.examples.lodgement.gen.di;
import dagger.Subcomponent;
import zhy2002.neutron.di.ComponentScope;
import zhy2002.examples.lodgement.gen.node.*;
import zhy2002.neutron.RuleProvider;
import java.util.*;

@ComponentScope
@Subcomponent(modules = {ProductTotalLvrNodeModule.class})
public interface ProductTotalLvrNodeComponent {


    RuleProvider<ProductTotalLvrNode> getProductTotalLvrNodeRuleProvider();
    Map<String, RuleProvider<ProductTotalLvrNode>> getInstanceRuleProviders();

    @Subcomponent.Builder
    interface Builder {

        Builder setProductTotalLvrNodeModule(ProductTotalLvrNodeModule module);

        ProductTotalLvrNodeComponent build();
    }

}
