package zhy2002.examples.lodgement.gen.di;
import dagger.*;
import javax.inject.*;
import zhy2002.examples.lodgement.gen.node.*;
import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import zhy2002.neutron.di.*;
import java.util.*;


@Module
public class ContributionTypeNodeModule {

    private final ContributionTypeNode owner;

    public ContributionTypeNodeModule(ContributionTypeNode owner) {
        this.owner = owner;
    }

    @Provides @ContributionTypeNodeScope @Owner ContributionTypeNode provideContributionTypeNode() {
        return owner;
    }

    @Provides @ContributionTypeNodeScope @Owner StringUiNode<?> provideStringUiNode() {
        return owner;
    }

    @Provides @ContributionTypeNodeScope @Owner LeafUiNode<?,?> provideLeafUiNode() {
        return owner;
    }

    @Provides @ContributionTypeNodeScope @Owner UiNode<?> provideUiNode() {
        return owner;
    }

    @Provides @ContributionTypeNodeScope ProductCustomerContributionNode provideProductCustomerContributionNode() {
        return owner.getParent();
    }

    @Provides @ContributionTypeNodeScope
    RuleProvider<ContributionTypeNode> provideRuleProvider(Provider<ContributionTypeNodeRuleProvider> provider) {
        return provider.get();
    }

    @Provides @ContributionTypeNodeScope
    Map<String, RuleProvider<ContributionTypeNode>> provideInstanceProviderMap(
        Provider<ProductCustomerContributionNodeChildProvider.ContributionTypeNodeRuleProvider> contributionTypeNodeRuleProvider
    ) {
        Map<String, RuleProvider<ContributionTypeNode>> result = new HashMap<>();
        result.put("contributionTypeNode", contributionTypeNodeRuleProvider.get());
        return result;
    }
}