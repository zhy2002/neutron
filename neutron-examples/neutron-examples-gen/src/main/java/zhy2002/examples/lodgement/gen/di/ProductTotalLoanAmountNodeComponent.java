package zhy2002.examples.lodgement.gen.di;
import dagger.Subcomponent;
import zhy2002.examples.lodgement.gen.*;
import zhy2002.examples.lodgement.gen.node.*;
import zhy2002.neutron.RuleProvider;
import java.util.*;

@ProductTotalLoanAmountNodeScope
@Subcomponent(modules = {ProductTotalLoanAmountNodeModule.class})
public interface ProductTotalLoanAmountNodeComponent {

    ProductTotalLoanAmountNodeRuleProvider getProductTotalLoanAmountNodeRuleProvider();
    Map<String, RuleProvider<ProductTotalLoanAmountNode>> getInstanceRuleProviders();

    @Subcomponent.Builder
    interface Builder {

        Builder setProductTotalLoanAmountNodeModule(ProductTotalLoanAmountNodeModule module);

        ProductTotalLoanAmountNodeComponent build();
    }
}
