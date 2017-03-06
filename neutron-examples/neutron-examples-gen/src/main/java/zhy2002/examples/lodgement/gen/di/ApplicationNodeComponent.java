package zhy2002.examples.lodgement.gen.di;
import dagger.Subcomponent;
import zhy2002.examples.lodgement.gen.*;
import zhy2002.examples.lodgement.gen.node.*;

@ApplicationNodeScope
@Subcomponent(modules = {ApplicationNodeModule.class})
public interface ApplicationNodeComponent {

    ApplicationNodeRuleProvider getApplicationNodeRuleProvider();

    @Subcomponent.Builder
    interface Builder {

        Builder setApplicationNodeModule(ApplicationNodeModule module);

        ApplicationNodeComponent build();
    }
}
