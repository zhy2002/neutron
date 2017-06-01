package zhy2002.examples.lodgement.gen.di;
import dagger.Subcomponent;
import zhy2002.neutron.di.ComponentScope;
import zhy2002.examples.lodgement.gen.node.*;
import zhy2002.neutron.RuleProvider;
import java.util.*;


@ComponentScope
@Subcomponent(modules = {LoanTypeNodeModule.class})
public interface LoanTypeNodeComponent {

    List<RuleProvider<LoanTypeNode>> provideRuleProviders();


    @Subcomponent.Builder
    interface Builder {

        Builder setLoanTypeNodeModule(LoanTypeNodeModule module);

        LoanTypeNodeComponent build();
    }

}
