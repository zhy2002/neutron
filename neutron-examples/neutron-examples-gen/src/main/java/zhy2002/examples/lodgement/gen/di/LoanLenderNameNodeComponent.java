package zhy2002.examples.lodgement.gen.di;
import dagger.Subcomponent;
import zhy2002.examples.lodgement.gen.*;
import zhy2002.examples.lodgement.gen.node.*;
import zhy2002.neutron.RuleProvider;
import java.util.*;

@LoanLenderNameNodeScope
@Subcomponent(modules = {LoanLenderNameNodeModule.class})
public interface LoanLenderNameNodeComponent {

    LoanLenderNameNodeRuleProvider getLoanLenderNameNodeRuleProvider();
    Map<String, RuleProvider<LoanLenderNameNode>> getInstanceRuleProviders();

    @Subcomponent.Builder
    interface Builder {

        Builder setLoanLenderNameNodeModule(LoanLenderNameNodeModule module);

        LoanLenderNameNodeComponent build();
    }
}
