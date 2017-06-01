package zhy2002.examples.lodgement.gen.di;
import dagger.Subcomponent;
import zhy2002.neutron.di.ComponentScope;
import zhy2002.examples.lodgement.gen.node.*;
import zhy2002.neutron.RuleProvider;
import java.util.*;

@ComponentScope
@Subcomponent(modules = {MortgageChargePositionNodeModule.class})
public interface MortgageChargePositionNodeComponent {


    RuleProvider<MortgageChargePositionNode> getMortgageChargePositionNodeRuleProvider();
    Map<String, RuleProvider<MortgageChargePositionNode>> getInstanceRuleProviders();

    @Subcomponent.Builder
    interface Builder {

        Builder setMortgageChargePositionNodeModule(MortgageChargePositionNodeModule module);

        MortgageChargePositionNodeComponent build();
    }

}
