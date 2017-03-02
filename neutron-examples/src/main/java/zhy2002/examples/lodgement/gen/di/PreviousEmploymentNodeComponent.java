package zhy2002.examples.lodgement.gen.di;
import dagger.Subcomponent;
import zhy2002.examples.lodgement.gen.*;
import zhy2002.examples.lodgement.gen.rule.*;

@PreviousEmploymentNodeScope
@Subcomponent(modules = {PreviousEmploymentNodeModule.class})
public interface PreviousEmploymentNodeComponent {

    PreviousEmploymentNodeRuleProvider getPreviousEmploymentNodeRuleProvider();

    @Subcomponent.Builder
    interface Builder {

        Builder setPreviousEmploymentNodeModule(PreviousEmploymentNodeModule module);

        PreviousEmploymentNodeComponent build();
    }
}
