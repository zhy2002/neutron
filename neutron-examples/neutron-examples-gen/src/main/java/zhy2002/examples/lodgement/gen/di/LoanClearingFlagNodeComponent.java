package zhy2002.examples.lodgement.gen.di;
import dagger.Subcomponent;
import zhy2002.examples.lodgement.gen.*;
import zhy2002.examples.lodgement.gen.node.*;
import zhy2002.neutron.RuleProvider;
import java.util.*;

@LoanClearingFlagNodeScope
@Subcomponent(modules = {LoanClearingFlagNodeModule.class})
public interface LoanClearingFlagNodeComponent {

    LoanClearingFlagNodeRuleProvider getLoanClearingFlagNodeRuleProvider();
    Map<String, RuleProvider<LoanClearingFlagNode>> getInstanceRuleProviders();

    @Subcomponent.Builder
    interface Builder {

        Builder setLoanClearingFlagNodeModule(LoanClearingFlagNodeModule module);

        LoanClearingFlagNodeComponent build();
    }
}
