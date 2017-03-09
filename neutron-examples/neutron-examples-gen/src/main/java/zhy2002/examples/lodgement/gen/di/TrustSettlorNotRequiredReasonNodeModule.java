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

    @Provides @TrustSettlorNotRequiredReasonNodeScope @Owner TrustSettlorNotRequiredReasonNode provideTrustSettlorNotRequiredReasonNode() {
        return owner;
    }

    @Provides @TrustSettlorNotRequiredReasonNodeScope @Owner StringUiNode<?> provideStringUiNode() {
        return owner;
    }

    @Provides @TrustSettlorNotRequiredReasonNodeScope @Owner LeafUiNode<?,?> provideLeafUiNode() {
        return owner;
    }

    @Provides @TrustSettlorNotRequiredReasonNodeScope @Owner UiNode<?> provideUiNode() {
        return owner;
    }

    @Provides @TrustSettlorNotRequiredReasonNodeScope BaseTrustNode<?> provideBaseTrustNode() {
        return owner.getParent();
    }

    @Provides @TrustSettlorNotRequiredReasonNodeScope
    Map<String, RuleProvider<TrustSettlorNotRequiredReasonNode>> provideInstanceProviders(
        Provider<BaseTrustNodeChildProvider.TrustSettlorNotRequiredReasonNodeRuleProvider> trustSettlorNotRequiredReasonNodeRuleProvider
    ) {
        Map<String, RuleProvider<TrustSettlorNotRequiredReasonNode>> result = new HashMap<>();
        result.put("trustSettlorNotRequiredReasonNode", trustSettlorNotRequiredReasonNodeRuleProvider.get());
        return result;
    }
}