package zhy2002.examples.lodgement.gen.di;
import dagger.Subcomponent;
import zhy2002.examples.lodgement.gen.*;
import zhy2002.examples.lodgement.gen.node.*;

@MortgageBreakFeeNodeScope
@Subcomponent(modules = {MortgageBreakFeeNodeModule.class})
public interface MortgageBreakFeeNodeComponent {

    MortgageBreakFeeNodeRuleProvider getMortgageBreakFeeNodeRuleProvider();

    @Subcomponent.Builder
    interface Builder {

        Builder setMortgageBreakFeeNodeModule(MortgageBreakFeeNodeModule module);

        MortgageBreakFeeNodeComponent build();
    }
}
