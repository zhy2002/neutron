package zhy2002.examples.lodgement.gen.di;
import dagger.Subcomponent;
import zhy2002.neutron.di.ComponentScope;
import zhy2002.examples.lodgement.gen.node.*;
import zhy2002.neutron.RuleProvider;
import java.util.*;


@ComponentScope
@Subcomponent(modules = {ProductGroupNodeModule.class})
public interface ProductGroupNodeComponent {

    List<RuleProvider<ProductGroupNode>> provideRuleProviders();


    @Subcomponent.Builder
    interface Builder {

        Builder setProductGroupNodeModule(ProductGroupNodeModule module);

        ProductGroupNodeComponent build();
    }

}
