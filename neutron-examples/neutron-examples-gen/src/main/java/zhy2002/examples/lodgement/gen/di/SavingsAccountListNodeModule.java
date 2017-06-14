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
public class SavingsAccountListNodeModule {

    private final SavingsAccountListNode owner;

    public SavingsAccountListNodeModule(SavingsAccountListNode owner) {
        this.owner = owner;
    }

    @Provides @ComponentScope @Owner SavingsAccountListNode provideSavingsAccountListNode() {
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

    @Provides @ComponentScope AssetsNode provideAssetsNode() {
        return owner.getParent();
    }

    @Provides @Named("SavingsAccountListNodeRuleProvider") @IntoMap @StringKey(NeutronConstants.PLACEHOLDER_RULE_PROVIDER)
    RuleProvider<SavingsAccountListNode> providePlaceholderRuleProvider() {
        return null;
    }

    @Provides @Named("SavingsAccountListNodeRuleProvider") @IntoMap @StringKey(NeutronConstants.TYPE_RULE_PROVIDER)
    RuleProvider<SavingsAccountListNode> provideTypeRuleProvider(SavingsAccountListNodeRuleProvider provider) {
        return provider;
    }


    @Provides @ComponentScope
    List<RuleProvider<SavingsAccountListNode>> provideRuleProviders(
        @Named("SavingsAccountListNodeRuleProvider")  Map<String, Provider<RuleProvider<SavingsAccountListNode>>> ruleProviderProviderMap
    ) {
        String[] potentialRuleProviderKeys = {NeutronConstants.TYPE_RULE_PROVIDER, owner.getName(), owner.getName() + "-test"};
        return RuleProvider.extractRuleProviders(potentialRuleProviderKeys, ruleProviderProviderMap);
    }
}