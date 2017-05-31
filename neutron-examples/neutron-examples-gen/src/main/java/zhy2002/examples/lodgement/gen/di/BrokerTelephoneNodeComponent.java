package zhy2002.examples.lodgement.gen.di;
import dagger.Subcomponent;
import zhy2002.neutron.di.ComponentScope;
import zhy2002.examples.lodgement.gen.node.*;
import zhy2002.neutron.RuleProvider;
import java.util.*;

@ComponentScope
@Subcomponent(modules = {BrokerTelephoneNodeModule.class})
public interface BrokerTelephoneNodeComponent {

    RuleProvider<BrokerTelephoneNode> getBrokerTelephoneNodeRuleProvider();
    Map<String, RuleProvider<BrokerTelephoneNode>> getInstanceRuleProviders();

    @Subcomponent.Builder
    interface Builder {

        Builder setBrokerTelephoneNodeModule(BrokerTelephoneNodeModule module);

        BrokerTelephoneNodeComponent build();
    }
}
