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
public class CreditCardLenderNameNodeModule {

    private final CreditCardLenderNameNode owner;

    public CreditCardLenderNameNodeModule(CreditCardLenderNameNode owner) {
        this.owner = owner;
    }

    @Provides @ComponentScope @Owner CreditCardLenderNameNode provideCreditCardLenderNameNode() {
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

    @Provides @ComponentScope CreditCardNode provideCreditCardNode() {
        return owner.getParent();
    }

    @Provides @Named("CreditCardLenderNameNodeRuleProvider") @IntoMap @StringKey(NeutronConstants.PLACEHOLDER_RULE_PROVIDER)
    RuleProvider<CreditCardLenderNameNode> providePlaceholderRuleProvider() {
        return null;
    }

    @Provides @Named("CreditCardLenderNameNodeRuleProvider") @IntoMap @StringKey(NeutronConstants.TYPE_RULE_PROVIDER)
    RuleProvider<CreditCardLenderNameNode> provideTypeRuleProvider(CreditCardLenderNameNodeRuleProvider provider) {
        return provider;
    }

        @Provides @Named("CreditCardLenderNameNodeRuleProvider") @IntoMap @StringKey("creditCardLenderNameNode")
        RuleProvider<CreditCardLenderNameNode> provideCreditCardLenderNameNodeChildRuleProvider(
            CreditCardNodeChildProvider.CreditCardLenderNameNodeRuleProvider provider
        ) {
            return provider;
        }


    @Provides @ComponentScope
    List<RuleProvider<CreditCardLenderNameNode>> provideRuleProviders(
        @Named("CreditCardLenderNameNodeRuleProvider")  Map<String, Provider<RuleProvider<CreditCardLenderNameNode>>> ruleProviderProviderMap
    ) {
        String[] potentialRuleProviderKeys = {NeutronConstants.TYPE_RULE_PROVIDER, owner.getName()};
        return RuleProvider.extractRuleProviders(potentialRuleProviderKeys, ruleProviderProviderMap);
    }
}