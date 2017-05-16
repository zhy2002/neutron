package zhy2002.examples.lodgement.gen.di;
import dagger.*;
import javax.inject.*;
import zhy2002.examples.lodgement.gen.node.*;
import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import zhy2002.neutron.di.*;
import java.util.*;


@Module
public class BrokerFirstNameNodeModule {

    private final BrokerFirstNameNode owner;

    public BrokerFirstNameNodeModule(BrokerFirstNameNode owner) {
        this.owner = owner;
    }

    @Provides @BrokerFirstNameNodeScope @Owner BrokerFirstNameNode provideBrokerFirstNameNode() {
        return owner;
    }

    @Provides @BrokerFirstNameNodeScope @Owner NameNode<?> provideNameNode() {
        return owner;
    }

    @Provides @BrokerFirstNameNodeScope @Owner StringUiNode<?> provideStringUiNode() {
        return owner;
    }

    @Provides @BrokerFirstNameNodeScope @Owner LeafUiNode<?,?> provideLeafUiNode() {
        return owner;
    }

    @Provides @BrokerFirstNameNodeScope @Owner UiNode<?> provideUiNode() {
        return owner;
    }

    @Provides @BrokerFirstNameNodeScope SubmissionNode provideSubmissionNode() {
        return owner.getParent();
    }

    @Provides @BrokerFirstNameNodeScope
    Map<String, RuleProvider<BrokerFirstNameNode>> provideInstanceProviders(
        Provider<SubmissionNodeChildProvider.BrokerFirstNameNodeRuleProvider> brokerFirstNameNodeRuleProvider
    ) {
        Map<String, RuleProvider<BrokerFirstNameNode>> result = new HashMap<>();
        result.put("brokerFirstNameNode", brokerFirstNameNodeRuleProvider.get());
        return result;
    }
}