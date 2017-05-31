package zhy2002.examples.lodgement.gen.di;
import dagger.Subcomponent;
import zhy2002.neutron.di.ComponentScope;
import zhy2002.examples.lodgement.gen.node.*;
import zhy2002.neutron.RuleProvider;
import java.util.*;

@ComponentScope
@Subcomponent(modules = {UsageNodeModule.class})
public interface UsageNodeComponent {

    RuleProvider<UsageNode> getUsageNodeRuleProvider();
    Map<String, RuleProvider<UsageNode>> getInstanceRuleProviders();

    @Subcomponent.Builder
    interface Builder {

        Builder setUsageNodeModule(UsageNodeModule module);

        UsageNodeComponent build();
    }
}
