package zhy2002.examples.lodgement.gen.di;
import dagger.Subcomponent;
import zhy2002.examples.lodgement.gen.*;
import zhy2002.examples.lodgement.gen.node.*;

@MortgageClearingFlagNodeScope
@Subcomponent(modules = {MortgageClearingFlagNodeModule.class})
public interface MortgageClearingFlagNodeComponent {

    MortgageClearingFlagNodeRuleProvider getMortgageClearingFlagNodeRuleProvider();

    @Subcomponent.Builder
    interface Builder {

        Builder setMortgageClearingFlagNodeModule(MortgageClearingFlagNodeModule module);

        MortgageClearingFlagNodeComponent build();
    }
}
