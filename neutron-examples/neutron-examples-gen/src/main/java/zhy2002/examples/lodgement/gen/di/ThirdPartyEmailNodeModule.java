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
public class ThirdPartyEmailNodeModule {

    private final ThirdPartyEmailNode owner;

    public ThirdPartyEmailNodeModule(ThirdPartyEmailNode owner) {
        this.owner = owner;
    }

    @Provides @ComponentScope @Owner ThirdPartyEmailNode provideThirdPartyEmailNode() {
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

    @Provides @ComponentScope RelatedPartyNode provideRelatedPartyNode() {
        return owner.getParent();
    }

    @Provides @Named("ThirdPartyEmailNodeRuleProvider") @IntoMap @StringKey(NeutronConstants.PLACEHOLDER_RULE_PROVIDER)
    RuleProvider<ThirdPartyEmailNode> providePlaceholderRuleProvider() {
        return null;
    }

    @Provides @Named("ThirdPartyEmailNodeRuleProvider") @IntoMap @StringKey(NeutronConstants.TYPE_RULE_PROVIDER)
    RuleProvider<ThirdPartyEmailNode> provideTypeRuleProvider(ThirdPartyEmailNodeRuleProvider provider) {
        return provider;
    }

        @Provides @Named("ThirdPartyEmailNodeRuleProvider") @IntoMap @StringKey("thirdPartyEmailNode")
        RuleProvider<ThirdPartyEmailNode> provideThirdPartyEmailNodeChildRuleProvider(
            RelatedPartyNodeChildProvider.ThirdPartyEmailNodeRuleProvider provider
        ) {
            return provider;
        }


    @Provides @ComponentScope
    List<RuleProvider<ThirdPartyEmailNode>> provideRuleProviders(
        @Named("ThirdPartyEmailNodeRuleProvider")  Map<String, Provider<RuleProvider<ThirdPartyEmailNode>>> ruleProviderProviderMap
    ) {
        String[] potentialRuleProviderKeys = {NeutronConstants.TYPE_RULE_PROVIDER, owner.getName()};
        return RuleProvider.extractRuleProviders(potentialRuleProviderKeys, ruleProviderProviderMap);
    }
}