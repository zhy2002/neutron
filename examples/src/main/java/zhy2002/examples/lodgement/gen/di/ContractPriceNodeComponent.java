package zhy2002.examples.lodgement.gen.di;
import dagger.Subcomponent;
import zhy2002.examples.lodgement.gen.*;
import zhy2002.examples.lodgement.gen.rule.*;

@ContractPriceNodeScope
@Subcomponent(modules = {ContractPriceNodeModule.class})
public interface ContractPriceNodeComponent {

    ContractPriceNodeRuleProvider getContractPriceNodeRuleProvider();

    @Subcomponent.Builder
    interface Builder {

        Builder setContractPriceNodeModule(ContractPriceNodeModule module);

        ContractPriceNodeComponent build();
    }
}
