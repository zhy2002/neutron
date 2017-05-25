package zhy2002.examples.lodgement.gen.di;
import dagger.Subcomponent;
import zhy2002.examples.lodgement.gen.node.*;
import zhy2002.neutron.RuleProvider;
import java.util.*;

@ProductTotalLoanLmiAmountNodeScope
@Subcomponent(modules = {ProductTotalLoanLmiAmountNodeModule.class})
public interface ProductTotalLoanLmiAmountNodeComponent {

    RuleProvider<ProductTotalLoanLmiAmountNode> getProductTotalLoanLmiAmountNodeRuleProvider();
    Map<String, RuleProvider<ProductTotalLoanLmiAmountNode>> getInstanceRuleProviders();

    @Subcomponent.Builder
    interface Builder {

        Builder setProductTotalLoanLmiAmountNodeModule(ProductTotalLoanLmiAmountNodeModule module);

        ProductTotalLoanLmiAmountNodeComponent build();
    }
}
