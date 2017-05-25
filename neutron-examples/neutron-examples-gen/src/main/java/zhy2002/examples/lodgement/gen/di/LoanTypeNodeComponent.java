package zhy2002.examples.lodgement.gen.di;
import dagger.Subcomponent;
import zhy2002.examples.lodgement.gen.node.*;
import zhy2002.neutron.RuleProvider;
import java.util.*;

@LoanTypeNodeScope
@Subcomponent(modules = {LoanTypeNodeModule.class})
public interface LoanTypeNodeComponent {

    RuleProvider<LoanTypeNode> getLoanTypeNodeRuleProvider();
    Map<String, RuleProvider<LoanTypeNode>> getInstanceRuleProviders();

    @Subcomponent.Builder
    interface Builder {

        Builder setLoanTypeNodeModule(LoanTypeNodeModule module);

        LoanTypeNodeComponent build();
    }
}
