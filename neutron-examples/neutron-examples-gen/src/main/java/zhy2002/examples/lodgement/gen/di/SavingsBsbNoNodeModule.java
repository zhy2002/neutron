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
public class SavingsBsbNoNodeModule {

    private final SavingsBsbNoNode owner;

    public SavingsBsbNoNodeModule(SavingsBsbNoNode owner) {
        this.owner = owner;
    }

    @Provides @ComponentScope @Owner SavingsBsbNoNode provideSavingsBsbNoNode() {
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

    @Provides @ComponentScope SavingsAccountNode provideSavingsAccountNode() {
        return owner.getParent();
    }

    @Provides @Named("SavingsBsbNoNodeRuleProvider") @IntoMap @StringKey(NeutronConstants.PLACEHOLDER_RULE_PROVIDER)
    RuleProvider<SavingsBsbNoNode> providePlaceholderRuleProvider() {
        return null;
    }

    @Provides @Named("SavingsBsbNoNodeRuleProvider") @IntoMap @StringKey(NeutronConstants.TYPE_RULE_PROVIDER)
    RuleProvider<SavingsBsbNoNode> provideTypeRuleProvider(SavingsBsbNoNodeRuleProvider provider) {
        return provider;
    }

        @Provides @Named("SavingsBsbNoNodeRuleProvider") @IntoMap @StringKey("savingsBsbNoNode")
        RuleProvider<SavingsBsbNoNode> provideSavingsBsbNoNodeChildRuleProvider(
            SavingsAccountNodeChildProvider.SavingsBsbNoNodeRuleProvider provider
        ) {
            return provider;
        }


    @Provides @ComponentScope
    List<RuleProvider<SavingsBsbNoNode>> provideRuleProviders(
        @Named("SavingsBsbNoNodeRuleProvider")  Map<String, Provider<RuleProvider<SavingsBsbNoNode>>> ruleProviderProviderMap
    ) {
        String[] potentialRuleProviderKeys = {NeutronConstants.TYPE_RULE_PROVIDER, owner.getName()};
        return RuleProvider.extractRuleProviders(potentialRuleProviderKeys, ruleProviderProviderMap);
    }
}