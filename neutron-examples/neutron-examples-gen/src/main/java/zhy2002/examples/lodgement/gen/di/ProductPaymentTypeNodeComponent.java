package zhy2002.examples.lodgement.gen.di;
import dagger.Subcomponent;
import zhy2002.examples.lodgement.gen.*;
import zhy2002.examples.lodgement.gen.rule.*;

@ProductPaymentTypeNodeScope
@Subcomponent(modules = {ProductPaymentTypeNodeModule.class})
public interface ProductPaymentTypeNodeComponent {

    ProductPaymentTypeNodeRuleProvider getProductPaymentTypeNodeRuleProvider();

    @Subcomponent.Builder
    interface Builder {

        Builder setProductPaymentTypeNodeModule(ProductPaymentTypeNodeModule module);

        ProductPaymentTypeNodeComponent build();
    }
}
