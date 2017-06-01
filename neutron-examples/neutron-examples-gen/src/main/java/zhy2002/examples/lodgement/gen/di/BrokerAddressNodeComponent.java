package zhy2002.examples.lodgement.gen.di;
import dagger.Subcomponent;
import zhy2002.neutron.di.ComponentScope;
import zhy2002.examples.lodgement.gen.node.*;
import zhy2002.neutron.RuleProvider;
import java.util.*;

@ComponentScope
@Subcomponent(modules = {BrokerAddressNodeModule.class})
public interface BrokerAddressNodeComponent extends AddressNodeComponent {


    RuleProvider<BrokerAddressNode> getBrokerAddressNodeRuleProvider();
    Map<String, RuleProvider<BrokerAddressNode>> getInstanceRuleProviders();

    @Subcomponent.Builder
    interface Builder {

        Builder setBrokerAddressNodeModule(BrokerAddressNodeModule module);

        BrokerAddressNodeComponent build();
    }

}
