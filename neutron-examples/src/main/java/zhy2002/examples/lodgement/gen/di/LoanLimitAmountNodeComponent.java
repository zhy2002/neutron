package zhy2002.examples.lodgement.gen.di;
import dagger.Subcomponent;
import zhy2002.examples.lodgement.gen.*;
import zhy2002.examples.lodgement.gen.rule.*;

@LoanLimitAmountNodeScope
@Subcomponent(modules = {LoanLimitAmountNodeModule.class})
public interface LoanLimitAmountNodeComponent {

    LoanLimitAmountNodeRuleProvider getLoanLimitAmountNodeRuleProvider();

    @Subcomponent.Builder
    interface Builder {

        Builder setLoanLimitAmountNodeModule(LoanLimitAmountNodeModule module);

        LoanLimitAmountNodeComponent build();
    }
}
