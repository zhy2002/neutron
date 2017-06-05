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
public class SelectRelatedPersonFlagNodeModule {

    private final SelectRelatedPersonFlagNode owner;

    public SelectRelatedPersonFlagNodeModule(SelectRelatedPersonFlagNode owner) {
        this.owner = owner;
    }

    @Provides @ComponentScope @Owner SelectRelatedPersonFlagNode provideSelectRelatedPersonFlagNode() {
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

    @Provides @ComponentScope SelectRelatedPersonNode provideSelectRelatedPersonNode() {
        return owner.getParent();
    }

    @Provides @Named("SelectRelatedPersonFlagNodeRuleProvider") @IntoMap @StringKey(NeutronConstants.PLACEHOLDER_RULE_PROVIDER)
    RuleProvider<SelectRelatedPersonFlagNode> providePlaceholderRuleProvider() {
        return null;
    }

    @Provides @Named("SelectRelatedPersonFlagNodeRuleProvider") @IntoMap @StringKey(NeutronConstants.TYPE_RULE_PROVIDER)
    RuleProvider<SelectRelatedPersonFlagNode> provideTypeRuleProvider(SelectRelatedPersonFlagNodeRuleProvider provider) {
        return provider;
    }


    @Provides @ComponentScope
    List<RuleProvider<SelectRelatedPersonFlagNode>> provideRuleProviders(
        @Named("SelectRelatedPersonFlagNodeRuleProvider")  Map<String, Provider<RuleProvider<SelectRelatedPersonFlagNode>>> ruleProviderProviderMap
    ) {
        String[] potentialRuleProviderKeys = {NeutronConstants.TYPE_RULE_PROVIDER, owner.getName()};
        return RuleProvider.extractRuleProviders(potentialRuleProviderKeys, ruleProviderProviderMap);
    }
}