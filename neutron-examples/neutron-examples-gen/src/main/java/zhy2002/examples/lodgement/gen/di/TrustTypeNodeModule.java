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

    @Provides @ComponentScope @Owner TrustTypeNode provideTrustTypeNode() {
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

    @Provides @ChildName String provideChildName() {
        return owner.getContext().getNameOfNodeBeingCreated();
    }

    @Provides @ComponentScope BaseTrustNode<?> provideBaseTrustNode() {
        return owner.getParent();
    }

    @Provides @ComponentScope
    RuleProvider<TrustTypeNode> provideRuleProvider(Provider<TrustTypeNodeRuleProvider> provider) {
        return provider.get();
    }

    @Provides @ComponentScope
    Map<String, RuleProvider<TrustTypeNode>> provideInstanceProviderMap(
        Provider<BaseTrustNodeChildProvider.TrustTypeNodeRuleProvider> trustTypeNodeRuleProvider
    ) {
        Map<String, RuleProvider<TrustTypeNode>> result = new HashMap<>();
        result.put("trustTypeNode", trustTypeNodeRuleProvider.get());
        return result;
    }
}