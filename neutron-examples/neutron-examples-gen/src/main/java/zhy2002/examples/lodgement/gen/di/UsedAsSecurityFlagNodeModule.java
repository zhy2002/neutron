package zhy2002.examples.lodgement.gen.di;
import dagger.*;
import javax.inject.*;
import zhy2002.examples.lodgement.gen.node.*;
import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import zhy2002.neutron.di.*;
import java.util.*;


@Module
public class UsedAsSecurityFlagNodeModule {

    private final UsedAsSecurityFlagNode owner;

    public UsedAsSecurityFlagNodeModule(UsedAsSecurityFlagNode owner) {
        this.owner = owner;
    }

    @Provides @ComponentScope @Owner UsedAsSecurityFlagNode provideUsedAsSecurityFlagNode() {
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
        return owner.getContext().getNodeIdentity().getName();
    }

    @Provides @ComponentScope UsageNode provideUsageNode() {
        return owner.getParent();
    }

    @Provides @ComponentScope
    RuleProvider<UsedAsSecurityFlagNode> provideRuleProvider(Provider<UsedAsSecurityFlagNodeRuleProvider> provider) {
        return provider.get();
    }

    @Provides @ComponentScope
    Map<String, RuleProvider<UsedAsSecurityFlagNode>> provideInstanceProviderMap(
        Provider<UsageNodeChildProvider.UsedAsSecurityFlagNodeRuleProvider> usedAsSecurityFlagNodeRuleProvider
    ) {
        Map<String, RuleProvider<UsedAsSecurityFlagNode>> result = new HashMap<>();
        result.put("usedAsSecurityFlagNode", usedAsSecurityFlagNodeRuleProvider.get());
        return result;
    }
}