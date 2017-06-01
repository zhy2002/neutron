package zhy2002.examples.lodgement.gen.di;
import dagger.Subcomponent;
import zhy2002.neutron.di.ComponentScope;
import zhy2002.examples.lodgement.gen.node.*;
import zhy2002.neutron.RuleProvider;
import java.util.*;

@ComponentScope
@Subcomponent(modules = {LoanLimitAmountNodeModule.class})
public interface LoanLimitAmountNodeComponent {


    RuleProvider<LoanLimitAmountNode> getLoanLimitAmountNodeRuleProvider();
    Map<String, RuleProvider<LoanLimitAmountNode>> getInstanceRuleProviders();

    @Subcomponent.Builder
    interface Builder {

        Builder setLoanLimitAmountNodeModule(LoanLimitAmountNodeModule module);

        LoanLimitAmountNodeComponent build();
    }

}
