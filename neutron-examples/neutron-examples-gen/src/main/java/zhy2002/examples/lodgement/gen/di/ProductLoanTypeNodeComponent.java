package zhy2002.examples.lodgement.gen.di;
import dagger.Subcomponent;
import zhy2002.examples.lodgement.gen.*;
import zhy2002.examples.lodgement.gen.node.*;

@ProductLoanTypeNodeScope
@Subcomponent(modules = {ProductLoanTypeNodeModule.class})
public interface ProductLoanTypeNodeComponent {

    ProductLoanTypeNodeRuleProvider getProductLoanTypeNodeRuleProvider();

    @Subcomponent.Builder
    interface Builder {

        Builder setProductLoanTypeNodeModule(ProductLoanTypeNodeModule module);

        ProductLoanTypeNodeComponent build();
    }
}
