package zhy2002.examples.lodgement.gen.node;

import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import javax.inject.*;
import javax.validation.constraints.NotNull;
import zhy2002.examples.lodgement.gen.rule.*;
import zhy2002.examples.lodgement.gen.di.*;
import java.util.List;

public class MotorVehicleListNode extends ListUiNode<AssetsNode,MotorVehicleNode> {
    private MotorVehicleListNodeItemFactory itemFactory;
    private MotorVehicleListNodeComponent component;

    public MotorVehicleListNode(@NotNull AssetsNode parent, String name) {
        super(parent, name);
    }

    @Override
    public final Class<?> getConcreteClass() {
        return MotorVehicleListNode.class;
    }

    @Inject
    void receiveNodeProvider(MotorVehicleListNodeItemProvider provider) {
        itemFactory = provider.createFactory(this);
    }

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
