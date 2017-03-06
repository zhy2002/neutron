package zhy2002.examples.lodgement.gen.di;
import dagger.Subcomponent;
import zhy2002.examples.lodgement.gen.*;
import zhy2002.examples.lodgement.gen.node.*;

@MortgqageUnpaidBalanceNodeScope
@Subcomponent(modules = {MortgqageUnpaidBalanceNodeModule.class})
public interface MortgqageUnpaidBalanceNodeComponent {

    MortgqageUnpaidBalanceNodeRuleProvider getMortgqageUnpaidBalanceNodeRuleProvider();

    @Subcomponent.Builder
    interface Builder {

        Builder setMortgqageUnpaidBalanceNodeModule(MortgqageUnpaidBalanceNodeModule module);

        MortgqageUnpaidBalanceNodeComponent build();
    }
}
