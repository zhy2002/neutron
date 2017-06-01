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
public class SavingsAccountNodeModule {

    private final SavingsAccountNode owner;

    public SavingsAccountNodeModule(SavingsAccountNode owner) {
        this.owner = owner;
    }

    @Provides @ComponentScope @Owner SavingsAccountNode provideSavingsAccountNode() {
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

    @Provides @ComponentScope SavingsAccountListNode provideSavingsAccountListNode() {
        return owner.getParent();
    }

    @Provides @Named("SavingsAccountNodeRuleProvider") @IntoMap @StringKey(NeutronConstants.PLACEHOLDER_RULE_PROVIDER)
    RuleProvider<SavingsAccountNode> providePlaceholderRuleProvider() {
        return null;
    }

    @Provides @Named("SavingsAccountNodeRuleProvider") @IntoMap @StringKey(NeutronConstants.TYPE_RULE_PROVIDER)
    RuleProvider<SavingsAccountNode> provideTypeRuleProvider(SavingsAccountNodeRuleProvider provider) {
        return provider;
    }


    @Provides @ComponentScope
    List<RuleProvider<SavingsAccountNode>> provideRuleProviders(
        @Named("SavingsAccountNodeRuleProvider")  Map<String, Provider<RuleProvider<SavingsAccountNode>>> ruleProviderProviderMap
    ) {
        String[] potentialRuleProviderKeys = {NeutronConstants.TYPE_RULE_PROVIDER, owner.getName()};
        return RuleProvider.extractRuleProviders(potentialRuleProviderKeys, ruleProviderProviderMap);
    }
}