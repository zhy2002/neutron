package zhy2002.examples.lodgement.gen.di;
import dagger.Subcomponent;
import zhy2002.examples.lodgement.gen.node.*;
import zhy2002.neutron.RuleProvider;
import java.util.*;

@ContractPriceNodeScope
@Subcomponent(modules = {ContractPriceNodeModule.class})
public interface ContractPriceNodeComponent {

    RuleProvider<ContractPriceNode> getContractPriceNodeRuleProvider();
    Map<String, RuleProvider<ContractPriceNode>> getInstanceRuleProviders();

    @Subcomponent.Builder
    interface Builder {

        Builder setContractPriceNodeModule(ContractPriceNodeModule module);

        ContractPriceNodeComponent build();
    }
}
