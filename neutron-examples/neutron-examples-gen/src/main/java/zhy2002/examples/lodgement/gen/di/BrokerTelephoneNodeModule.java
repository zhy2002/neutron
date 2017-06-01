package zhy2002.examples.lodgement.gen.di;
import dagger.*;
import javax.inject.*;
import zhy2002.examples.lodgement.gen.node.*;
import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import zhy2002.neutron.di.*;
import java.util.*;


@Module
public class BrokerTelephoneNodeModule {

    private final BrokerTelephoneNode owner;

    public BrokerTelephoneNodeModule(BrokerTelephoneNode owner) {
        this.owner = owner;
    }

    @Provides @ComponentScope @Owner BrokerTelephoneNode provideBrokerTelephoneNode() {
        return owner;
    }

    @Provides @ComponentScope @Owner TelephoneNode<?> provideTelephoneNode() {
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
    RuleProvider<BrokerTelephoneNode> provideRuleProvider(Provider<BrokerTelephoneNodeRuleProvider> provider) {
        return provider.get();
    }

    @Provides @ComponentScope
    Map<String, RuleProvider<BrokerTelephoneNode>> provideInstanceProviderMap(
        Provider<SubmissionNodeChildProvider.ContactNumberNodeRuleProvider> contactNumberNodeRuleProvider
        ,Provider<SubmissionNodeChildProvider.FaxNumberNodeRuleProvider> faxNumberNodeRuleProvider
    ) {
        Map<String, RuleProvider<BrokerTelephoneNode>> result = new HashMap<>();
        result.put("contactNumberNode", contactNumberNodeRuleProvider.get());
        result.put("faxNumberNode", faxNumberNodeRuleProvider.get());
        return result;
    }
}