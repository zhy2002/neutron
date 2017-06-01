package zhy2002.examples.lodgement.gen.di;
import dagger.Subcomponent;
import zhy2002.neutron.di.ComponentScope;
import zhy2002.examples.lodgement.gen.node.*;
import zhy2002.neutron.RuleProvider;
import java.util.*;


@ComponentScope
@Subcomponent(modules = {ProductLoanTypeNodeModule.class})
public interface ProductLoanTypeNodeComponent {

    List<RuleProvider<ProductLoanTypeNode>> provideRuleProviders();


    @Subcomponent.Builder
    interface Builder {

        Builder setProductLoanTypeNodeModule(ProductLoanTypeNodeModule module);

        ProductLoanTypeNodeComponent build();
    }

}
