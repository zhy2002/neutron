package zhy2002.examples.lodgement.gen.di;
import dagger.Subcomponent;
import zhy2002.neutron.di.ComponentScope;
import zhy2002.examples.lodgement.gen.node.*;
import zhy2002.neutron.RuleProvider;
import java.util.*;


@ComponentScope
@Subcomponent(modules = {ProductTransactionAccountFlagNodeModule.class})
public interface ProductTransactionAccountFlagNodeComponent {

    List<RuleProvider<ProductTransactionAccountFlagNode>> provideRuleProviders();


    @Subcomponent.Builder
    interface Builder {

        Builder setProductTransactionAccountFlagNodeModule(ProductTransactionAccountFlagNodeModule module);

        ProductTransactionAccountFlagNodeComponent build();
    }

}
