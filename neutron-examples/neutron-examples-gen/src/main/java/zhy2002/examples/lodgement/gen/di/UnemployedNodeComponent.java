package zhy2002.examples.lodgement.gen.di;
import dagger.Subcomponent;
import zhy2002.examples.lodgement.gen.*;
import zhy2002.examples.lodgement.gen.node.*;
import zhy2002.neutron.RuleProvider;
import java.util.*;

@UnemployedNodeScope
@Subcomponent(modules = {UnemployedNodeModule.class})
public interface UnemployedNodeComponent {

    UnemployedNodeRuleProvider getUnemployedNodeRuleProvider();
    Map<String, RuleProvider<UnemployedNode>> getInstanceRuleProviders();

    @Subcomponent.Builder
    interface Builder {

        Builder setUnemployedNodeModule(UnemployedNodeModule module);

        UnemployedNodeComponent build();
    }
}
