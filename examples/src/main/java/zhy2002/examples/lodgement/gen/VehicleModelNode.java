package zhy2002.examples.lodgement.gen;

import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import javax.inject.*;
import javax.validation.constraints.NotNull;
import zhy2002.examples.lodgement.gen.rule.*;
import zhy2002.examples.lodgement.gen.di.*;

public class VehicleModelNode extends StringUiNode<MotorVehicleNode> {

    @Override
    public final Class<?> getConcreteClass() {
        return VehicleModelNode.class;
    }

    private VehicleModelNodeComponent component;

    @Inject
    void createComponent(VehicleModelNodeComponent.Builder builder) {
        this.component = builder.setVehicleModelNodeModule(new VehicleModelNodeModule(this)).build();
    }

    @Override
    protected VehicleModelNodeRuleProvider getRuleProvider() {
        return component.getVehicleModelNodeRuleProvider();
    }

    public VehicleModelNode(@NotNull MotorVehicleNode parent, String name) {
        super(parent, name);
    }

}
