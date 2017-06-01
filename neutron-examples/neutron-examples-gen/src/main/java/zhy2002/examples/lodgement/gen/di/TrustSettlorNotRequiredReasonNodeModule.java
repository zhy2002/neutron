package zhy2002.examples.lodgement.gen.di;
import dagger.*;
import javax.inject.*;
import zhy2002.examples.lodgement.gen.node.*;
import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import zhy2002.neutron.di.*;
import java.util.*;


@Module
public class TrustSettlorNotRequiredReasonNodeModule {

    private final TrustSettlorNotRequiredReasonNode owner;

    public TrustSettlorNotRequiredReasonNodeModule(TrustSettlorNotRequiredReasonNode owner) {
        this.owner = owner;
    }

    @Provides @ComponentScope @Owner TrustSettlorNotRequiredReasonNode provideTrustSettlorNotRequiredReasonNode() {
        return owner;
    }

    @Provides @ComponentScope @Owner StringUiNode<?> provideStringUiNode() {
        return owner;
    }

    @Provides @ComponentScope @Owner LeafUiNode<?,?> provideLeafUiNode() {
        return owner;
    }

    @Provides @ComponentScope @Owner UiNode<?> provideUiNode() {
        return owner;
    }

    @Provides @ComponentScope BaseTrustNode<?> provideBaseTrustNode() {
        return owner.getParent();
    }

    @Provides @ComponentScope
    RuleProvider<TrustSettlorNotRequiredReasonNode> provideRuleProvider(Provider<TrustSettlorNotRequiredReasonNodeRuleProvider> provider) {
        return provider.get();
    }

    @Provides @ComponentScope
    Map<String, RuleProvider<TrustSettlorNotRequiredReasonNode>> provideInstanceProviderMap(
        Provider<BaseTrustNodeChildProvider.TrustSettlorNotRequiredReasonNodeRuleProvider> trustSettlorNotRequiredReasonNodeRuleProvider
    ) {
        Map<String, RuleProvider<TrustSettlorNotRequiredReasonNode>> result = new HashMap<>();
        result.put("trustSettlorNotRequiredReasonNode", trustSettlorNotRequiredReasonNodeRuleProvider.get());
        return result;
    }
}