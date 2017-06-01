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
    public MotorVehicleNode(@Owner MotorVehicleListNode parent, @ChildName String name) {
        super(parent, name);
    }

    @Override
    public final Class<?> getConcreteClass() {
    return MotorVehicleNode.class;
    }

    private MotorVehicleNodeChildFactory childFactory;

    @Inject
    void receiveNodeProvider(MotorVehicleNodeChildProvider provider) {
        childFactory = provider.createFactory(this);
    }



    protected final MotorVehicleNodeComponent getComponent() {
        return component;
    }


    private MotorVehicleNodeComponent component;

    @Inject
    void createComponent(MotorVehicleNodeComponent.Builder builder) {
        this.component = builder.setMotorVehicleNodeModule(new MotorVehicleNodeModule(this)).build();
    }

    private RuleProvider<MotorVehicleNode> getRuleProvider() {
        return component.getMotorVehicleNodeRuleProvider();
    }

    @Override
    protected void initializeState() {
        getRuleProvider().initializeState(this);
    }

    @Override
    protected void createRules(List<UiNodeRule<?>> createdRules) {
        getRuleProvider().createRules(createdRules);
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
        children.add(getComponent().createOwnershipListNode());
        setChildNodeIdentity(null);
        return children;
    }

}
