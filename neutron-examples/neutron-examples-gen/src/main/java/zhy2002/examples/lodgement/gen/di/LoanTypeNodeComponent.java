package zhy2002.examples.lodgement.gen.di;
import dagger.Subcomponent;
import zhy2002.examples.lodgement.gen.*;
import zhy2002.examples.lodgement.gen.rule.*;

@LoanTypeNodeScope
@Subcomponent(modules = {LoanTypeNodeModule.class})
public interface LoanTypeNodeComponent {

    LoanTypeNodeRuleProvider getLoanTypeNodeRuleProvider();

    @Subcomponent.Builder
    interface Builder {

        Builder setLoanTypeNodeModule(LoanTypeNodeModule module);

        LoanTypeNodeComponent build();
    }
}
