package zhy2002.examples.lodgement.gen.event;

import zhy2002.examples.lodgement.gen.node.MotorVehicleNode;
import zhy2002.neutron.NodeRemoveEvent;


public class MotorVehicleNodeRemoveEvent extends NodeRemoveEvent<MotorVehicleNode> {
    public MotorVehicleNodeRemoveEvent(MotorVehicleNode target) {
        super(target);
    }
}