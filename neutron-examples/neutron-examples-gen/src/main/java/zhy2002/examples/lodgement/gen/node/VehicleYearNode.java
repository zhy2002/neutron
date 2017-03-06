package zhy2002.examples.lodgement.gen.node;

import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import javax.inject.*;
import javax.validation.constraints.NotNull;
import zhy2002.examples.lodgement.gen.rule.*;
import zhy2002.examples.lodgement.gen.di.*;
import java.util.List;


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

    private VehicleYearNodeRuleProvider getRuleProvider() {
        return component.getVehicleYearNodeRuleProvider();
    }

    @Override
    protected void initializeState() {
        getRuleProvider().initializeState(this);
    }

    @Override
    protected void createRules(List<UiNodeRule<?>> createdRules) {
        getRuleProvider().createRules(createdRules);
    }


    public VehicleYearNode(@NotNull MotorVehicleNode parent, String name) {
        super(parent, name);
    }

}
