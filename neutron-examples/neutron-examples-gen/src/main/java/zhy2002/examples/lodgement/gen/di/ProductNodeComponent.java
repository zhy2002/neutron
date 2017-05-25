package zhy2002.examples.lodgement.gen.di;
import dagger.Subcomponent;
import zhy2002.examples.lodgement.gen.node.*;
import zhy2002.neutron.RuleProvider;

@ProductNodeScope
@Subcomponent(modules = {ProductNodeModule.class})
public interface ProductNodeComponent {

    RuleProvider<ProductNode> getProductNodeRuleProvider();

    @Subcomponent.Builder
    interface Builder {

        Builder setProductNodeModule(ProductNodeModule module);

        ProductNodeComponent build();
    }
}
