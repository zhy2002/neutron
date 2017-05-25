package zhy2002.examples.lodgement.gen.di;
import dagger.*;
import javax.inject.*;
import zhy2002.examples.lodgement.gen.node.*;
import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import zhy2002.neutron.di.*;
import java.util.*;


@Module
public class LenderIssuedBrokerNumberNodeModule {

    private final LenderIssuedBrokerNumberNode owner;

    public LenderIssuedBrokerNumberNodeModule(LenderIssuedBrokerNumberNode owner) {
        this.owner = owner;
    }

    @Provides @LenderIssuedBrokerNumberNodeScope @Owner LenderIssuedBrokerNumberNode provideLenderIssuedBrokerNumberNode() {
        return owner;
    }

    @Provides @LenderIssuedBrokerNumberNodeScope @Owner StringUiNode<?> provideStringUiNode() {
        return owner;
    }

    @Provides @LenderIssuedBrokerNumberNodeScope @Owner LeafUiNode<?,?> provideLeafUiNode() {
        return owner;
    }

    @Provides @LenderIssuedBrokerNumberNodeScope @Owner UiNode<?> provideUiNode() {
        return owner;
    }

    @Provides @LenderIssuedBrokerNumberNodeScope SubmissionNode provideSubmissionNode() {
        return owner.getParent();
    }

    @Provides @LenderIssuedBrokerNumberNodeScope
    RuleProvider<LenderIssuedBrokerNumberNode> provideRuleProvider(Provider<LenderIssuedBrokerNumberNodeRuleProvider> provider) {
        return provider.get();
    }

    @Provides @LenderIssuedBrokerNumberNodeScope
    Map<String, RuleProvider<LenderIssuedBrokerNumberNode>> provideInstanceProviderMap(
        Provider<SubmissionNodeChildProvider.LenderIssuedBrokerNumberNodeRuleProvider> lenderIssuedBrokerNumberNodeRuleProvider
    ) {
        Map<String, RuleProvider<LenderIssuedBrokerNumberNode>> result = new HashMap<>();
        result.put("lenderIssuedBrokerNumberNode", lenderIssuedBrokerNumberNodeRuleProvider.get());
        return result;
    }
}