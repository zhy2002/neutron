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

    @Provides @ComponentScope @Owner ThirdPartyDisclosureFlagNode provideThirdPartyDisclosureFlagNode() {
        return owner;
    }

    @Provides @ComponentScope @Owner BooleanUiNode<?> provideBooleanUiNode() {
        return owner;
    }

    @Provides @ComponentScope @Owner LeafUiNode<?,?> provideLeafUiNode() {
        return owner;
    }

    @Provides @ComponentScope @Owner UiNode<?> provideUiNode() {
        return owner;
    }

    @Provides @ComponentScope BasePrivacyNode<?> provideBasePrivacyNode() {
        return owner.getParent();
    }

    @Provides @ComponentScope
    RuleProvider<ThirdPartyDisclosureFlagNode> provideRuleProvider(Provider<ThirdPartyDisclosureFlagNodeRuleProvider> provider) {
        return provider.get();
    }

    @Provides @ComponentScope
    Map<String, RuleProvider<ThirdPartyDisclosureFlagNode>> provideInstanceProviderMap(
        Provider<BasePrivacyNodeChildProvider.ThirdPartyDisclosureFlagNodeRuleProvider> thirdPartyDisclosureFlagNodeRuleProvider
    ) {
        Map<String, RuleProvider<ThirdPartyDisclosureFlagNode>> result = new HashMap<>();
        result.put("thirdPartyDisclosureFlagNode", thirdPartyDisclosureFlagNodeRuleProvider.get());
        return result;
    }
}