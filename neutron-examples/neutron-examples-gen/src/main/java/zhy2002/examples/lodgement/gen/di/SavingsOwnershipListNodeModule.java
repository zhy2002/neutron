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
public class SavingsOwnershipListNodeModule {

    private final SavingsOwnershipListNode owner;

    public SavingsOwnershipListNodeModule(SavingsOwnershipListNode owner) {
        this.owner = owner;
    }

    @Provides @ComponentScope @Owner SavingsOwnershipListNode provideSavingsOwnershipListNode() {
        return owner;
    }

    @Provides @ComponentScope @Owner OwnershipListNode<?> provideOwnershipListNode() {
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

    @Provides @ComponentScope SavingsAccountNode provideSavingsAccountNode() {
        return owner.getParent();
    }

    @Provides @Named("SavingsOwnershipListNodeRuleProvider") @IntoMap @StringKey(NeutronConstants.PLACEHOLDER_RULE_PROVIDER)
    RuleProvider<SavingsOwnershipListNode> providePlaceholderRuleProvider() {
        return null;
    }

    @Provides @Named("SavingsOwnershipListNodeRuleProvider") @IntoMap @StringKey(NeutronConstants.TYPE_RULE_PROVIDER)
    RuleProvider<SavingsOwnershipListNode> provideTypeRuleProvider(SavingsOwnershipListNodeRuleProvider provider) {
        return provider;
    }


    @Provides @ComponentScope
    List<RuleProvider<SavingsOwnershipListNode>> provideRuleProviders(
        @Named("SavingsOwnershipListNodeRuleProvider")  Map<String, Provider<RuleProvider<SavingsOwnershipListNode>>> ruleProviderProviderMap
    ) {
        String[] potentialRuleProviderKeys = {NeutronConstants.TYPE_RULE_PROVIDER, owner.getName()};
        return RuleProvider.extractRuleProviders(potentialRuleProviderKeys, ruleProviderProviderMap);
    }
}