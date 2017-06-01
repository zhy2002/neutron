package zhy2002.examples.lodgement.gen.di;
import dagger.Subcomponent;
import zhy2002.neutron.di.ComponentScope;
import zhy2002.examples.lodgement.gen.node.*;
import zhy2002.neutron.RuleProvider;
import java.util.*;


@ComponentScope
@Subcomponent(modules = {ProductRateLockFlagNodeModule.class})
public interface ProductRateLockFlagNodeComponent {

    List<RuleProvider<ProductRateLockFlagNode>> provideRuleProviders();


    @Subcomponent.Builder
    interface Builder {

        Builder setProductRateLockFlagNodeModule(ProductRateLockFlagNodeModule module);

        ProductRateLockFlagNodeComponent build();
    }

}
