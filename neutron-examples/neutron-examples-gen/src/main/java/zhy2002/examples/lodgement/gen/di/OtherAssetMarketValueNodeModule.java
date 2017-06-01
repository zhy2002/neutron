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

    @Provides @ComponentScope @Owner OtherAssetMarketValueNode provideOtherAssetMarketValueNode() {
        return owner;
    }

    @Provides @ComponentScope @Owner BaseCurrencyNode<?> provideBaseCurrencyNode() {
        return owner;
    }

    @Provides @ComponentScope @Owner BigDecimalUiNode<?> provideBigDecimalUiNode() {
        return owner;
    }

    @Provides @ComponentScope @Owner LeafUiNode<?,?> provideLeafUiNode() {
        return owner;
    }

    @Provides @ComponentScope @Owner UiNode<?> provideUiNode() {
        return owner;
    }

    @Provides @ChildName String provideChildName() {
        return owner.getContext().getNameOfNodeBeingCreated();
    }

    @Provides @ComponentScope OtherAssetNode provideOtherAssetNode() {
        return owner.getParent();
    }

    @Provides @ComponentScope
    RuleProvider<OtherAssetMarketValueNode> provideRuleProvider(Provider<OtherAssetMarketValueNodeRuleProvider> provider) {
        return provider.get();
    }

    @Provides @ComponentScope
    Map<String, RuleProvider<OtherAssetMarketValueNode>> provideInstanceProviderMap(
        Provider<OtherAssetNodeChildProvider.OtherAssetMarketValueNodeRuleProvider> otherAssetMarketValueNodeRuleProvider
    ) {
        Map<String, RuleProvider<OtherAssetMarketValueNode>> result = new HashMap<>();
        result.put("otherAssetMarketValueNode", otherAssetMarketValueNodeRuleProvider.get());
        return result;
    }
}