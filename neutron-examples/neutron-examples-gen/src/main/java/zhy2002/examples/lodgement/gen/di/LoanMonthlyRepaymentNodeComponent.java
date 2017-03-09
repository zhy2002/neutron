package zhy2002.examples.lodgement.gen.di;
import dagger.Subcomponent;
import zhy2002.examples.lodgement.gen.*;
import zhy2002.examples.lodgement.gen.node.*;
import zhy2002.neutron.RuleProvider;
import java.util.*;

@LoanMonthlyRepaymentNodeScope
@Subcomponent(modules = {LoanMonthlyRepaymentNodeModule.class})
public interface LoanMonthlyRepaymentNodeComponent {

    LoanMonthlyRepaymentNodeRuleProvider getLoanMonthlyRepaymentNodeRuleProvider();
    Map<String, RuleProvider<LoanMonthlyRepaymentNode>> getInstanceRuleProviders();

    @Subcomponent.Builder
    interface Builder {

        Builder setLoanMonthlyRepaymentNodeModule(LoanMonthlyRepaymentNodeModule module);

        LoanMonthlyRepaymentNodeComponent build();
    }
}
