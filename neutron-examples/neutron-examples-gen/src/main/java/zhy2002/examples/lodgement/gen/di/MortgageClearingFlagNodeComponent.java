package zhy2002.examples.lodgement.gen.di;
import dagger.Subcomponent;
import zhy2002.examples.lodgement.gen.*;
import zhy2002.examples.lodgement.gen.node.*;
import zhy2002.neutron.RuleProvider;
import java.util.*;

@MortgageClearingFlagNodeScope
@Subcomponent(modules = {MortgageClearingFlagNodeModule.class})
public interface MortgageClearingFlagNodeComponent {

    MortgageClearingFlagNodeRuleProvider getMortgageClearingFlagNodeRuleProvider();
    Map<String, RuleProvider<MortgageClearingFlagNode>> getInstanceRuleProviders();

    @Subcomponent.Builder
    interface Builder {

        Builder setMortgageClearingFlagNodeModule(MortgageClearingFlagNodeModule module);

        MortgageClearingFlagNodeComponent build();
    }
}
