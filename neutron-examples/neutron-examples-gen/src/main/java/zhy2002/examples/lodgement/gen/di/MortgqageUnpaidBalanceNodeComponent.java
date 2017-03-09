package zhy2002.examples.lodgement.gen.di;
import dagger.Subcomponent;
import zhy2002.examples.lodgement.gen.*;
import zhy2002.examples.lodgement.gen.node.*;
import zhy2002.neutron.RuleProvider;
import java.util.*;

@MortgqageUnpaidBalanceNodeScope
@Subcomponent(modules = {MortgqageUnpaidBalanceNodeModule.class})
public interface MortgqageUnpaidBalanceNodeComponent {

    MortgqageUnpaidBalanceNodeRuleProvider getMortgqageUnpaidBalanceNodeRuleProvider();
    Map<String, RuleProvider<MortgqageUnpaidBalanceNode>> getInstanceRuleProviders();

    @Subcomponent.Builder
    interface Builder {

        Builder setMortgqageUnpaidBalanceNodeModule(MortgqageUnpaidBalanceNodeModule module);

        MortgqageUnpaidBalanceNodeComponent build();
    }
}
