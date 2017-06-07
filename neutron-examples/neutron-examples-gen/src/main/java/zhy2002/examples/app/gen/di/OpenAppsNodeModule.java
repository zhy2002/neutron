package zhy2002.examples.app.gen.di;
import dagger.*;
import dagger.multibindings.*;
import javax.inject.*;
import zhy2002.examples.app.gen.node.*;
import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import zhy2002.neutron.di.*;
import zhy2002.neutron.config.NeutronConstants;
import java.util.*;


@Module
public class OpenAppsNodeModule {

    private final OpenAppsNode owner;

    public OpenAppsNodeModule(OpenAppsNode owner) {
        this.owner = owner;
    }

    @Provides @ComponentScope @Owner OpenAppsNode provideOpenAppsNode() {
        return owner;
    }

    @Provides @ComponentScope @Owner ListUiNode<?,?> provideListUiNode() {
        return owner;
    }

    @Provides @ComponentScope @Owner ParentUiNode<?> provideParentUiNode() {
        return owner;
    }

    @Provides @ComponentScope @Owner UiNode<?> provideUiNode() {
        return owner;
    }

    @Provides @ComponentScope GlobalUiStateNode provideGlobalUiStateNode() {
        return owner.getParent();
    }

    @Provides @Named("OpenAppsNodeRuleProvider") @IntoMap @StringKey(NeutronConstants.PLACEHOLDER_RULE_PROVIDER)
    RuleProvider<OpenAppsNode> providePlaceholderRuleProvider() {
        return null;
    }

    @Provides @Named("OpenAppsNodeRuleProvider") @IntoMap @StringKey(NeutronConstants.TYPE_RULE_PROVIDER)
    RuleProvider<OpenAppsNode> provideTypeRuleProvider(OpenAppsNodeRuleProvider provider) {
        return provider;
    }


    @Provides @ComponentScope
    List<RuleProvider<OpenAppsNode>> provideRuleProviders(
        @Named("OpenAppsNodeRuleProvider")  Map<String, Provider<RuleProvider<OpenAppsNode>>> ruleProviderProviderMap
    ) {
        String[] potentialRuleProviderKeys = {NeutronConstants.TYPE_RULE_PROVIDER, owner.getName()};
        return RuleProvider.extractRuleProviders(potentialRuleProviderKeys, ruleProviderProviderMap);
    }
}