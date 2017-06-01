package zhy2002.examples.lodgement.gen.di;
import dagger.Subcomponent;
import zhy2002.neutron.di.ComponentScope;
import zhy2002.examples.lodgement.gen.node.*;
import zhy2002.neutron.RuleProvider;
import java.util.*;


@ComponentScope
@Subcomponent(modules = {LoanMonthlyRepaymentNodeModule.class})
public interface LoanMonthlyRepaymentNodeComponent {

    List<RuleProvider<LoanMonthlyRepaymentNode>> provideRuleProviders();


    @Subcomponent.Builder
    interface Builder {

        Builder setLoanMonthlyRepaymentNodeModule(LoanMonthlyRepaymentNodeModule module);

        LoanMonthlyRepaymentNodeComponent build();
    }

}
