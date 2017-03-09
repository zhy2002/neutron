package zhy2002.examples.lodgement.gen.di;
import dagger.Subcomponent;
import zhy2002.examples.lodgement.gen.*;
import zhy2002.examples.lodgement.gen.node.*;
import zhy2002.neutron.RuleProvider;
import java.util.*;

@MortgageBorrowerRateNodeScope
@Subcomponent(modules = {MortgageBorrowerRateNodeModule.class})
public interface MortgageBorrowerRateNodeComponent {

    MortgageBorrowerRateNodeRuleProvider getMortgageBorrowerRateNodeRuleProvider();
    Map<String, RuleProvider<MortgageBorrowerRateNode>> getInstanceRuleProviders();

    @Subcomponent.Builder
    interface Builder {

        Builder setMortgageBorrowerRateNodeModule(MortgageBorrowerRateNodeModule module);

        MortgageBorrowerRateNodeComponent build();
    }
}
