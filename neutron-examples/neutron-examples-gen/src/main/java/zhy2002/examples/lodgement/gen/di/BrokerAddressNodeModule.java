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

    @Provides @BrokerAddressNodeScope @Owner BrokerAddressNode provideBrokerAddressNode() {
        return owner;
    }

    @Provides @BrokerAddressNodeScope @Owner AddressNode<?> provideAddressNode() {
        return owner;
    }

    @Provides @BrokerAddressNodeScope @Owner ObjectUiNode<?> provideObjectUiNode() {
        return owner;
    }

    @Provides @BrokerAddressNodeScope @Owner ParentUiNode<?> provideParentUiNode() {
        return owner;
    }

    @Provides @BrokerAddressNodeScope @Owner UiNode<?> provideUiNode() {
        return owner;
    }

    @Provides @BrokerAddressNodeScope SubmissionNode provideSubmissionNode() {
        return owner.getParent();
    }

    @Provides @BrokerAddressNodeScope
    RuleProvider<BrokerAddressNode> provideRuleProvider(Provider<BrokerAddressNodeRuleProvider> provider) {
        return provider.get();
    }

    @Provides @BrokerAddressNodeScope
    Map<String, RuleProvider<BrokerAddressNode>> provideInstanceProviderMap(
        Provider<SubmissionNodeChildProvider.BrokerAddressNodeRuleProvider> brokerAddressNodeRuleProvider
    ) {
        Map<String, RuleProvider<BrokerAddressNode>> result = new HashMap<>();
        result.put("brokerAddressNode", brokerAddressNodeRuleProvider.get());
        return result;
    }
}