package zhy2002.examples.lodgement.gen.di;
import dagger.Subcomponent;
import zhy2002.examples.lodgement.gen.*;
import zhy2002.examples.lodgement.gen.node.*;
import zhy2002.neutron.RuleProvider;
import java.util.*;

@LenderIssuedBrokerNumberNodeScope
@Subcomponent(modules = {LenderIssuedBrokerNumberNodeModule.class})
public interface LenderIssuedBrokerNumberNodeComponent {

    LenderIssuedBrokerNumberNodeRuleProvider getLenderIssuedBrokerNumberNodeRuleProvider();
    Map<String, RuleProvider<LenderIssuedBrokerNumberNode>> getInstanceRuleProviders();

    @Subcomponent.Builder
    interface Builder {

        Builder setLenderIssuedBrokerNumberNodeModule(LenderIssuedBrokerNumberNodeModule module);

        LenderIssuedBrokerNumberNodeComponent build();
    }
}
