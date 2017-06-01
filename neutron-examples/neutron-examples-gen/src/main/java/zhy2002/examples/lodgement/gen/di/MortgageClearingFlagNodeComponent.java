package zhy2002.examples.lodgement.gen.di;
import dagger.Subcomponent;
import zhy2002.neutron.di.ComponentScope;
import zhy2002.examples.lodgement.gen.node.*;
import zhy2002.neutron.RuleProvider;
import java.util.*;

@ComponentScope
@Subcomponent(modules = {MortgageClearingFlagNodeModule.class})
public interface MortgageClearingFlagNodeComponent {


    RuleProvider<MortgageClearingFlagNode> getMortgageClearingFlagNodeRuleProvider();
    Map<String, RuleProvider<MortgageClearingFlagNode>> getInstanceRuleProviders();

    @Subcomponent.Builder
    interface Builder {

        Builder setMortgageClearingFlagNodeModule(MortgageClearingFlagNodeModule module);

        MortgageClearingFlagNodeComponent build();
    }

}
