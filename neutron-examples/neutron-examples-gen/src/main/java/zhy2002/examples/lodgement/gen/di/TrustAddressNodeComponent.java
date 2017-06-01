package zhy2002.examples.lodgement.gen.di;
import dagger.Subcomponent;
import zhy2002.neutron.di.ComponentScope;
import zhy2002.examples.lodgement.gen.node.*;
import zhy2002.neutron.RuleProvider;
import java.util.*;

@ComponentScope
@Subcomponent(modules = {TrustAddressNodeModule.class})
public interface TrustAddressNodeComponent extends AddressNodeComponent {


    RuleProvider<TrustAddressNode> getTrustAddressNodeRuleProvider();
    Map<String, RuleProvider<TrustAddressNode>> getInstanceRuleProviders();

    @Subcomponent.Builder
    interface Builder {

        Builder setTrustAddressNodeModule(TrustAddressNodeModule module);

        TrustAddressNodeComponent build();
    }

}
