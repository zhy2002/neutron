package zhy2002.examples.lodgement.gen.di;
import dagger.Subcomponent;
import zhy2002.examples.lodgement.gen.*;
import zhy2002.examples.lodgement.gen.node.*;
import zhy2002.neutron.RuleProvider;
import java.util.*;

@ProductCreditCardFlagNodeScope
@Subcomponent(modules = {ProductCreditCardFlagNodeModule.class})
public interface ProductCreditCardFlagNodeComponent {

    ProductCreditCardFlagNodeRuleProvider getProductCreditCardFlagNodeRuleProvider();
    Map<String, RuleProvider<ProductCreditCardFlagNode>> getInstanceRuleProviders();

    @Subcomponent.Builder
    interface Builder {

        Builder setProductCreditCardFlagNodeModule(ProductCreditCardFlagNodeModule module);

        ProductCreditCardFlagNodeComponent build();
    }
}
