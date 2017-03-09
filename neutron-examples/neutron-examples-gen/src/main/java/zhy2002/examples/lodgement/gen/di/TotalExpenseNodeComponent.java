package zhy2002.examples.lodgement.gen.di;
import dagger.Subcomponent;
import zhy2002.examples.lodgement.gen.*;
import zhy2002.examples.lodgement.gen.node.*;
import zhy2002.neutron.RuleProvider;
import java.util.*;

@TotalExpenseNodeScope
@Subcomponent(modules = {TotalExpenseNodeModule.class})
public interface TotalExpenseNodeComponent {

    TotalExpenseNodeRuleProvider getTotalExpenseNodeRuleProvider();
    Map<String, RuleProvider<TotalExpenseNode>> getInstanceRuleProviders();

    @Subcomponent.Builder
    interface Builder {

        Builder setTotalExpenseNodeModule(TotalExpenseNodeModule module);

        TotalExpenseNodeComponent build();
    }
}
