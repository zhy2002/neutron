package zhy2002.examples.lodgement.gen.di;
import dagger.Subcomponent;
import zhy2002.examples.lodgement.gen.node.*;
import zhy2002.neutron.RuleProvider;
import java.util.*;

@BrokerFirstNameNodeScope
@Subcomponent(modules = {BrokerFirstNameNodeModule.class})
public interface BrokerFirstNameNodeComponent {

    RuleProvider<BrokerFirstNameNode> getBrokerFirstNameNodeRuleProvider();
    Map<String, RuleProvider<BrokerFirstNameNode>> getInstanceRuleProviders();

    @Subcomponent.Builder
    interface Builder {

        Builder setBrokerFirstNameNodeModule(BrokerFirstNameNodeModule module);

        BrokerFirstNameNodeComponent build();
    }
}
