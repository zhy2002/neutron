package zhy2002.examples.lodgement.gen.node;

import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import jsinterop.annotations.*;
import java.math.BigDecimal;
import javax.inject.*;
import javax.validation.constraints.NotNull;
import java.util.*;
import zhy2002.examples.lodgement.gen.rule.*;
import zhy2002.examples.lodgement.gen.di.*;
import java.util.List;

public class PropertyNode extends ObjectUiNode<RealEstateNode> {

    private PropertyNodeChildFactory childFactory;

    @Inject
    void receiveNodeProvider(PropertyNodeChildProvider provider) {
        childFactory = provider.createFactory(this);
    }

    @Override
    public final Class<?> getConcreteClass() {
        return PropertyNode.class;
    }

    private PropertyNodeComponent component;

    @Inject
    void createComponent(PropertyNodeComponent.Builder builder) {
        this.component = builder.setPropertyNodeModule(new PropertyNodeModule(this)).build();
    }

    private RuleProvider<PropertyNode> getRuleProvider() {
        return component.getPropertyNodeRuleProvider();
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

    private RuleProvider<PropertyNode> getInstanceRuleProvider() {
        return component.getInstanceRuleProviders().get(this.getName());
    }


    public PropertyNode(@NotNull RealEstateNode parent, String name) {
        super(parent, name);
    }

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

    @Override
    protected List<UiNode<?>> createChildren() {
        List<UiNode<?>> children = super.createChildren();
        setChildNodeIdentity("rentedFlagNode");
        children.add(childFactory.createRentedFlagNode());
        setChildNodeIdentity("propertyWeeklyRentNode");
        children.add(childFactory.createPropertyWeeklyRentNode());
        setChildNodeIdentity("propertyAddressNode");
        children.add(childFactory.createPropertyAddressNode());
        setChildNodeIdentity("estimatedMarketValueNode");
        children.add(childFactory.createEstimatedMarketValueNode());
        setChildNodeIdentity("contractPriceNode");
        children.add(childFactory.createContractPriceNode());
        setChildNodeIdentity("defenseServiceFlagNode");
        children.add(childFactory.createDefenseServiceFlagNode());
        setChildNodeIdentity("propertyTypeNode");
        children.add(childFactory.createPropertyTypeNode());
        setChildNodeIdentity("propertySubTypeNode");
        children.add(childFactory.createPropertySubTypeNode());
        setChildNodeIdentity("propertyPurseNode");
        children.add(childFactory.createPropertyPurseNode());
        setChildNodeIdentity("propertyOwnershipListNode");
        children.add(childFactory.createPropertyOwnershipListNode());
        setChildNodeIdentity(null);
        return children;
    }

}
