package zhy2002.examples.lodgement.gen.di;
import dagger.Subcomponent;
import zhy2002.examples.lodgement.gen.*;
import zhy2002.examples.lodgement.gen.rule.*;

@ProductTotalLoanTermNodeScope
@Subcomponent(modules = {ProductTotalLoanTermNodeModule.class})
public interface ProductTotalLoanTermNodeComponent {

    ProductTotalLoanTermNodeRuleProvider getProductTotalLoanTermNodeRuleProvider();

    @Subcomponent.Builder
    interface Builder {

        Builder setProductTotalLoanTermNodeModule(ProductTotalLoanTermNodeModule module);

        ProductTotalLoanTermNodeComponent build();
    }
}
