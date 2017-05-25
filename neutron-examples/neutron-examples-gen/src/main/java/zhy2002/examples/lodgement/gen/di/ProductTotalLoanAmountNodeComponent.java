package zhy2002.examples.lodgement.gen.di;
import dagger.Subcomponent;
import zhy2002.examples.lodgement.gen.node.*;
import zhy2002.neutron.RuleProvider;
import java.util.*;

@ProductTotalLoanAmountNodeScope
@Subcomponent(modules = {ProductTotalLoanAmountNodeModule.class})
public interface ProductTotalLoanAmountNodeComponent {

    RuleProvider<ProductTotalLoanAmountNode> getProductTotalLoanAmountNodeRuleProvider();
    Map<String, RuleProvider<ProductTotalLoanAmountNode>> getInstanceRuleProviders();

    @Subcomponent.Builder
    interface Builder {

        Builder setProductTotalLoanAmountNodeModule(ProductTotalLoanAmountNodeModule module);

        ProductTotalLoanAmountNodeComponent build();
    }
}
