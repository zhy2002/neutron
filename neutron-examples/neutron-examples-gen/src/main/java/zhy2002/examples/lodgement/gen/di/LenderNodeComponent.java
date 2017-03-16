package zhy2002.examples.lodgement.gen.di;
import dagger.Subcomponent;
import zhy2002.examples.lodgement.gen.*;
import zhy2002.examples.lodgement.gen.node.*;
import zhy2002.neutron.RuleProvider;
import java.util.*;

@LenderNodeScope
@Subcomponent(modules = {LenderNodeModule.class})
public interface LenderNodeComponent {

    LenderNodeRuleProvider getLenderNodeRuleProvider();
    Map<String, RuleProvider<LenderNode>> getInstanceRuleProviders();

    @Subcomponent.Builder
    interface Builder {

        Builder setLenderNodeModule(LenderNodeModule module);

        LenderNodeComponent build();
    }
}
