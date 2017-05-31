package zhy2002.examples.lodgement.gen.di;
import dagger.Subcomponent;
import zhy2002.neutron.di.ComponentScope;
import zhy2002.examples.lodgement.gen.node.*;
import zhy2002.neutron.RuleProvider;
import java.util.*;

@ComponentScope
@Subcomponent(modules = {LoanBreakCostNodeModule.class})
public interface LoanBreakCostNodeComponent {

    RuleProvider<LoanBreakCostNode> getLoanBreakCostNodeRuleProvider();
    Map<String, RuleProvider<LoanBreakCostNode>> getInstanceRuleProviders();

    @Subcomponent.Builder
    interface Builder {

        Builder setLoanBreakCostNodeModule(LoanBreakCostNodeModule module);

        LoanBreakCostNodeComponent build();
    }
}
