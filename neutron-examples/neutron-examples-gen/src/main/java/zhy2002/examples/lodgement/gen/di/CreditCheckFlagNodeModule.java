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
public class CreditCheckFlagNodeModule {

    private final CreditCheckFlagNode owner;

    public CreditCheckFlagNodeModule(CreditCheckFlagNode owner) {
        this.owner = owner;
    }

    @Provides @ComponentScope @Owner CreditCheckFlagNode provideCreditCheckFlagNode() {
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

    @Provides @ComponentScope BasePrivacyNode<?> provideBasePrivacyNode() {
        return owner.getParent();
    }

    @Provides @Named("CreditCheckFlagNodeRuleProvider") @IntoMap @StringKey(NeutronConstants.PLACEHOLDER_RULE_PROVIDER)
    RuleProvider<CreditCheckFlagNode> providePlaceholderRuleProvider() {
        return null;
    }

    @Provides @Named("CreditCheckFlagNodeRuleProvider") @IntoMap @StringKey(NeutronConstants.TYPE_RULE_PROVIDER)
    RuleProvider<CreditCheckFlagNode> provideTypeRuleProvider(CreditCheckFlagNodeRuleProvider provider) {
        return provider;
    }


    @Provides @ComponentScope
    List<RuleProvider<CreditCheckFlagNode>> provideRuleProviders(
        @Named("CreditCheckFlagNodeRuleProvider")  Map<String, Provider<RuleProvider<CreditCheckFlagNode>>> ruleProviderProviderMap
    ) {
        String[] potentialRuleProviderKeys = {NeutronConstants.TYPE_RULE_PROVIDER, owner.getName()};
        return RuleProvider.extractRuleProviders(potentialRuleProviderKeys, ruleProviderProviderMap);
    }
}