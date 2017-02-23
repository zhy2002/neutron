package zhy2002.examples.register.gen.di;
import dagger.Subcomponent;
import javax.inject.Named;
import zhy2002.examples.register.gen.*;
import zhy2002.examples.register.gen.rule.*;

@RegisterNodeScope
@Subcomponent(modules = {RegisterNodeModule.class})
public interface RegisterNodeComponent {

    RegisterNodeRuleProvider getRegisterNodeRuleProvider();

    @Subcomponent.Builder
    interface Builder {

        Builder setRegisterNodeModule(RegisterNodeModule module);

        RegisterNodeComponent build();
    }
}
