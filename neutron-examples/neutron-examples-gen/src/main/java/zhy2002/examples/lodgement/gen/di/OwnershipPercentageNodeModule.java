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

    @Provides @ComponentScope @Owner OwnershipPercentageNode provideOwnershipPercentageNode() {
        return owner;
    }

    @Provides @ComponentScope @Owner BasePercentageNode<?> provideBasePercentageNode() {
        return owner;
    }

    @Provides @ComponentScope @Owner BigDecimalUiNode<?> provideBigDecimalUiNode() {
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

    @Provides @ComponentScope OwnershipNode provideOwnershipNode() {
        return owner.getParent();
    }

    @Provides @ComponentScope
    RuleProvider<OwnershipPercentageNode> provideRuleProvider(Provider<OwnershipPercentageNodeRuleProvider> provider) {
        return provider.get();
    }

    @Provides @ComponentScope
    Map<String, RuleProvider<OwnershipPercentageNode>> provideInstanceProviderMap(
        Provider<OwnershipNodeChildProvider.OwnershipPercentageNodeRuleProvider> ownershipPercentageNodeRuleProvider
    ) {
        Map<String, RuleProvider<OwnershipPercentageNode>> result = new HashMap<>();
        result.put("ownershipPercentageNode", ownershipPercentageNodeRuleProvider.get());
        return result;
    }
}