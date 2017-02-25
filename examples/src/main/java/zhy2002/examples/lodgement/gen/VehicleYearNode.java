package zhy2002.examples.lodgement.gen;

import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import javax.inject.*;
import javax.validation.constraints.NotNull;
import zhy2002.examples.lodgement.gen.rule.*;
import zhy2002.examples.lodgement.gen.di.*;

public class VehicleYearNode extends BigDecimalUiNode<MotorVehicleNode> {

    @Override
    public final Class<?> getConcreteClass() {
        return VehicleYearNode.class;
    }

    private VehicleYearNodeComponent component;

    @Inject
    void createComponent(VehicleYearNodeComponent.Builder builder) {
        this.component = builder.setVehicleYearNodeModule(new VehicleYearNodeModule(this)).build();
    }

    @Override
    protected VehicleYearNodeRuleProvider getRuleProvider() {
        return component.getVehicleYearNodeRuleProvider();
    }

    public VehicleYearNode(@NotNull MotorVehicleNode parent, String name) {
        super(parent, name);
    }

}
