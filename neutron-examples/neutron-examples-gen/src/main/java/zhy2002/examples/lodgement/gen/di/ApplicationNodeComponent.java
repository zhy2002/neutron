package zhy2002.examples.lodgement.gen.di;
import dagger.Subcomponent;
import zhy2002.examples.lodgement.gen.node.*;
import zhy2002.neutron.RuleProvider;

@ApplicationNodeScope
@Subcomponent(modules = {ApplicationNodeModule.class})
public interface ApplicationNodeComponent {

    RuleProvider<ApplicationNode> getApplicationNodeRuleProvider();

    @Subcomponent.Builder
    interface Builder {

        Builder setApplicationNodeModule(ApplicationNodeModule module);

        ApplicationNodeComponent build();
    }
}
