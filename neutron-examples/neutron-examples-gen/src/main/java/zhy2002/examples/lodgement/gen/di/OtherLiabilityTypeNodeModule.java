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

    @Provides @OtherLiabilityTypeNodeScope @Owner OtherLiabilityTypeNode provideOtherLiabilityTypeNode() {
        return owner;
    }

    @Provides @OtherLiabilityTypeNodeScope @Owner StringUiNode<?> provideStringUiNode() {
        return owner;
    }

    @Provides @OtherLiabilityTypeNodeScope @Owner LeafUiNode<?,?> provideLeafUiNode() {
        return owner;
    }

    @Provides @OtherLiabilityTypeNodeScope @Owner UiNode<?> provideUiNode() {
        return owner;
    }

    @Provides @OtherLiabilityTypeNodeScope OtherLiabilityNode provideOtherLiabilityNode() {
        return owner.getParent();
    }

    @Provides @OtherLiabilityTypeNodeScope
    RuleProvider<OtherLiabilityTypeNode> provideRuleProvider(Provider<OtherLiabilityTypeNodeRuleProvider> provider) {
        return provider.get();
    }

    @Provides @OtherLiabilityTypeNodeScope
    Map<String, RuleProvider<OtherLiabilityTypeNode>> provideInstanceProviderMap(
        Provider<OtherLiabilityNodeChildProvider.OtherLiabilityTypeNodeRuleProvider> otherLiabilityTypeNodeRuleProvider
    ) {
        Map<String, RuleProvider<OtherLiabilityTypeNode>> result = new HashMap<>();
        result.put("otherLiabilityTypeNode", otherLiabilityTypeNodeRuleProvider.get());
        return result;
    }
}