package zhy2002.examples.lodgement.gen.di;
import dagger.Subcomponent;
import zhy2002.examples.lodgement.gen.*;
import zhy2002.examples.lodgement.gen.node.*;
import zhy2002.neutron.RuleProvider;
import java.util.*;

@BrokerEmailNodeScope
@Subcomponent(modules = {BrokerEmailNodeModule.class})
public interface BrokerEmailNodeComponent {

    BrokerEmailNodeRuleProvider getBrokerEmailNodeRuleProvider();
    Map<String, RuleProvider<BrokerEmailNode>> getInstanceRuleProviders();

    @Subcomponent.Builder
    interface Builder {

        Builder setBrokerEmailNodeModule(BrokerEmailNodeModule module);

        BrokerEmailNodeComponent build();
    }
}
