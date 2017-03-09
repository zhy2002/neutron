package zhy2002.examples.lodgement.gen.di;
import dagger.Subcomponent;
import zhy2002.examples.lodgement.gen.*;
import zhy2002.examples.lodgement.gen.node.*;
import zhy2002.neutron.RuleProvider;
import java.util.*;

@ProductCreditCardTypeNodeScope
@Subcomponent(modules = {ProductCreditCardTypeNodeModule.class})
public interface ProductCreditCardTypeNodeComponent {

    ProductCreditCardTypeNodeRuleProvider getProductCreditCardTypeNodeRuleProvider();
    Map<String, RuleProvider<ProductCreditCardTypeNode>> getInstanceRuleProviders();

    @Subcomponent.Builder
    interface Builder {

        Builder setProductCreditCardTypeNodeModule(ProductCreditCardTypeNodeModule module);

        ProductCreditCardTypeNodeComponent build();
    }
}
