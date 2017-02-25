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
import zhy2002.examples.lodgement.gen.rule.*;
import zhy2002.examples.lodgement.gen.di.*;

public class MotorVehicleListNode extends ListUiNode<AssetsNode,MotorVehicleNode> {

    private MotorVehicleListNodeItemFactory itemFactory;

    @Inject
    void receiveNodeProvider(MotorVehicleListNodeItemProvider provider) {
        itemFactory = provider.createFactory(this);
    }

    @Override
    public final Class<?> getConcreteClass() {
        return MotorVehicleListNode.class;
    }

    private MotorVehicleListNodeComponent component;

    @Inject
    void createComponent(MotorVehicleListNodeComponent.Builder builder) {
        this.component = builder.setMotorVehicleListNodeModule(new MotorVehicleListNodeModule(this)).build();
    }

    @Override
    protected MotorVehicleListNodeRuleProvider getRuleProvider() {
        return component.getMotorVehicleListNodeRuleProvider();
    }

    public MotorVehicleListNode(AssetsNode parent, String name) {
        super(parent, name);
    }

    @Override
    public Class<MotorVehicleNode> getItemClass() {
        return MotorVehicleNode.class;
    }

    public NodeAddEvent<MotorVehicleNode> createItemAddEvent() {
        return itemFactory.createItemAddEvent(String.valueOf(super.getChildSequenceNumber()));
    }

    public NodeRemoveEvent<MotorVehicleNode> createItemRemoveEvent(MotorVehicleNode item) {
        return itemFactory.createItemRemoveEvent(item);
    }

}
