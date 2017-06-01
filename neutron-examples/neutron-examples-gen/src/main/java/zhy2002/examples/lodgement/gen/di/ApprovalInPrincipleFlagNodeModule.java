package zhy2002.examples.lodgement.gen.di;
import dagger.*;
import javax.inject.*;
import zhy2002.examples.lodgement.gen.node.*;
import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import zhy2002.neutron.di.*;
import java.util.*;


@Module
public class ApprovalInPrincipleFlagNodeModule {

    private final ApprovalInPrincipleFlagNode owner;

    public ApprovalInPrincipleFlagNodeModule(ApprovalInPrincipleFlagNode owner) {
        this.owner = owner;
    }

    @Provides @ComponentScope @Owner ApprovalInPrincipleFlagNode provideApprovalInPrincipleFlagNode() {
        return owner;
    }

    @Provides @ComponentScope @Owner BooleanUiNode<?> provideBooleanUiNode() {
        return owner;
    }

    @Provides @ComponentScope @Owner LeafUiNode<?,?> provideLeafUiNode() {
        return owner;
    }

    @Provides @ComponentScope @Owner UiNode<?> provideUiNode() {
        return owner;
    }

    @Provides @ChildName String provideChildName() {
        return owner.getContext().getNameOfNodeBeingCreated();
    }

    @Provides @ComponentScope UsageNode provideUsageNode() {
        return owner.getParent();
    }

    @Provides @ComponentScope
    RuleProvider<ApprovalInPrincipleFlagNode> provideRuleProvider(Provider<ApprovalInPrincipleFlagNodeRuleProvider> provider) {
        return provider.get();
    }

    @Provides @ComponentScope
    Map<String, RuleProvider<ApprovalInPrincipleFlagNode>> provideInstanceProviderMap(
        Provider<UsageNodeChildProvider.ApprovalInPrincipleFlagNodeRuleProvider> approvalInPrincipleFlagNodeRuleProvider
    ) {
        Map<String, RuleProvider<ApprovalInPrincipleFlagNode>> result = new HashMap<>();
        result.put("approvalInPrincipleFlagNode", approvalInPrincipleFlagNodeRuleProvider.get());
        return result;
    }
}