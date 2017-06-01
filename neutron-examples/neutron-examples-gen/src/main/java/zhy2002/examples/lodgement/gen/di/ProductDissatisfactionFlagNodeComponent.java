package zhy2002.examples.lodgement.gen.di;
import dagger.Subcomponent;
import zhy2002.neutron.di.ComponentScope;
import zhy2002.examples.lodgement.gen.node.*;
import zhy2002.neutron.RuleProvider;
import java.util.*;


@ComponentScope
@Subcomponent(modules = {ProductDissatisfactionFlagNodeModule.class})
public interface ProductDissatisfactionFlagNodeComponent {

    List<RuleProvider<ProductDissatisfactionFlagNode>> provideRuleProviders();


    @Subcomponent.Builder
    interface Builder {

        Builder setProductDissatisfactionFlagNodeModule(ProductDissatisfactionFlagNodeModule module);

        ProductDissatisfactionFlagNodeComponent build();
    }

}
