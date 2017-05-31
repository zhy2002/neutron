package zhy2002.examples.lodgement.gen.di;
import dagger.Subcomponent;
import zhy2002.neutron.di.ComponentScope;
import zhy2002.examples.lodgement.gen.node.*;
import zhy2002.neutron.RuleProvider;
import java.util.*;

@ComponentScope
@Subcomponent(modules = {LoanListNodeModule.class})
public interface LoanListNodeComponent {

    RuleProvider<LoanListNode> getLoanListNodeRuleProvider();
    Map<String, RuleProvider<LoanListNode>> getInstanceRuleProviders();

    @Subcomponent.Builder
    interface Builder {

        Builder setLoanListNodeModule(LoanListNodeModule module);

        LoanListNodeComponent build();
    }
}
