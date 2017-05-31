package zhy2002.examples.lodgement.gen.di;
import dagger.Subcomponent;
import zhy2002.neutron.di.ComponentScope;
import zhy2002.examples.lodgement.gen.node.*;
import zhy2002.neutron.RuleProvider;
import java.util.*;

@ComponentScope
@Subcomponent(modules = {MortgageBorrowerRateNodeModule.class})
public interface MortgageBorrowerRateNodeComponent {

    RuleProvider<MortgageBorrowerRateNode> getMortgageBorrowerRateNodeRuleProvider();
    Map<String, RuleProvider<MortgageBorrowerRateNode>> getInstanceRuleProviders();

    @Subcomponent.Builder
    interface Builder {

        Builder setMortgageBorrowerRateNodeModule(MortgageBorrowerRateNodeModule module);

        MortgageBorrowerRateNodeComponent build();
    }
}
