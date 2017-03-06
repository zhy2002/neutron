package zhy2002.examples.lodgement.gen.di;
import dagger.Subcomponent;
import zhy2002.examples.lodgement.gen.*;
import zhy2002.examples.lodgement.gen.node.*;

@ProductTotalLoanLmiAmountNodeScope
@Subcomponent(modules = {ProductTotalLoanLmiAmountNodeModule.class})
public interface ProductTotalLoanLmiAmountNodeComponent {

    ProductTotalLoanLmiAmountNodeRuleProvider getProductTotalLoanLmiAmountNodeRuleProvider();

    @Subcomponent.Builder
    interface Builder {

        Builder setProductTotalLoanLmiAmountNodeModule(ProductTotalLoanLmiAmountNodeModule module);

        ProductTotalLoanLmiAmountNodeComponent build();
    }
}
