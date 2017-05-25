package zhy2002.examples.lodgement.gen.di;
import dagger.*;
import javax.inject.*;
import zhy2002.examples.lodgement.gen.node.*;
import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import zhy2002.neutron.di.*;
import java.util.*;


@Module
public class AverageFlagNodeModule {

    private final AverageFlagNode owner;

    public AverageFlagNodeModule(AverageFlagNode owner) {
        this.owner = owner;
    }

    @Provides @AverageFlagNodeScope @Owner AverageFlagNode provideAverageFlagNode() {
        return owner;
    }

    @Provides @AverageFlagNodeScope @Owner BooleanUiNode<?> provideBooleanUiNode() {
        return owner;
    }

    @Provides @AverageFlagNodeScope @Owner LeafUiNode<?,?> provideLeafUiNode() {
        return owner;
    }

    @Provides @AverageFlagNodeScope @Owner UiNode<?> provideUiNode() {
        return owner;
    }

    @Provides @AverageFlagNodeScope OwnershipNode provideOwnershipNode() {
        return owner.getParent();
    }

    @Provides @AverageFlagNodeScope
    RuleProvider<AverageFlagNode> provideRuleProvider(Provider<AverageFlagNodeRuleProvider> provider) {
        return provider.get();
    }

    @Provides @AverageFlagNodeScope
    Map<String, RuleProvider<AverageFlagNode>> provideInstanceProviderMap(
        Provider<OwnershipNodeChildProvider.AverageFlagNodeRuleProvider> averageFlagNodeRuleProvider
    ) {
        Map<String, RuleProvider<AverageFlagNode>> result = new HashMap<>();
        result.put("averageFlagNode", averageFlagNodeRuleProvider.get());
        return result;
    }
}