package zhy2002.examples.lodgement.gen;

import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import zhy2002.neutron.data.*;
import zhy2002.neutron.util.*;
import jsinterop.annotations.*;
import javax.inject.*;
import javax.validation.constraints.NotNull;
import java.util.*;
import java.math.*;
import zhy2002.examples.lodgement.data.*;

public class MotorVehicleListNode extends ListUiNode<AssetsNode,MotorVehicleListNode,MotorVehicleNode>
{
    private MotorVehicleListNodeItemFactory itemFactory;

    @Inject
    void receiveProviders(MotorVehicleListNodeItemProvider provider) {
        itemFactory = provider.createFactory(this);
    }

    @Inject
    void receiveClassRegistry(ClassRegistryImpl classRegistry) {
        UiNodeConfig<MotorVehicleListNode> config = classRegistry.getUiNodeConfig(MotorVehicleListNode.class, getName());
        if (config != null) {
            this.setStatusListener(new ConfigBindingNodeStatusListener<>(this, config));
        }
    }

    public MotorVehicleListNode(AssetsNode parent, String name) {
        super(parent, name);
    }

    @Override
    public Class<MotorVehicleNode> getItemClass() {
        return MotorVehicleNode.class;
    }

    @Override
    protected <M extends MotorVehicleNode> MotorVehicleNode createItemNode(Class<M> itemClass, String name) {
        return itemFactory.createMotorVehicleNode(name);
    }



}
