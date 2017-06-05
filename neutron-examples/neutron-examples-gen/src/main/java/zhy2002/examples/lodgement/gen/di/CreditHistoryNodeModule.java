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
public class CreditHistoryNodeModule {

    private final CreditHistoryNode owner;

    public CreditHistoryNodeModule(CreditHistoryNode owner) {
        this.owner = owner;
    }

    @Provides @ComponentScope @Owner CreditHistoryNode provideCreditHistoryNode() {
        return owner;
    }

    @Provides @ComponentScope @Owner StringUiNode<?> provideStringUiNode() {
        return owner;
    }

    @Provides @ComponentScope @Owner LeafUiNode<?,?> provideLeafUiNode() {
        return owner;
    }

    @Provides @ComponentScope @Owner UiNode<?> provideUiNode() {
        return owner;
    }

    @Provides @ComponentScope CreditHistoryListNode provideCreditHistoryListNode() {
        return owner.getParent();
    }

    @Provides @Named("CreditHistoryNodeRuleProvider") @IntoMap @StringKey(NeutronConstants.PLACEHOLDER_RULE_PROVIDER)
    RuleProvider<CreditHistoryNode> providePlaceholderRuleProvider() {
        return null;
    }

    @Provides @Named("CreditHistoryNodeRuleProvider") @IntoMap @StringKey(NeutronConstants.TYPE_RULE_PROVIDER)
    RuleProvider<CreditHistoryNode> provideTypeRuleProvider(CreditHistoryNodeRuleProvider provider) {
        return provider;
    }


    @Provides @ComponentScope
    List<RuleProvider<CreditHistoryNode>> provideRuleProviders(
        @Named("CreditHistoryNodeRuleProvider")  Map<String, Provider<RuleProvider<CreditHistoryNode>>> ruleProviderProviderMap
    ) {
        String[] potentialRuleProviderKeys = {NeutronConstants.TYPE_RULE_PROVIDER, owner.getName()};
        return RuleProvider.extractRuleProviders(potentialRuleProviderKeys, ruleProviderProviderMap);
    }
}