package zhy2002.examples.lodgement.gen.di;
import dagger.Subcomponent;
import zhy2002.examples.lodgement.gen.*;
import zhy2002.examples.lodgement.gen.rule.*;

@ProductCreditCardLimitNodeScope
@Subcomponent(modules = {ProductCreditCardLimitNodeModule.class})
public interface ProductCreditCardLimitNodeComponent {

    ProductCreditCardLimitNodeRuleProvider getProductCreditCardLimitNodeRuleProvider();

    @Subcomponent.Builder
    interface Builder {

        Builder setProductCreditCardLimitNodeModule(ProductCreditCardLimitNodeModule module);

        ProductCreditCardLimitNodeComponent build();
    }
}
