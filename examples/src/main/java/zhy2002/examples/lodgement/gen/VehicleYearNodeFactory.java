package zhy2002.examples.lodgement.gen;

import zhy2002.neutron.*;

public class VehicleYearNodeFactory implements ChildNodeFactory<VehicleYearNode, MotorVehicleNode> {

    @Override
    public VehicleYearNode create(MotorVehicleNode parent, String name) {
        return new VehicleYearNode(parent, name);
    }
}
