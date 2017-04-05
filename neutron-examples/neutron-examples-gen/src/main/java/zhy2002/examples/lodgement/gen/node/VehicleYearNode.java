package zhy2002.examples.lodgement.gen.node;

import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import jsinterop.annotations.*;
import java.math.BigDecimal;
import javax.inject.*;
import javax.validation.constraints.NotNull;
import zhy2002.examples.lodgement.data.*;
import zhy2002.examples.lodgement.gen.rule.*;
import zhy2002.examples.lodgement.gen.di.*;
import java.util.List;


public class VehicleYearNode extends BigDecimalUiNode<MotorVehicleNode> {

    @Override
    public final Class<?> getConcreteClass() {
        return VehicleYearNode.class;
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

    public VehicleYearNode(@NotNull MotorVehicleNode parent, String name) {
        super(parent, name);
    }

    @JsMethod
    public Object[] getOptions() {
        return getStateValue(ApplicationNodeConstants.OPTIONS);
    }

    @JsMethod
    public void setOptions(Object[] value) {
        setStateValue(ApplicationNodeConstants.OPTIONS, Object.class, value);
    }

}
