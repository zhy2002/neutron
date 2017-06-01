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
public class RentedFlagNodeModule {

    private final RentedFlagNode owner;

    public RentedFlagNodeModule(RentedFlagNode owner) {
        this.owner = owner;
    }

    @Provides @ComponentScope @Owner RentedFlagNode provideRentedFlagNode() {
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

    @Provides @ComponentScope PropertyNode providePropertyNode() {
        return owner.getParent();
    }

    @Provides @Named("RentedFlagNodeRuleProvider") @IntoMap @StringKey(NeutronConstants.PLACEHOLDER_RULE_PROVIDER)
    RuleProvider<RentedFlagNode> providePlaceholderRuleProvider() {
        return null;
    }

    @Provides @Named("RentedFlagNodeRuleProvider") @IntoMap @StringKey(NeutronConstants.TYPE_RULE_PROVIDER)
    RuleProvider<RentedFlagNode> provideTypeRuleProvider(RentedFlagNodeRuleProvider provider) {
        return provider;
    }

        @Provides @Named("RentedFlagNodeRuleProvider") @IntoMap @StringKey("rentedFlagNode")
        RuleProvider<RentedFlagNode> provideRentedFlagNodeChildRuleProvider(
            PropertyNodeChildProvider.RentedFlagNodeRuleProvider provider
        ) {
            return provider;
        }


    @Provides @ComponentScope
    List<RuleProvider<RentedFlagNode>> provideRuleProviders(
        @Named("RentedFlagNodeRuleProvider")  Map<String, Provider<RuleProvider<RentedFlagNode>>> ruleProviderProviderMap
    ) {
        String[] potentialRuleProviderKeys = {NeutronConstants.TYPE_RULE_PROVIDER, owner.getName()};
        return RuleProvider.extractRuleProviders(potentialRuleProviderKeys, ruleProviderProviderMap);
    }
}