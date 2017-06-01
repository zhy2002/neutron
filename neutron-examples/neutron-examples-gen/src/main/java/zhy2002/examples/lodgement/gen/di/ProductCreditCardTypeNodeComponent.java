package zhy2002.examples.lodgement.gen.di;
import dagger.Subcomponent;
import zhy2002.neutron.di.ComponentScope;
import zhy2002.examples.lodgement.gen.node.*;
import zhy2002.neutron.RuleProvider;
import java.util.*;

@ComponentScope
@Subcomponent(modules = {ProductCreditCardTypeNodeModule.class})
public interface ProductCreditCardTypeNodeComponent {


    RuleProvider<ProductCreditCardTypeNode> getProductCreditCardTypeNodeRuleProvider();
    Map<String, RuleProvider<ProductCreditCardTypeNode>> getInstanceRuleProviders();

    @Subcomponent.Builder
    interface Builder {

        Builder setProductCreditCardTypeNodeModule(ProductCreditCardTypeNodeModule module);

        ProductCreditCardTypeNodeComponent build();
    }

}
