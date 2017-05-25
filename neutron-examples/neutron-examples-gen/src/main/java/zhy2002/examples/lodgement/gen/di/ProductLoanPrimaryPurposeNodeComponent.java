package zhy2002.examples.lodgement.gen.di;
import dagger.Subcomponent;
import zhy2002.examples.lodgement.gen.node.*;
import zhy2002.neutron.RuleProvider;
import java.util.*;

@ProductLoanPrimaryPurposeNodeScope
@Subcomponent(modules = {ProductLoanPrimaryPurposeNodeModule.class})
public interface ProductLoanPrimaryPurposeNodeComponent {

    RuleProvider<ProductLoanPrimaryPurposeNode> getProductLoanPrimaryPurposeNodeRuleProvider();
    Map<String, RuleProvider<ProductLoanPrimaryPurposeNode>> getInstanceRuleProviders();

    @Subcomponent.Builder
    interface Builder {

        Builder setProductLoanPrimaryPurposeNodeModule(ProductLoanPrimaryPurposeNodeModule module);

        ProductLoanPrimaryPurposeNodeComponent build();
    }
}
