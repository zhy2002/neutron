package zhy2002.examples.lodgement.gen.di;
import dagger.Subcomponent;
import zhy2002.examples.lodgement.gen.*;
import zhy2002.examples.lodgement.gen.node.*;

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
