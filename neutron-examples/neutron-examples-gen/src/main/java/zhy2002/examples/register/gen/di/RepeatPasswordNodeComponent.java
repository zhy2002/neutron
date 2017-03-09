package zhy2002.examples.register.gen.di;
import dagger.Subcomponent;
import zhy2002.examples.register.gen.*;
import zhy2002.examples.register.gen.node.*;
import zhy2002.neutron.RuleProvider;
import java.util.*;

@RepeatPasswordNodeScope
@Subcomponent(modules = {RepeatPasswordNodeModule.class})
public interface RepeatPasswordNodeComponent {

    RepeatPasswordNodeRuleProvider getRepeatPasswordNodeRuleProvider();
    Map<String, RuleProvider<RepeatPasswordNode>> getInstanceRuleProviders();

    @Subcomponent.Builder
    interface Builder {

        Builder setRepeatPasswordNodeModule(RepeatPasswordNodeModule module);

        RepeatPasswordNodeComponent build();
    }
}
