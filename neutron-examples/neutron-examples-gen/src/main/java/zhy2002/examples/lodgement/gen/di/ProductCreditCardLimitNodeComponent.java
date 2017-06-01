package zhy2002.examples.lodgement.gen.di;
import dagger.Subcomponent;
import zhy2002.neutron.di.ComponentScope;
import zhy2002.examples.lodgement.gen.node.*;
import zhy2002.neutron.RuleProvider;
import java.util.*;


@ComponentScope
@Subcomponent(modules = {ProductCreditCardLimitNodeModule.class})
public interface ProductCreditCardLimitNodeComponent {

    List<RuleProvider<ProductCreditCardLimitNode>> provideRuleProviders();


    @Subcomponent.Builder
    interface Builder {

        Builder setProductCreditCardLimitNodeModule(ProductCreditCardLimitNodeModule module);

        ProductCreditCardLimitNodeComponent build();
    }

}
