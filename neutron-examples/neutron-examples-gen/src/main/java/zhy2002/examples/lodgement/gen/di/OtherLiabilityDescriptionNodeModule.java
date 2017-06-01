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

    @Provides @ComponentScope @Owner OtherLiabilityDescriptionNode provideOtherLiabilityDescriptionNode() {
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

    @Provides @ComponentScope OtherLiabilityNode provideOtherLiabilityNode() {
        return owner.getParent();
    }

    @Provides @ComponentScope
    RuleProvider<OtherLiabilityDescriptionNode> provideRuleProvider(Provider<OtherLiabilityDescriptionNodeRuleProvider> provider) {
        return provider.get();
    }

    @Provides @ComponentScope
    Map<String, RuleProvider<OtherLiabilityDescriptionNode>> provideInstanceProviderMap(
        Provider<OtherLiabilityNodeChildProvider.OtherLiabilityDescriptionNodeRuleProvider> otherLiabilityDescriptionNodeRuleProvider
    ) {
        Map<String, RuleProvider<OtherLiabilityDescriptionNode>> result = new HashMap<>();
        result.put("otherLiabilityDescriptionNode", otherLiabilityDescriptionNodeRuleProvider.get());
        return result;
    }
}