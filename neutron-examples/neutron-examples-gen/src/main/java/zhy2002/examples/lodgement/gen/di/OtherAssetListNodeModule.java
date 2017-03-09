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

    @Provides @OtherAssetListNodeScope @Owner OtherAssetListNode provideOtherAssetListNode() {
        return owner;
    }

    @Provides @OtherAssetListNodeScope @Owner ListUiNode<?,?> provideListUiNode() {
        return owner;
    }

    @Provides @OtherAssetListNodeScope @Owner ParentUiNode<?> provideParentUiNode() {
        return owner;
    }

    @Provides @OtherAssetListNodeScope @Owner UiNode<?> provideUiNode() {
        return owner;
    }

    @Provides @OtherAssetListNodeScope AssetsNode provideAssetsNode() {
        return owner.getParent();
    }

    @Provides @OtherAssetListNodeScope
    Map<String, RuleProvider<OtherAssetListNode>> provideInstanceProviders(
        Provider<AssetsNodeChildProvider.OtherAssetListNodeRuleProvider> otherAssetListNodeRuleProvider
    ) {
        Map<String, RuleProvider<OtherAssetListNode>> result = new HashMap<>();
        result.put("otherAssetListNode", otherAssetListNodeRuleProvider.get());
        return result;
    }
}