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
public class VehicleMarketValueNodeModule {

    private final VehicleMarketValueNode owner;

    public VehicleMarketValueNodeModule(VehicleMarketValueNode owner) {
        this.owner = owner;
    }

    @Provides @ComponentScope @Owner VehicleMarketValueNode provideVehicleMarketValueNode() {
        return owner;
    }

    @Provides @ComponentScope @Owner BaseCurrencyNode<?> provideBaseCurrencyNode() {
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

    @Provides @Named("VehicleMarketValueNodeRuleProvider") @IntoMap @StringKey(NeutronConstants.PLACEHOLDER_RULE_PROVIDER)
    RuleProvider<VehicleMarketValueNode> providePlaceholderRuleProvider() {
        return null;
    }

    @Provides @Named("VehicleMarketValueNodeRuleProvider") @IntoMap @StringKey(NeutronConstants.TYPE_RULE_PROVIDER)
    RuleProvider<VehicleMarketValueNode> provideTypeRuleProvider(VehicleMarketValueNodeRuleProvider provider) {
        return provider;
    }


    @Provides @ComponentScope
    List<RuleProvider<VehicleMarketValueNode>> provideRuleProviders(
        @Named("VehicleMarketValueNodeRuleProvider")  Map<String, Provider<RuleProvider<VehicleMarketValueNode>>> ruleProviderProviderMap
    ) {
        String[] potentialRuleProviderKeys = {NeutronConstants.TYPE_RULE_PROVIDER, owner.getName(), owner.getName() + "-test"};
        return RuleProvider.extractRuleProviders(potentialRuleProviderKeys, ruleProviderProviderMap);
    }
}