package zhy2002.examples.lodgement.gen.di;
import dagger.Subcomponent;
import zhy2002.examples.lodgement.gen.*;
import zhy2002.examples.lodgement.gen.rule.*;

@PersonRepaymentDifficultyNodeScope
@Subcomponent(modules = {PersonRepaymentDifficultyNodeModule.class})
public interface PersonRepaymentDifficultyNodeComponent {

    PersonRepaymentDifficultyNodeRuleProvider getPersonRepaymentDifficultyNodeRuleProvider();

    @Subcomponent.Builder
    interface Builder {

        Builder setPersonRepaymentDifficultyNodeModule(PersonRepaymentDifficultyNodeModule module);

        PersonRepaymentDifficultyNodeComponent build();
    }
}
