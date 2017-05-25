package zhy2002.examples.lodgement.gen.di;
import dagger.*;
import javax.inject.*;
import zhy2002.examples.lodgement.gen.node.*;
import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import zhy2002.neutron.di.*;
import java.util.*;


@Module
public class OtherAssetMarketValueNodeModule {

    private final OtherAssetMarketValueNode owner;

    public OtherAssetMarketValueNodeModule(OtherAssetMarketValueNode owner) {
        this.owner = owner;
    }

    @Provides @OtherAssetMarketValueNodeScope @Owner OtherAssetMarketValueNode provideOtherAssetMarketValueNode() {
        return owner;
    }

    @Provides @OtherAssetMarketValueNodeScope @Owner BaseCurrencyNode<?> provideBaseCurrencyNode() {
        return owner;
    }

    @Provides @OtherAssetMarketValueNodeScope @Owner BigDecimalUiNode<?> provideBigDecimalUiNode() {
        return owner;
    }

    @Provides @OtherAssetMarketValueNodeScope @Owner LeafUiNode<?,?> provideLeafUiNode() {
        return owner;
    }

    @Provides @OtherAssetMarketValueNodeScope @Owner UiNode<?> provideUiNode() {
        return owner;
    }

    @Provides @OtherAssetMarketValueNodeScope OtherAssetNode provideOtherAssetNode() {
        return owner.getParent();
    }

    @Provides @OtherAssetMarketValueNodeScope
    RuleProvider<OtherAssetMarketValueNode> provideRuleProvider(Provider<OtherAssetMarketValueNodeRuleProvider> provider) {
        return provider.get();
    }

    @Provides @OtherAssetMarketValueNodeScope
    Map<String, RuleProvider<OtherAssetMarketValueNode>> provideInstanceProviderMap(
        Provider<OtherAssetNodeChildProvider.OtherAssetMarketValueNodeRuleProvider> otherAssetMarketValueNodeRuleProvider
    ) {
        Map<String, RuleProvider<OtherAssetMarketValueNode>> result = new HashMap<>();
        result.put("otherAssetMarketValueNode", otherAssetMarketValueNodeRuleProvider.get());
        return result;
    }
}