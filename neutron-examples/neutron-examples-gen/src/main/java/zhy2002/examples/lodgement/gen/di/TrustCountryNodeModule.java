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

    @Provides @TrustCountryNodeScope @Owner TrustCountryNode provideTrustCountryNode() {
        return owner;
    }

    @Provides @TrustCountryNodeScope @Owner BaseCountryNode<?> provideBaseCountryNode() {
        return owner;
    }

    @Provides @TrustCountryNodeScope @Owner StringUiNode<?> provideStringUiNode() {
        return owner;
    }

    @Provides @TrustCountryNodeScope @Owner LeafUiNode<?,?> provideLeafUiNode() {
        return owner;
    }

    @Provides @TrustCountryNodeScope @Owner UiNode<?> provideUiNode() {
        return owner;
    }

    @Provides @TrustCountryNodeScope BaseTrustNode<?> provideBaseTrustNode() {
        return owner.getParent();
    }

    @Provides @TrustCountryNodeScope
    Map<String, RuleProvider<TrustCountryNode>> provideInstanceProviders(
        Provider<BaseTrustNodeChildProvider.TrustCountryNodeRuleProvider> trustCountryNodeRuleProvider
    ) {
        Map<String, RuleProvider<TrustCountryNode>> result = new HashMap<>();
        result.put("trustCountryNode", trustCountryNodeRuleProvider.get());
        return result;
    }
}