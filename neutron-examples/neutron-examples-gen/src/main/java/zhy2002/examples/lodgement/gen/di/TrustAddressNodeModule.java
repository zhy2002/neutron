package zhy2002.examples.lodgement.gen.di;
import dagger.*;
import javax.inject.*;
import zhy2002.examples.lodgement.gen.node.*;
import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import zhy2002.neutron.di.*;
import java.util.*;


@Module
public class TrustAddressNodeModule {

    private final TrustAddressNode owner;

    public TrustAddressNodeModule(TrustAddressNode owner) {
        this.owner = owner;
    }

    @Provides @TrustAddressNodeScope @Owner TrustAddressNode provideTrustAddressNode() {
        return owner;
    }

    @Provides @TrustAddressNodeScope @Owner AddressNode<?> provideAddressNode() {
        return owner;
    }

    @Provides @TrustAddressNodeScope @Owner ObjectUiNode<?> provideObjectUiNode() {
        return owner;
    }

    @Provides @TrustAddressNodeScope @Owner ParentUiNode<?> provideParentUiNode() {
        return owner;
    }

    @Provides @TrustAddressNodeScope @Owner UiNode<?> provideUiNode() {
        return owner;
    }

    @Provides @TrustAddressNodeScope BaseTrustNode<?> provideBaseTrustNode() {
        return owner.getParent();
    }

    @Provides @TrustAddressNodeScope
    RuleProvider<TrustAddressNode> provideRuleProvider(Provider<TrustAddressNodeRuleProvider> provider) {
        return provider.get();
    }

    @Provides @TrustAddressNodeScope
    Map<String, RuleProvider<TrustAddressNode>> provideInstanceProviderMap(
        Provider<BaseTrustNodeChildProvider.TrustAddressNodeRuleProvider> trustAddressNodeRuleProvider
    ) {
        Map<String, RuleProvider<TrustAddressNode>> result = new HashMap<>();
        result.put("trustAddressNode", trustAddressNodeRuleProvider.get());
        return result;
    }
}