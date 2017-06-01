package zhy2002.examples.lodgement.gen.node;

import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import zhy2002.examples.lodgement.gen.di.VehicleYearNodeComponent;
import javax.inject.*;
import zhy2002.neutron.di.*;
import zhy2002.examples.lodgement.gen.rule.*;
import zhy2002.examples.lodgement.gen.di.*;
import java.util.List;

public class VehicleYearNode extends BigDecimalUiNode<MotorVehicleNode> {

    @Inject
    public VehicleYearNode(@Owner MotorVehicleNode parent, @ChildName String name) {
        super(parent, name);
    }

    @Override
    public final Class<?> getConcreteClass() {
    return VehicleYearNode.class;
    }

    protected final VehicleYearNodeComponent getComponent() {
        return component;
    }


    private VehicleYearNodeComponent component;

    @Inject
    void createComponent(VehicleYearNodeComponent.Builder builder) {
        this.component = builder.setVehicleYearNodeModule(new VehicleYearNodeModule(this)).build();
    }

    private RuleProvider<VehicleYearNode> getRuleProvider() {
        return component.getVehicleYearNodeRuleProvider();
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

    private RuleProvider<VehicleYearNode> getInstanceRuleProvider() {
        return component.getInstanceRuleProviders().get(this.getName());
    }

}
