package zhy2002.examples.lodgement.gen.di;
import dagger.Subcomponent;
import javax.inject.Named;
import zhy2002.examples.lodgement.gen.*;
import zhy2002.examples.lodgement.gen.rule.*;

@EmploymentTypeNodeScope
@Subcomponent(modules = {EmploymentTypeNodeModule.class})
public interface EmploymentTypeNodeComponent {

    EmploymentTypeNodeRuleProvider getEmploymentTypeNodeRuleProvider();

    @Subcomponent.Builder
    interface Builder {

        Builder setEmploymentTypeNodeModule(EmploymentTypeNodeModule module);

        EmploymentTypeNodeComponent build();
    }
}
