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
public class SelectAccountHolderNodeModule {

    private final SelectAccountHolderNode owner;

    public SelectAccountHolderNodeModule(SelectAccountHolderNode owner) {
        this.owner = owner;
    }

    @Provides @ComponentScope @Owner SelectAccountHolderNode provideSelectAccountHolderNode() {
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

    @Provides @ComponentScope SelectAccountHolderListNode<?> provideSelectAccountHolderListNode() {
        return owner.getParent();
    }

    @Provides @Named("SelectAccountHolderNodeRuleProvider") @IntoMap @StringKey(NeutronConstants.PLACEHOLDER_RULE_PROVIDER)
    RuleProvider<SelectAccountHolderNode> providePlaceholderRuleProvider() {
        return null;
    }

    @Provides @Named("SelectAccountHolderNodeRuleProvider") @IntoMap @StringKey(NeutronConstants.TYPE_RULE_PROVIDER)
    RuleProvider<SelectAccountHolderNode> provideTypeRuleProvider(SelectAccountHolderNodeRuleProvider provider) {
        return provider;
    }


    @Provides @ComponentScope
    List<RuleProvider<SelectAccountHolderNode>> provideRuleProviders(
        @Named("SelectAccountHolderNodeRuleProvider")  Map<String, Provider<RuleProvider<SelectAccountHolderNode>>> ruleProviderProviderMap
    ) {
        String[] potentialRuleProviderKeys = {NeutronConstants.TYPE_RULE_PROVIDER, owner.getName()};
        return RuleProvider.extractRuleProviders(potentialRuleProviderKeys, ruleProviderProviderMap);
    }
}