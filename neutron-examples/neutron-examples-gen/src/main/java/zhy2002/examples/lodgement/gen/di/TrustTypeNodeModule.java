package zhy2002.examples.lodgement.gen.di;
import dagger.*;
import javax.inject.*;
import zhy2002.examples.lodgement.gen.node.*;
import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import zhy2002.neutron.di.*;
import java.util.*;


@Module
public class TrustTypeNodeModule {

    private final TrustTypeNode owner;

    public TrustTypeNodeModule(TrustTypeNode owner) {
        this.owner = owner;
    }

    @Provides @TrustTypeNodeScope @Owner TrustTypeNode provideTrustTypeNode() {
        return owner;
    }

    @Provides @TrustTypeNodeScope @Owner StringUiNode<?> provideStringUiNode() {
        return owner;
    }

    @Provides @TrustTypeNodeScope @Owner LeafUiNode<?,?> provideLeafUiNode() {
        return owner;
    }

    @Provides @TrustTypeNodeScope @Owner UiNode<?> provideUiNode() {
        return owner;
    }

    @Provides @TrustTypeNodeScope BaseTrustNode<?> provideBaseTrustNode() {
        return owner.getParent();
    }

    @Provides @TrustTypeNodeScope
    RuleProvider<TrustTypeNode> provideRuleProvider(Provider<TrustTypeNodeRuleProvider> provider) {
        return provider.get();
    }

    @Provides @TrustTypeNodeScope
    Map<String, RuleProvider<TrustTypeNode>> provideInstanceProviderMap(
        Provider<BaseTrustNodeChildProvider.TrustTypeNodeRuleProvider> trustTypeNodeRuleProvider
    ) {
        Map<String, RuleProvider<TrustTypeNode>> result = new HashMap<>();
        result.put("trustTypeNode", trustTypeNodeRuleProvider.get());
        return result;
    }
}