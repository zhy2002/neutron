package zhy2002.examples.lodgement.gen.node;

import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import zhy2002.examples.lodgement.gen.di.VehicleOwnershipListNodeComponent;
import javax.inject.*;
import zhy2002.neutron.di.*;
import zhy2002.examples.lodgement.gen.rule.*;
import zhy2002.examples.lodgement.gen.di.*;
import java.util.List;


public class VehicleOwnershipListNode extends OwnershipListNode<MotorVehicleNode> {

    @Inject
    protected VehicleOwnershipListNode(@Owner MotorVehicleNode parentProfileNodeInfo) {
        super(parentProfileNodeInfo);
    }

    @Override
    public final Class<?> getConcreteClass() {
    return VehicleOwnershipListNode.class;
    }

    protected final VehicleOwnershipListNodeComponent getComponent() {
        return component;
    }


    private VehicleOwnershipListNodeComponent component;

    @Inject
    void createComponent(VehicleOwnershipListNodeComponent.Builder builder) {
        this.component = builder.setVehicleOwnershipListNodeModule(new VehicleOwnershipListNodeModule(this)).build();
    }

    @Override
    protected void initializeState() {
        this.component.provideRuleProviders().forEach(provider -> provider.initializeState(this));
    }

    @Override
    protected void createRules(List<UiNodeRule<?>> createdRules) {
        this.component.provideRuleProviders().forEach(provider -> provider.createRules(createdRules));
    }

}
