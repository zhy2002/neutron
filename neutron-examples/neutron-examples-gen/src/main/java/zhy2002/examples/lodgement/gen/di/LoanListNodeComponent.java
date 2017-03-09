package zhy2002.examples.lodgement.gen.di;
import dagger.Subcomponent;
import zhy2002.examples.lodgement.gen.*;
import zhy2002.examples.lodgement.gen.node.*;
import zhy2002.neutron.RuleProvider;
import java.util.*;

@LoanListNodeScope
@Subcomponent(modules = {LoanListNodeModule.class})
public interface LoanListNodeComponent {

    LoanListNodeRuleProvider getLoanListNodeRuleProvider();
    Map<String, RuleProvider<LoanListNode>> getInstanceRuleProviders();

    @Subcomponent.Builder
    interface Builder {

        Builder setLoanListNodeModule(LoanListNodeModule module);

        LoanListNodeComponent build();
    }
}
