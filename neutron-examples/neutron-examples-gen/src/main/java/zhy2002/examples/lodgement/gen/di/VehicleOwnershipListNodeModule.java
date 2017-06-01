package zhy2002.examples.lodgement.gen.di;
import dagger.*;
import dagger.multibindings.*;
import javax.inject.*;
import zhy2002.examples.lodgement.gen.node.*;
import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import zhy2002.neutron.di.*;
import java.util.*;
import zhy2002.neutron.util.NeutronConstants;


@Module
public class VehicleOwnershipListNodeModule {

    private final VehicleOwnershipListNode owner;

    public VehicleOwnershipListNodeModule(VehicleOwnershipListNode owner) {
        this.owner = owner;
    }

    @Provides @ComponentScope @Owner VehicleOwnershipListNode provideVehicleOwnershipListNode() {
        return owner;
    }

    @Provides @ComponentScope @Owner OwnershipListNode<?> provideOwnershipListNode() {
        return owner;
    }

    @Provides @ComponentScope @Owner ListUiNode<?,?> provideListUiNode() {
        return owner;
    }

    @Provides @ComponentScope @Owner ParentUiNode<?> provideParentUiNode() {
        return owner;
    }

    @Provides @ComponentScope @Owner UiNode<?> provideUiNode() {
        return owner;
    }

    @Provides @ComponentScope MotorVehicleNode provideMotorVehicleNode() {
        return owner.getParent();
    }

    @Provides @Named("VehicleOwnershipListNodeRuleProvider") @IntoMap @StringKey(NeutronConstants.PLACEHOLDER_RULE_PROVIDER)
    RuleProvider<VehicleOwnershipListNode> providePlaceholderRuleProvider() {
        return null;
    }

    @Provides @Named("VehicleOwnershipListNodeRuleProvider") @IntoMap @StringKey(NeutronConstants.TYPE_RULE_PROVIDER)
    RuleProvider<VehicleOwnershipListNode> provideTypeRuleProvider(VehicleOwnershipListNodeRuleProvider provider) {
        return provider;
    }

        @Provides @Named("VehicleOwnershipListNodeRuleProvider") @IntoMap @StringKey("ownershipListNode")
        RuleProvider<VehicleOwnershipListNode> provideOwnershipListNodeChildRuleProvider(
            MotorVehicleNodeChildProvider.OwnershipListNodeRuleProvider provider
        ) {
            return provider;
        }


    @Provides @ComponentScope
    List<RuleProvider<VehicleOwnershipListNode>> provideRuleProviders(
        @Named("VehicleOwnershipListNodeRuleProvider")  Map<String, Provider<RuleProvider<VehicleOwnershipListNode>>> ruleProviderProviderMap
    ) {
        String[] potentialRuleProviderKeys = {NeutronConstants.TYPE_RULE_PROVIDER, owner.getName()};
        return RuleProvider.extractRuleProviders(potentialRuleProviderKeys, ruleProviderProviderMap);
    }
}