package zhy2002.examples.lodgement.gen.di;
import dagger.Subcomponent;
import zhy2002.examples.lodgement.gen.node.*;
import zhy2002.neutron.RuleProvider;
import java.util.*;

@ProductRequestedAmountNodeScope
@Subcomponent(modules = {ProductRequestedAmountNodeModule.class})
public interface ProductRequestedAmountNodeComponent {

    RuleProvider<ProductRequestedAmountNode> getProductRequestedAmountNodeRuleProvider();
    Map<String, RuleProvider<ProductRequestedAmountNode>> getInstanceRuleProviders();

    @Subcomponent.Builder
    interface Builder {

        Builder setProductRequestedAmountNodeModule(ProductRequestedAmountNodeModule module);

        ProductRequestedAmountNodeComponent build();
    }
}
