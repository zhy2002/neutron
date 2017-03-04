package zhy2002.examples.lodgement.gen.node;

import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import jsinterop.annotations.*;
import javax.inject.*;
import javax.validation.constraints.NotNull;
import java.util.*;
import zhy2002.examples.lodgement.gen.rule.*;
import zhy2002.examples.lodgement.gen.di.*;


public class MotorVehicleNode extends ObjectUiNode<MotorVehicleListNode> {

    private VehicleModelNode vehicleModelNode;
    private VehicleYearNode vehicleYearNode;
    private VehicleMarketValueNode vehicleMarketValueNode;

    private MotorVehicleNodeChildFactory childFactory;

    @Inject
    void receiveNodeProvider(MotorVehicleNodeChildProvider provider) {
        childFactory = provider.createFactory(this);
    }

    @Override
    public final Class<?> getConcreteClass() {
        return MotorVehicleNode.class;
    }

    private MotorVehicleNodeComponent component;

    @Inject
    void createComponent(MotorVehicleNodeComponent.Builder builder) {
        this.component = builder.setMotorVehicleNodeModule(new MotorVehicleNodeModule(this)).build();
    }

    @Override
    protected MotorVehicleNodeRuleProvider getRuleProvider() {
        return component.getMotorVehicleNodeRuleProvider();
    }

    @Override
    protected void initializeRuleState() {
        getRuleProvider().initializeState(this);
    }


    public MotorVehicleNode(@NotNull MotorVehicleListNode parent, String name) {
        super(parent, name);
    }

    @JsMethod
    public VehicleModelNode getVehicleModelNode() {
        return vehicleModelNode;
    }

    @JsMethod
    public VehicleYearNode getVehicleYearNode() {
        return vehicleYearNode;
    }

    @JsMethod
    public VehicleMarketValueNode getVehicleMarketValueNode() {
        return vehicleMarketValueNode;
    }

    @Override
    protected List<UiNode<?>> createChildren() {
        List<UiNode<?>> children = super.createChildren();
        vehicleModelNode = childFactory.createVehicleModelNode();
        children.add(vehicleModelNode);
        vehicleYearNode = childFactory.createVehicleYearNode();
        children.add(vehicleYearNode);
        vehicleMarketValueNode = childFactory.createVehicleMarketValueNode();
        children.add(vehicleMarketValueNode);
        return children;
    }

}
