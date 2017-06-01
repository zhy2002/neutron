package zhy2002.examples.lodgement.gen.di;
import dagger.Subcomponent;
import zhy2002.neutron.di.ComponentScope;
import zhy2002.examples.lodgement.gen.node.*;
import zhy2002.neutron.RuleProvider;
import java.util.*;


@ComponentScope
@Subcomponent(modules = {ProductExpressConsentFlagNodeModule.class})
public interface ProductExpressConsentFlagNodeComponent {

    List<RuleProvider<ProductExpressConsentFlagNode>> provideRuleProviders();


    @Subcomponent.Builder
    interface Builder {

        Builder setProductExpressConsentFlagNodeModule(ProductExpressConsentFlagNodeModule module);

        ProductExpressConsentFlagNodeComponent build();
    }

}
