package zhy2002.examples.lodgement.gen.di;
import dagger.Subcomponent;
import javax.inject.Named;
import zhy2002.examples.lodgement.gen.*;
import zhy2002.examples.lodgement.gen.rule.*;

@ApplicationTypeNodeScope
@Subcomponent(modules = {ApplicationTypeNodeModule.class})
public interface ApplicationTypeNodeComponent {

    ApplicationTypeNodeRuleProvider getApplicationTypeNodeRuleProvider();

    @Subcomponent.Builder
    interface Builder {

        Builder setApplicationTypeNodeModule(ApplicationTypeNodeModule module);

        ApplicationTypeNodeComponent build();
    }
}
