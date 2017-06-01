package zhy2002.examples.lodgement.gen.node;

import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import javax.inject.*;
import zhy2002.neutron.di.*;
import zhy2002.examples.lodgement.gen.rule.*;
import zhy2002.examples.lodgement.gen.di.*;
import java.util.List;

public class VehicleModelNode extends StringUiNode<MotorVehicleNode> {

    private VehicleModelNodeComponent component;

    @Inject
    public VehicleModelNode(@Owner MotorVehicleNode parent, @ChildName String name) {
        super(parent, name);
    }

    @Override
    public final Class<?> getConcreteClass() {
    return VehicleModelNode.class;
    }

    @Inject
    void createComponent(VehicleModelNodeComponent.Builder builder) {
        this.component = builder.setVehicleModelNodeModule(new VehicleModelNodeModule(this)).build();
    }

    private RuleProvider<VehicleModelNode> getRuleProvider() {
        return component.getVehicleModelNodeRuleProvider();
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

    private RuleProvider<VehicleModelNode> getInstanceRuleProvider() {
        return component.getInstanceRuleProviders().get(this.getName());
    }

}
