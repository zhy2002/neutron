package zhy2002.examples.lodgement.gen.di;
import dagger.Subcomponent;
import zhy2002.neutron.di.ComponentScope;
import zhy2002.examples.lodgement.gen.node.*;
import zhy2002.neutron.RuleProvider;
import java.util.*;

@ComponentScope
@Subcomponent(modules = {TotalLiabilityNodeModule.class})
public interface TotalLiabilityNodeComponent {


    RuleProvider<TotalLiabilityNode> getTotalLiabilityNodeRuleProvider();
    Map<String, RuleProvider<TotalLiabilityNode>> getInstanceRuleProviders();

    @Subcomponent.Builder
    interface Builder {

        Builder setTotalLiabilityNodeModule(TotalLiabilityNodeModule module);

        TotalLiabilityNodeComponent build();
    }

}
