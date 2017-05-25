package zhy2002.examples.lodgement.gen.di;
import dagger.Subcomponent;
import zhy2002.examples.lodgement.gen.node.*;
import zhy2002.neutron.RuleProvider;

@ProductCustomerContributionNodeScope
@Subcomponent(modules = {ProductCustomerContributionNodeModule.class})
public interface ProductCustomerContributionNodeComponent {

    RuleProvider<ProductCustomerContributionNode> getProductCustomerContributionNodeRuleProvider();

    @Subcomponent.Builder
    interface Builder {

        Builder setProductCustomerContributionNodeModule(ProductCustomerContributionNodeModule module);

        ProductCustomerContributionNodeComponent build();
    }
}
