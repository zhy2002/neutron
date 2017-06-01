package zhy2002.examples.lodgement.gen.di;
import dagger.Subcomponent;
import zhy2002.neutron.di.ComponentScope;
import zhy2002.examples.lodgement.gen.node.*;
import zhy2002.neutron.RuleProvider;
import java.util.*;


@ComponentScope
@Subcomponent(modules = {LoanBreakCostNodeModule.class})
public interface LoanBreakCostNodeComponent {

    List<RuleProvider<LoanBreakCostNode>> provideRuleProviders();


    @Subcomponent.Builder
    interface Builder {

        Builder setLoanBreakCostNodeModule(LoanBreakCostNodeModule module);

        LoanBreakCostNodeComponent build();
    }

}
