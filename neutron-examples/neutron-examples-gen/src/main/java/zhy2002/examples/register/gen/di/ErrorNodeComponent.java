package zhy2002.examples.register.gen.di;
import dagger.Subcomponent;
import zhy2002.examples.register.gen.node.*;
import zhy2002.neutron.RuleProvider;

@ErrorNodeScope
@Subcomponent(modules = {ErrorNodeModule.class})
public interface ErrorNodeComponent {

    RuleProvider<ErrorNode> getErrorNodeRuleProvider();

    @Subcomponent.Builder
    interface Builder {

        Builder setErrorNodeModule(ErrorNodeModule module);

        ErrorNodeComponent build();
    }
}
