package zhy2002.examples.lodgement.gen.di;
import dagger.Subcomponent;
import zhy2002.neutron.di.ComponentScope;
import zhy2002.examples.lodgement.gen.node.*;
import zhy2002.neutron.RuleProvider;
import java.util.*;

@ComponentScope
@Subcomponent(modules = {ProductTotalLoanTermNodeModule.class})
public interface ProductTotalLoanTermNodeComponent {

    RuleProvider<ProductTotalLoanTermNode> getProductTotalLoanTermNodeRuleProvider();
    Map<String, RuleProvider<ProductTotalLoanTermNode>> getInstanceRuleProviders();

    @Subcomponent.Builder
    interface Builder {

        Builder setProductTotalLoanTermNodeModule(ProductTotalLoanTermNodeModule module);

        ProductTotalLoanTermNodeComponent build();
    }
}
