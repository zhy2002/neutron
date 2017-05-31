package zhy2002.examples.lodgement.gen.di;
import dagger.Subcomponent;
import zhy2002.neutron.di.ComponentScope;
import zhy2002.examples.lodgement.gen.node.*;
import zhy2002.neutron.RuleProvider;
import java.util.*;

@ComponentScope
@Subcomponent(modules = {LoanOwnershipListNodeModule.class})
public interface LoanOwnershipListNodeComponent {

    RuleProvider<LoanOwnershipListNode> getLoanOwnershipListNodeRuleProvider();
    Map<String, RuleProvider<LoanOwnershipListNode>> getInstanceRuleProviders();

    @Subcomponent.Builder
    interface Builder {

        Builder setLoanOwnershipListNodeModule(LoanOwnershipListNodeModule module);

        LoanOwnershipListNodeComponent build();
    }
}
