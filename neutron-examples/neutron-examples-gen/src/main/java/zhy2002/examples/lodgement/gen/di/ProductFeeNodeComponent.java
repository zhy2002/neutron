package zhy2002.examples.lodgement.gen.di;
import dagger.Subcomponent;
import zhy2002.examples.lodgement.gen.node.*;
import zhy2002.neutron.RuleProvider;

@ProductFeeNodeScope
@Subcomponent(modules = {ProductFeeNodeModule.class})
public interface ProductFeeNodeComponent {

    RuleProvider<ProductFeeNode> getProductFeeNodeRuleProvider();

    @Subcomponent.Builder
    interface Builder {

        Builder setProductFeeNodeModule(ProductFeeNodeModule module);

        ProductFeeNodeComponent build();
    }
}
