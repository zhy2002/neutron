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
public class FirstHomeBuyerFlagNodeModule {

    private final FirstHomeBuyerFlagNode owner;

    public FirstHomeBuyerFlagNodeModule(FirstHomeBuyerFlagNode owner) {
        this.owner = owner;
    }

    @Provides @ComponentScope @Owner FirstHomeBuyerFlagNode provideFirstHomeBuyerFlagNode() {
        return owner;
    }

    @Provides @ComponentScope @Owner BooleanUiNode<?> provideBooleanUiNode() {
        return owner;
    }

    @Provides @ComponentScope @Owner LeafUiNode<?,?> provideLeafUiNode() {
        return owner;
    }

    @Provides @ComponentScope @Owner UiNode<?> provideUiNode() {
        return owner;
    }

    @Provides @ComponentScope PersonGeneralNode providePersonGeneralNode() {
        return owner.getParent();
    }

    @Provides @Named("FirstHomeBuyerFlagNodeRuleProvider") @IntoMap @StringKey(NeutronConstants.PLACEHOLDER_RULE_PROVIDER)
    RuleProvider<FirstHomeBuyerFlagNode> providePlaceholderRuleProvider() {
        return null;
    }

    @Provides @Named("FirstHomeBuyerFlagNodeRuleProvider") @IntoMap @StringKey(NeutronConstants.TYPE_RULE_PROVIDER)
    RuleProvider<FirstHomeBuyerFlagNode> provideTypeRuleProvider(FirstHomeBuyerFlagNodeRuleProvider provider) {
        return provider;
    }


    @Provides @ComponentScope
    List<RuleProvider<FirstHomeBuyerFlagNode>> provideRuleProviders(
        @Named("FirstHomeBuyerFlagNodeRuleProvider")  Map<String, Provider<RuleProvider<FirstHomeBuyerFlagNode>>> ruleProviderProviderMap
    ) {
        String[] potentialRuleProviderKeys = {NeutronConstants.TYPE_RULE_PROVIDER, owner.getName()};
        return RuleProvider.extractRuleProviders(potentialRuleProviderKeys, ruleProviderProviderMap);
    }
}