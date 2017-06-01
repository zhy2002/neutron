package zhy2002.examples.lodgement.gen.di;
import dagger.*;
import javax.inject.*;
import zhy2002.examples.lodgement.gen.node.*;
import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import zhy2002.neutron.di.*;
import java.util.*;


@Module
public class BrokerCompanyNodeModule {

    private final BrokerCompanyNode owner;

    public BrokerCompanyNodeModule(BrokerCompanyNode owner) {
        this.owner = owner;
    }

    @Provides @ComponentScope @Owner BrokerCompanyNode provideBrokerCompanyNode() {
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
    RuleProvider<BrokerCompanyNode> provideRuleProvider(Provider<BrokerCompanyNodeRuleProvider> provider) {
        return provider.get();
    }

    @Provides @ComponentScope
    Map<String, RuleProvider<BrokerCompanyNode>> provideInstanceProviderMap(
        Provider<SubmissionNodeChildProvider.BrokerCompanyNodeRuleProvider> brokerCompanyNodeRuleProvider
    ) {
        Map<String, RuleProvider<BrokerCompanyNode>> result = new HashMap<>();
        result.put("brokerCompanyNode", brokerCompanyNodeRuleProvider.get());
        return result;
    }
}