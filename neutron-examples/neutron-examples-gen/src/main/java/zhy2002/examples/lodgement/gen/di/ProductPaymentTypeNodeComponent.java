package zhy2002.examples.lodgement.gen.di;
import dagger.Subcomponent;
import zhy2002.neutron.di.ComponentScope;
import zhy2002.examples.lodgement.gen.node.*;
import zhy2002.neutron.RuleProvider;
import java.util.*;


@ComponentScope
@Subcomponent(modules = {ProductPaymentTypeNodeModule.class})
public interface ProductPaymentTypeNodeComponent {

    List<RuleProvider<ProductPaymentTypeNode>> provideRuleProviders();


    @Subcomponent.Builder
    interface Builder {

        Builder setProductPaymentTypeNodeModule(ProductPaymentTypeNodeModule module);

        ProductPaymentTypeNodeComponent build();
    }

}
