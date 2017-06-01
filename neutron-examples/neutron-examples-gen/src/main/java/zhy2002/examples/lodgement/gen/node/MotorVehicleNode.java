package zhy2002.examples.lodgement.gen.node;

import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import zhy2002.examples.lodgement.gen.di.MotorVehicleNodeComponent;
import jsinterop.annotations.*;
import java.math.BigDecimal;
import javax.inject.*;
import zhy2002.neutron.di.*;
import java.util.*;
import zhy2002.examples.lodgement.gen.rule.*;
import zhy2002.examples.lodgement.gen.di.*;
import java.util.List;


public class MotorVehicleNode extends ObjectUiNode<MotorVehicleListNode> {

    @Inject
    public MotorVehicleNode(@Owner MotorVehicleListNode parent) {
        super(parent);
    }

    @Override
    public final Class<?> getConcreteClass() {
    return MotorVehicleNode.class;
    }

    protected final MotorVehicleNodeComponent getComponent() {
        return component;
    }


    private MotorVehicleNodeComponent component;

    @Inject
    void createComponent(MotorVehicleNodeComponent.Builder builder) {
        this.component = builder.setMotorVehicleNodeModule(new MotorVehicleNodeModule(this)).build();
    }

    @Override
    protected void initializeState() {
        this.component.provideRuleProviders().forEach(provider -> provider.initializeState(this));
    }

    @Override
    protected void createRules(List<UiNodeRule<?>> createdRules) {
        this.component.provideRuleProviders().forEach(provider -> provider.createRules(createdRules));
    }

    //region children getters

    @JsMethod
    public VehicleModelNode getVehicleModelNode() {
        return (VehicleModelNode)getChildByName("vehicleModelNode");
    }

    @JsMethod
    public VehicleYearNode getVehicleYearNode() {
        return (VehicleYearNode)getChildByName("vehicleYearNode");
    }

    @JsMethod
    public VehicleMarketValueNode getVehicleMarketValueNode() {
        return (VehicleMarketValueNode)getChildByName("vehicleMarketValueNode");
    }

    @JsMethod
    public VehicleOwnershipListNode getOwnershipListNode() {
        return (VehicleOwnershipListNode)getChildByName("ownershipListNode");
    }

    //endregion
    @Override
    protected List<UiNode<?>> createChildren() {
        List<UiNode<?>> children = super.createChildren();
        setChildNodeIdentity("vehicleModelNode");
        children.add(getComponent().createVehicleModelNode());
        setChildNodeIdentity("vehicleYearNode");
        children.add(getComponent().createVehicleYearNode());
        setChildNodeIdentity("vehicleMarketValueNode");
        children.add(getComponent().createVehicleMarketValueNode());
        setChildNodeIdentity("ownershipListNode");
        children.add(getComponent().createVehicleOwnershipListNode());
        setChildNodeIdentity(null);
        return children;
    }

}
