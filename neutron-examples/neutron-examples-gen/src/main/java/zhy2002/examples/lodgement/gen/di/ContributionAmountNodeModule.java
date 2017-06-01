package zhy2002.examples.lodgement.gen.di;
import dagger.*;
import javax.inject.*;
import zhy2002.examples.lodgement.gen.node.*;
import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import zhy2002.neutron.di.*;
import java.util.*;


@Module
public class ContributionAmountNodeModule {

    private final ContributionAmountNode owner;

    public ContributionAmountNodeModule(ContributionAmountNode owner) {
        this.owner = owner;
    }

    @Provides @ComponentScope @Owner ContributionAmountNode provideContributionAmountNode() {
        return owner;
    }

    @Provides @ComponentScope @Owner BaseCurrencyNode<?> provideBaseCurrencyNode() {
        return owner;
    }

    @Provides @ComponentScope @Owner BigDecimalUiNode<?> provideBigDecimalUiNode() {
        return owner;
    }

    @Provides @ComponentScope @Owner LeafUiNode<?,?> provideLeafUiNode() {
        return owner;
    }

    @Provides @ComponentScope @Owner UiNode<?> provideUiNode() {
        return owner;
    }

    @Provides @ChildName String provideChildName() {
        return owner.getContext().getNodeIdentity().getName();
    }

    @Provides @ComponentScope ProductCustomerContributionNode provideProductCustomerContributionNode() {
        return owner.getParent();
    }

    @Provides @ComponentScope
    RuleProvider<ContributionAmountNode> provideRuleProvider(Provider<ContributionAmountNodeRuleProvider> provider) {
        return provider.get();
    }

    @Provides @ComponentScope
    Map<String, RuleProvider<ContributionAmountNode>> provideInstanceProviderMap(
        Provider<ProductCustomerContributionNodeChildProvider.ContributionAmountNodeRuleProvider> contributionAmountNodeRuleProvider
    ) {
        Map<String, RuleProvider<ContributionAmountNode>> result = new HashMap<>();
        result.put("contributionAmountNode", contributionAmountNodeRuleProvider.get());
        return result;
    }
}