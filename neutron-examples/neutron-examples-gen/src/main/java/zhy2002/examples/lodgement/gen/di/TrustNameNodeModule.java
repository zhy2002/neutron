package zhy2002.examples.lodgement.gen.di;
import dagger.*;
import javax.inject.*;
import zhy2002.examples.lodgement.gen.node.*;
import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import zhy2002.neutron.di.*;
import java.util.*;


@Module
public class TrustNameNodeModule {

    private final TrustNameNode owner;

    public TrustNameNodeModule(TrustNameNode owner) {
        this.owner = owner;
    }

    @Provides @ComponentScope @Owner TrustNameNode provideTrustNameNode() {
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
        return owner.getContext().getNodeIdentity().getName();
    }

    @Provides @ComponentScope BaseTrustNode<?> provideBaseTrustNode() {
        return owner.getParent();
    }

    @Provides @ComponentScope
    RuleProvider<TrustNameNode> provideRuleProvider(Provider<TrustNameNodeRuleProvider> provider) {
        return provider.get();
    }

    @Provides @ComponentScope
    Map<String, RuleProvider<TrustNameNode>> provideInstanceProviderMap(
        Provider<BaseTrustNodeChildProvider.TrustNameNodeRuleProvider> trustNameNodeRuleProvider
    ) {
        Map<String, RuleProvider<TrustNameNode>> result = new HashMap<>();
        result.put("trustNameNode", trustNameNodeRuleProvider.get());
        return result;
    }
}