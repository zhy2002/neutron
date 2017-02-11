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

public class PropertyNode extends ObjectUiNode<RealEstateNode>
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

    private PropertyNodeChildFactory childFactory;

    @Inject
    void receiveNodeProvider(PropertyNodeChildProvider provider) {
        childFactory = provider.createFactory(this);
    }

    @Inject
    void receiveClassRegistry(ClassRegistryImpl classRegistry) {
        UiNodeConfig<PropertyNode> config = classRegistry.getUiNodeConfig(PropertyNode.class, getName());
        if (config != null) {
            this.setStatusListener(new ConfigBindingNodeStatusListener<>(this, config));
        }
    }

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
        rentedFlagNode = childFactory.createRentedFlagNode();
        children.add(rentedFlagNode);
        propertyWeeklyRentNode = childFactory.createPropertyWeeklyRentNode();
        children.add(propertyWeeklyRentNode);
        propertyAddressNode = childFactory.createPropertyAddressNode();
        children.add(propertyAddressNode);
        estimatedMarketValueNode = childFactory.createEstimatedMarketValueNode();
        children.add(estimatedMarketValueNode);
        contractPriceNode = childFactory.createContractPriceNode();
        children.add(contractPriceNode);
        defenseServiceFlagNode = childFactory.createDefenseServiceFlagNode();
        children.add(defenseServiceFlagNode);
        propertyTypeNode = childFactory.createPropertyTypeNode();
        children.add(propertyTypeNode);
        propertySubTypeNode = childFactory.createPropertySubTypeNode();
        children.add(propertySubTypeNode);
        propertyPurseNode = childFactory.createPropertyPurseNode();
        children.add(propertyPurseNode);
        return children;
    }

}
