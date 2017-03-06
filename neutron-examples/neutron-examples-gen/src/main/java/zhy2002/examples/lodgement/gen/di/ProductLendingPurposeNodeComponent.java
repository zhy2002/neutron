package zhy2002.examples.lodgement.gen.di;
import dagger.Subcomponent;
import zhy2002.examples.lodgement.gen.*;
import zhy2002.examples.lodgement.gen.node.*;

@ProductLendingPurposeNodeScope
@Subcomponent(modules = {ProductLendingPurposeNodeModule.class})
public interface ProductLendingPurposeNodeComponent {

    ProductLendingPurposeNodeRuleProvider getProductLendingPurposeNodeRuleProvider();

    @Subcomponent.Builder
    interface Builder {

        Builder setProductLendingPurposeNodeModule(ProductLendingPurposeNodeModule module);

        ProductLendingPurposeNodeComponent build();
    }
}
