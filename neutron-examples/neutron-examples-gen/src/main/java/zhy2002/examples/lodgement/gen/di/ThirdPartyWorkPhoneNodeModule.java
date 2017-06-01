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
public class ThirdPartyWorkPhoneNodeModule {

    private final ThirdPartyWorkPhoneNode owner;

    public ThirdPartyWorkPhoneNodeModule(ThirdPartyWorkPhoneNode owner) {
        this.owner = owner;
    }

    @Provides @ComponentScope @Owner ThirdPartyWorkPhoneNode provideThirdPartyWorkPhoneNode() {
        return owner;
    }

    @Provides @ComponentScope @Owner TelephoneNode<?> provideTelephoneNode() {
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

    @Provides @Named("ThirdPartyWorkPhoneNodeRuleProvider") @IntoMap @StringKey(NeutronConstants.PLACEHOLDER_RULE_PROVIDER)
    RuleProvider<ThirdPartyWorkPhoneNode> providePlaceholderRuleProvider() {
        return null;
    }

    @Provides @Named("ThirdPartyWorkPhoneNodeRuleProvider") @IntoMap @StringKey(NeutronConstants.TYPE_RULE_PROVIDER)
    RuleProvider<ThirdPartyWorkPhoneNode> provideTypeRuleProvider(ThirdPartyWorkPhoneNodeRuleProvider provider) {
        return provider;
    }

        @Provides @Named("ThirdPartyWorkPhoneNodeRuleProvider") @IntoMap @StringKey("thirdPartyWorkPhoneNode")
        RuleProvider<ThirdPartyWorkPhoneNode> provideThirdPartyWorkPhoneNodeChildRuleProvider(
            RelatedPartyNodeChildProvider.ThirdPartyWorkPhoneNodeRuleProvider provider
        ) {
            return provider;
        }


    @Provides @ComponentScope
    List<RuleProvider<ThirdPartyWorkPhoneNode>> provideRuleProviders(
        @Named("ThirdPartyWorkPhoneNodeRuleProvider")  Map<String, Provider<RuleProvider<ThirdPartyWorkPhoneNode>>> ruleProviderProviderMap
    ) {
        String[] potentialRuleProviderKeys = {NeutronConstants.TYPE_RULE_PROVIDER, owner.getName()};
        return RuleProvider.extractRuleProviders(potentialRuleProviderKeys, ruleProviderProviderMap);
    }
}