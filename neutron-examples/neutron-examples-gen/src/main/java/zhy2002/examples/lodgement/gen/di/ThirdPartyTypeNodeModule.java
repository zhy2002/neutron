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
public class ThirdPartyTypeNodeModule {

    private final ThirdPartyTypeNode owner;

    public ThirdPartyTypeNodeModule(ThirdPartyTypeNode owner) {
        this.owner = owner;
    }

    @Provides @ComponentScope @Owner ThirdPartyTypeNode provideThirdPartyTypeNode() {
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

    @Provides @Named("ThirdPartyTypeNodeRuleProvider") @IntoMap @StringKey(NeutronConstants.PLACEHOLDER_RULE_PROVIDER)
    RuleProvider<ThirdPartyTypeNode> providePlaceholderRuleProvider() {
        return null;
    }

    @Provides @Named("ThirdPartyTypeNodeRuleProvider") @IntoMap @StringKey(NeutronConstants.TYPE_RULE_PROVIDER)
    RuleProvider<ThirdPartyTypeNode> provideTypeRuleProvider(ThirdPartyTypeNodeRuleProvider provider) {
        return provider;
    }

        @Provides @Named("ThirdPartyTypeNodeRuleProvider") @IntoMap @StringKey("thirdPartyTypeNode")
        RuleProvider<ThirdPartyTypeNode> provideThirdPartyTypeNodeChildRuleProvider(
            RelatedPartyNodeChildProvider.ThirdPartyTypeNodeRuleProvider provider
        ) {
            return provider;
        }


    @Provides @ComponentScope
    List<RuleProvider<ThirdPartyTypeNode>> provideRuleProviders(
        @Named("ThirdPartyTypeNodeRuleProvider")  Map<String, Provider<RuleProvider<ThirdPartyTypeNode>>> ruleProviderProviderMap
    ) {
        String[] potentialRuleProviderKeys = {NeutronConstants.TYPE_RULE_PROVIDER, owner.getName()};
        return RuleProvider.extractRuleProviders(potentialRuleProviderKeys, ruleProviderProviderMap);
    }
}