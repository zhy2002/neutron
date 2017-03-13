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

    @Provides @BrokerCompanyNodeScope @Owner BrokerCompanyNode provideBrokerCompanyNode() {
        return owner;
    }

    @Provides @BrokerCompanyNodeScope @Owner StringUiNode<?> provideStringUiNode() {
        return owner;
    }

    @Provides @BrokerCompanyNodeScope @Owner LeafUiNode<?,?> provideLeafUiNode() {
        return owner;
    }

    @Provides @BrokerCompanyNodeScope @Owner UiNode<?> provideUiNode() {
        return owner;
    }

    @Provides @BrokerCompanyNodeScope SubmissionNode provideSubmissionNode() {
        return owner.getParent();
    }

    @Provides @BrokerCompanyNodeScope
    Map<String, RuleProvider<BrokerCompanyNode>> provideInstanceProviders(
        Provider<SubmissionNodeChildProvider.BrokerCompanyNodeRuleProvider> brokerCompanyNodeRuleProvider
    ) {
        Map<String, RuleProvider<BrokerCompanyNode>> result = new HashMap<>();
        result.put("brokerCompanyNode", brokerCompanyNodeRuleProvider.get());
        return result;
    }
}