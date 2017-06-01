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
public class MaritalStatusNodeModule {

    private final MaritalStatusNode owner;

    public MaritalStatusNodeModule(MaritalStatusNode owner) {
        this.owner = owner;
    }

    @Provides @ComponentScope @Owner MaritalStatusNode provideMaritalStatusNode() {
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

    @Provides @ComponentScope PersonGeneralNode providePersonGeneralNode() {
        return owner.getParent();
    }

    @Provides @Named("MaritalStatusNodeRuleProvider") @IntoMap @StringKey(NeutronConstants.PLACEHOLDER_RULE_PROVIDER)
    RuleProvider<MaritalStatusNode> providePlaceholderRuleProvider() {
        return null;
    }

    @Provides @Named("MaritalStatusNodeRuleProvider") @IntoMap @StringKey(NeutronConstants.TYPE_RULE_PROVIDER)
    RuleProvider<MaritalStatusNode> provideTypeRuleProvider(MaritalStatusNodeRuleProvider provider) {
        return provider;
    }

        @Provides @Named("MaritalStatusNodeRuleProvider") @IntoMap @StringKey("maritalStatusNode")
        RuleProvider<MaritalStatusNode> provideMaritalStatusNodeChildRuleProvider(
            PersonGeneralNodeChildProvider.MaritalStatusNodeRuleProvider provider
        ) {
            return provider;
        }


    @Provides @ComponentScope
    List<RuleProvider<MaritalStatusNode>> provideRuleProviders(
        @Named("MaritalStatusNodeRuleProvider")  Map<String, Provider<RuleProvider<MaritalStatusNode>>> ruleProviderProviderMap
    ) {
        String[] potentialRuleProviderKeys = {NeutronConstants.TYPE_RULE_PROVIDER, owner.getName()};
        return RuleProvider.extractRuleProviders(potentialRuleProviderKeys, ruleProviderProviderMap);
    }
}