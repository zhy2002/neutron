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
public class OtherAssetListNodeModule {

    private final OtherAssetListNode owner;

    public OtherAssetListNodeModule(OtherAssetListNode owner) {
        this.owner = owner;
    }

    @Provides @ComponentScope @Owner OtherAssetListNode provideOtherAssetListNode() {
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

    @Provides @ComponentScope AssetsNode provideAssetsNode() {
        return owner.getParent();
    }

    @Provides @Named("OtherAssetListNodeRuleProvider") @IntoMap @StringKey(NeutronConstants.PLACEHOLDER_RULE_PROVIDER)
    RuleProvider<OtherAssetListNode> providePlaceholderRuleProvider() {
        return null;
    }

    @Provides @Named("OtherAssetListNodeRuleProvider") @IntoMap @StringKey(NeutronConstants.TYPE_RULE_PROVIDER)
    RuleProvider<OtherAssetListNode> provideTypeRuleProvider(OtherAssetListNodeRuleProvider provider) {
        return provider;
    }


    @Provides @ComponentScope
    List<RuleProvider<OtherAssetListNode>> provideRuleProviders(
        @Named("OtherAssetListNodeRuleProvider")  Map<String, Provider<RuleProvider<OtherAssetListNode>>> ruleProviderProviderMap
    ) {
        String[] potentialRuleProviderKeys = {NeutronConstants.TYPE_RULE_PROVIDER, owner.getName()};
        return RuleProvider.extractRuleProviders(potentialRuleProviderKeys, ruleProviderProviderMap);
    }
}