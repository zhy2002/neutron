package zhy2002.examples.lodgement.gen.di;
import dagger.*;
import javax.inject.*;
import zhy2002.examples.lodgement.gen.node.*;
import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import zhy2002.neutron.di.*;
import java.util.*;


@Module
public class BrokerEmailNodeModule {

    private final BrokerEmailNode owner;

    public BrokerEmailNodeModule(BrokerEmailNode owner) {
        this.owner = owner;
    }

    @Provides @ComponentScope @Owner BrokerEmailNode provideBrokerEmailNode() {
        return owner;
    }

    @Provides @ComponentScope @Owner EmailNode<?> provideEmailNode() {
        return owner;
    }

    @Provides @ComponentScope @Owner StringUiNode<?> provideStringUiNode() {
        return owner;
    }

    @Provides @ComponentScope @Owner LeafUiNode<?,?> provideLeafUiNode() {
        return owner;
    }

    @Provides @ComponentScope @Owner UiNode<?> provideUiNode() {
        return owner;
    }

    @Provides @ChildName String provideChildName() {
        return owner.getContext().getNodeIdentity().getName();
    }

    @Provides @ComponentScope SubmissionNode provideSubmissionNode() {
        return owner.getParent();
    }

    @Provides @ComponentScope
    RuleProvider<BrokerEmailNode> provideRuleProvider(Provider<BrokerEmailNodeRuleProvider> provider) {
        return provider.get();
    }

    @Provides @ComponentScope
    Map<String, RuleProvider<BrokerEmailNode>> provideInstanceProviderMap(
        Provider<SubmissionNodeChildProvider.BrokerEmailNodeRuleProvider> brokerEmailNodeRuleProvider
    ) {
        Map<String, RuleProvider<BrokerEmailNode>> result = new HashMap<>();
        result.put("brokerEmailNode", brokerEmailNodeRuleProvider.get());
        return result;
    }
}