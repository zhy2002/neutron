package zhy2002.examples.lodgement.gen;

import dagger.MembersInjector;
import javax.inject.Inject;
import javax.inject.Singleton;
import zhy2002.neutron.NodeAddEvent;
import zhy2002.neutron.NodeRemoveEvent;
import zhy2002.examples.lodgement.gen.event.*;

interface MotorVehicleListNodeItemFactory {
    NodeAddEvent<MotorVehicleNode> createItemAddEvent(String name);
    NodeRemoveEvent<MotorVehicleNode> createItemRemoveEvent(MotorVehicleNode item);
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

    protected NodeAddEvent<MotorVehicleNode> newItemAddEvent(MotorVehicleNode item) {
        return new MotorVehicleNodeAddEvent(item);
    }

    protected NodeRemoveEvent<MotorVehicleNode> newItemRemoveEvent(MotorVehicleNode item) {
        return new MotorVehicleNodeRemoveEvent(item);
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
        public final NodeAddEvent<MotorVehicleNode> createItemAddEvent(String name) {
            MotorVehicleNode item = createItemNode(name);
            return newItemAddEvent(item);
        }

        @Override
        public final NodeRemoveEvent<MotorVehicleNode> createItemRemoveEvent(MotorVehicleNode item) {
            return newItemRemoveEvent(item);
        }

        private MotorVehicleNode createItemNode(String name) {
            MotorVehicleNode node = newMotorVehicleNode(parent, name);
            motorVehicleNodeInjector.injectMembers(node);
            configureMotorVehicleNode(node);
            return node;
        }

    }
}
