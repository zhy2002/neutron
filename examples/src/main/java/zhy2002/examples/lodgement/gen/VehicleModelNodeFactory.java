package zhy2002.examples.lodgement.gen;

import zhy2002.neutron.*;

public class VehicleModelNodeFactory implements ChildNodeFactory<VehicleModelNode, MotorVehicleNode> {

    @Override
    public VehicleModelNode create(MotorVehicleNode parent, String name) {
        return new VehicleModelNode(parent, name);
    }
}
