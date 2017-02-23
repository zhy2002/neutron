package zhy2002.examples.register.gen.di;
import dagger.Subcomponent;
import javax.inject.Named;
import zhy2002.examples.register.gen.*;
import zhy2002.examples.register.gen.rule.*;

@UsernameNodeScope
@Subcomponent(modules = {UsernameNodeModule.class})
public interface UsernameNodeComponent {

    UsernameNodeRuleProvider getUsernameNodeRuleProvider();

    @Subcomponent.Builder
    interface Builder {

        Builder setUsernameNodeModule(UsernameNodeModule module);

        UsernameNodeComponent build();
    }
}
