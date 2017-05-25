package zhy2002.examples.lodgement.gen.di;
import dagger.*;
import javax.inject.*;
import zhy2002.examples.lodgement.gen.node.*;
import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import zhy2002.neutron.di.*;
import java.util.*;


@Module
public class TrustIndustryNodeModule {

    private final TrustIndustryNode owner;

    public TrustIndustryNodeModule(TrustIndustryNode owner) {
        this.owner = owner;
    }

    @Provides @TrustIndustryNodeScope @Owner TrustIndustryNode provideTrustIndustryNode() {
        return owner;
    }

    @Provides @TrustIndustryNodeScope @Owner StringUiNode<?> provideStringUiNode() {
        return owner;
    }

    @Provides @TrustIndustryNodeScope @Owner LeafUiNode<?,?> provideLeafUiNode() {
        return owner;
    }

    @Provides @TrustIndustryNodeScope @Owner UiNode<?> provideUiNode() {
        return owner;
    }

    @Provides @TrustIndustryNodeScope BaseTrustNode<?> provideBaseTrustNode() {
        return owner.getParent();
    }

    @Provides @TrustIndustryNodeScope
    RuleProvider<TrustIndustryNode> provideRuleProvider(Provider<TrustIndustryNodeRuleProvider> provider) {
        return provider.get();
    }

    @Provides @TrustIndustryNodeScope
    Map<String, RuleProvider<TrustIndustryNode>> provideInstanceProviderMap(
        Provider<BaseTrustNodeChildProvider.TrustIndustryNodeRuleProvider> trustIndustryNodeRuleProvider
    ) {
        Map<String, RuleProvider<TrustIndustryNode>> result = new HashMap<>();
        result.put("trustIndustryNode", trustIndustryNodeRuleProvider.get());
        return result;
    }
}