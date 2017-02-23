package zhy2002.examples.lodgement.gen.di;
import dagger.Subcomponent;
import javax.inject.Named;
import zhy2002.examples.lodgement.gen.*;
import zhy2002.examples.lodgement.gen.rule.*;

@LoanNodeScope
@Subcomponent(modules = {LoanNodeModule.class})
public interface LoanNodeComponent {

    LoanNodeRuleProvider getLoanNodeRuleProvider();

    @Subcomponent.Builder
    interface Builder {

        Builder setLoanNodeModule(LoanNodeModule module);

        LoanNodeComponent build();
    }
}
