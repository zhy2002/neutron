package zhy2002.examples.lodgement.gen.di;
import dagger.*;
import javax.inject.*;
import zhy2002.examples.lodgement.gen.node.*;
import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import zhy2002.neutron.di.*;
import java.util.*;


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

    @Provides @ChildName String provideChildName() {
        return owner.getContext().getNodeIdentity().getName();
    }

    @Provides @ComponentScope AssetsNode provideAssetsNode() {
        return owner.getParent();
    }

    @Provides @ComponentScope
    RuleProvider<MotorVehicleListNode> provideRuleProvider(Provider<MotorVehicleListNodeRuleProvider> provider) {
        return provider.get();
    }

    @Provides @ComponentScope
    Map<String, RuleProvider<MotorVehicleListNode>> provideInstanceProviderMap(
        Provider<AssetsNodeChildProvider.MotorVehicleListNodeRuleProvider> motorVehicleListNodeRuleProvider
    ) {
        Map<String, RuleProvider<MotorVehicleListNode>> result = new HashMap<>();
        result.put("motorVehicleListNode", motorVehicleListNodeRuleProvider.get());
        return result;
    }
}