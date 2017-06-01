package zhy2002.examples.lodgement.gen.di;
import dagger.*;
import javax.inject.*;
import zhy2002.examples.lodgement.gen.node.*;
import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import zhy2002.neutron.di.*;
import java.util.*;


@Module
public class TrustRegistrationDateNodeModule {

    private final TrustRegistrationDateNode owner;

    public TrustRegistrationDateNodeModule(TrustRegistrationDateNode owner) {
        this.owner = owner;
    }

    @Provides @ComponentScope @Owner TrustRegistrationDateNode provideTrustRegistrationDateNode() {
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
    RuleProvider<TrustRegistrationDateNode> provideRuleProvider(Provider<TrustRegistrationDateNodeRuleProvider> provider) {
        return provider.get();
    }

    @Provides @ComponentScope
    Map<String, RuleProvider<TrustRegistrationDateNode>> provideInstanceProviderMap(
        Provider<BaseTrustNodeChildProvider.TrustRegistrationDateNodeRuleProvider> trustRegistrationDateNodeRuleProvider
    ) {
        Map<String, RuleProvider<TrustRegistrationDateNode>> result = new HashMap<>();
        result.put("trustRegistrationDateNode", trustRegistrationDateNodeRuleProvider.get());
        return result;
    }
}