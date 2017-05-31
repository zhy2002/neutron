package zhy2002.examples.register.gen.di;
import dagger.Subcomponent;
import zhy2002.neutron.di.ComponentScope;
import zhy2002.examples.register.gen.node.*;
import zhy2002.neutron.RuleProvider;
import java.util.*;

@ComponentScope
@Subcomponent(modules = {PlanNodeModule.class})
public interface PlanNodeComponent {

    RuleProvider<PlanNode> getPlanNodeRuleProvider();
    Map<String, RuleProvider<PlanNode>> getInstanceRuleProviders();

    @Subcomponent.Builder
    interface Builder {

        Builder setPlanNodeModule(PlanNodeModule module);

        PlanNodeComponent build();
    }
}
