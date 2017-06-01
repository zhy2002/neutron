package zhy2002.examples.lodgement.gen.di;
import dagger.Subcomponent;
import zhy2002.neutron.di.ComponentScope;
import zhy2002.examples.lodgement.gen.node.*;
import zhy2002.neutron.RuleProvider;
import java.util.*;

@ComponentScope
@Subcomponent(modules = {UnemployedSinceNodeModule.class})
public interface UnemployedSinceNodeComponent extends MonthYearNodeComponent {


    RuleProvider<UnemployedSinceNode> getUnemployedSinceNodeRuleProvider();
    Map<String, RuleProvider<UnemployedSinceNode>> getInstanceRuleProviders();

    @Subcomponent.Builder
    interface Builder {

        Builder setUnemployedSinceNodeModule(UnemployedSinceNodeModule module);

        UnemployedSinceNodeComponent build();
    }

}
