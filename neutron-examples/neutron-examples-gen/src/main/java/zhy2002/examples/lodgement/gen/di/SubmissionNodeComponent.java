package zhy2002.examples.lodgement.gen.di;
import dagger.Subcomponent;
import zhy2002.examples.lodgement.gen.*;
import zhy2002.examples.lodgement.gen.node.*;
import zhy2002.neutron.RuleProvider;
import java.util.*;

@SubmissionNodeScope
@Subcomponent(modules = {SubmissionNodeModule.class})
public interface SubmissionNodeComponent {

    SubmissionNodeRuleProvider getSubmissionNodeRuleProvider();
    Map<String, RuleProvider<SubmissionNode>> getInstanceRuleProviders();

    @Subcomponent.Builder
    interface Builder {

        Builder setSubmissionNodeModule(SubmissionNodeModule module);

        SubmissionNodeComponent build();
    }
}
