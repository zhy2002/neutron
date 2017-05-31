package zhy2002.examples.lodgement.gen.di;
import dagger.Subcomponent;
import zhy2002.neutron.di.ComponentScope;
import zhy2002.examples.lodgement.gen.node.*;
import zhy2002.neutron.RuleProvider;
import java.util.*;

@ComponentScope
@Subcomponent(modules = {ProductCreditCardFlagNodeModule.class})
public interface ProductCreditCardFlagNodeComponent {

    RuleProvider<ProductCreditCardFlagNode> getProductCreditCardFlagNodeRuleProvider();
    Map<String, RuleProvider<ProductCreditCardFlagNode>> getInstanceRuleProviders();

    @Subcomponent.Builder
    interface Builder {

        Builder setProductCreditCardFlagNodeModule(ProductCreditCardFlagNodeModule module);

        ProductCreditCardFlagNodeComponent build();
    }
}
