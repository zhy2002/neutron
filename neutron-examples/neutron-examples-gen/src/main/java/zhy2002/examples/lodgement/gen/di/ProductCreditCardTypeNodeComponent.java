package zhy2002.examples.lodgement.gen.di;
import dagger.Subcomponent;
import zhy2002.examples.lodgement.gen.*;
import zhy2002.examples.lodgement.gen.node.*;

@ProductCreditCardTypeNodeScope
@Subcomponent(modules = {ProductCreditCardTypeNodeModule.class})
public interface ProductCreditCardTypeNodeComponent {

    ProductCreditCardTypeNodeRuleProvider getProductCreditCardTypeNodeRuleProvider();

    @Subcomponent.Builder
    interface Builder {

        Builder setProductCreditCardTypeNodeModule(ProductCreditCardTypeNodeModule module);

        ProductCreditCardTypeNodeComponent build();
    }
}
