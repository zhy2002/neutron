package zhy2002.examples.lodgement.gen.di;
import dagger.Subcomponent;
import zhy2002.examples.lodgement.gen.*;
import zhy2002.examples.lodgement.gen.node.*;
import zhy2002.neutron.RuleProvider;
import java.util.*;

@UnemployedSinceNodeScope
@Subcomponent(modules = {UnemployedSinceNodeModule.class})
public interface UnemployedSinceNodeComponent {

    UnemployedSinceNodeRuleProvider getUnemployedSinceNodeRuleProvider();
    Map<String, RuleProvider<UnemployedSinceNode>> getInstanceRuleProviders();

    @Subcomponent.Builder
    interface Builder {

        Builder setUnemployedSinceNodeModule(UnemployedSinceNodeModule module);

        UnemployedSinceNodeComponent build();
    }
}
