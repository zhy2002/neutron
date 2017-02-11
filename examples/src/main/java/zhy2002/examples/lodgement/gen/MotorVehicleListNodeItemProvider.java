package zhy2002.examples.lodgement.gen;

import dagger.MembersInjector;
import javax.inject.Inject;
import javax.inject.Singleton;


interface MotorVehicleListNodeItemFactory {
    MotorVehicleNode createMotorVehicleNode(String name);
}

@Singleton
public class MotorVehicleListNodeItemProvider {
    @Inject
    MembersInjector<MotorVehicleNode> motorVehicleNodeInjector;

    @Inject
    protected MotorVehicleListNodeItemProvider () {}

    protected MembersInjector<MotorVehicleNode> getMotorVehicleNodeInjector() {
        return this.motorVehicleNodeInjector;
    }

    protected MotorVehicleNode newMotorVehicleNode (
        MotorVehicleListNode parent,
        String name
    ) {
        return new MotorVehicleNode(parent, name);
    }

    protected void configureMotorVehicleNode(MotorVehicleNode node) {
    }

    MotorVehicleListNodeItemFactory createFactory(MotorVehicleListNode parent) {
        return new MotorVehicleListNodeItemFactoryImpl(parent);
    }

    private class MotorVehicleListNodeItemFactoryImpl implements MotorVehicleListNodeItemFactory {

        private final MotorVehicleListNode parent;
        
        private MotorVehicleListNodeItemFactoryImpl(MotorVehicleListNode parent) {
            this.parent = parent;
        }

        @Override
        public MotorVehicleNode createMotorVehicleNode(String name) {
            MotorVehicleNode node = newMotorVehicleNode(parent, name);
            motorVehicleNodeInjector.injectMembers(node);
            configureMotorVehicleNode(node);
            return node;
        }

    }
}
