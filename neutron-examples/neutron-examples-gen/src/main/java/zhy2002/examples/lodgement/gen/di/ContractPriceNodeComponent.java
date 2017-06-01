package zhy2002.examples.lodgement.gen.di;
import dagger.Subcomponent;
import zhy2002.neutron.di.ComponentScope;
import zhy2002.examples.lodgement.gen.node.*;
import zhy2002.neutron.RuleProvider;
import java.util.*;


@ComponentScope
@Subcomponent(modules = {ContractPriceNodeModule.class})
public interface ContractPriceNodeComponent {

    List<RuleProvider<ContractPriceNode>> provideRuleProviders();


    @Subcomponent.Builder
    interface Builder {

        Builder setContractPriceNodeModule(ContractPriceNodeModule module);

        ContractPriceNodeComponent build();
    }

}
