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
public class OtherLiabilityOwnershipListNodeModule {

    private final OtherLiabilityOwnershipListNode owner;

    public OtherLiabilityOwnershipListNodeModule(OtherLiabilityOwnershipListNode owner) {
        this.owner = owner;
    }

    @Provides @ComponentScope @Owner OtherLiabilityOwnershipListNode provideOtherLiabilityOwnershipListNode() {
        return owner;
    }

    @Provides @ComponentScope @Owner OwnershipListNode<?> provideOwnershipListNode() {
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

    @Provides @ComponentScope OtherLiabilityNode provideOtherLiabilityNode() {
        return owner.getParent();
    }

    @Provides @Named("OtherLiabilityOwnershipListNodeRuleProvider") @IntoMap @StringKey(NeutronConstants.PLACEHOLDER_RULE_PROVIDER)
    RuleProvider<OtherLiabilityOwnershipListNode> providePlaceholderRuleProvider() {
        return null;
    }

    @Provides @Named("OtherLiabilityOwnershipListNodeRuleProvider") @IntoMap @StringKey(NeutronConstants.TYPE_RULE_PROVIDER)
    RuleProvider<OtherLiabilityOwnershipListNode> provideTypeRuleProvider(OtherLiabilityOwnershipListNodeRuleProvider provider) {
        return provider;
    }


    @Provides @ComponentScope
    List<RuleProvider<OtherLiabilityOwnershipListNode>> provideRuleProviders(
        @Named("OtherLiabilityOwnershipListNodeRuleProvider")  Map<String, Provider<RuleProvider<OtherLiabilityOwnershipListNode>>> ruleProviderProviderMap
    ) {
        String[] potentialRuleProviderKeys = {NeutronConstants.TYPE_RULE_PROVIDER, owner.getName()};
        return RuleProvider.extractRuleProviders(potentialRuleProviderKeys, ruleProviderProviderMap);
    }
}