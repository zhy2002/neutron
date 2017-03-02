package zhy2002.examples.lodgement.gen.di;
import dagger.Subcomponent;
import zhy2002.examples.lodgement.gen.*;
import zhy2002.examples.lodgement.gen.rule.*;

@ProductRateLockFlagNodeScope
@Subcomponent(modules = {ProductRateLockFlagNodeModule.class})
public interface ProductRateLockFlagNodeComponent {

    ProductRateLockFlagNodeRuleProvider getProductRateLockFlagNodeRuleProvider();

    @Subcomponent.Builder
    interface Builder {

        Builder setProductRateLockFlagNodeModule(ProductRateLockFlagNodeModule module);

        ProductRateLockFlagNodeComponent build();
    }
}
