package zhy2002.examples.lodgement.gen.di;
import dagger.Subcomponent;
import zhy2002.neutron.di.ComponentScope;
import zhy2002.examples.lodgement.gen.node.*;
import zhy2002.neutron.RuleProvider;
import java.util.*;

@ComponentScope
@Subcomponent(modules = {LoanOwingAmountNodeModule.class})
public interface LoanOwingAmountNodeComponent {


    RuleProvider<LoanOwingAmountNode> getLoanOwingAmountNodeRuleProvider();
    Map<String, RuleProvider<LoanOwingAmountNode>> getInstanceRuleProviders();

    @Subcomponent.Builder
    interface Builder {

        Builder setLoanOwingAmountNodeModule(LoanOwingAmountNodeModule module);

        LoanOwingAmountNodeComponent build();
    }

}
