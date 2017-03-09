package zhy2002.examples.lodgement.gen.di;
import dagger.Subcomponent;
import zhy2002.examples.lodgement.gen.*;
import zhy2002.examples.lodgement.gen.node.*;
import zhy2002.neutron.RuleProvider;
import java.util.*;

@ProductTransactionAccountFlagNodeScope
@Subcomponent(modules = {ProductTransactionAccountFlagNodeModule.class})
public interface ProductTransactionAccountFlagNodeComponent {

    ProductTransactionAccountFlagNodeRuleProvider getProductTransactionAccountFlagNodeRuleProvider();
    Map<String, RuleProvider<ProductTransactionAccountFlagNode>> getInstanceRuleProviders();

    @Subcomponent.Builder
    interface Builder {

        Builder setProductTransactionAccountFlagNodeModule(ProductTransactionAccountFlagNodeModule module);

        ProductTransactionAccountFlagNodeComponent build();
    }
}
