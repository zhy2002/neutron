package zhy2002.examples.lodgement.gen.di;
import dagger.Subcomponent;
import zhy2002.examples.lodgement.gen.*;
import zhy2002.examples.lodgement.gen.node.*;

@EmploymentStartedNodeScope
@Subcomponent(modules = {EmploymentStartedNodeModule.class})
public interface EmploymentStartedNodeComponent {

    EmploymentStartedNodeRuleProvider getEmploymentStartedNodeRuleProvider();

    @Subcomponent.Builder
    interface Builder {

        Builder setEmploymentStartedNodeModule(EmploymentStartedNodeModule module);

        EmploymentStartedNodeComponent build();
    }
}
