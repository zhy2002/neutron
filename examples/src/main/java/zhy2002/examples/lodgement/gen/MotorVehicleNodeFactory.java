package zhy2002.examples.lodgement.gen;

import zhy2002.neutron.*;

public class MotorVehicleNodeFactory implements ChildNodeFactory<MotorVehicleNode, MotorVehicleListNode> {

    @Override
    public MotorVehicleNode create(MotorVehicleListNode parent, String name) {
        return new MotorVehicleNode(parent, name);
    }
}
