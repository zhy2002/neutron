package zhy2002.examples.lodgement.gen.di;
import dagger.Subcomponent;
import zhy2002.examples.lodgement.gen.*;
import zhy2002.examples.lodgement.gen.rule.*;

@ProductCustomerContributionNodeScope
@Subcomponent(modules = {ProductCustomerContributionNodeModule.class})
public interface ProductCustomerContributionNodeComponent {

    ProductCustomerContributionNodeRuleProvider getProductCustomerContributionNodeRuleProvider();

    @Subcomponent.Builder
    interface Builder {

        Builder setProductCustomerContributionNodeModule(ProductCustomerContributionNodeModule module);

        ProductCustomerContributionNodeComponent build();
    }
}
