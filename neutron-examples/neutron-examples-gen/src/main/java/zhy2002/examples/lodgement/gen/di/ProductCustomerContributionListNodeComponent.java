package zhy2002.examples.lodgement.gen.di;
import dagger.Subcomponent;
import zhy2002.examples.lodgement.gen.*;
import zhy2002.examples.lodgement.gen.node.*;
import zhy2002.neutron.RuleProvider;
import java.util.*;

@ProductCustomerContributionListNodeScope
@Subcomponent(modules = {ProductCustomerContributionListNodeModule.class})
public interface ProductCustomerContributionListNodeComponent {

    ProductCustomerContributionListNodeRuleProvider getProductCustomerContributionListNodeRuleProvider();
    Map<String, RuleProvider<ProductCustomerContributionListNode>> getInstanceRuleProviders();

    @Subcomponent.Builder
    interface Builder {

        Builder setProductCustomerContributionListNodeModule(ProductCustomerContributionListNodeModule module);

        ProductCustomerContributionListNodeComponent build();
    }
}