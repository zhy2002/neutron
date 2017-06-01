package zhy2002.examples.lodgement.gen.di;
import dagger.*;
import javax.inject.*;
import zhy2002.examples.lodgement.gen.node.*;
import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import zhy2002.neutron.di.*;
import java.util.*;


@Module
public class PrimarySecurityFlagNodeModule {

    private final PrimarySecurityFlagNode owner;

    public PrimarySecurityFlagNodeModule(PrimarySecurityFlagNode owner) {
        this.owner = owner;
    }

    @Provides @ComponentScope @Owner PrimarySecurityFlagNode providePrimarySecurityFlagNode() {
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

    @Provides @ComponentScope UsageNode provideUsageNode() {
        return owner.getParent();
    }

    @Provides @ComponentScope
    RuleProvider<PrimarySecurityFlagNode> provideRuleProvider(Provider<PrimarySecurityFlagNodeRuleProvider> provider) {
        return provider.get();
    }

    @Provides @ComponentScope
    Map<String, RuleProvider<PrimarySecurityFlagNode>> provideInstanceProviderMap(
        Provider<UsageNodeChildProvider.PrimarySecurityFlagNodeRuleProvider> primarySecurityFlagNodeRuleProvider
    ) {
        Map<String, RuleProvider<PrimarySecurityFlagNode>> result = new HashMap<>();
        result.put("primarySecurityFlagNode", primarySecurityFlagNodeRuleProvider.get());
        return result;
    }
}