package zhy2002.examples.register.gen.di;
import dagger.*;
import dagger.multibindings.*;
import javax.inject.*;
import zhy2002.examples.register.gen.node.*;
import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import zhy2002.neutron.di.*;
import java.util.*;
import zhy2002.neutron.util.NeutronConstants;


@Module
public class OwnInvestmentPropertyNodeModule {

    private final OwnInvestmentPropertyNode owner;

    public OwnInvestmentPropertyNodeModule(OwnInvestmentPropertyNode owner) {
        this.owner = owner;
    }

    @Provides @ComponentScope @Owner OwnInvestmentPropertyNode provideOwnInvestmentPropertyNode() {
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

    @Provides @ComponentScope RegisterNode provideRegisterNode() {
        return owner.getParent();
    }

    @Provides @Named("OwnInvestmentPropertyNodeRuleProvider") @IntoMap @StringKey(NeutronConstants.PLACEHOLDER_RULE_PROVIDER)
    RuleProvider<OwnInvestmentPropertyNode> providePlaceholderRuleProvider() {
        return null;
    }

    @Provides @Named("OwnInvestmentPropertyNodeRuleProvider") @IntoMap @StringKey(NeutronConstants.TYPE_RULE_PROVIDER)
    RuleProvider<OwnInvestmentPropertyNode> provideTypeRuleProvider(OwnInvestmentPropertyNodeRuleProvider provider) {
        return provider;
    }

        @Provides @Named("OwnInvestmentPropertyNodeRuleProvider") @IntoMap @StringKey("ownInvestmentPropertyNode")
        RuleProvider<OwnInvestmentPropertyNode> provideOwnInvestmentPropertyNodeChildRuleProvider(
            RegisterNodeChildProvider.OwnInvestmentPropertyNodeRuleProvider provider
        ) {
            return provider;
        }


    @Provides @ComponentScope
    List<RuleProvider<OwnInvestmentPropertyNode>> provideRuleProviders(
        @Named("OwnInvestmentPropertyNodeRuleProvider")  Map<String, Provider<RuleProvider<OwnInvestmentPropertyNode>>> ruleProviderProviderMap
    ) {
        String[] potentialRuleProviderKeys = {NeutronConstants.TYPE_RULE_PROVIDER, owner.getName()};
        return RuleProvider.extractRuleProviders(potentialRuleProviderKeys, ruleProviderProviderMap);
    }
}