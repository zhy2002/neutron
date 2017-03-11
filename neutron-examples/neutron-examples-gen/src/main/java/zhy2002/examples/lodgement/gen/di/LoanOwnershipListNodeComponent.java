package zhy2002.examples.lodgement.gen.di;
import dagger.Subcomponent;
import zhy2002.examples.lodgement.gen.*;
import zhy2002.examples.lodgement.gen.node.*;
import zhy2002.neutron.RuleProvider;
import java.util.*;

@LoanOwnershipListNodeScope
@Subcomponent(modules = {LoanOwnershipListNodeModule.class})
public interface LoanOwnershipListNodeComponent {

    LoanOwnershipListNodeRuleProvider getLoanOwnershipListNodeRuleProvider();
    Map<String, RuleProvider<LoanOwnershipListNode>> getInstanceRuleProviders();

    @Subcomponent.Builder
    interface Builder {

        Builder setLoanOwnershipListNodeModule(LoanOwnershipListNodeModule module);

        LoanOwnershipListNodeComponent build();
    }
}
