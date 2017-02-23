package zhy2002.examples.lodgement.gen.di;
import dagger.Subcomponent;
import javax.inject.Named;
import zhy2002.examples.lodgement.gen.*;
import zhy2002.examples.lodgement.gen.rule.*;

@LoanClearingFlagNodeScope
@Subcomponent(modules = {LoanClearingFlagNodeModule.class})
public interface LoanClearingFlagNodeComponent {

    LoanClearingFlagNodeRuleProvider getLoanClearingFlagNodeRuleProvider();

    @Subcomponent.Builder
    interface Builder {

        Builder setLoanClearingFlagNodeModule(LoanClearingFlagNodeModule module);

        LoanClearingFlagNodeComponent build();
    }
}
