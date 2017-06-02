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
public class OtherLiabilityDescriptionNodeModule {

    private final OtherLiabilityDescriptionNode owner;

    public OtherLiabilityDescriptionNodeModule(OtherLiabilityDescriptionNode owner) {
        this.owner = owner;
    }

    @Provides @ComponentScope @Owner OtherLiabilityDescriptionNode provideOtherLiabilityDescriptionNode() {
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

    @Provides @ComponentScope OtherLiabilityNode provideOtherLiabilityNode() {
        return owner.getParent();
    }

    @Provides @Named("OtherLiabilityDescriptionNodeRuleProvider") @IntoMap @StringKey(NeutronConstants.PLACEHOLDER_RULE_PROVIDER)
    RuleProvider<OtherLiabilityDescriptionNode> providePlaceholderRuleProvider() {
        return null;
    }

    @Provides @Named("OtherLiabilityDescriptionNodeRuleProvider") @IntoMap @StringKey(NeutronConstants.TYPE_RULE_PROVIDER)
    RuleProvider<OtherLiabilityDescriptionNode> provideTypeRuleProvider(OtherLiabilityDescriptionNodeRuleProvider provider) {
        return provider;
    }


    @Provides @ComponentScope
    List<RuleProvider<OtherLiabilityDescriptionNode>> provideRuleProviders(
        @Named("OtherLiabilityDescriptionNodeRuleProvider")  Map<String, Provider<RuleProvider<OtherLiabilityDescriptionNode>>> ruleProviderProviderMap
    ) {
        String[] potentialRuleProviderKeys = {NeutronConstants.TYPE_RULE_PROVIDER, owner.getName()};
        return RuleProvider.extractRuleProviders(potentialRuleProviderKeys, ruleProviderProviderMap);
    }
}