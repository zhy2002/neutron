package zhy2002.examples.lodgement.gen;

import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import zhy2002.neutron.data.*;
import zhy2002.neutron.util.*;
import jsinterop.annotations.*;
import javax.inject.*;
import javax.validation.constraints.NotNull;
import java.util.*;
import java.math.*;
import zhy2002.examples.lodgement.data.*;
import zhy2002.examples.lodgement.gen.rule.*;
import zhy2002.examples.lodgement.gen.di.*;

public class VehicleMarketValueNode extends BaseCurrencyNode<MotorVehicleNode>
{
    @Override
    public final Class<?> getConcreteClass() {
        return VehicleMarketValueNode.class;
    }

    private VehicleMarketValueNodeComponent component;

    @Inject
    void createComponent(VehicleMarketValueNodeComponent.Builder builder) {
        this.component = builder.setVehicleMarketValueNodeModule(new VehicleMarketValueNodeModule(this)).build();
    }

    @Override
    protected VehicleMarketValueNodeRuleProvider getRuleProvider() {
        return component.getVehicleMarketValueNodeRuleProvider();
    }

    public VehicleMarketValueNode(MotorVehicleNode parent, String name) {
        super(parent, name);
    }

}
