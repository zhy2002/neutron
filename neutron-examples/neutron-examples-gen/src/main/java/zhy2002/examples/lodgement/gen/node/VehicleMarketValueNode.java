package zhy2002.examples.lodgement.gen.node;

import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import javax.inject.*;
import javax.validation.constraints.NotNull;
import zhy2002.examples.lodgement.gen.rule.*;
import zhy2002.examples.lodgement.gen.di.*;
import java.util.List;


public class VehicleMarketValueNode extends BaseCurrencyNode<MotorVehicleNode> {

    @Override
    public final Class<?> getConcreteClass() {
        return VehicleMarketValueNode.class;
    }

    private VehicleMarketValueNodeComponent component;

    @Inject
    void createComponent(VehicleMarketValueNodeComponent.Builder builder) {
        this.component = builder.setVehicleMarketValueNodeModule(new VehicleMarketValueNodeModule(this)).build();
    }

    private VehicleMarketValueNodeRuleProvider getRuleProvider() {
        return component.getVehicleMarketValueNodeRuleProvider();
    }

    @Override
    protected void initializeState() {
        getRuleProvider().initializeState(this);
    }

    @Override
    protected void createRules(List<UiNodeRule<?>> createdRules) {
        getRuleProvider().createRules(createdRules);
    }


    public VehicleMarketValueNode(@NotNull MotorVehicleNode parent, String name) {
        super(parent, name);
    }

}
