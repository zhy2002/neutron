package zhy2002.examples.register.gen.di;
import dagger.Subcomponent;
import zhy2002.neutron.di.ComponentScope;
import zhy2002.examples.register.gen.node.*;
import zhy2002.neutron.RuleProvider;

@ComponentScope
@Subcomponent(modules = {ErrorNodeModule.class})
public interface ErrorNodeComponent {


    RuleProvider<ErrorNode> getErrorNodeRuleProvider();

    @Subcomponent.Builder
    interface Builder {

        Builder setErrorNodeModule(ErrorNodeModule module);

        ErrorNodeComponent build();
    }

}
