package zhy2002.examples.lodgement.gen.di;
import dagger.Subcomponent;
import zhy2002.examples.lodgement.gen.node.*;
import zhy2002.neutron.RuleProvider;
import java.util.*;

@BrokerLastNameNodeScope
@Subcomponent(modules = {BrokerLastNameNodeModule.class})
public interface BrokerLastNameNodeComponent {

    RuleProvider<BrokerLastNameNode> getBrokerLastNameNodeRuleProvider();
    Map<String, RuleProvider<BrokerLastNameNode>> getInstanceRuleProviders();

    @Subcomponent.Builder
    interface Builder {

        Builder setBrokerLastNameNodeModule(BrokerLastNameNodeModule module);

        BrokerLastNameNodeComponent build();
    }
}
