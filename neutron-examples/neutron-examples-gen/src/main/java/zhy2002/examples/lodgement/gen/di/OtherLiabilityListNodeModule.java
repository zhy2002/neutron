package zhy2002.examples.lodgement.gen.di;
import dagger.*;
import javax.inject.*;
import zhy2002.examples.lodgement.gen.node.*;
import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import zhy2002.neutron.di.*;
import java.util.*;


@Module
public class OtherLiabilityListNodeModule {

    private final OtherLiabilityListNode owner;

    public OtherLiabilityListNodeModule(OtherLiabilityListNode owner) {
        this.owner = owner;
    }

    @Provides @OtherLiabilityListNodeScope @Owner OtherLiabilityListNode provideOtherLiabilityListNode() {
        return owner;
    }

    @Provides @OtherLiabilityListNodeScope @Owner ListUiNode<?,?> provideListUiNode() {
        return owner;
    }

    @Provides @OtherLiabilityListNodeScope @Owner ParentUiNode<?> provideParentUiNode() {
        return owner;
    }

    @Provides @OtherLiabilityListNodeScope @Owner UiNode<?> provideUiNode() {
        return owner;
    }

    @Provides @OtherLiabilityListNodeScope LiabilitiesNode provideLiabilitiesNode() {
        return owner.getParent();
    }

    @Provides @OtherLiabilityListNodeScope
    Map<String, RuleProvider<OtherLiabilityListNode>> provideInstanceProviders(
        Provider<LiabilitiesNodeChildProvider.OtherLiabilityListNodeRuleProvider> otherLiabilityListNodeRuleProvider
    ) {
        Map<String, RuleProvider<OtherLiabilityListNode>> result = new HashMap<>();
        result.put("otherLiabilityListNode", otherLiabilityListNodeRuleProvider.get());
        return result;
    }
}