package zhy2002.examples.lodgement.gen.di;
import dagger.*;
import dagger.multibindings.*;
import javax.inject.*;
import zhy2002.examples.lodgement.gen.node.*;
import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import zhy2002.neutron.di.*;
import zhy2002.neutron.config.NeutronConstants;
import java.util.*;


@Module
public class ThirdPartyDobNodeModule {

    private final ThirdPartyDobNode owner;

    public ThirdPartyDobNodeModule(ThirdPartyDobNode owner) {
        this.owner = owner;
    }

    @Provides @ComponentScope @Owner ThirdPartyDobNode provideThirdPartyDobNode() {
        return owner;
    }

    @Provides @ComponentScope @Owner DobNode<?> provideDobNode() {
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

    @Provides @Named("ThirdPartyDobNodeRuleProvider") @IntoMap @StringKey(NeutronConstants.PLACEHOLDER_RULE_PROVIDER)
    RuleProvider<ThirdPartyDobNode> providePlaceholderRuleProvider() {
        return null;
    }

    @Provides @Named("ThirdPartyDobNodeRuleProvider") @IntoMap @StringKey(NeutronConstants.TYPE_RULE_PROVIDER)
    RuleProvider<ThirdPartyDobNode> provideTypeRuleProvider(ThirdPartyDobNodeRuleProvider provider) {
        return provider;
    }


    @Provides @ComponentScope
    List<RuleProvider<ThirdPartyDobNode>> provideRuleProviders(
        @Named("ThirdPartyDobNodeRuleProvider")  Map<String, Provider<RuleProvider<ThirdPartyDobNode>>> ruleProviderProviderMap
    ) {
        String[] potentialRuleProviderKeys = {NeutronConstants.TYPE_RULE_PROVIDER, owner.getName()};
        return RuleProvider.extractRuleProviders(potentialRuleProviderKeys, ruleProviderProviderMap);
    }
}