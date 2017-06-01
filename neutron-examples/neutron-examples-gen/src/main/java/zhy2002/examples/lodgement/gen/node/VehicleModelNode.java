package zhy2002.examples.lodgement.gen.node;

import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import zhy2002.examples.lodgement.gen.di.VehicleModelNodeComponent;
import javax.inject.*;
import zhy2002.neutron.di.*;
import zhy2002.examples.lodgement.gen.rule.*;
import zhy2002.examples.lodgement.gen.di.*;
import java.util.List;


public class VehicleModelNode extends StringUiNode<MotorVehicleNode> {

    @Inject
    public VehicleModelNode(@Owner MotorVehicleNode parent) {
        super(parent);
    }

    @Override
    public final Class<?> getConcreteClass() {
    return VehicleModelNode.class;
    }

    protected final VehicleModelNodeComponent getComponent() {
        return component;
    }


    private VehicleModelNodeComponent component;

    @Inject
    void createComponent(VehicleModelNodeComponent.Builder builder) {
        this.component = builder.setVehicleModelNodeModule(new VehicleModelNodeModule(this)).build();
    }

    @Override
    protected void initializeState() {
        this.component.provideRuleProviders().forEach(provider -> provider.initializeState(this));
    }

    @Override
    protected void createRules(List<UiNodeRule<?>> createdRules) {
        this.component.provideRuleProviders().forEach(provider -> provider.createRules(createdRules));
    }

}
