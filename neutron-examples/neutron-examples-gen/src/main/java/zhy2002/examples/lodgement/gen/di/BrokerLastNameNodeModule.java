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

    @Provides @BrokerLastNameNodeScope @Owner BrokerLastNameNode provideBrokerLastNameNode() {
        return owner;
    }

    @Provides @BrokerLastNameNodeScope @Owner StringUiNode<?> provideStringUiNode() {
        return owner;
    }

    @Provides @BrokerLastNameNodeScope @Owner LeafUiNode<?,?> provideLeafUiNode() {
        return owner;
    }

    @Provides @BrokerLastNameNodeScope @Owner UiNode<?> provideUiNode() {
        return owner;
    }

    @Provides @BrokerLastNameNodeScope SubmissionNode provideSubmissionNode() {
        return owner.getParent();
    }

    @Provides @BrokerLastNameNodeScope
    Map<String, RuleProvider<BrokerLastNameNode>> provideInstanceProviders(
        Provider<SubmissionNodeChildProvider.BrokerLastNameNodeRuleProvider> brokerLastNameNodeRuleProvider
    ) {
        Map<String, RuleProvider<BrokerLastNameNode>> result = new HashMap<>();
        result.put("brokerLastNameNode", brokerLastNameNodeRuleProvider.get());
        return result;
    }
}