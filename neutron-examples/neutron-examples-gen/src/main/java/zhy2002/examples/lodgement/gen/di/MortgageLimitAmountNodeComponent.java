package zhy2002.examples.lodgement.gen.di;
import dagger.Subcomponent;
import zhy2002.examples.lodgement.gen.*;
import zhy2002.examples.lodgement.gen.node.*;

@MortgageLimitAmountNodeScope
@Subcomponent(modules = {MortgageLimitAmountNodeModule.class})
public interface MortgageLimitAmountNodeComponent {

    MortgageLimitAmountNodeRuleProvider getMortgageLimitAmountNodeRuleProvider();

    @Subcomponent.Builder
    interface Builder {

        Builder setMortgageLimitAmountNodeModule(MortgageLimitAmountNodeModule module);

        MortgageLimitAmountNodeComponent build();
    }
}
