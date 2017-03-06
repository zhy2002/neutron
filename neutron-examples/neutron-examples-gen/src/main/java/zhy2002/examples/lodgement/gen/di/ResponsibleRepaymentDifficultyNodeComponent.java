package zhy2002.examples.lodgement.gen.di;
import dagger.Subcomponent;
import zhy2002.examples.lodgement.gen.*;
import zhy2002.examples.lodgement.gen.node.*;

@ResponsibleRepaymentDifficultyNodeScope
@Subcomponent(modules = {ResponsibleRepaymentDifficultyNodeModule.class})
public interface ResponsibleRepaymentDifficultyNodeComponent {

    ResponsibleRepaymentDifficultyNodeRuleProvider getResponsibleRepaymentDifficultyNodeRuleProvider();

    @Subcomponent.Builder
    interface Builder {

        Builder setResponsibleRepaymentDifficultyNodeModule(ResponsibleRepaymentDifficultyNodeModule module);

        ResponsibleRepaymentDifficultyNodeComponent build();
    }
}
