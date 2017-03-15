package zhy2002.examples.lodgement.gen.di;
import dagger.Subcomponent;
import zhy2002.examples.lodgement.gen.*;
import zhy2002.examples.lodgement.gen.node.*;
import zhy2002.neutron.RuleProvider;
import java.util.*;

@OwningUserNodeScope
@Subcomponent(modules = {OwningUserNodeModule.class})
public interface OwningUserNodeComponent {

    OwningUserNodeRuleProvider getOwningUserNodeRuleProvider();
    Map<String, RuleProvider<OwningUserNode>> getInstanceRuleProviders();

    @Subcomponent.Builder
    interface Builder {

        Builder setOwningUserNodeModule(OwningUserNodeModule module);

        OwningUserNodeComponent build();
    }
}
