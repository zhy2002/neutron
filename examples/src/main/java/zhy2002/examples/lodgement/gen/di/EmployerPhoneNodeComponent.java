package zhy2002.examples.lodgement.gen.di;
import dagger.Subcomponent;
import javax.inject.Named;
import zhy2002.examples.lodgement.gen.*;
import zhy2002.examples.lodgement.gen.rule.*;

@EmployerPhoneNodeScope
@Subcomponent(modules = {EmployerPhoneNodeModule.class})
public interface EmployerPhoneNodeComponent {

    EmployerPhoneNodeRuleProvider getEmployerPhoneNodeRuleProvider();

    @Subcomponent.Builder
    interface Builder {

        Builder setEmployerPhoneNodeModule(EmployerPhoneNodeModule module);

        EmployerPhoneNodeComponent build();
    }
}
