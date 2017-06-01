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
public class OtherLiabilityListNodeModule {

    private final OtherLiabilityListNode owner;

    public OtherLiabilityListNodeModule(OtherLiabilityListNode owner) {
        this.owner = owner;
    }

    @Provides @ComponentScope @Owner OtherLiabilityListNode provideOtherLiabilityListNode() {
        return owner;
    }

    @Provides @ComponentScope @Owner ListUiNode<?,?> provideListUiNode() {
        return owner;
    }

    @Provides @ComponentScope @Owner ParentUiNode<?> provideParentUiNode() {
        return owner;
    }

    @Provides @ComponentScope @Owner UiNode<?> provideUiNode() {
        return owner;
    }

    @Provides @ComponentScope LiabilitiesNode provideLiabilitiesNode() {
        return owner.getParent();
    }

    @Provides @Named("OtherLiabilityListNodeRuleProvider") @IntoMap @StringKey(NeutronConstants.PLACEHOLDER_RULE_PROVIDER)
    RuleProvider<OtherLiabilityListNode> providePlaceholderRuleProvider() {
        return null;
    }

    @Provides @Named("OtherLiabilityListNodeRuleProvider") @IntoMap @StringKey(NeutronConstants.TYPE_RULE_PROVIDER)
    RuleProvider<OtherLiabilityListNode> provideTypeRuleProvider(OtherLiabilityListNodeRuleProvider provider) {
        return provider;
    }

        @Provides @Named("OtherLiabilityListNodeRuleProvider") @IntoMap @StringKey("otherLiabilityListNode")
        RuleProvider<OtherLiabilityListNode> provideOtherLiabilityListNodeChildRuleProvider(
            LiabilitiesNodeChildProvider.OtherLiabilityListNodeRuleProvider provider
        ) {
            return provider;
        }


    @Provides @ComponentScope
    List<RuleProvider<OtherLiabilityListNode>> provideRuleProviders(
        @Named("OtherLiabilityListNodeRuleProvider")  Map<String, Provider<RuleProvider<OtherLiabilityListNode>>> ruleProviderProviderMap
    ) {
        String[] potentialRuleProviderKeys = {NeutronConstants.TYPE_RULE_PROVIDER, owner.getName()};
        return RuleProvider.extractRuleProviders(potentialRuleProviderKeys, ruleProviderProviderMap);
    }
}