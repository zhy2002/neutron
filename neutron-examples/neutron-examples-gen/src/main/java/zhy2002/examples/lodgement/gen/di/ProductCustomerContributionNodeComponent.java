package zhy2002.examples.lodgement.gen.di;
import dagger.Subcomponent;
import zhy2002.examples.lodgement.gen.*;
import zhy2002.examples.lodgement.gen.node.*;
import zhy2002.neutron.RuleProvider;
import java.util.*;

@ProductCustomerContributionNodeScope
@Subcomponent(modules = {ProductCustomerContributionNodeModule.class})
public interface ProductCustomerContributionNodeComponent {

    ProductCustomerContributionNodeRuleProvider getProductCustomerContributionNodeRuleProvider();
    Map<String, RuleProvider<ProductCustomerContributionNode>> getInstanceRuleProviders();

    @Subcomponent.Builder
    interface Builder {

        Builder setProductCustomerContributionNodeModule(ProductCustomerContributionNodeModule module);

        ProductCustomerContributionNodeComponent build();
    }
}
