package zhy2002.examples.lodgement.gen.di;
import dagger.Subcomponent;
import zhy2002.examples.lodgement.gen.*;
import zhy2002.examples.lodgement.gen.node.*;

@LoanOwingAmountNodeScope
@Subcomponent(modules = {LoanOwingAmountNodeModule.class})
public interface LoanOwingAmountNodeComponent {

    LoanOwingAmountNodeRuleProvider getLoanOwingAmountNodeRuleProvider();

    @Subcomponent.Builder
    interface Builder {

        Builder setLoanOwingAmountNodeModule(LoanOwingAmountNodeModule module);

        LoanOwingAmountNodeComponent build();
    }
}
