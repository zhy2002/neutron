package zhy2002.examples.lodgement.gen.di;
import dagger.*;
import javax.inject.*;
import zhy2002.examples.lodgement.gen.node.*;
import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import zhy2002.neutron.di.*;
import java.util.*;


@Module
public class OtherLiabilityDescriptionNodeModule {

    private final OtherLiabilityDescriptionNode owner;

    public OtherLiabilityDescriptionNodeModule(OtherLiabilityDescriptionNode owner) {
        this.owner = owner;
    }

    @Provides @OtherLiabilityDescriptionNodeScope @Owner OtherLiabilityDescriptionNode provideOtherLiabilityDescriptionNode() {
        return owner;
    }

    @Provides @OtherLiabilityDescriptionNodeScope @Owner StringUiNode<?> provideStringUiNode() {
        return owner;
    }

    @Provides @OtherLiabilityDescriptionNodeScope @Owner LeafUiNode<?,?> provideLeafUiNode() {
        return owner;
    }

    @Provides @OtherLiabilityDescriptionNodeScope @Owner UiNode<?> provideUiNode() {
        return owner;
    }

    @Provides @OtherLiabilityDescriptionNodeScope OtherLiabilityNode provideOtherLiabilityNode() {
        return owner.getParent();
    }

    @Provides @OtherLiabilityDescriptionNodeScope
    Map<String, RuleProvider<OtherLiabilityDescriptionNode>> provideInstanceProviders(
        Provider<OtherLiabilityNodeChildProvider.OtherLiabilityDescriptionNodeRuleProvider> otherLiabilityDescriptionNodeRuleProvider
    ) {
        Map<String, RuleProvider<OtherLiabilityDescriptionNode>> result = new HashMap<>();
        result.put("otherLiabilityDescriptionNode", otherLiabilityDescriptionNodeRuleProvider.get());
        return result;
    }
}