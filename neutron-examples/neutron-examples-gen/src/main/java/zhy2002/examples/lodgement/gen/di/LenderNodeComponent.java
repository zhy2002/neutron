package zhy2002.examples.lodgement.gen.di;
import dagger.Subcomponent;
import zhy2002.neutron.di.ComponentScope;
import zhy2002.examples.lodgement.gen.node.*;
import zhy2002.neutron.RuleProvider;
import java.util.*;

@ComponentScope
@Subcomponent(modules = {LenderNodeModule.class})
public interface LenderNodeComponent {

    RuleProvider<LenderNode> getLenderNodeRuleProvider();
    Map<String, RuleProvider<LenderNode>> getInstanceRuleProviders();

    @Subcomponent.Builder
    interface Builder {

        Builder setLenderNodeModule(LenderNodeModule module);

        LenderNodeComponent build();
    }
}
