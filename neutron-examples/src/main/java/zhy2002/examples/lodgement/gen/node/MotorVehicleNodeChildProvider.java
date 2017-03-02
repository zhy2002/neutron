package zhy2002.examples.lodgement.gen.node;

import dagger.MembersInjector;
import javax.inject.Inject;
import javax.inject.Singleton;


interface MotorVehicleNodeChildFactory {
    VehicleModelNode createVehicleModelNode();
    VehicleYearNode createVehicleYearNode();
    VehicleMarketValueNode createVehicleMarketValueNode();
}

@Singleton
public class MotorVehicleNodeChildProvider {
    @Inject
    MembersInjector<VehicleYearNode> vehicleYearNodeInjector;
    @Inject
    MembersInjector<VehicleModelNode> vehicleModelNodeInjector;
    @Inject
    MembersInjector<VehicleMarketValueNode> vehicleMarketValueNodeInjector;

    @Inject
    protected MotorVehicleNodeChildProvider () {}

    protected MembersInjector<VehicleYearNode> getVehicleYearNodeInjector() {
        return this.vehicleYearNodeInjector;
    }

    protected MembersInjector<VehicleModelNode> getVehicleModelNodeInjector() {
        return this.vehicleModelNodeInjector;
    }

    protected MembersInjector<VehicleMarketValueNode> getVehicleMarketValueNodeInjector() {
        return this.vehicleMarketValueNodeInjector;
    }

    protected VehicleModelNode newVehicleModelNode(
        MotorVehicleNode parent,
        String name
    ) {
        return new VehicleModelNode(parent, name);
    }

    protected void configureVehicleModelNode(VehicleModelNode node) {
    }

    protected VehicleYearNode newVehicleYearNode(
        MotorVehicleNode parent,
        String name
    ) {
        return new VehicleYearNode(parent, name);
    }

    protected void configureVehicleYearNode(VehicleYearNode node) {
    }

    protected VehicleMarketValueNode newVehicleMarketValueNode(
        MotorVehicleNode parent,
        String name
    ) {
        return new VehicleMarketValueNode(parent, name);
    }

    protected void configureVehicleMarketValueNode(VehicleMarketValueNode node) {
    }

    MotorVehicleNodeChildFactory createFactory(MotorVehicleNode parent) {
        return new MotorVehicleNodeChildFactoryImpl(parent);
    }

    private class MotorVehicleNodeChildFactoryImpl implements MotorVehicleNodeChildFactory {

        private final MotorVehicleNode parent;
        
        private MotorVehicleNodeChildFactoryImpl(MotorVehicleNode parent) {
            this.parent = parent;
        }

        @Override
        public VehicleModelNode createVehicleModelNode() {
            VehicleModelNode node = newVehicleModelNode(parent, "vehicleModelNode");
            vehicleModelNodeInjector.injectMembers(node);
            configureVehicleModelNode(node);
            return node;
        }

        @Override
        public VehicleYearNode createVehicleYearNode() {
            VehicleYearNode node = newVehicleYearNode(parent, "vehicleYearNode");
            vehicleYearNodeInjector.injectMembers(node);
            configureVehicleYearNode(node);
            return node;
        }

        @Override
        public VehicleMarketValueNode createVehicleMarketValueNode() {
            VehicleMarketValueNode node = newVehicleMarketValueNode(parent, "vehicleMarketValueNode");
            vehicleMarketValueNodeInjector.injectMembers(node);
            configureVehicleMarketValueNode(node);
            return node;
        }

    }
}
