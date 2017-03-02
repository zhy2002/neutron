package zhy2002.examples.lodgement.gen.node;

import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import javax.inject.*;
import javax.validation.constraints.NotNull;
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

    public MotorVehicleListNode(@NotNull AssetsNode parent, String name) {
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
