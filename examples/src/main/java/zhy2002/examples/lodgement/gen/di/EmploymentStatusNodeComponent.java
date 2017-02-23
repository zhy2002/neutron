package zhy2002.examples.lodgement.gen.di;
import dagger.Subcomponent;
import javax.inject.Named;
import zhy2002.examples.lodgement.gen.*;
import zhy2002.examples.lodgement.gen.rule.*;

@EmploymentStatusNodeScope
@Subcomponent(modules = {EmploymentStatusNodeModule.class})
public interface EmploymentStatusNodeComponent {

    EmploymentStatusNodeRuleProvider getEmploymentStatusNodeRuleProvider();

    @Subcomponent.Builder
    interface Builder {

        Builder setEmploymentStatusNodeModule(EmploymentStatusNodeModule module);

        EmploymentStatusNodeComponent build();
    }
}
