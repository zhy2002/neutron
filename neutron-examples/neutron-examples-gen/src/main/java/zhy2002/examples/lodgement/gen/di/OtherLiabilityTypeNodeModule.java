package zhy2002.examples.lodgement.gen.di;
import dagger.*;
import javax.inject.*;
import zhy2002.examples.lodgement.gen.node.*;
import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import zhy2002.neutron.di.*;
import java.util.*;


@Module
public class OtherLiabilityTypeNodeModule {

    private final OtherLiabilityTypeNode owner;

    public OtherLiabilityTypeNodeModule(OtherLiabilityTypeNode owner) {
        this.owner = owner;
    }

    @Provides @ComponentScope @Owner OtherLiabilityTypeNode provideOtherLiabilityTypeNode() {
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

    @Provides @ComponentScope OtherLiabilityNode provideOtherLiabilityNode() {
        return owner.getParent();
    }

    @Provides @ComponentScope
    RuleProvider<OtherLiabilityTypeNode> provideRuleProvider(Provider<OtherLiabilityTypeNodeRuleProvider> provider) {
        return provider.get();
    }

    @Provides @ComponentScope
    Map<String, RuleProvider<OtherLiabilityTypeNode>> provideInstanceProviderMap(
        Provider<OtherLiabilityNodeChildProvider.OtherLiabilityTypeNodeRuleProvider> otherLiabilityTypeNodeRuleProvider
    ) {
        Map<String, RuleProvider<OtherLiabilityTypeNode>> result = new HashMap<>();
        result.put("otherLiabilityTypeNode", otherLiabilityTypeNodeRuleProvider.get());
        return result;
    }
}