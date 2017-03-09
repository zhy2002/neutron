package zhy2002.examples.lodgement.gen.di;
import dagger.Subcomponent;
import zhy2002.examples.lodgement.gen.*;
import zhy2002.examples.lodgement.gen.node.*;
import zhy2002.neutron.RuleProvider;
import java.util.*;

@MortgageChargePositionNodeScope
@Subcomponent(modules = {MortgageChargePositionNodeModule.class})
public interface MortgageChargePositionNodeComponent {

    MortgageChargePositionNodeRuleProvider getMortgageChargePositionNodeRuleProvider();
    Map<String, RuleProvider<MortgageChargePositionNode>> getInstanceRuleProviders();

    @Subcomponent.Builder
    interface Builder {

        Builder setMortgageChargePositionNodeModule(MortgageChargePositionNodeModule module);

        MortgageChargePositionNodeComponent build();
    }
}
