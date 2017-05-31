package zhy2002.examples.lodgement.gen.di;
import dagger.*;
import javax.inject.*;
import zhy2002.examples.lodgement.gen.node.*;
import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import zhy2002.neutron.di.*;


@Module
public class ProductCustomerContributionNodeModule {

    private final ProductCustomerContributionNode owner;

    public ProductCustomerContributionNodeModule(ProductCustomerContributionNode owner) {
        this.owner = owner;
    }

    @Provides @ComponentScope @Owner ProductCustomerContributionNode provideProductCustomerContributionNode() {
        return owner;
    }

    @Provides @ComponentScope @Owner ObjectUiNode<?> provideObjectUiNode() {
        return owner;
    }

    @Provides @ComponentScope @Owner ParentUiNode<?> provideParentUiNode() {
        return owner;
    }

    @Provides @ComponentScope @Owner UiNode<?> provideUiNode() {
        return owner;
    }

    @Provides @ComponentScope ProductCustomerContributionListNode provideProductCustomerContributionListNode() {
        return owner.getParent();
    }

    @Provides @ComponentScope
    RuleProvider<ProductCustomerContributionNode> provideRuleProvider(Provider<ProductCustomerContributionNodeRuleProvider> provider) {
        return provider.get();
    }

}