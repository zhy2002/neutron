package zhy2002.examples.lodgement.gen.di;
import dagger.Subcomponent;
import zhy2002.examples.lodgement.gen.node.*;
import zhy2002.neutron.RuleProvider;
import java.util.*;

@SettlementDateNodeScope
@Subcomponent(modules = {SettlementDateNodeModule.class})
public interface SettlementDateNodeComponent {

    RuleProvider<SettlementDateNode> getSettlementDateNodeRuleProvider();
    Map<String, RuleProvider<SettlementDateNode>> getInstanceRuleProviders();

    @Subcomponent.Builder
    interface Builder {

        Builder setSettlementDateNodeModule(SettlementDateNodeModule module);

        SettlementDateNodeComponent build();
    }
}
