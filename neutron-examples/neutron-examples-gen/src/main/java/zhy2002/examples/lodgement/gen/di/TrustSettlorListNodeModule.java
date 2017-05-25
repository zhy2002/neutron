package zhy2002.examples.lodgement.gen.di;
import dagger.*;
import javax.inject.*;
import zhy2002.examples.lodgement.gen.node.*;
import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import zhy2002.neutron.di.*;
import java.util.*;


@Module
public class TrustSettlorListNodeModule {

    private final TrustSettlorListNode owner;

    public TrustSettlorListNodeModule(TrustSettlorListNode owner) {
        this.owner = owner;
    }

    @Provides @TrustSettlorListNodeScope @Owner TrustSettlorListNode provideTrustSettlorListNode() {
        return owner;
    }

    @Provides @TrustSettlorListNodeScope @Owner SelectRelatedPersonListNode<?> provideSelectRelatedPersonListNode() {
        return owner;
    }

    @Provides @TrustSettlorListNodeScope @Owner ListUiNode<?,?> provideListUiNode() {
        return owner;
    }

    @Provides @TrustSettlorListNodeScope @Owner ParentUiNode<?> provideParentUiNode() {
        return owner;
    }

    @Provides @TrustSettlorListNodeScope @Owner UiNode<?> provideUiNode() {
        return owner;
    }

    @Provides @TrustSettlorListNodeScope BaseTrustNode<?> provideBaseTrustNode() {
        return owner.getParent();
    }

    @Provides @TrustSettlorListNodeScope
    RuleProvider<TrustSettlorListNode> provideRuleProvider(Provider<TrustSettlorListNodeRuleProvider> provider) {
        return provider.get();
    }

    @Provides @TrustSettlorListNodeScope
    Map<String, RuleProvider<TrustSettlorListNode>> provideInstanceProviderMap(
        Provider<BaseTrustNodeChildProvider.TrustSettlorListNodeRuleProvider> trustSettlorListNodeRuleProvider
    ) {
        Map<String, RuleProvider<TrustSettlorListNode>> result = new HashMap<>();
        result.put("trustSettlorListNode", trustSettlorListNodeRuleProvider.get());
        return result;
    }
}