package zhy2002.examples.lodgement.gen.di;
import dagger.Subcomponent;
import zhy2002.examples.lodgement.gen.*;
import zhy2002.examples.lodgement.gen.rule.*;

@ProductCreditCardFlagNodeScope
@Subcomponent(modules = {ProductCreditCardFlagNodeModule.class})
public interface ProductCreditCardFlagNodeComponent {

    ProductCreditCardFlagNodeRuleProvider getProductCreditCardFlagNodeRuleProvider();

    @Subcomponent.Builder
    interface Builder {

        Builder setProductCreditCardFlagNodeModule(ProductCreditCardFlagNodeModule module);

        ProductCreditCardFlagNodeComponent build();
    }
}
