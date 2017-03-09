package zhy2002.examples.lodgement.gen.di;
import dagger.*;
import javax.inject.*;
import zhy2002.examples.lodgement.gen.node.*;
import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import zhy2002.neutron.di.*;
import java.util.*;


@Module
public class OwnershipPercentageNodeModule {

    private final OwnershipPercentageNode owner;

    public OwnershipPercentageNodeModule(OwnershipPercentageNode owner) {
        this.owner = owner;
    }

    @Provides @OwnershipPercentageNodeScope @Owner OwnershipPercentageNode provideOwnershipPercentageNode() {
        return owner;
    }

    @Provides @OwnershipPercentageNodeScope @Owner BasePercentageNode<?> provideBasePercentageNode() {
        return owner;
    }

    @Provides @OwnershipPercentageNodeScope @Owner BigDecimalUiNode<?> provideBigDecimalUiNode() {
        return owner;
    }

    @Provides @OwnershipPercentageNodeScope @Owner LeafUiNode<?,?> provideLeafUiNode() {
        return owner;
    }

    @Provides @OwnershipPercentageNodeScope @Owner UiNode<?> provideUiNode() {
        return owner;
    }

    @Provides @OwnershipPercentageNodeScope OwnershipNode provideOwnershipNode() {
        return owner.getParent();
    }

    @Provides @OwnershipPercentageNodeScope
    Map<String, RuleProvider<OwnershipPercentageNode>> provideInstanceProviders(
        Provider<OwnershipNodeChildProvider.OwnershipPercentageNodeRuleProvider> ownershipPercentageNodeRuleProvider
    ) {
        Map<String, RuleProvider<OwnershipPercentageNode>> result = new HashMap<>();
        result.put("ownershipPercentageNode", ownershipPercentageNodeRuleProvider.get());
        return result;
    }
}