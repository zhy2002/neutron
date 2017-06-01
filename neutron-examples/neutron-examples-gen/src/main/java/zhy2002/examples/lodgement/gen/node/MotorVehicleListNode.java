package zhy2002.examples.lodgement.gen.node;

import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import zhy2002.examples.lodgement.gen.di.MotorVehicleListNodeComponent;
import javax.inject.*;
import zhy2002.neutron.di.*;
import zhy2002.examples.lodgement.gen.rule.*;
import zhy2002.examples.lodgement.gen.di.*;
import java.util.List;

public class MotorVehicleListNode extends ListUiNode<AssetsNode,MotorVehicleNode> {

    @Inject
    public MotorVehicleListNode(@Owner AssetsNode parent, @ChildName String name) {
        super(parent, name);
    }

    @Override
    public final Class<?> getConcreteClass() {
    return MotorVehicleListNode.class;
    }

    private MotorVehicleListNodeItemFactory itemFactory;

    @Inject
    void receiveNodeProvider(MotorVehicleListNodeItemProvider provider) {
        itemFactory = provider.createFactory(this);
    }

    protected final MotorVehicleListNodeComponent getComponent() {
        return component;
    }


    private MotorVehicleListNodeComponent component;

    @Inject
    void createComponent(MotorVehicleListNodeComponent.Builder builder) {
        this.component = builder.setMotorVehicleListNodeModule(new MotorVehicleListNodeModule(this)).build();
    }

    private RuleProvider<MotorVehicleListNode> getRuleProvider() {
        return component.getMotorVehicleListNodeRuleProvider();
    }

    @Override
    protected void initializeState() {
        getRuleProvider().initializeState(this);
        getInstanceRuleProvider().initializeState(this);
    }

    @Override
    protected void createRules(List<UiNodeRule<?>> createdRules) {
        getRuleProvider().createRules(createdRules);
        getInstanceRuleProvider().createRules(createdRules);
    }

    private RuleProvider<MotorVehicleListNode> getInstanceRuleProvider() {
        return component.getInstanceRuleProviders().get(this.getName());
    }

    @Override
    public Class<MotorVehicleNode> getItemClass() {
        return MotorVehicleNode.class;
    }

    @Override
    public NodeAddEvent<MotorVehicleNode> createItemAddEvent(String name) {
        ensureSequenceNumber(name);
        return itemFactory.createItemAddEvent(name);
    }

    @Override
    public NodeRemoveEvent<MotorVehicleNode> createItemRemoveEvent(MotorVehicleNode item) {
        return itemFactory.createItemRemoveEvent(item);
    }

}
