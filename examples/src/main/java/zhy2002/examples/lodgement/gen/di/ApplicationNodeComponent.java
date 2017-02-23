package zhy2002.examples.lodgement.gen.di;
import dagger.Subcomponent;
import javax.inject.Named;
import zhy2002.examples.lodgement.gen.*;
import zhy2002.examples.lodgement.gen.rule.*;

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
