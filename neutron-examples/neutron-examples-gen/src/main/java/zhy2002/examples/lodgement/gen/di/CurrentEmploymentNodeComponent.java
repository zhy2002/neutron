package zhy2002.examples.lodgement.gen.di;
import dagger.Subcomponent;
import zhy2002.neutron.di.ComponentScope;
import zhy2002.examples.lodgement.gen.node.*;
import zhy2002.neutron.RuleProvider;

@ComponentScope
@Subcomponent(modules = {CurrentEmploymentNodeModule.class})
public interface CurrentEmploymentNodeComponent extends EmploymentNodeComponent {


    RuleProvider<CurrentEmploymentNode> getCurrentEmploymentNodeRuleProvider();

    @Subcomponent.Builder
    interface Builder {

        Builder setCurrentEmploymentNodeModule(CurrentEmploymentNodeModule module);

        CurrentEmploymentNodeComponent build();
    }

}
