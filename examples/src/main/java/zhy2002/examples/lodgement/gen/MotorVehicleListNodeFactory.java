package zhy2002.examples.lodgement.gen;

import zhy2002.neutron.*;

public class MotorVehicleListNodeFactory implements ChildNodeFactory<MotorVehicleListNode, AssetsNode> {

    @Override
    public MotorVehicleListNode create(AssetsNode parent, String name) {
        return new MotorVehicleListNode(parent, name);
    }
}
