package zhy2002.examples.register.gen.di;
import dagger.Subcomponent;
import zhy2002.examples.register.gen.*;
import zhy2002.examples.register.gen.node.*;

@RepeatPasswordNodeScope
@Subcomponent(modules = {RepeatPasswordNodeModule.class})
public interface RepeatPasswordNodeComponent {

    RepeatPasswordNodeRuleProvider getRepeatPasswordNodeRuleProvider();

    @Subcomponent.Builder
    interface Builder {

        Builder setRepeatPasswordNodeModule(RepeatPasswordNodeModule module);

        RepeatPasswordNodeComponent build();
    }
}
