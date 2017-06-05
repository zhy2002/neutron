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
public class SelectAccountHolderFlagNodeModule {

    private final SelectAccountHolderFlagNode owner;

    public SelectAccountHolderFlagNodeModule(SelectAccountHolderFlagNode owner) {
        this.owner = owner;
    }

    @Provides @ComponentScope @Owner SelectAccountHolderFlagNode provideSelectAccountHolderFlagNode() {
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

    @Provides @ComponentScope SelectAccountHolderNode provideSelectAccountHolderNode() {
        return owner.getParent();
    }

    @Provides @Named("SelectAccountHolderFlagNodeRuleProvider") @IntoMap @StringKey(NeutronConstants.PLACEHOLDER_RULE_PROVIDER)
    RuleProvider<SelectAccountHolderFlagNode> providePlaceholderRuleProvider() {
        return null;
    }

    @Provides @Named("SelectAccountHolderFlagNodeRuleProvider") @IntoMap @StringKey(NeutronConstants.TYPE_RULE_PROVIDER)
    RuleProvider<SelectAccountHolderFlagNode> provideTypeRuleProvider(SelectAccountHolderFlagNodeRuleProvider provider) {
        return provider;
    }


    @Provides @ComponentScope
    List<RuleProvider<SelectAccountHolderFlagNode>> provideRuleProviders(
        @Named("SelectAccountHolderFlagNodeRuleProvider")  Map<String, Provider<RuleProvider<SelectAccountHolderFlagNode>>> ruleProviderProviderMap
    ) {
        String[] potentialRuleProviderKeys = {NeutronConstants.TYPE_RULE_PROVIDER, owner.getName()};
        return RuleProvider.extractRuleProviders(potentialRuleProviderKeys, ruleProviderProviderMap);
    }
}