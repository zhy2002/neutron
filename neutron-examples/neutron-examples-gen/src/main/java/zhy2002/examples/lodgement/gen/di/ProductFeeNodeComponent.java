package zhy2002.examples.lodgement.gen.di;
import dagger.Subcomponent;
import zhy2002.neutron.di.ComponentScope;
import zhy2002.examples.lodgement.gen.node.*;
import zhy2002.neutron.RuleProvider;

@ComponentScope
@Subcomponent(modules = {ProductFeeNodeModule.class})
public interface ProductFeeNodeComponent {

    FeeTypeNode createFeeTypeNode();
    FeeDescriptionNode createFeeDescriptionNode();
    FeePayFromNode createFeePayFromNode();
    FeeAmountNode createFeeAmountNode();

    RuleProvider<ProductFeeNode> getProductFeeNodeRuleProvider();

    @Subcomponent.Builder
    interface Builder {

        Builder setProductFeeNodeModule(ProductFeeNodeModule module);

        ProductFeeNodeComponent build();
    }

}
