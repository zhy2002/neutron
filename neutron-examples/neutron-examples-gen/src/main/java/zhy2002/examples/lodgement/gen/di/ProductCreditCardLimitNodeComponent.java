package zhy2002.examples.lodgement.gen.di;
import dagger.Subcomponent;
import zhy2002.examples.lodgement.gen.*;
import zhy2002.examples.lodgement.gen.node.*;
import zhy2002.neutron.RuleProvider;
import java.util.*;

@ProductCreditCardLimitNodeScope
@Subcomponent(modules = {ProductCreditCardLimitNodeModule.class})
public interface ProductCreditCardLimitNodeComponent {

    ProductCreditCardLimitNodeRuleProvider getProductCreditCardLimitNodeRuleProvider();
    Map<String, RuleProvider<ProductCreditCardLimitNode>> getInstanceRuleProviders();

    @Subcomponent.Builder
    interface Builder {

        Builder setProductCreditCardLimitNodeModule(ProductCreditCardLimitNodeModule module);

        ProductCreditCardLimitNodeComponent build();
    }
}
