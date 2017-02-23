package zhy2002.examples.lodgement.gen.di;
import dagger.Subcomponent;
import javax.inject.Named;
import zhy2002.examples.lodgement.gen.*;
import zhy2002.examples.lodgement.gen.rule.*;

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
