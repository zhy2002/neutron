package zhy2002.examples.lodgement.gen.di;
import dagger.Subcomponent;
import zhy2002.examples.lodgement.gen.*;
import zhy2002.examples.lodgement.gen.node.*;

@SubmissionNodeScope
@Subcomponent(modules = {SubmissionNodeModule.class})
public interface SubmissionNodeComponent {

    SubmissionNodeRuleProvider getSubmissionNodeRuleProvider();

    @Subcomponent.Builder
    interface Builder {

        Builder setSubmissionNodeModule(SubmissionNodeModule module);

        SubmissionNodeComponent build();
    }
}
