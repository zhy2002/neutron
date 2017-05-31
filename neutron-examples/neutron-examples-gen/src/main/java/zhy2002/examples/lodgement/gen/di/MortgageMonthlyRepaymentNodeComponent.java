package zhy2002.examples.lodgement.gen.di;
import dagger.Subcomponent;
import zhy2002.neutron.di.ComponentScope;
import zhy2002.examples.lodgement.gen.node.*;
import zhy2002.neutron.RuleProvider;
import java.util.*;

@ComponentScope
@Subcomponent(modules = {MortgageMonthlyRepaymentNodeModule.class})
public interface MortgageMonthlyRepaymentNodeComponent {

    RuleProvider<MortgageMonthlyRepaymentNode> getMortgageMonthlyRepaymentNodeRuleProvider();
    Map<String, RuleProvider<MortgageMonthlyRepaymentNode>> getInstanceRuleProviders();

    @Subcomponent.Builder
    interface Builder {

        Builder setMortgageMonthlyRepaymentNodeModule(MortgageMonthlyRepaymentNodeModule module);

        MortgageMonthlyRepaymentNodeComponent build();
    }
}
