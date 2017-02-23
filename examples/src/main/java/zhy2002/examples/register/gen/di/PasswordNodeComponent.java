package zhy2002.examples.register.gen.di;
import dagger.Subcomponent;
import javax.inject.Named;
import zhy2002.examples.register.gen.*;
import zhy2002.examples.register.gen.rule.*;

@PasswordNodeScope
@Subcomponent(modules = {PasswordNodeModule.class})
public interface PasswordNodeComponent {

    PasswordNodeRuleProvider getPasswordNodeRuleProvider();

    @Subcomponent.Builder
    interface Builder {

        Builder setPasswordNodeModule(PasswordNodeModule module);

        PasswordNodeComponent build();
    }
}
