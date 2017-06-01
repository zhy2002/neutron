package zhy2002.examples.lodgement.gen.di;
import dagger.Subcomponent;
import zhy2002.neutron.di.ComponentScope;
import zhy2002.examples.lodgement.gen.node.*;
import zhy2002.neutron.RuleProvider;
import java.util.*;

@ComponentScope
@Subcomponent(modules = {OccupationNodeModule.class})
public interface OccupationNodeComponent {


    RuleProvider<OccupationNode> getOccupationNodeRuleProvider();
    Map<String, RuleProvider<OccupationNode>> getInstanceRuleProviders();

    @Subcomponent.Builder
    interface Builder {

        Builder setOccupationNodeModule(OccupationNodeModule module);

        OccupationNodeComponent build();
    }

}
