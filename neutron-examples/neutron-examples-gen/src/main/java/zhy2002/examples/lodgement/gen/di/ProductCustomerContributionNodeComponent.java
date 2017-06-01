package zhy2002.examples.lodgement.gen.di;
import dagger.Subcomponent;
import zhy2002.neutron.di.ComponentScope;
import zhy2002.examples.lodgement.gen.node.*;
import zhy2002.neutron.RuleProvider;
import java.util.*;


@ComponentScope
@Subcomponent(modules = {ProductCustomerContributionNodeModule.class})
public interface ProductCustomerContributionNodeComponent {

    List<RuleProvider<ProductCustomerContributionNode>> provideRuleProviders();

    ContributionTypeNode createContributionTypeNode();
    ContributionDescriptionNode createContributionDescriptionNode();
    ContributionAmountNode createContributionAmountNode();

    @Subcomponent.Builder
    interface Builder {

        Builder setProductCustomerContributionNodeModule(ProductCustomerContributionNodeModule module);

        ProductCustomerContributionNodeComponent build();
    }

}
