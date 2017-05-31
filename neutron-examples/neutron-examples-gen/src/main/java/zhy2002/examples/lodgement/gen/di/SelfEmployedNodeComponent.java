package zhy2002.examples.lodgement.gen.di;
import dagger.Subcomponent;
import zhy2002.neutron.di.ComponentScope;
import zhy2002.examples.lodgement.gen.node.*;
import zhy2002.neutron.RuleProvider;
import java.util.*;

@ComponentScope
@Subcomponent(modules = {SelfEmployedNodeModule.class})
public interface SelfEmployedNodeComponent {

    RuleProvider<SelfEmployedNode> getSelfEmployedNodeRuleProvider();
    Map<String, RuleProvider<SelfEmployedNode>> getInstanceRuleProviders();

    @Subcomponent.Builder
    interface Builder {

        Builder setSelfEmployedNodeModule(SelfEmployedNodeModule module);

        SelfEmployedNodeComponent build();
    }
}
