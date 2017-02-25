package zhy2002.examples.lodgement.gen.di;
import dagger.Subcomponent;
import zhy2002.examples.lodgement.gen.*;
import zhy2002.examples.lodgement.gen.rule.*;

@UnemployedNodeScope
@Subcomponent(modules = {UnemployedNodeModule.class})
public interface UnemployedNodeComponent {

    UnemployedNodeRuleProvider getUnemployedNodeRuleProvider();

    @Subcomponent.Builder
    interface Builder {

        Builder setUnemployedNodeModule(UnemployedNodeModule module);

        UnemployedNodeComponent build();
    }
}
