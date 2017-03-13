package zhy2002.examples.lodgement.gen.di;
import dagger.Subcomponent;
import zhy2002.examples.lodgement.gen.*;
import zhy2002.examples.lodgement.gen.node.*;
import zhy2002.neutron.RuleProvider;
import java.util.*;

@BrokerTelephoneNodeScope
@Subcomponent(modules = {BrokerTelephoneNodeModule.class})
public interface BrokerTelephoneNodeComponent {

    BrokerTelephoneNodeRuleProvider getBrokerTelephoneNodeRuleProvider();
    Map<String, RuleProvider<BrokerTelephoneNode>> getInstanceRuleProviders();

    @Subcomponent.Builder
    interface Builder {

        Builder setBrokerTelephoneNodeModule(BrokerTelephoneNodeModule module);

        BrokerTelephoneNodeComponent build();
    }
}
