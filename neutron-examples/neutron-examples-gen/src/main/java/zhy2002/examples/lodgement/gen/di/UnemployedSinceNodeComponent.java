package zhy2002.examples.lodgement.gen.di;
import dagger.Subcomponent;
import zhy2002.examples.lodgement.gen.*;
import zhy2002.examples.lodgement.gen.node.*;

@UnemployedSinceNodeScope
@Subcomponent(modules = {UnemployedSinceNodeModule.class})
public interface UnemployedSinceNodeComponent {

    UnemployedSinceNodeRuleProvider getUnemployedSinceNodeRuleProvider();

    @Subcomponent.Builder
    interface Builder {

        Builder setUnemployedSinceNodeModule(UnemployedSinceNodeModule module);

        UnemployedSinceNodeComponent build();
    }
}
