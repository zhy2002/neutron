package zhy2002.examples.lodgement.gen.di;
import dagger.Subcomponent;
import zhy2002.examples.lodgement.gen.node.*;
import zhy2002.neutron.RuleProvider;

@LoanNodeScope
@Subcomponent(modules = {LoanNodeModule.class})
public interface LoanNodeComponent {

    RuleProvider<LoanNode> getLoanNodeRuleProvider();

    @Subcomponent.Builder
    interface Builder {

        Builder setLoanNodeModule(LoanNodeModule module);

        LoanNodeComponent build();
    }
}
