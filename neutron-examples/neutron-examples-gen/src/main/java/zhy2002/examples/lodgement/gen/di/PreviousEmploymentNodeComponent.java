package zhy2002.examples.lodgement.gen.di;
import dagger.Subcomponent;
import zhy2002.examples.lodgement.gen.node.*;
import zhy2002.neutron.RuleProvider;

@PreviousEmploymentNodeScope
@Subcomponent(modules = {PreviousEmploymentNodeModule.class})
public interface PreviousEmploymentNodeComponent {

    RuleProvider<PreviousEmploymentNode> getPreviousEmploymentNodeRuleProvider();

    @Subcomponent.Builder
    interface Builder {

        Builder setPreviousEmploymentNodeModule(PreviousEmploymentNodeModule module);

        PreviousEmploymentNodeComponent build();
    }
}
