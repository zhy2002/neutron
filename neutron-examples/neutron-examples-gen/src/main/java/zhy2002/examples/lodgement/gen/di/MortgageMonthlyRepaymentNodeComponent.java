package zhy2002.examples.lodgement.gen.di;
import dagger.Subcomponent;
import zhy2002.examples.lodgement.gen.*;
import zhy2002.examples.lodgement.gen.node.*;

@MortgageMonthlyRepaymentNodeScope
@Subcomponent(modules = {MortgageMonthlyRepaymentNodeModule.class})
public interface MortgageMonthlyRepaymentNodeComponent {

    MortgageMonthlyRepaymentNodeRuleProvider getMortgageMonthlyRepaymentNodeRuleProvider();

    @Subcomponent.Builder
    interface Builder {

        Builder setMortgageMonthlyRepaymentNodeModule(MortgageMonthlyRepaymentNodeModule module);

        MortgageMonthlyRepaymentNodeComponent build();
    }
}
