package zhy2002.examples.lodgement.gen.di;
import dagger.Subcomponent;
import zhy2002.examples.lodgement.gen.*;
import zhy2002.examples.lodgement.gen.rule.*;

@EmploymentEndedNodeScope
@Subcomponent(modules = {EmploymentEndedNodeModule.class})
public interface EmploymentEndedNodeComponent {

    EmploymentEndedNodeRuleProvider getEmploymentEndedNodeRuleProvider();

    @Subcomponent.Builder
    interface Builder {

        Builder setEmploymentEndedNodeModule(EmploymentEndedNodeModule module);

        EmploymentEndedNodeComponent build();
    }
}
