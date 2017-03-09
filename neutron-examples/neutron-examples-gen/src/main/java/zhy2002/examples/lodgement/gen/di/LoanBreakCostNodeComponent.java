package zhy2002.examples.lodgement.gen.di;
import dagger.Subcomponent;
import zhy2002.examples.lodgement.gen.*;
import zhy2002.examples.lodgement.gen.node.*;
import zhy2002.neutron.RuleProvider;
import java.util.*;

@LoanBreakCostNodeScope
@Subcomponent(modules = {LoanBreakCostNodeModule.class})
public interface LoanBreakCostNodeComponent {

    LoanBreakCostNodeRuleProvider getLoanBreakCostNodeRuleProvider();
    Map<String, RuleProvider<LoanBreakCostNode>> getInstanceRuleProviders();

    @Subcomponent.Builder
    interface Builder {

        Builder setLoanBreakCostNodeModule(LoanBreakCostNodeModule module);

        LoanBreakCostNodeComponent build();
    }
}
