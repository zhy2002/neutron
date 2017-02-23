package zhy2002.examples.register.gen.di;
import dagger.Subcomponent;
import javax.inject.Named;
import zhy2002.examples.register.gen.*;
import zhy2002.examples.register.gen.rule.*;

@ErrorNodeScope
@Subcomponent(modules = {ErrorNodeModule.class})
public interface ErrorNodeComponent {

    ErrorNodeRuleProvider getErrorNodeRuleProvider();

    @Subcomponent.Builder
    interface Builder {

        Builder setErrorNodeModule(ErrorNodeModule module);

        ErrorNodeComponent build();
    }
}
