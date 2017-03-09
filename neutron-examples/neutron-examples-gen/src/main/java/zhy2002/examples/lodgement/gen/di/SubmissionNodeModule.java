package zhy2002.examples.lodgement.gen.di;
import dagger.*;
import javax.inject.*;
import zhy2002.examples.lodgement.gen.node.*;
import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import zhy2002.neutron.di.*;
import java.util.*;


@Module
public class SubmissionNodeModule {

    private final SubmissionNode owner;

    public SubmissionNodeModule(SubmissionNode owner) {
        this.owner = owner;
    }

    @Provides @SubmissionNodeScope @Owner SubmissionNode provideSubmissionNode() {
        return owner;
    }

    @Provides @SubmissionNodeScope @Owner ObjectUiNode<?> provideObjectUiNode() {
        return owner;
    }

    @Provides @SubmissionNodeScope @Owner ParentUiNode<?> provideParentUiNode() {
        return owner;
    }

    @Provides @SubmissionNodeScope @Owner UiNode<?> provideUiNode() {
        return owner;
    }

    @Provides @SubmissionNodeScope ApplicationNode provideApplicationNode() {
        return owner.getParent();
    }

    @Provides @SubmissionNodeScope
    Map<String, RuleProvider<SubmissionNode>> provideInstanceProviders(
        Provider<ApplicationNodeChildProvider.SubmissionNodeRuleProvider> submissionNodeRuleProvider
    ) {
        Map<String, RuleProvider<SubmissionNode>> result = new HashMap<>();
        result.put("submissionNode", submissionNodeRuleProvider.get());
        return result;
    }
}