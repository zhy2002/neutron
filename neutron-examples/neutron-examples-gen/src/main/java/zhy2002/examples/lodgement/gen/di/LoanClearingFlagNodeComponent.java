package zhy2002.examples.lodgement.gen.di;
import dagger.Subcomponent;
import zhy2002.neutron.di.ComponentScope;
import zhy2002.examples.lodgement.gen.node.*;
import zhy2002.neutron.RuleProvider;
import java.util.*;


@ComponentScope
@Subcomponent(modules = {LoanClearingFlagNodeModule.class})
public interface LoanClearingFlagNodeComponent {

    List<RuleProvider<LoanClearingFlagNode>> provideRuleProviders();


    @Subcomponent.Builder
    interface Builder {

        Builder setLoanClearingFlagNodeModule(LoanClearingFlagNodeModule module);

        LoanClearingFlagNodeComponent build();
    }

}
