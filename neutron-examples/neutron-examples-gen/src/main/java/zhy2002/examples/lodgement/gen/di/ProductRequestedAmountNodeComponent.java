package zhy2002.examples.lodgement.gen.di;
import dagger.Subcomponent;
import zhy2002.neutron.di.ComponentScope;
import zhy2002.examples.lodgement.gen.node.*;
import zhy2002.neutron.RuleProvider;
import java.util.*;


@ComponentScope
@Subcomponent(modules = {ProductRequestedAmountNodeModule.class})
public interface ProductRequestedAmountNodeComponent {

    List<RuleProvider<ProductRequestedAmountNode>> provideRuleProviders();


    @Subcomponent.Builder
    interface Builder {

        Builder setProductRequestedAmountNodeModule(ProductRequestedAmountNodeModule module);

        ProductRequestedAmountNodeComponent build();
    }

}
