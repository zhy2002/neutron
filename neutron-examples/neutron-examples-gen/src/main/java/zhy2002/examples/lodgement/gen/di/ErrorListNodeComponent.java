package zhy2002.examples.lodgement.gen.di;
import dagger.Subcomponent;
import zhy2002.examples.lodgement.gen.*;
import zhy2002.examples.lodgement.gen.node.*;

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
