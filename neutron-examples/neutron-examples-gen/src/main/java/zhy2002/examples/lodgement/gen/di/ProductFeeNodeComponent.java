package zhy2002.examples.lodgement.gen.di;
import dagger.Subcomponent;
import zhy2002.neutron.di.ComponentScope;
import zhy2002.examples.lodgement.gen.node.*;
import zhy2002.neutron.RuleProvider;
import java.util.*;


@ComponentScope
@Subcomponent(modules = {ProductFeeNodeModule.class})
public interface ProductFeeNodeComponent {

    List<RuleProvider<ProductFeeNode>> provideRuleProviders();

    FeeTypeNode createFeeTypeNode();
    FeeDescriptionNode createFeeDescriptionNode();
    FeePayFromNode createFeePayFromNode();
    FeeAmountNode createFeeAmountNode();

    @Subcomponent.Builder
    interface Builder {

        Builder setProductFeeNodeModule(ProductFeeNodeModule module);

        ProductFeeNodeComponent build();
    }

}
