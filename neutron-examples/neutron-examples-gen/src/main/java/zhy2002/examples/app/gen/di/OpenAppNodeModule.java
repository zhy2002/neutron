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
public class OpenAppNodeModule {

    private final OpenAppNode owner;

    public OpenAppNodeModule(OpenAppNode owner) {
        this.owner = owner;
    }

    @Provides @ComponentScope @Owner OpenAppNode provideOpenAppNode() {
        return owner;
    }

    @Provides @ComponentScope @Owner AnyUiNode<?> provideAnyUiNode() {
        return owner;
    }

    @Provides @ComponentScope @Owner LeafUiNode<?,?> provideLeafUiNode() {
        return owner;
    }

    @Provides @ComponentScope @Owner UiNode<?> provideUiNode() {
        return owner;
    }

    @Provides @ComponentScope OpenAppsNode provideOpenAppsNode() {
        return owner.getParent();
    }

    @Provides @Named("OpenAppNodeRuleProvider") @IntoMap @StringKey(NeutronConstants.PLACEHOLDER_RULE_PROVIDER)
    RuleProvider<OpenAppNode> providePlaceholderRuleProvider() {
        return null;
    }

    @Provides @Named("OpenAppNodeRuleProvider") @IntoMap @StringKey(NeutronConstants.TYPE_RULE_PROVIDER)
    RuleProvider<OpenAppNode> provideTypeRuleProvider(OpenAppNodeRuleProvider provider) {
        return provider;
    }


    @Provides @ComponentScope
    List<RuleProvider<OpenAppNode>> provideRuleProviders(
        @Named("OpenAppNodeRuleProvider")  Map<String, Provider<RuleProvider<OpenAppNode>>> ruleProviderProviderMap
    ) {
        String[] potentialRuleProviderKeys = {NeutronConstants.TYPE_RULE_PROVIDER, owner.getName(), owner.getName() + "-test"};
        return RuleProvider.extractRuleProviders(potentialRuleProviderKeys, ruleProviderProviderMap);
    }
}