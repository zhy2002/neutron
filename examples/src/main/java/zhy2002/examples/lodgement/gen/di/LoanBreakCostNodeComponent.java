package zhy2002.examples.lodgement.gen.di;
import dagger.Subcomponent;
import javax.inject.Named;
import zhy2002.examples.lodgement.gen.*;
import zhy2002.examples.lodgement.gen.rule.*;

@LoanBreakCostNodeScope
@Subcomponent(modules = {LoanBreakCostNodeModule.class})
public interface LoanBreakCostNodeComponent {

    LoanBreakCostNodeRuleProvider getLoanBreakCostNodeRuleProvider();

    @Subcomponent.Builder
    interface Builder {

        Builder setLoanBreakCostNodeModule(LoanBreakCostNodeModule module);

        LoanBreakCostNodeComponent build();
    }
}
