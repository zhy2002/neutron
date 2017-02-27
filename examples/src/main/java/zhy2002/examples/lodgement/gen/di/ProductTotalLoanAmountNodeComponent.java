package zhy2002.examples.lodgement.gen.di;
import dagger.Subcomponent;
import zhy2002.examples.lodgement.gen.*;
import zhy2002.examples.lodgement.gen.rule.*;

@ProductTotalLoanAmountNodeScope
@Subcomponent(modules = {ProductTotalLoanAmountNodeModule.class})
public interface ProductTotalLoanAmountNodeComponent {

    ProductTotalLoanAmountNodeRuleProvider getProductTotalLoanAmountNodeRuleProvider();

    @Subcomponent.Builder
    interface Builder {

        Builder setProductTotalLoanAmountNodeModule(ProductTotalLoanAmountNodeModule module);

        ProductTotalLoanAmountNodeComponent build();
    }
}
