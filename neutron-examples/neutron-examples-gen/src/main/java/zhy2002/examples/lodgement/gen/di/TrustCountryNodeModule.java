package zhy2002.examples.lodgement.gen.di;
import dagger.*;
import javax.inject.*;
import zhy2002.examples.lodgement.gen.node.*;
import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import zhy2002.neutron.di.*;
import java.util.*;


@Module
public class TrustCountryNodeModule {

    private final TrustCountryNode owner;

    public TrustCountryNodeModule(TrustCountryNode owner) {
        this.owner = owner;
    }

    @Provides @ComponentScope @Owner TrustCountryNode provideTrustCountryNode() {
        return owner;
    }

    @Provides @ComponentScope @Owner BaseCountryNode<?> provideBaseCountryNode() {
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
    RuleProvider<TrustCountryNode> provideRuleProvider(Provider<TrustCountryNodeRuleProvider> provider) {
        return provider.get();
    }

    @Provides @ComponentScope
    Map<String, RuleProvider<TrustCountryNode>> provideInstanceProviderMap(
        Provider<BaseTrustNodeChildProvider.TrustCountryNodeRuleProvider> trustCountryNodeRuleProvider
    ) {
        Map<String, RuleProvider<TrustCountryNode>> result = new HashMap<>();
        result.put("trustCountryNode", trustCountryNodeRuleProvider.get());
        return result;
    }
}