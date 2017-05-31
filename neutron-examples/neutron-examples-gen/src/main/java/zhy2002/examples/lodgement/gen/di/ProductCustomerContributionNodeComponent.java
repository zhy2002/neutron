package zhy2002.examples.lodgement.gen.di;
import dagger.Subcomponent;
import zhy2002.neutron.di.ComponentScope;
import zhy2002.examples.lodgement.gen.node.*;
import zhy2002.neutron.RuleProvider;

@ComponentScope
@Subcomponent(modules = {ProductCustomerContributionNodeModule.class})
public interface ProductCustomerContributionNodeComponent {

    RuleProvider<ProductCustomerContributionNode> getProductCustomerContributionNodeRuleProvider();

    @Subcomponent.Builder
    interface Builder {

        Builder setProductCustomerContributionNodeModule(ProductCustomerContributionNodeModule module);

        ProductCustomerContributionNodeComponent build();
    }
}
