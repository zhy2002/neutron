package zhy2002.examples.lodgement.gen.di;
import dagger.Subcomponent;
import zhy2002.neutron.di.ComponentScope;
import zhy2002.examples.lodgement.gen.node.*;
import zhy2002.neutron.RuleProvider;
import java.util.*;


@ComponentScope
@Subcomponent(modules = {ProductListNodeModule.class})
public interface ProductListNodeComponent {

    List<RuleProvider<ProductListNode>> provideRuleProviders();

    ProductNode createProductNode();

    @Subcomponent.Builder
    interface Builder {

        Builder setProductListNodeModule(ProductListNodeModule module);

        ProductListNodeComponent build();
    }

}
