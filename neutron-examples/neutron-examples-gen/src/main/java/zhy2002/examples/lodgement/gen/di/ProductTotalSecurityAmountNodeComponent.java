package zhy2002.examples.lodgement.gen.di;
import dagger.Subcomponent;
import zhy2002.examples.lodgement.gen.*;
import zhy2002.examples.lodgement.gen.node.*;

@ProductTotalSecurityAmountNodeScope
@Subcomponent(modules = {ProductTotalSecurityAmountNodeModule.class})
public interface ProductTotalSecurityAmountNodeComponent {

    ProductTotalSecurityAmountNodeRuleProvider getProductTotalSecurityAmountNodeRuleProvider();

    @Subcomponent.Builder
    interface Builder {

        Builder setProductTotalSecurityAmountNodeModule(ProductTotalSecurityAmountNodeModule module);

        ProductTotalSecurityAmountNodeComponent build();
    }
}
