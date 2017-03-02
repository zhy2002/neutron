package zhy2002.examples.lodgement.gen.di;
import dagger.Subcomponent;
import zhy2002.examples.lodgement.gen.*;
import zhy2002.examples.lodgement.gen.rule.*;

@ProductRequestedAmountNodeScope
@Subcomponent(modules = {ProductRequestedAmountNodeModule.class})
public interface ProductRequestedAmountNodeComponent {

    ProductRequestedAmountNodeRuleProvider getProductRequestedAmountNodeRuleProvider();

    @Subcomponent.Builder
    interface Builder {

        Builder setProductRequestedAmountNodeModule(ProductRequestedAmountNodeModule module);

        ProductRequestedAmountNodeComponent build();
    }
}
