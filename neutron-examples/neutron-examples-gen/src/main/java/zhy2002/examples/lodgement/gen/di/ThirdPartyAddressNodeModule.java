package zhy2002.examples.lodgement.gen.di;
import dagger.*;
import javax.inject.*;
import zhy2002.examples.lodgement.gen.node.*;
import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import zhy2002.neutron.di.*;
import java.util.*;


@Module
public class ThirdPartyAddressNodeModule {

    private final ThirdPartyAddressNode owner;

    public ThirdPartyAddressNodeModule(ThirdPartyAddressNode owner) {
        this.owner = owner;
    }

    @Provides @ThirdPartyAddressNodeScope @Owner ThirdPartyAddressNode provideThirdPartyAddressNode() {
        return owner;
    }

    @Provides @ThirdPartyAddressNodeScope @Owner AddressNode<?> provideAddressNode() {
        return owner;
    }

    @Provides @ThirdPartyAddressNodeScope @Owner ObjectUiNode<?> provideObjectUiNode() {
        return owner;
    }

    @Provides @ThirdPartyAddressNodeScope @Owner ParentUiNode<?> provideParentUiNode() {
        return owner;
    }

    @Provides @ThirdPartyAddressNodeScope @Owner UiNode<?> provideUiNode() {
        return owner;
    }

    @Provides @ThirdPartyAddressNodeScope RelatedPartyNode provideRelatedPartyNode() {
        return owner.getParent();
    }

    @Provides @ThirdPartyAddressNodeScope
    RuleProvider<ThirdPartyAddressNode> provideRuleProvider(Provider<ThirdPartyAddressNodeRuleProvider> provider) {
        return provider.get();
    }

    @Provides @ThirdPartyAddressNodeScope
    Map<String, RuleProvider<ThirdPartyAddressNode>> provideInstanceProviderMap(
        Provider<RelatedPartyNodeChildProvider.ThirdPartyAddressNodeRuleProvider> thirdPartyAddressNodeRuleProvider
    ) {
        Map<String, RuleProvider<ThirdPartyAddressNode>> result = new HashMap<>();
        result.put("thirdPartyAddressNode", thirdPartyAddressNodeRuleProvider.get());
        return result;
    }
}