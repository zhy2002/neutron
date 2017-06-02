package zhy2002.examples.lodgement.gen.node;

import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import zhy2002.examples.lodgement.gen.di.MotorVehicleListNodeComponent;
import javax.inject.*;
import zhy2002.neutron.di.*;
import zhy2002.examples.lodgement.gen.rule.*;
import zhy2002.examples.lodgement.gen.di.*;
import java.util.List;
import zhy2002.examples.lodgement.gen.event.*;


public class MotorVehicleListNode extends ListUiNode<AssetsNode,MotorVehicleNode> {

    @Inject
    protected MotorVehicleListNode(@Owner AssetsNode parent) {
        super(parent);
    }

    @Override
    public final Class<?> getConcreteClass() {
    return MotorVehicleListNode.class;
    }

    protected final MotorVehicleListNodeComponent getComponent() {
        return component;
    }


    private MotorVehicleListNodeComponent component;

    @Inject
    void createComponent(MotorVehicleListNodeComponent.Builder builder) {
        this.component = builder.setMotorVehicleListNodeModule(new MotorVehicleListNodeModule(this)).build();
    }

    @Override
    protected void initializeState() {
        this.component.provideRuleProviders().forEach(provider -> provider.initializeState(this));
    }

    @Override
    protected void createRules(List<UiNodeRule<?>> createdRules) {
        this.component.provideRuleProviders().forEach(provider -> provider.createRules(createdRules));
    }

    @Override
    public Class<MotorVehicleNode> getItemClass() {
        return MotorVehicleNode.class;
    }

    @Override
    public NodeAddEvent<MotorVehicleNode> createItemAddEvent(String name) {
        ensureSequenceNumber(name);
        setNameOfChildBeingCreated(name);
        MotorVehicleNode item = getComponent().createMotorVehicleNode();
        setNameOfChildBeingCreated(null);
        return new MotorVehicleNodeAddEvent(item);
    }

    @Override
    public final NodeRemoveEvent<MotorVehicleNode> createItemRemoveEvent(MotorVehicleNode item) {
        return new MotorVehicleNodeRemoveEvent(item);
    }

}
