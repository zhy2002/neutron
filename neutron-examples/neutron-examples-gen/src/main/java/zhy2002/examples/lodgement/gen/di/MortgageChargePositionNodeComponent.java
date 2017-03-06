package zhy2002.examples.lodgement.gen.di;
import dagger.Subcomponent;
import zhy2002.examples.lodgement.gen.*;
import zhy2002.examples.lodgement.gen.node.*;

@MortgageChargePositionNodeScope
@Subcomponent(modules = {MortgageChargePositionNodeModule.class})
public interface MortgageChargePositionNodeComponent {

    MortgageChargePositionNodeRuleProvider getMortgageChargePositionNodeRuleProvider();

    @Subcomponent.Builder
    interface Builder {

        Builder setMortgageChargePositionNodeModule(MortgageChargePositionNodeModule module);

        MortgageChargePositionNodeComponent build();
    }
}
