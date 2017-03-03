package zhy2002.examples.lodgement.gen.di;
import dagger.Subcomponent;
import zhy2002.examples.lodgement.gen.*;
import zhy2002.examples.lodgement.gen.rule.*;

@ProductLoanPrimaryPurposeNodeScope
@Subcomponent(modules = {ProductLoanPrimaryPurposeNodeModule.class})
public interface ProductLoanPrimaryPurposeNodeComponent {

    ProductLoanPrimaryPurposeNodeRuleProvider getProductLoanPrimaryPurposeNodeRuleProvider();

    @Subcomponent.Builder
    interface Builder {

        Builder setProductLoanPrimaryPurposeNodeModule(ProductLoanPrimaryPurposeNodeModule module);

        ProductLoanPrimaryPurposeNodeComponent build();
    }
}
