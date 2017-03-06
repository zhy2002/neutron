package zhy2002.examples.lodgement.gen.di;
import dagger.Subcomponent;
import zhy2002.examples.lodgement.gen.*;
import zhy2002.examples.lodgement.gen.node.*;

@EmployerAddressNodeScope
@Subcomponent(modules = {EmployerAddressNodeModule.class})
public interface EmployerAddressNodeComponent {

    EmployerAddressNodeRuleProvider getEmployerAddressNodeRuleProvider();

    @Subcomponent.Builder
    interface Builder {

        Builder setEmployerAddressNodeModule(EmployerAddressNodeModule module);

        EmployerAddressNodeComponent build();
    }
}
