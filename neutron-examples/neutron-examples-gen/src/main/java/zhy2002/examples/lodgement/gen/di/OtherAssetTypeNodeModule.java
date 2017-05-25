package zhy2002.examples.lodgement.gen.di;
import dagger.*;
import javax.inject.*;
import zhy2002.examples.lodgement.gen.node.*;
import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import zhy2002.neutron.di.*;
import java.util.*;


@Module
public class OtherAssetTypeNodeModule {

    private final OtherAssetTypeNode owner;

    public OtherAssetTypeNodeModule(OtherAssetTypeNode owner) {
        this.owner = owner;
    }

    @Provides @OtherAssetTypeNodeScope @Owner OtherAssetTypeNode provideOtherAssetTypeNode() {
        return owner;
    }

    @Provides @OtherAssetTypeNodeScope @Owner StringUiNode<?> provideStringUiNode() {
        return owner;
    }

    @Provides @OtherAssetTypeNodeScope @Owner LeafUiNode<?,?> provideLeafUiNode() {
        return owner;
    }

    @Provides @OtherAssetTypeNodeScope @Owner UiNode<?> provideUiNode() {
        return owner;
    }

    @Provides @OtherAssetTypeNodeScope OtherAssetNode provideOtherAssetNode() {
        return owner.getParent();
    }

    @Provides @OtherAssetTypeNodeScope
    RuleProvider<OtherAssetTypeNode> provideRuleProvider(Provider<OtherAssetTypeNodeRuleProvider> provider) {
        return provider.get();
    }

    @Provides @OtherAssetTypeNodeScope
    Map<String, RuleProvider<OtherAssetTypeNode>> provideInstanceProviderMap(
        Provider<OtherAssetNodeChildProvider.OtherAssetTypeNodeRuleProvider> otherAssetTypeNodeRuleProvider
    ) {
        Map<String, RuleProvider<OtherAssetTypeNode>> result = new HashMap<>();
        result.put("otherAssetTypeNode", otherAssetTypeNodeRuleProvider.get());
        return result;
    }
}