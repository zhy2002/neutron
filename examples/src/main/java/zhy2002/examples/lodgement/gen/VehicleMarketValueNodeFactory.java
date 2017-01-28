package zhy2002.examples.lodgement.gen;

import zhy2002.neutron.*;

public class VehicleMarketValueNodeFactory implements ChildNodeFactory<VehicleMarketValueNode, MotorVehicleNode> {

    @Override
    public VehicleMarketValueNode create(MotorVehicleNode parent, String name) {
        return new VehicleMarketValueNode(parent, name);
    }
}
