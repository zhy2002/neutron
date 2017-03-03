package zhy2002.examples.lodgement.gen.di;
import dagger.Subcomponent;
import zhy2002.examples.lodgement.gen.*;
import zhy2002.examples.lodgement.gen.rule.*;

@LoanListNodeScope
@Subcomponent(modules = {LoanListNodeModule.class})
public interface LoanListNodeComponent {

    LoanListNodeRuleProvider getLoanListNodeRuleProvider();

    @Subcomponent.Builder
    interface Builder {

        Builder setLoanListNodeModule(LoanListNodeModule module);

        LoanListNodeComponent build();
    }
}
