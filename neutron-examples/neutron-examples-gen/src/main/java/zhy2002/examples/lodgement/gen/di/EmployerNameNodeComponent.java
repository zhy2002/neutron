package zhy2002.examples.lodgement.gen.di;
import dagger.Subcomponent;
import zhy2002.examples.lodgement.gen.*;
import zhy2002.examples.lodgement.gen.node.*;

@EmployerNameNodeScope
@Subcomponent(modules = {EmployerNameNodeModule.class})
public interface EmployerNameNodeComponent {

    EmployerNameNodeRuleProvider getEmployerNameNodeRuleProvider();

    @Subcomponent.Builder
    interface Builder {

        Builder setEmployerNameNodeModule(EmployerNameNodeModule module);

        EmployerNameNodeComponent build();
    }
}
