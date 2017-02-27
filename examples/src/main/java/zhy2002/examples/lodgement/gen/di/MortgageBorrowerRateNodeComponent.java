package zhy2002.examples.lodgement.gen.di;
import dagger.Subcomponent;
import zhy2002.examples.lodgement.gen.*;
import zhy2002.examples.lodgement.gen.rule.*;

@MortgageBorrowerRateNodeScope
@Subcomponent(modules = {MortgageBorrowerRateNodeModule.class})
public interface MortgageBorrowerRateNodeComponent {

    MortgageBorrowerRateNodeRuleProvider getMortgageBorrowerRateNodeRuleProvider();

    @Subcomponent.Builder
    interface Builder {

        Builder setMortgageBorrowerRateNodeModule(MortgageBorrowerRateNodeModule module);

        MortgageBorrowerRateNodeComponent build();
    }
}
