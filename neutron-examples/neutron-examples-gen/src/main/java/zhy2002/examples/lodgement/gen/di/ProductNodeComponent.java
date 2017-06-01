package zhy2002.examples.lodgement.gen.di;
import dagger.Subcomponent;
import zhy2002.neutron.di.ComponentScope;
import zhy2002.examples.lodgement.gen.node.*;
import zhy2002.neutron.RuleProvider;
import java.util.*;


@ComponentScope
@Subcomponent(modules = {ProductNodeModule.class})
public interface ProductNodeComponent {

    List<RuleProvider<ProductNode>> provideRuleProviders();

    ProductDescriptionNode createProductDescriptionNode();
    ProductFeaturesNode createProductFeaturesNode();

    @Subcomponent.Builder
    interface Builder {

        Builder setProductNodeModule(ProductNodeModule module);

        ProductNodeComponent build();
    }

}
