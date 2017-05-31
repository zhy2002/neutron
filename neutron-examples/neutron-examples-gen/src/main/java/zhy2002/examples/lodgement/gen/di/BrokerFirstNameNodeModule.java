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

    @Provides @ComponentScope @Owner BrokerFirstNameNode provideBrokerFirstNameNode() {
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

    @Provides @ComponentScope SubmissionNode provideSubmissionNode() {
        return owner.getParent();
    }

    @Provides @ComponentScope
    RuleProvider<BrokerFirstNameNode> provideRuleProvider(Provider<BrokerFirstNameNodeRuleProvider> provider) {
        return provider.get();
    }

    @Provides @ComponentScope
    Map<String, RuleProvider<BrokerFirstNameNode>> provideInstanceProviderMap(
        Provider<SubmissionNodeChildProvider.BrokerFirstNameNodeRuleProvider> brokerFirstNameNodeRuleProvider
    ) {
        Map<String, RuleProvider<BrokerFirstNameNode>> result = new HashMap<>();
        result.put("brokerFirstNameNode", brokerFirstNameNodeRuleProvider.get());
        return result;
    }
}