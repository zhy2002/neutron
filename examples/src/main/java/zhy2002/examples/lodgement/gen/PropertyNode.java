package zhy2002.examples.lodgement.gen;

import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import zhy2002.neutron.data.*;
import zhy2002.neutron.util.*;
import jsinterop.annotations.*;
import javax.validation.constraints.NotNull;
import java.util.*;
import java.math.*;
import zhy2002.examples.lodgement.data.*;

public  class PropertyNode extends ObjectUiNode<RealEstateNode>
{
    private RentedFlagNode rentedFlagNode;
    private PropertyWeeklyRentNode propertyWeeklyRentNode;
    private PropertyAddressNode propertyAddressNode;
    private EstimatedMarketValueNode estimatedMarketValueNode;
    private ContractPriceNode contractPriceNode;
    private DefenseServiceFlagNode defenseServiceFlagNode;
    private PropertyTypeNode propertyTypeNode;
    private PropertySubTypeNode propertySubTypeNode;
    private PropertyPurseNode propertyPurseNode;

    public PropertyNode(RealEstateNode parent, String name) {
        super(parent, name);
    }

    @JsMethod
    public RentedFlagNode getRentedFlagNode() {
        return rentedFlagNode;
    }

    @JsMethod
    public PropertyWeeklyRentNode getPropertyWeeklyRentNode() {
        return propertyWeeklyRentNode;
    }

    @JsMethod
    public PropertyAddressNode getPropertyAddressNode() {
        return propertyAddressNode;
    }

    @JsMethod
    public EstimatedMarketValueNode getEstimatedMarketValueNode() {
        return estimatedMarketValueNode;
    }

    @JsMethod
    public ContractPriceNode getContractPriceNode() {
        return contractPriceNode;
    }

    @JsMethod
    public DefenseServiceFlagNode getDefenseServiceFlagNode() {
        return defenseServiceFlagNode;
    }

    @JsMethod
    public PropertyTypeNode getPropertyTypeNode() {
        return propertyTypeNode;
    }

    @JsMethod
    public PropertySubTypeNode getPropertySubTypeNode() {
        return propertySubTypeNode;
    }

    @JsMethod
    public PropertyPurseNode getPropertyPurseNode() {
        return propertyPurseNode;
    }

    @Override
    protected List<UiNode<?>> createChildren() {
        List<UiNode<?>> children = super.createChildren();
        UiNodeContext<?> context = getContext();
        rentedFlagNode = context.createChildNode(RentedFlagNode.class, this, "rentedFlagNode");
        children.add(rentedFlagNode);
        propertyWeeklyRentNode = context.createChildNode(PropertyWeeklyRentNode.class, this, "propertyWeeklyRentNode");
        children.add(propertyWeeklyRentNode);
        propertyAddressNode = context.createChildNode(PropertyAddressNode.class, this, "propertyAddressNode");
        children.add(propertyAddressNode);
        estimatedMarketValueNode = context.createChildNode(EstimatedMarketValueNode.class, this, "estimatedMarketValueNode");
        children.add(estimatedMarketValueNode);
        contractPriceNode = context.createChildNode(ContractPriceNode.class, this, "contractPriceNode");
        children.add(contractPriceNode);
        defenseServiceFlagNode = context.createChildNode(DefenseServiceFlagNode.class, this, "defenseServiceFlagNode");
        children.add(defenseServiceFlagNode);
        propertyTypeNode = context.createChildNode(PropertyTypeNode.class, this, "propertyTypeNode");
        children.add(propertyTypeNode);
        propertySubTypeNode = context.createChildNode(PropertySubTypeNode.class, this, "propertySubTypeNode");
        children.add(propertySubTypeNode);
        propertyPurseNode = context.createChildNode(PropertyPurseNode.class, this, "propertyPurseNode");
        children.add(propertyPurseNode);
        return children;
    }



}
