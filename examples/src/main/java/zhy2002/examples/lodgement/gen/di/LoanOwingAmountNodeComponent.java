package zhy2002.examples.lodgement.gen.di;
import dagger.Subcomponent;
import javax.inject.Named;
import zhy2002.examples.lodgement.gen.*;
import zhy2002.examples.lodgement.gen.rule.*;

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
