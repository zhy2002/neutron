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
public class MotorVehicleListNodeModule {

    private final MotorVehicleListNode owner;

    public MotorVehicleListNodeModule(MotorVehicleListNode owner) {
        this.owner = owner;
    }

    @Provides @ComponentScope @Owner MotorVehicleListNode provideMotorVehicleListNode() {
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

    @Provides @ComponentScope AssetsNode provideAssetsNode() {
        return owner.getParent();
    }

    @Provides @Named("MotorVehicleListNodeRuleProvider") @IntoMap @StringKey(NeutronConstants.PLACEHOLDER_RULE_PROVIDER)
    RuleProvider<MotorVehicleListNode> providePlaceholderRuleProvider() {
        return null;
    }

    @Provides @Named("MotorVehicleListNodeRuleProvider") @IntoMap @StringKey(NeutronConstants.TYPE_RULE_PROVIDER)
    RuleProvider<MotorVehicleListNode> provideTypeRuleProvider(MotorVehicleListNodeRuleProvider provider) {
        return provider;
    }

        @Provides @Named("MotorVehicleListNodeRuleProvider") @IntoMap @StringKey("motorVehicleListNode")
        RuleProvider<MotorVehicleListNode> provideMotorVehicleListNodeChildRuleProvider(
            AssetsNodeChildProvider.MotorVehicleListNodeRuleProvider provider
        ) {
            return provider;
        }


    @Provides @ComponentScope
    List<RuleProvider<MotorVehicleListNode>> provideRuleProviders(
        @Named("MotorVehicleListNodeRuleProvider")  Map<String, Provider<RuleProvider<MotorVehicleListNode>>> ruleProviderProviderMap
    ) {
        String[] potentialRuleProviderKeys = {NeutronConstants.TYPE_RULE_PROVIDER, owner.getName()};
        return RuleProvider.extractRuleProviders(potentialRuleProviderKeys, ruleProviderProviderMap);
    }
}