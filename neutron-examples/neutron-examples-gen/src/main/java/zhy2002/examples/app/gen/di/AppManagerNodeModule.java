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
public class AppManagerNodeModule {

    private final AppManagerNode owner;

    public AppManagerNodeModule(AppManagerNode owner) {
        this.owner = owner;
    }

    @Provides @ComponentScope @Owner AppManagerNode provideAppManagerNode() {
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

    @Provides @ComponentScope GlobalUiStateNode provideGlobalUiStateNode() {
        return owner.getParent();
    }

    @Provides @Named("AppManagerNodeRuleProvider") @IntoMap @StringKey(NeutronConstants.PLACEHOLDER_RULE_PROVIDER)
    RuleProvider<AppManagerNode> providePlaceholderRuleProvider() {
        return null;
    }

    @Provides @Named("AppManagerNodeRuleProvider") @IntoMap @StringKey(NeutronConstants.TYPE_RULE_PROVIDER)
    RuleProvider<AppManagerNode> provideTypeRuleProvider(AppManagerNodeRuleProvider provider) {
        return provider;
    }


    @Provides @ComponentScope
    List<RuleProvider<AppManagerNode>> provideRuleProviders(
        @Named("AppManagerNodeRuleProvider")  Map<String, Provider<RuleProvider<AppManagerNode>>> ruleProviderProviderMap
    ) {
        String[] potentialRuleProviderKeys = {NeutronConstants.TYPE_RULE_PROVIDER, owner.getName()};
        return RuleProvider.extractRuleProviders(potentialRuleProviderKeys, ruleProviderProviderMap);
    }
}