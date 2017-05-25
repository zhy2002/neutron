package zhy2002.examples.lodgement.gen.di;
import dagger.*;
import javax.inject.*;
import zhy2002.examples.lodgement.gen.node.*;
import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import zhy2002.neutron.di.*;
import java.util.*;


@Module
public class OtherAssetOwnershipListNodeModule {

    private final OtherAssetOwnershipListNode owner;

    public OtherAssetOwnershipListNodeModule(OtherAssetOwnershipListNode owner) {
        this.owner = owner;
    }

    @Provides @OtherAssetOwnershipListNodeScope @Owner OtherAssetOwnershipListNode provideOtherAssetOwnershipListNode() {
        return owner;
    }

    @Provides @OtherAssetOwnershipListNodeScope @Owner OwnershipListNode<?> provideOwnershipListNode() {
        return owner;
    }

    @Provides @OtherAssetOwnershipListNodeScope @Owner ListUiNode<?,?> provideListUiNode() {
        return owner;
    }

    @Provides @OtherAssetOwnershipListNodeScope @Owner ParentUiNode<?> provideParentUiNode() {
        return owner;
    }

    @Provides @OtherAssetOwnershipListNodeScope @Owner UiNode<?> provideUiNode() {
        return owner;
    }

    @Provides @OtherAssetOwnershipListNodeScope OtherAssetNode provideOtherAssetNode() {
        return owner.getParent();
    }

    @Provides @OtherAssetOwnershipListNodeScope
    RuleProvider<OtherAssetOwnershipListNode> provideRuleProvider(Provider<OtherAssetOwnershipListNodeRuleProvider> provider) {
        return provider.get();
    }

    @Provides @OtherAssetOwnershipListNodeScope
    Map<String, RuleProvider<OtherAssetOwnershipListNode>> provideInstanceProviderMap(
        Provider<OtherAssetNodeChildProvider.OwnershipListNodeRuleProvider> ownershipListNodeRuleProvider
    ) {
        Map<String, RuleProvider<OtherAssetOwnershipListNode>> result = new HashMap<>();
        result.put("ownershipListNode", ownershipListNodeRuleProvider.get());
        return result;
    }
}