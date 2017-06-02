package zhy2002.examples.lodgement.gen.di;
import dagger.*;
import dagger.multibindings.*;
import javax.inject.*;
import zhy2002.examples.lodgement.gen.node.*;
import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import zhy2002.neutron.di.*;
import java.util.*;
import zhy2002.neutron.util.NeutronConstants;


@Module
public class CreditHistoryListNodeModule {

    private final CreditHistoryListNode owner;

    public CreditHistoryListNodeModule(CreditHistoryListNode owner) {
        this.owner = owner;
    }

    @Provides @ComponentScope @Owner CreditHistoryListNode provideCreditHistoryListNode() {
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

    @Provides @ComponentScope BasePrivacyNode<?> provideBasePrivacyNode() {
        return owner.getParent();
    }

    @Provides @Named("CreditHistoryListNodeRuleProvider") @IntoMap @StringKey(NeutronConstants.PLACEHOLDER_RULE_PROVIDER)
    RuleProvider<CreditHistoryListNode> providePlaceholderRuleProvider() {
        return null;
    }

    @Provides @Named("CreditHistoryListNodeRuleProvider") @IntoMap @StringKey(NeutronConstants.TYPE_RULE_PROVIDER)
    RuleProvider<CreditHistoryListNode> provideTypeRuleProvider(CreditHistoryListNodeRuleProvider provider) {
        return provider;
    }


    @Provides @ComponentScope
    List<RuleProvider<CreditHistoryListNode>> provideRuleProviders(
        @Named("CreditHistoryListNodeRuleProvider")  Map<String, Provider<RuleProvider<CreditHistoryListNode>>> ruleProviderProviderMap
    ) {
        String[] potentialRuleProviderKeys = {NeutronConstants.TYPE_RULE_PROVIDER, owner.getName()};
        return RuleProvider.extractRuleProviders(potentialRuleProviderKeys, ruleProviderProviderMap);
    }
}