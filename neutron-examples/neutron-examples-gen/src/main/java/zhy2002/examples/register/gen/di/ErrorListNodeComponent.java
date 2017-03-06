package zhy2002.examples.register.gen.di;
import dagger.Subcomponent;
import zhy2002.examples.register.gen.*;
import zhy2002.examples.register.gen.node.*;

@ErrorListNodeScope
@Subcomponent(modules = {ErrorListNodeModule.class})
public interface ErrorListNodeComponent {

    ErrorListNodeRuleProvider getErrorListNodeRuleProvider();

    @Subcomponent.Builder
    interface Builder {

        Builder setErrorListNodeModule(ErrorListNodeModule module);

        ErrorListNodeComponent build();
    }
}
