package zhy2002.examples.lodgement.gen.node;

import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import zhy2002.examples.lodgement.gen.di.PropertyNodeComponent;
import jsinterop.annotations.*;
import java.math.BigDecimal;
import javax.inject.*;
import zhy2002.neutron.di.*;
import java.util.*;
import zhy2002.examples.lodgement.gen.rule.*;
import zhy2002.examples.lodgement.gen.di.*;
import java.util.List;


public class PropertyNode extends ObjectUiNode<RealEstateNode> {

    @Inject
    protected PropertyNode(@Owner RealEstateNode parent) {
        super(parent);
    }

    @Override
    public final Class<?> getConcreteClass() {
    return PropertyNode.class;
    }

    protected final PropertyNodeComponent getComponent() {
        return component;
    }


    private PropertyNodeComponent component;

    @Inject
    void createComponent(PropertyNodeComponent.Builder builder) {
        this.component = builder.setPropertyNodeModule(new PropertyNodeModule(this)).build();
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
    public RentedFlagNode getRentedFlagNode() {
        return (RentedFlagNode)getChildByName("rentedFlagNode");
    }

    @JsMethod
    public PropertyWeeklyRentNode getPropertyWeeklyRentNode() {
        return (PropertyWeeklyRentNode)getChildByName("propertyWeeklyRentNode");
    }

    @JsMethod
    public PropertyAddressNode getPropertyAddressNode() {
        return (PropertyAddressNode)getChildByName("propertyAddressNode");
    }

    @JsMethod
    public EstimatedMarketValueNode getEstimatedMarketValueNode() {
        return (EstimatedMarketValueNode)getChildByName("estimatedMarketValueNode");
    }

    @JsMethod
    public ContractPriceNode getContractPriceNode() {
        return (ContractPriceNode)getChildByName("contractPriceNode");
    }

    @JsMethod
    public DefenseServiceFlagNode getDefenseServiceFlagNode() {
        return (DefenseServiceFlagNode)getChildByName("defenseServiceFlagNode");
    }

    @JsMethod
    public PropertyTypeNode getPropertyTypeNode() {
        return (PropertyTypeNode)getChildByName("propertyTypeNode");
    }

    @JsMethod
    public PropertySubTypeNode getPropertySubTypeNode() {
        return (PropertySubTypeNode)getChildByName("propertySubTypeNode");
    }

    @JsMethod
    public PropertyPurseNode getPropertyPurseNode() {
        return (PropertyPurseNode)getChildByName("propertyPurseNode");
    }

    @JsMethod
    public PropertyOwnershipListNode getPropertyOwnershipListNode() {
        return (PropertyOwnershipListNode)getChildByName("propertyOwnershipListNode");
    }

    //endregion
    @Override
    protected List<UiNode<?>> createChildren() {
        List<UiNode<?>> children = super.createChildren();
        setChildNodeIdentity("rentedFlagNode");
        children.add(getComponent().createRentedFlagNode());
        setChildNodeIdentity("propertyWeeklyRentNode");
        children.add(getComponent().createPropertyWeeklyRentNode());
        setChildNodeIdentity("propertyAddressNode");
        children.add(getComponent().createPropertyAddressNode());
        setChildNodeIdentity("estimatedMarketValueNode");
        children.add(getComponent().createEstimatedMarketValueNode());
        setChildNodeIdentity("contractPriceNode");
        children.add(getComponent().createContractPriceNode());
        setChildNodeIdentity("defenseServiceFlagNode");
        children.add(getComponent().createDefenseServiceFlagNode());
        setChildNodeIdentity("propertyTypeNode");
        children.add(getComponent().createPropertyTypeNode());
        setChildNodeIdentity("propertySubTypeNode");
        children.add(getComponent().createPropertySubTypeNode());
        setChildNodeIdentity("propertyPurseNode");
        children.add(getComponent().createPropertyPurseNode());
        setChildNodeIdentity("propertyOwnershipListNode");
        children.add(getComponent().createPropertyOwnershipListNode());
        setChildNodeIdentity(null);
        return children;
    }

}
