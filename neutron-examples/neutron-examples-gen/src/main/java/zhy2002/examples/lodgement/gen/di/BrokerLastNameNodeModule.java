package zhy2002.examples.lodgement.gen.di;
import dagger.*;
import javax.inject.*;
import zhy2002.examples.lodgement.gen.node.*;
import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import zhy2002.neutron.di.*;
import java.util.*;


@Module
public class BrokerLastNameNodeModule {

    private final BrokerLastNameNode owner;

    public BrokerLastNameNodeModule(BrokerLastNameNode owner) {
        this.owner = owner;
    }

    @Provides @ComponentScope @Owner BrokerLastNameNode provideBrokerLastNameNode() {
        return owner;
    }

    @Provides @ComponentScope @Owner NameNode<?> provideNameNode() {
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
        return owner.getContext().getNameOfNodeBeingCreated();
    }

    @Provides @ComponentScope SubmissionNode provideSubmissionNode() {
        return owner.getParent();
    }

    @Provides @ComponentScope
    RuleProvider<BrokerLastNameNode> provideRuleProvider(Provider<BrokerLastNameNodeRuleProvider> provider) {
        return provider.get();
    }

    @Provides @ComponentScope
    Map<String, RuleProvider<BrokerLastNameNode>> provideInstanceProviderMap(
        Provider<SubmissionNodeChildProvider.BrokerLastNameNodeRuleProvider> brokerLastNameNodeRuleProvider
    ) {
        Map<String, RuleProvider<BrokerLastNameNode>> result = new HashMap<>();
        result.put("brokerLastNameNode", brokerLastNameNodeRuleProvider.get());
        return result;
    }
}