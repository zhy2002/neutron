package zhy2002.examples.lodgement.gen.di;
import dagger.Subcomponent;
import zhy2002.examples.lodgement.gen.*;
import zhy2002.examples.lodgement.gen.node.*;

@SelfEmployedNodeScope
@Subcomponent(modules = {SelfEmployedNodeModule.class})
public interface SelfEmployedNodeComponent {

    SelfEmployedNodeRuleProvider getSelfEmployedNodeRuleProvider();

    @Subcomponent.Builder
    interface Builder {

        Builder setSelfEmployedNodeModule(SelfEmployedNodeModule module);

        SelfEmployedNodeComponent build();
    }
}
