package zhy2002.examples.lodgement.gen.di;
import dagger.*;
import javax.inject.*;
import zhy2002.examples.lodgement.gen.node.*;
import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import zhy2002.neutron.di.*;
import java.util.*;


@Module
public class ContributionDescriptionNodeModule {

    private final ContributionDescriptionNode owner;

    public ContributionDescriptionNodeModule(ContributionDescriptionNode owner) {
        this.owner = owner;
    }

    @Provides @ComponentScope @Owner ContributionDescriptionNode provideContributionDescriptionNode() {
        return owner;
    }

    @Provides @ComponentScope @Owner StringUiNode<?> provideStringUiNode() {
        return owner;
    }

    @Provides @ComponentScope @Owner LeafUiNode<?,?> provideLeafUiNode() {
        return owner;
    }

    @Provides @ComponentScope @Owner UiNode<?> provideUiNode() {
        return owner;
    }

    @Provides @ComponentScope ProductCustomerContributionNode provideProductCustomerContributionNode() {
        return owner.getParent();
    }

    @Provides @ComponentScope
    RuleProvider<ContributionDescriptionNode> provideRuleProvider(Provider<ContributionDescriptionNodeRuleProvider> provider) {
        return provider.get();
    }

    @Provides @ComponentScope
    Map<String, RuleProvider<ContributionDescriptionNode>> provideInstanceProviderMap(
        Provider<ProductCustomerContributionNodeChildProvider.ContributionDescriptionNodeRuleProvider> contributionDescriptionNodeRuleProvider
    ) {
        Map<String, RuleProvider<ContributionDescriptionNode>> result = new HashMap<>();
        result.put("contributionDescriptionNode", contributionDescriptionNodeRuleProvider.get());
        return result;
    }
}