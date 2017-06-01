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

    @Provides @ComponentScope @Owner SubmissionNode provideSubmissionNode() {
        return owner;
    }

    @Provides @ComponentScope @Owner ObjectUiNode<?> provideObjectUiNode() {
        return owner;
    }

    @Provides @ComponentScope @Owner ParentUiNode<?> provideParentUiNode() {
        return owner;
    }

    @Provides @ComponentScope @Owner UiNode<?> provideUiNode() {
        return owner;
    }

    @Provides @ComponentScope ApplicationNode provideApplicationNode() {
        return owner.getParent();
    }

    @Provides @ComponentScope
    RuleProvider<SubmissionNode> provideRuleProvider(Provider<SubmissionNodeRuleProvider> provider) {
        return provider.get();
    }

    @Provides @ComponentScope
    Map<String, RuleProvider<SubmissionNode>> provideInstanceProviderMap(
        Provider<ApplicationNodeChildProvider.SubmissionNodeRuleProvider> submissionNodeRuleProvider
    ) {
        Map<String, RuleProvider<SubmissionNode>> result = new HashMap<>();
        result.put("submissionNode", submissionNodeRuleProvider.get());
        return result;
    }
}