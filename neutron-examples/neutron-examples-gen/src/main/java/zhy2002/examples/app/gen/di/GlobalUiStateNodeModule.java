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
public class GlobalUiStateNodeModule {

    private final GlobalUiStateNode owner;

    public GlobalUiStateNodeModule(GlobalUiStateNode owner) {
        this.owner = owner;
    }

    @Provides @ComponentScope @Owner GlobalUiStateNode provideGlobalUiStateNode() {
        return owner;
    }

    @Provides @ComponentScope @Owner RootUiNode<?> provideRootUiNode() {
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

    @Provides @Named("GlobalUiStateNodeRuleProvider") @IntoMap @StringKey(NeutronConstants.PLACEHOLDER_RULE_PROVIDER)
    RuleProvider<GlobalUiStateNode> providePlaceholderRuleProvider() {
        return null;
    }

    @Provides @Named("GlobalUiStateNodeRuleProvider") @IntoMap @StringKey(NeutronConstants.TYPE_RULE_PROVIDER)
    RuleProvider<GlobalUiStateNode> provideTypeRuleProvider(GlobalUiStateNodeRuleProvider provider) {
        return provider;
    }


    @Provides @ComponentScope
    List<RuleProvider<GlobalUiStateNode>> provideRuleProviders(
        @Named("GlobalUiStateNodeRuleProvider")  Map<String, Provider<RuleProvider<GlobalUiStateNode>>> ruleProviderProviderMap
    ) {
        String[] potentialRuleProviderKeys = {NeutronConstants.TYPE_RULE_PROVIDER, owner.getName()};
        return RuleProvider.extractRuleProviders(potentialRuleProviderKeys, ruleProviderProviderMap);
    }
}