package zhy2002.examples.lodgement.gen.di;
import dagger.Subcomponent;
import zhy2002.examples.lodgement.gen.*;
import zhy2002.examples.lodgement.gen.node.*;
import zhy2002.neutron.RuleProvider;
import java.util.*;

@ProductLoanPrimaryPurposeNodeScope
@Subcomponent(modules = {ProductLoanPrimaryPurposeNodeModule.class})
public interface ProductLoanPrimaryPurposeNodeComponent {

    ProductLoanPrimaryPurposeNodeRuleProvider getProductLoanPrimaryPurposeNodeRuleProvider();
    Map<String, RuleProvider<ProductLoanPrimaryPurposeNode>> getInstanceRuleProviders();

    @Subcomponent.Builder
    interface Builder {

        Builder setProductLoanPrimaryPurposeNodeModule(ProductLoanPrimaryPurposeNodeModule module);

        ProductLoanPrimaryPurposeNodeComponent build();
    }
}
