package zhy2002.examples.lodgement.gen.di;
import dagger.Subcomponent;
import zhy2002.examples.lodgement.gen.node.*;
import zhy2002.neutron.RuleProvider;

@CurrentEmploymentNodeScope
@Subcomponent(modules = {CurrentEmploymentNodeModule.class})
public interface CurrentEmploymentNodeComponent {

    RuleProvider<CurrentEmploymentNode> getCurrentEmploymentNodeRuleProvider();

    @Subcomponent.Builder
    interface Builder {

        Builder setCurrentEmploymentNodeModule(CurrentEmploymentNodeModule module);

        CurrentEmploymentNodeComponent build();
    }
}
