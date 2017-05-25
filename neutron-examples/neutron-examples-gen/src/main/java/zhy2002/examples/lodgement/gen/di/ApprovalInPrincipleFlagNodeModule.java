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

    @Provides @ApprovalInPrincipleFlagNodeScope @Owner ApprovalInPrincipleFlagNode provideApprovalInPrincipleFlagNode() {
        return owner;
    }

    @Provides @ApprovalInPrincipleFlagNodeScope @Owner BooleanUiNode<?> provideBooleanUiNode() {
        return owner;
    }

    @Provides @ApprovalInPrincipleFlagNodeScope @Owner LeafUiNode<?,?> provideLeafUiNode() {
        return owner;
    }

    @Provides @ApprovalInPrincipleFlagNodeScope @Owner UiNode<?> provideUiNode() {
        return owner;
    }

    @Provides @ApprovalInPrincipleFlagNodeScope UsageNode provideUsageNode() {
        return owner.getParent();
    }

    @Provides @ApprovalInPrincipleFlagNodeScope
    RuleProvider<ApprovalInPrincipleFlagNode> provideRuleProvider(Provider<ApprovalInPrincipleFlagNodeRuleProvider> provider) {
        return provider.get();
    }

    @Provides @ApprovalInPrincipleFlagNodeScope
    Map<String, RuleProvider<ApprovalInPrincipleFlagNode>> provideInstanceProviderMap(
        Provider<UsageNodeChildProvider.ApprovalInPrincipleFlagNodeRuleProvider> approvalInPrincipleFlagNodeRuleProvider
    ) {
        Map<String, RuleProvider<ApprovalInPrincipleFlagNode>> result = new HashMap<>();
        result.put("approvalInPrincipleFlagNode", approvalInPrincipleFlagNodeRuleProvider.get());
        return result;
    }
}