package zhy2002.examples.lodgement.gen.di;
import dagger.Subcomponent;
import zhy2002.examples.lodgement.gen.*;
import zhy2002.examples.lodgement.gen.node.*;
import zhy2002.neutron.RuleProvider;
import java.util.*;

@MortgageMonthlyRepaymentNodeScope
@Subcomponent(modules = {MortgageMonthlyRepaymentNodeModule.class})
public interface MortgageMonthlyRepaymentNodeComponent {

    MortgageMonthlyRepaymentNodeRuleProvider getMortgageMonthlyRepaymentNodeRuleProvider();
    Map<String, RuleProvider<MortgageMonthlyRepaymentNode>> getInstanceRuleProviders();

    @Subcomponent.Builder
    interface Builder {

        Builder setMortgageMonthlyRepaymentNodeModule(MortgageMonthlyRepaymentNodeModule module);

        MortgageMonthlyRepaymentNodeComponent build();
    }
}
