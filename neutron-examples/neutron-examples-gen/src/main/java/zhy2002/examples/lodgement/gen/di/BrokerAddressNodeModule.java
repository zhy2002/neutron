package zhy2002.examples.lodgement.gen.di;
import dagger.*;
import javax.inject.*;
import zhy2002.examples.lodgement.gen.node.*;
import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import zhy2002.neutron.di.*;
import java.util.*;


@Module
public class BrokerAddressNodeModule {

    private final BrokerAddressNode owner;

    public BrokerAddressNodeModule(BrokerAddressNode owner) {
        this.owner = owner;
    }

    @Provides @ComponentScope @Owner BrokerAddressNode provideBrokerAddressNode() {
        return owner;
    }

    @Provides @ComponentScope @Owner AddressNode<?> provideAddressNode() {
        return owner;
    }

    @Provides @ComponentScope @Owner ObjectUiNode<?> provideObjectUiNode() {
        return owner;
    }

    @Provides @ComponentScope @Owner ParentUiNode<?> provideParentUiNode() {
        return owner;
    }

    @Provides @ComponentScope @Owner UiNode<?> provideUiNode() {
        return owner;
    }

    @Provides @ComponentScope SubmissionNode provideSubmissionNode() {
        return owner.getParent();
    }

    @Provides @ComponentScope
    RuleProvider<BrokerAddressNode> provideRuleProvider(Provider<BrokerAddressNodeRuleProvider> provider) {
        return provider.get();
    }

    @Provides @ComponentScope
    Map<String, RuleProvider<BrokerAddressNode>> provideInstanceProviderMap(
        Provider<SubmissionNodeChildProvider.BrokerAddressNodeRuleProvider> brokerAddressNodeRuleProvider
    ) {
        Map<String, RuleProvider<BrokerAddressNode>> result = new HashMap<>();
        result.put("brokerAddressNode", brokerAddressNodeRuleProvider.get());
        return result;
    }
}