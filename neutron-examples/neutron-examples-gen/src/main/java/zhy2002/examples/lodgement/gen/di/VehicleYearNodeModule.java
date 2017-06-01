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
public class VehicleYearNodeModule {

    private final VehicleYearNode owner;

    public VehicleYearNodeModule(VehicleYearNode owner) {
        this.owner = owner;
    }

    @Provides @ComponentScope @Owner VehicleYearNode provideVehicleYearNode() {
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

    @Provides @ComponentScope MotorVehicleNode provideMotorVehicleNode() {
        return owner.getParent();
    }

    @Provides @Named("VehicleYearNodeRuleProvider") @IntoMap @StringKey(NeutronConstants.PLACEHOLDER_RULE_PROVIDER)
    RuleProvider<VehicleYearNode> providePlaceholderRuleProvider() {
        return null;
    }

    @Provides @Named("VehicleYearNodeRuleProvider") @IntoMap @StringKey(NeutronConstants.TYPE_RULE_PROVIDER)
    RuleProvider<VehicleYearNode> provideTypeRuleProvider(VehicleYearNodeRuleProvider provider) {
        return provider;
    }

        @Provides @Named("VehicleYearNodeRuleProvider") @IntoMap @StringKey("vehicleYearNode")
        RuleProvider<VehicleYearNode> provideVehicleYearNodeChildRuleProvider(
            MotorVehicleNodeChildProvider.VehicleYearNodeRuleProvider provider
        ) {
            return provider;
        }


    @Provides @ComponentScope
    List<RuleProvider<VehicleYearNode>> provideRuleProviders(
        @Named("VehicleYearNodeRuleProvider")  Map<String, Provider<RuleProvider<VehicleYearNode>>> ruleProviderProviderMap
    ) {
        String[] potentialRuleProviderKeys = {NeutronConstants.TYPE_RULE_PROVIDER, owner.getName()};
        return RuleProvider.extractRuleProviders(potentialRuleProviderKeys, ruleProviderProviderMap);
    }
}