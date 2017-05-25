package zhy2002.examples.lodgement.gen.di;
import dagger.*;
import javax.inject.*;
import zhy2002.examples.lodgement.gen.node.*;
import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import zhy2002.neutron.di.*;
import java.util.*;


@Module
public class OtherAssetDescriptionNodeModule {

    private final OtherAssetDescriptionNode owner;

    public OtherAssetDescriptionNodeModule(OtherAssetDescriptionNode owner) {
        this.owner = owner;
    }

    @Provides @OtherAssetDescriptionNodeScope @Owner OtherAssetDescriptionNode provideOtherAssetDescriptionNode() {
        return owner;
    }

    @Provides @OtherAssetDescriptionNodeScope @Owner StringUiNode<?> provideStringUiNode() {
        return owner;
    }

    @Provides @OtherAssetDescriptionNodeScope @Owner LeafUiNode<?,?> provideLeafUiNode() {
        return owner;
    }

    @Provides @OtherAssetDescriptionNodeScope @Owner UiNode<?> provideUiNode() {
        return owner;
    }

    @Provides @OtherAssetDescriptionNodeScope OtherAssetNode provideOtherAssetNode() {
        return owner.getParent();
    }

    @Provides @OtherAssetDescriptionNodeScope
    RuleProvider<OtherAssetDescriptionNode> provideRuleProvider(Provider<OtherAssetDescriptionNodeRuleProvider> provider) {
        return provider.get();
    }

    @Provides @OtherAssetDescriptionNodeScope
    Map<String, RuleProvider<OtherAssetDescriptionNode>> provideInstanceProviderMap(
        Provider<OtherAssetNodeChildProvider.OtherAssetDescriptionNodeRuleProvider> otherAssetDescriptionNodeRuleProvider
    ) {
        Map<String, RuleProvider<OtherAssetDescriptionNode>> result = new HashMap<>();
        result.put("otherAssetDescriptionNode", otherAssetDescriptionNodeRuleProvider.get());
        return result;
    }
}