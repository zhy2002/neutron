package zhy2002.examples.lodgement.gen.di;
import dagger.Subcomponent;
import zhy2002.neutron.di.ComponentScope;
import zhy2002.examples.lodgement.gen.node.*;
import zhy2002.neutron.RuleProvider;
import java.util.*;


@ComponentScope
@Subcomponent(modules = {LoanLenderNameNodeModule.class})
public interface LoanLenderNameNodeComponent {

    List<RuleProvider<LoanLenderNameNode>> provideRuleProviders();


    @Subcomponent.Builder
    interface Builder {

        Builder setLoanLenderNameNodeModule(LoanLenderNameNodeModule module);

        LoanLenderNameNodeComponent build();
    }

}
