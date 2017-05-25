package zhy2002.examples.lodgement.gen.di;
import dagger.Subcomponent;
import zhy2002.examples.lodgement.gen.node.*;
import zhy2002.neutron.RuleProvider;
import java.util.*;

@ProductPaymentTypeNodeScope
@Subcomponent(modules = {ProductPaymentTypeNodeModule.class})
public interface ProductPaymentTypeNodeComponent {

    RuleProvider<ProductPaymentTypeNode> getProductPaymentTypeNodeRuleProvider();
    Map<String, RuleProvider<ProductPaymentTypeNode>> getInstanceRuleProviders();

    @Subcomponent.Builder
    interface Builder {

        Builder setProductPaymentTypeNodeModule(ProductPaymentTypeNodeModule module);

        ProductPaymentTypeNodeComponent build();
    }
}
