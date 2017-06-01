package zhy2002.examples.lodgement.gen.di;
import dagger.Subcomponent;
import zhy2002.neutron.di.ComponentScope;
import zhy2002.examples.lodgement.gen.node.*;
import zhy2002.neutron.RuleProvider;
import java.util.*;


@ComponentScope
@Subcomponent(modules = {BrokerAddressNodeModule.class})
public interface BrokerAddressNodeComponent extends AddressNodeComponent {

    List<RuleProvider<BrokerAddressNode>> provideRuleProviders();


    @Subcomponent.Builder
    interface Builder {

        Builder setBrokerAddressNodeModule(BrokerAddressNodeModule module);

        BrokerAddressNodeComponent build();
    }

}
