package zhy2002.examples.lodgement.gen.di;
import dagger.*;
import javax.inject.*;
import zhy2002.examples.lodgement.gen.node.*;
import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import zhy2002.neutron.di.*;
import java.util.*;


@Module
public class OtherLiabilityOwnershipListNodeModule {

    private final OtherLiabilityOwnershipListNode owner;

    public OtherLiabilityOwnershipListNodeModule(OtherLiabilityOwnershipListNode owner) {
        this.owner = owner;
    }

    @Provides @OtherLiabilityOwnershipListNodeScope @Owner OtherLiabilityOwnershipListNode provideOtherLiabilityOwnershipListNode() {
        return owner;
    }

    @Provides @OtherLiabilityOwnershipListNodeScope @Owner OwnershipListNode<?> provideOwnershipListNode() {
        return owner;
    }

    @Provides @OtherLiabilityOwnershipListNodeScope @Owner ListUiNode<?,?> provideListUiNode() {
        return owner;
    }

    @Provides @OtherLiabilityOwnershipListNodeScope @Owner ParentUiNode<?> provideParentUiNode() {
        return owner;
    }

    @Provides @OtherLiabilityOwnershipListNodeScope @Owner UiNode<?> provideUiNode() {
        return owner;
    }

    @Provides @OtherLiabilityOwnershipListNodeScope OtherLiabilityNode provideOtherLiabilityNode() {
        return owner.getParent();
    }

    @Provides @OtherLiabilityOwnershipListNodeScope
    Map<String, RuleProvider<OtherLiabilityOwnershipListNode>> provideInstanceProviders(
        Provider<OtherLiabilityNodeChildProvider.OwnershipListNodeRuleProvider> ownershipListNodeRuleProvider
    ) {
        Map<String, RuleProvider<OtherLiabilityOwnershipListNode>> result = new HashMap<>();
        result.put("ownershipListNode", ownershipListNodeRuleProvider.get());
        return result;
    }
}