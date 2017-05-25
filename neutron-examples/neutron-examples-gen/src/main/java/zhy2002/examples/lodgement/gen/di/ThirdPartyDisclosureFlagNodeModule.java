package zhy2002.examples.lodgement.gen.di;
import dagger.*;
import javax.inject.*;
import zhy2002.examples.lodgement.gen.node.*;
import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import zhy2002.neutron.di.*;
import java.util.*;


@Module
public class ThirdPartyDisclosureFlagNodeModule {

    private final ThirdPartyDisclosureFlagNode owner;

    public ThirdPartyDisclosureFlagNodeModule(ThirdPartyDisclosureFlagNode owner) {
        this.owner = owner;
    }

    @Provides @ThirdPartyDisclosureFlagNodeScope @Owner ThirdPartyDisclosureFlagNode provideThirdPartyDisclosureFlagNode() {
        return owner;
    }

    @Provides @ThirdPartyDisclosureFlagNodeScope @Owner BooleanUiNode<?> provideBooleanUiNode() {
        return owner;
    }

    @Provides @ThirdPartyDisclosureFlagNodeScope @Owner LeafUiNode<?,?> provideLeafUiNode() {
        return owner;
    }

    @Provides @ThirdPartyDisclosureFlagNodeScope @Owner UiNode<?> provideUiNode() {
        return owner;
    }

    @Provides @ThirdPartyDisclosureFlagNodeScope BasePrivacyNode<?> provideBasePrivacyNode() {
        return owner.getParent();
    }

    @Provides @ThirdPartyDisclosureFlagNodeScope
    RuleProvider<ThirdPartyDisclosureFlagNode> provideRuleProvider(Provider<ThirdPartyDisclosureFlagNodeRuleProvider> provider) {
        return provider.get();
    }

    @Provides @ThirdPartyDisclosureFlagNodeScope
    Map<String, RuleProvider<ThirdPartyDisclosureFlagNode>> provideInstanceProviderMap(
        Provider<BasePrivacyNodeChildProvider.ThirdPartyDisclosureFlagNodeRuleProvider> thirdPartyDisclosureFlagNodeRuleProvider
    ) {
        Map<String, RuleProvider<ThirdPartyDisclosureFlagNode>> result = new HashMap<>();
        result.put("thirdPartyDisclosureFlagNode", thirdPartyDisclosureFlagNodeRuleProvider.get());
        return result;
    }
}