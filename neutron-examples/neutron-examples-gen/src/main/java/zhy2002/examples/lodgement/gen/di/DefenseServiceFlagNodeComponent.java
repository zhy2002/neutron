package zhy2002.examples.lodgement.gen.di;
import dagger.Subcomponent;
import zhy2002.neutron.di.ComponentScope;
import zhy2002.examples.lodgement.gen.node.*;
import zhy2002.neutron.RuleProvider;
import java.util.*;

@ComponentScope
@Subcomponent(modules = {DefenseServiceFlagNodeModule.class})
public interface DefenseServiceFlagNodeComponent {

    RuleProvider<DefenseServiceFlagNode> getDefenseServiceFlagNodeRuleProvider();
    Map<String, RuleProvider<DefenseServiceFlagNode>> getInstanceRuleProviders();

    @Subcomponent.Builder
    interface Builder {

        Builder setDefenseServiceFlagNodeModule(DefenseServiceFlagNodeModule module);

        DefenseServiceFlagNodeComponent build();
    }
}
