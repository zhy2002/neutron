package zhy2002.examples.lodgement.gen.di;
import dagger.Subcomponent;
import zhy2002.examples.lodgement.gen.*;
import zhy2002.examples.lodgement.gen.rule.*;

@LoanLenderNameNodeScope
@Subcomponent(modules = {LoanLenderNameNodeModule.class})
public interface LoanLenderNameNodeComponent {

    LoanLenderNameNodeRuleProvider getLoanLenderNameNodeRuleProvider();

    @Subcomponent.Builder
    interface Builder {

        Builder setLoanLenderNameNodeModule(LoanLenderNameNodeModule module);

        LoanLenderNameNodeComponent build();
    }
}