package zhy2002.examples.lodgement.gen.di;
import dagger.*;
import dagger.multibindings.*;
import javax.inject.*;
import zhy2002.examples.lodgement.gen.node.*;
import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import zhy2002.neutron.di.*;
import zhy2002.neutron.config.NeutronConstants;
import java.util.*;


@Module
public class UnemployedSinceNodeModule {

    private final UnemployedSinceNode owner;

    public UnemployedSinceNodeModule(UnemployedSinceNode owner) {
        this.owner = owner;
    }

    @Provides @ComponentScope @Owner UnemployedSinceNode provideUnemployedSinceNode() {
        return owner;
    }

    @Provides @ComponentScope @Owner MonthYearNode<?> provideMonthYearNode() {
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

    @Provides @ComponentScope UnemployedNode provideUnemployedNode() {
        return owner.getParent();
    }

    @Provides @Named("UnemployedSinceNodeRuleProvider") @IntoMap @StringKey(NeutronConstants.PLACEHOLDER_RULE_PROVIDER)
    RuleProvider<UnemployedSinceNode> providePlaceholderRuleProvider() {
        return null;
    }

    @Provides @Named("UnemployedSinceNodeRuleProvider") @IntoMap @StringKey(NeutronConstants.TYPE_RULE_PROVIDER)
    RuleProvider<UnemployedSinceNode> provideTypeRuleProvider(UnemployedSinceNodeRuleProvider provider) {
        return provider;
    }


    @Provides @ComponentScope
    List<RuleProvider<UnemployedSinceNode>> provideRuleProviders(
        @Named("UnemployedSinceNodeRuleProvider")  Map<String, Provider<RuleProvider<UnemployedSinceNode>>> ruleProviderProviderMap
    ) {
        String[] potentialRuleProviderKeys = {NeutronConstants.TYPE_RULE_PROVIDER, owner.getName(), owner.getName() + "-test"};
        return RuleProvider.extractRuleProviders(potentialRuleProviderKeys, ruleProviderProviderMap);
    }
}