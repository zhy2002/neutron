package zhy2002.examples.lodgement.gen.di;
import dagger.*;
import dagger.multibindings.*;
import javax.inject.*;
import zhy2002.examples.lodgement.gen.node.*;
import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import zhy2002.neutron.di.*;
import zhy2002.neutron.config.NeutronConstants;
import java.util.*;


@Module
public class VehicleModelNodeModule {

    private final VehicleModelNode owner;

    public VehicleModelNodeModule(VehicleModelNode owner) {
        this.owner = owner;
    }

    @Provides @ComponentScope @Owner VehicleModelNode provideVehicleModelNode() {
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

    @Provides @ComponentScope MotorVehicleNode provideMotorVehicleNode() {
        return owner.getParent();
    }

    @Provides @Named("VehicleModelNodeRuleProvider") @IntoMap @StringKey(NeutronConstants.PLACEHOLDER_RULE_PROVIDER)
    RuleProvider<VehicleModelNode> providePlaceholderRuleProvider() {
        return null;
    }

    @Provides @Named("VehicleModelNodeRuleProvider") @IntoMap @StringKey(NeutronConstants.TYPE_RULE_PROVIDER)
    RuleProvider<VehicleModelNode> provideTypeRuleProvider(VehicleModelNodeRuleProvider provider) {
        return provider;
    }


    @Provides @ComponentScope
    List<RuleProvider<VehicleModelNode>> provideRuleProviders(
        @Named("VehicleModelNodeRuleProvider")  Map<String, Provider<RuleProvider<VehicleModelNode>>> ruleProviderProviderMap
    ) {
        String[] potentialRuleProviderKeys = {NeutronConstants.TYPE_RULE_PROVIDER, owner.getName(), owner.getName() + "-test"};
        return RuleProvider.extractRuleProviders(potentialRuleProviderKeys, ruleProviderProviderMap);
    }
}