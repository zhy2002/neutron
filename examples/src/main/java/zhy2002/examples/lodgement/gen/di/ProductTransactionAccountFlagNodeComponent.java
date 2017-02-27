package zhy2002.examples.lodgement.gen.di;
import dagger.Subcomponent;
import zhy2002.examples.lodgement.gen.*;
import zhy2002.examples.lodgement.gen.rule.*;

@ProductTransactionAccountFlagNodeScope
@Subcomponent(modules = {ProductTransactionAccountFlagNodeModule.class})
public interface ProductTransactionAccountFlagNodeComponent {

    ProductTransactionAccountFlagNodeRuleProvider getProductTransactionAccountFlagNodeRuleProvider();

    @Subcomponent.Builder
    interface Builder {

        Builder setProductTransactionAccountFlagNodeModule(ProductTransactionAccountFlagNodeModule module);

        ProductTransactionAccountFlagNodeComponent build();
    }
}
