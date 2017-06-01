package zhy2002.examples.lodgement.gen.di;
import dagger.*;
import javax.inject.*;
import zhy2002.examples.lodgement.gen.node.*;
import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import zhy2002.neutron.di.*;
import java.util.*;


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

    @Provides @ComponentScope
    RuleProvider<OtherAssetListNode> provideRuleProvider(Provider<OtherAssetListNodeRuleProvider> provider) {
        return provider.get();
    }

    @Provides @ComponentScope
    Map<String, RuleProvider<OtherAssetListNode>> provideInstanceProviderMap(
        Provider<AssetsNodeChildProvider.OtherAssetListNodeRuleProvider> otherAssetListNodeRuleProvider
    ) {
        Map<String, RuleProvider<OtherAssetListNode>> result = new HashMap<>();
        result.put("otherAssetListNode", otherAssetListNodeRuleProvider.get());
        return result;
    }
}