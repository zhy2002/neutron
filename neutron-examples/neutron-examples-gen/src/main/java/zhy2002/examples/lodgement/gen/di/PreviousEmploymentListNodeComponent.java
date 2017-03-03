package zhy2002.examples.lodgement.gen.di;
import dagger.Subcomponent;
import zhy2002.examples.lodgement.gen.*;
import zhy2002.examples.lodgement.gen.rule.*;

@PreviousEmploymentListNodeScope
@Subcomponent(modules = {PreviousEmploymentListNodeModule.class})
public interface PreviousEmploymentListNodeComponent {

    PreviousEmploymentListNodeRuleProvider getPreviousEmploymentListNodeRuleProvider();

    @Subcomponent.Builder
    interface Builder {

        Builder setPreviousEmploymentListNodeModule(PreviousEmploymentListNodeModule module);

        PreviousEmploymentListNodeComponent build();
    }
}
