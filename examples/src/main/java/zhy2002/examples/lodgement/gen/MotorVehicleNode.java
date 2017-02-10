package zhy2002.examples.lodgement.gen;

import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import zhy2002.neutron.data.*;
import zhy2002.neutron.util.*;
import jsinterop.annotations.*;
import javax.inject.*;
import javax.validation.constraints.NotNull;
import java.util.*;
import java.math.*;
import zhy2002.examples.lodgement.data.*;

public class MotorVehicleNode extends ObjectUiNode<MotorVehicleListNode>
{
    private VehicleModelNode vehicleModelNode;
    private VehicleYearNode vehicleYearNode;
    private VehicleMarketValueNode vehicleMarketValueNode;

    private MotorVehicleNodeChildFactory childFactory;

    @Inject
    void receiveNodeProvider(MotorVehicleNodeChildProvider provider) {
        childFactory = provider.createFactory(this);
    }

    @Inject
    void receiveClassRegistry(ClassRegistryImpl classRegistry) {
        UiNodeConfig<MotorVehicleNode> config = classRegistry.getUiNodeConfig(MotorVehicleNode.class, getName());
        if (config != null) {
            this.setStatusListener(new ConfigBindingNodeStatusListener<>(this, config));
        }
    }

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
        vehicleModelNode = childFactory.createVehicleModelNode();
        children.add(vehicleModelNode);
        vehicleYearNode = childFactory.createVehicleYearNode();
        children.add(vehicleYearNode);
        vehicleMarketValueNode = childFactory.createVehicleMarketValueNode();
        children.add(vehicleMarketValueNode);
        return children;
    }



}
