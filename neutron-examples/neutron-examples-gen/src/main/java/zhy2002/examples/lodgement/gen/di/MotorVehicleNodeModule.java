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
public class MotorVehicleNodeModule {

    private final MotorVehicleNode owner;

    public MotorVehicleNodeModule(MotorVehicleNode owner) {
        this.owner = owner;
    }

    @Provides @ComponentScope @Owner MotorVehicleNode provideMotorVehicleNode() {
        return owner;
    }

    @Provides @ComponentScope @Owner ObjectUiNode<?> provideObjectUiNode() {
        return owner;
    }

    @Provides @ComponentScope @Owner ParentUiNode<?> provideParentUiNode() {
        return owner;
    }

    @Provides @ComponentScope @Owner UiNode<?> provideUiNode() {
        return owner;
    }

    @Provides @ComponentScope MotorVehicleListNode provideMotorVehicleListNode() {
        return owner.getParent();
    }

    @Provides @Named("MotorVehicleNodeRuleProvider") @IntoMap @StringKey(NeutronConstants.PLACEHOLDER_RULE_PROVIDER)
    RuleProvider<MotorVehicleNode> providePlaceholderRuleProvider() {
        return null;
    }

    @Provides @Named("MotorVehicleNodeRuleProvider") @IntoMap @StringKey(NeutronConstants.TYPE_RULE_PROVIDER)
    RuleProvider<MotorVehicleNode> provideTypeRuleProvider(MotorVehicleNodeRuleProvider provider) {
        return provider;
    }


    @Provides @ComponentScope
    List<RuleProvider<MotorVehicleNode>> provideRuleProviders(
        @Named("MotorVehicleNodeRuleProvider")  Map<String, Provider<RuleProvider<MotorVehicleNode>>> ruleProviderProviderMap
    ) {
        String[] potentialRuleProviderKeys = {NeutronConstants.TYPE_RULE_PROVIDER, owner.getName(), owner.getName() + "-test"};
        return RuleProvider.extractRuleProviders(potentialRuleProviderKeys, ruleProviderProviderMap);
    }
}