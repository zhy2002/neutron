package zhy2002.examples.lodgement.gen.di;
import dagger.Subcomponent;
import zhy2002.examples.lodgement.gen.*;
import zhy2002.examples.lodgement.gen.node.*;
import zhy2002.neutron.RuleProvider;
import java.util.*;

@TotalLiabilityNodeScope
@Subcomponent(modules = {TotalLiabilityNodeModule.class})
public interface TotalLiabilityNodeComponent {

    TotalLiabilityNodeRuleProvider getTotalLiabilityNodeRuleProvider();
    Map<String, RuleProvider<TotalLiabilityNode>> getInstanceRuleProviders();

    @Subcomponent.Builder
    interface Builder {

        Builder setTotalLiabilityNodeModule(TotalLiabilityNodeModule module);

        TotalLiabilityNodeComponent build();
    }
}
