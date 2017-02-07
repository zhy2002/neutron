package zhy2002.examples.lodgement.gen;

import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import zhy2002.neutron.data.*;
import zhy2002.neutron.util.*;
import jsinterop.annotations.*;
import javax.validation.constraints.NotNull;
import java.util.*;
import java.math.*;
import zhy2002.examples.lodgement.data.*;

public  class MotorVehicleNode extends ObjectUiNode<MotorVehicleListNode>
{
    private VehicleModelNode vehicleModelNode;
    private VehicleYearNode vehicleYearNode;
    private VehicleMarketValueNode vehicleMarketValueNode;

    public MotorVehicleNode(MotorVehicleListNode parent, String name) {
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
        UiNodeContext<?> context = getContext();
        vehicleModelNode = context.createChildNode(VehicleModelNode.class, this, "vehicleModelNode");
        children.add(vehicleModelNode);
        vehicleYearNode = context.createChildNode(VehicleYearNode.class, this, "vehicleYearNode");
        children.add(vehicleYearNode);
        vehicleMarketValueNode = context.createChildNode(VehicleMarketValueNode.class, this, "vehicleMarketValueNode");
        children.add(vehicleMarketValueNode);
        return children;
    }



}
