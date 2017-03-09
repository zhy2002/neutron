package zhy2002.examples.lodgement.gen.di;
import dagger.Subcomponent;
import zhy2002.examples.lodgement.gen.*;
import zhy2002.examples.lodgement.gen.node.*;
import zhy2002.neutron.RuleProvider;
import java.util.*;

@ProductLendingPurposeNodeScope
@Subcomponent(modules = {ProductLendingPurposeNodeModule.class})
public interface ProductLendingPurposeNodeComponent {

    ProductLendingPurposeNodeRuleProvider getProductLendingPurposeNodeRuleProvider();
    Map<String, RuleProvider<ProductLendingPurposeNode>> getInstanceRuleProviders();

    @Subcomponent.Builder
    interface Builder {

        Builder setProductLendingPurposeNodeModule(ProductLendingPurposeNodeModule module);

        ProductLendingPurposeNodeComponent build();
    }
}
