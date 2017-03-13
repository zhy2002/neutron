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

    @Provides @BrokerTelephoneNodeScope @Owner BrokerTelephoneNode provideBrokerTelephoneNode() {
        return owner;
    }

    @Provides @BrokerTelephoneNodeScope @Owner TelephoneNode<?> provideTelephoneNode() {
        return owner;
    }

    @Provides @BrokerTelephoneNodeScope @Owner LeafUiNode<?,?> provideLeafUiNode() {
        return owner;
    }

    @Provides @BrokerTelephoneNodeScope @Owner UiNode<?> provideUiNode() {
        return owner;
    }

    @Provides @BrokerTelephoneNodeScope SubmissionNode provideSubmissionNode() {
        return owner.getParent();
    }

    @Provides @BrokerTelephoneNodeScope
    Map<String, RuleProvider<BrokerTelephoneNode>> provideInstanceProviders(
        Provider<SubmissionNodeChildProvider.ContactNumberNodeRuleProvider> contactNumberNodeRuleProvider
        ,Provider<SubmissionNodeChildProvider.FaxNumberNodeRuleProvider> faxNumberNodeRuleProvider
    ) {
        Map<String, RuleProvider<BrokerTelephoneNode>> result = new HashMap<>();
        result.put("contactNumberNode", contactNumberNodeRuleProvider.get());
        result.put("faxNumberNode", faxNumberNodeRuleProvider.get());
        return result;
    }
}