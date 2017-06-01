package zhy2002.examples.lodgement.gen.node;

import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import zhy2002.examples.lodgement.gen.di.VehicleMarketValueNodeComponent;
import javax.inject.*;
import zhy2002.neutron.di.*;
import zhy2002.examples.lodgement.gen.rule.*;
import zhy2002.examples.lodgement.gen.di.*;
import java.util.List;


public class VehicleMarketValueNode extends BaseCurrencyNode<MotorVehicleNode> {

    @Inject
    public VehicleMarketValueNode(@Owner MotorVehicleNode parent) {
        super(parent);
    }

    @Override
    public final Class<?> getConcreteClass() {
    return VehicleMarketValueNode.class;
    }

    protected final VehicleMarketValueNodeComponent getComponent() {
        return component;
    }


    private VehicleMarketValueNodeComponent component;

    @Inject
    void createComponent(VehicleMarketValueNodeComponent.Builder builder) {
        this.component = builder.setVehicleMarketValueNodeModule(new VehicleMarketValueNodeModule(this)).build();
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
