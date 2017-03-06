package zhy2002.examples.lodgement.gen.di;
import dagger.Subcomponent;
import zhy2002.examples.lodgement.gen.*;
import zhy2002.examples.lodgement.gen.node.*;

@ProductExpressConsentFlagNodeScope
@Subcomponent(modules = {ProductExpressConsentFlagNodeModule.class})
public interface ProductExpressConsentFlagNodeComponent {

    ProductExpressConsentFlagNodeRuleProvider getProductExpressConsentFlagNodeRuleProvider();

    @Subcomponent.Builder
    interface Builder {

        Builder setProductExpressConsentFlagNodeModule(ProductExpressConsentFlagNodeModule module);

        ProductExpressConsentFlagNodeComponent build();
    }
}
