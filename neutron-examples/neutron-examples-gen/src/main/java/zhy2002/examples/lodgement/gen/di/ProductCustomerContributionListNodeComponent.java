package zhy2002.examples.lodgement.gen.di;
import dagger.Subcomponent;
import zhy2002.neutron.di.ComponentScope;
import zhy2002.examples.lodgement.gen.node.*;
import zhy2002.neutron.RuleProvider;
import java.util.*;

@ComponentScope
@Subcomponent(modules = {ProductCustomerContributionListNodeModule.class})
public interface ProductCustomerContributionListNodeComponent {

    RuleProvider<ProductCustomerContributionListNode> getProductCustomerContributionListNodeRuleProvider();
    Map<String, RuleProvider<ProductCustomerContributionListNode>> getInstanceRuleProviders();

    @Subcomponent.Builder
    interface Builder {

        Builder setProductCustomerContributionListNodeModule(ProductCustomerContributionListNodeModule module);

        ProductCustomerContributionListNodeComponent build();
    }
}
