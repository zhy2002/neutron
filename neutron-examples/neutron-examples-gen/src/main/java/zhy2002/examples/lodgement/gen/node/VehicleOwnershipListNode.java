package zhy2002.examples.lodgement.gen.node;

import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import javax.inject.*;
import zhy2002.neutron.di.*;
import zhy2002.examples.lodgement.gen.rule.*;
import zhy2002.examples.lodgement.gen.di.*;
import java.util.List;

public class VehicleOwnershipListNode extends OwnershipListNode<MotorVehicleNode> {

    private VehicleOwnershipListNodeComponent component;

    @Inject
    public VehicleOwnershipListNode(@Owner MotorVehicleNode parent, @ChildName String name) {
        super(parent, name);
    }

    @Override
    public final Class<?> getConcreteClass() {
    return VehicleOwnershipListNode.class;
    }

    @Inject
    void createComponent(VehicleOwnershipListNodeComponent.Builder builder) {
        this.component = builder.setVehicleOwnershipListNodeModule(new VehicleOwnershipListNodeModule(this)).build();
    }

    private RuleProvider<VehicleOwnershipListNode> getRuleProvider() {
        return component.getVehicleOwnershipListNodeRuleProvider();
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

    private RuleProvider<VehicleOwnershipListNode> getInstanceRuleProvider() {
        return component.getInstanceRuleProviders().get(this.getName());
    }

}
