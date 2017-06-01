package zhy2002.examples.lodgement.gen.di;
import dagger.Subcomponent;
import zhy2002.neutron.di.ComponentScope;
import zhy2002.examples.lodgement.gen.node.*;
import zhy2002.neutron.RuleProvider;
import java.util.*;

@ComponentScope
@Subcomponent(modules = {MortgageBreakFeeNodeModule.class})
public interface MortgageBreakFeeNodeComponent {


    RuleProvider<MortgageBreakFeeNode> getMortgageBreakFeeNodeRuleProvider();
    Map<String, RuleProvider<MortgageBreakFeeNode>> getInstanceRuleProviders();

    @Subcomponent.Builder
    interface Builder {

        Builder setMortgageBreakFeeNodeModule(MortgageBreakFeeNodeModule module);

        MortgageBreakFeeNodeComponent build();
    }

}
