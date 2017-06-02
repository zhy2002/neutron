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
public class OtherAssetOwnershipListNodeModule {

    private final OtherAssetOwnershipListNode owner;

    public OtherAssetOwnershipListNodeModule(OtherAssetOwnershipListNode owner) {
        this.owner = owner;
    }

    @Provides @ComponentScope @Owner OtherAssetOwnershipListNode provideOtherAssetOwnershipListNode() {
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

    @Provides @ComponentScope OtherAssetNode provideOtherAssetNode() {
        return owner.getParent();
    }

    @Provides @Named("OtherAssetOwnershipListNodeRuleProvider") @IntoMap @StringKey(NeutronConstants.PLACEHOLDER_RULE_PROVIDER)
    RuleProvider<OtherAssetOwnershipListNode> providePlaceholderRuleProvider() {
        return null;
    }

    @Provides @Named("OtherAssetOwnershipListNodeRuleProvider") @IntoMap @StringKey(NeutronConstants.TYPE_RULE_PROVIDER)
    RuleProvider<OtherAssetOwnershipListNode> provideTypeRuleProvider(OtherAssetOwnershipListNodeRuleProvider provider) {
        return provider;
    }


    @Provides @ComponentScope
    List<RuleProvider<OtherAssetOwnershipListNode>> provideRuleProviders(
        @Named("OtherAssetOwnershipListNodeRuleProvider")  Map<String, Provider<RuleProvider<OtherAssetOwnershipListNode>>> ruleProviderProviderMap
    ) {
        String[] potentialRuleProviderKeys = {NeutronConstants.TYPE_RULE_PROVIDER, owner.getName()};
        return RuleProvider.extractRuleProviders(potentialRuleProviderKeys, ruleProviderProviderMap);
    }
}