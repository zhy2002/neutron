package zhy2002.examples.lodgement.gen.di;
import dagger.Subcomponent;
import zhy2002.examples.lodgement.gen.*;
import zhy2002.examples.lodgement.gen.node.*;
import zhy2002.neutron.RuleProvider;
import java.util.*;

@BrokerMobileNumberNodeScope
@Subcomponent(modules = {BrokerMobileNumberNodeModule.class})
public interface BrokerMobileNumberNodeComponent {

    BrokerMobileNumberNodeRuleProvider getBrokerMobileNumberNodeRuleProvider();
    Map<String, RuleProvider<BrokerMobileNumberNode>> getInstanceRuleProviders();

    @Subcomponent.Builder
    interface Builder {

        Builder setBrokerMobileNumberNodeModule(BrokerMobileNumberNodeModule module);

        BrokerMobileNumberNodeComponent build();
    }
}
