package zhy2002.examples.lodgement.gen.event;

import zhy2002.examples.lodgement.gen.node.MotorVehicleNode;
import zhy2002.neutron.NodeAddEvent;


public class MotorVehicleNodeAddEvent extends NodeAddEvent<MotorVehicleNode> {

    public MotorVehicleNodeAddEvent(MotorVehicleNode target) {
        super(target);
    }
}
