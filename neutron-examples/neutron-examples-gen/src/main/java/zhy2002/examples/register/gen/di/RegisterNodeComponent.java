package zhy2002.examples.register.gen.di;
import dagger.Subcomponent;
import zhy2002.examples.register.gen.node.*;
import zhy2002.neutron.RuleProvider;

@RegisterNodeScope
@Subcomponent(modules = {RegisterNodeModule.class})
public interface RegisterNodeComponent {

    RuleProvider<RegisterNode> getRegisterNodeRuleProvider();

    @Subcomponent.Builder
    interface Builder {

        Builder setRegisterNodeModule(RegisterNodeModule module);

        RegisterNodeComponent build();
    }
}
