package zhy2002.examples.lodgement.gen.di;
import dagger.Subcomponent;
import zhy2002.examples.lodgement.gen.*;
import zhy2002.examples.lodgement.gen.rule.*;

@MortgageLoanTypeNodeScope
@Subcomponent(modules = {MortgageLoanTypeNodeModule.class})
public interface MortgageLoanTypeNodeComponent {

    MortgageLoanTypeNodeRuleProvider getMortgageLoanTypeNodeRuleProvider();

    @Subcomponent.Builder
    interface Builder {

        Builder setMortgageLoanTypeNodeModule(MortgageLoanTypeNodeModule module);

        MortgageLoanTypeNodeComponent build();
    }
}
