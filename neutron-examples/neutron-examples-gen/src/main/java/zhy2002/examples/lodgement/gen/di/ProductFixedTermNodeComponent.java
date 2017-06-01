package zhy2002.examples.lodgement.gen.di;
import dagger.Subcomponent;
import zhy2002.neutron.di.ComponentScope;
import zhy2002.examples.lodgement.gen.node.*;
import zhy2002.neutron.RuleProvider;
import java.util.*;


@ComponentScope
@Subcomponent(modules = {ProductFixedTermNodeModule.class})
public interface ProductFixedTermNodeComponent {

    List<RuleProvider<ProductFixedTermNode>> provideRuleProviders();


    @Subcomponent.Builder
    interface Builder {

        Builder setProductFixedTermNodeModule(ProductFixedTermNodeModule module);

        ProductFixedTermNodeComponent build();
    }

}
