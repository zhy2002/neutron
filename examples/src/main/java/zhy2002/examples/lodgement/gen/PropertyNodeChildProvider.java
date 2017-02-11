package zhy2002.examples.lodgement.gen;

import dagger.MembersInjector;
import javax.inject.Inject;
import javax.inject.Singleton;


interface PropertyNodeChildFactory {
    RentedFlagNode createRentedFlagNode();
    PropertyWeeklyRentNode createPropertyWeeklyRentNode();
    PropertyAddressNode createPropertyAddressNode();
    EstimatedMarketValueNode createEstimatedMarketValueNode();
    ContractPriceNode createContractPriceNode();
    DefenseServiceFlagNode createDefenseServiceFlagNode();
    PropertyTypeNode createPropertyTypeNode();
    PropertySubTypeNode createPropertySubTypeNode();
    PropertyPurseNode createPropertyPurseNode();
}

@Singleton
public class PropertyNodeChildProvider {
    @Inject
    MembersInjector<RentedFlagNode> rentedFlagNodeInjector;
    @Inject
    MembersInjector<PropertyWeeklyRentNode> propertyWeeklyRentNodeInjector;
    @Inject
    MembersInjector<PropertyAddressNode> propertyAddressNodeInjector;
    @Inject
    MembersInjector<EstimatedMarketValueNode> estimatedMarketValueNodeInjector;
    @Inject
    MembersInjector<ContractPriceNode> contractPriceNodeInjector;
    @Inject
    MembersInjector<DefenseServiceFlagNode> defenseServiceFlagNodeInjector;
    @Inject
    MembersInjector<PropertyTypeNode> propertyTypeNodeInjector;
    @Inject
    MembersInjector<PropertySubTypeNode> propertySubTypeNodeInjector;
    @Inject
    MembersInjector<PropertyPurseNode> propertyPurseNodeInjector;

    @Inject
    protected PropertyNodeChildProvider () {}

    protected MembersInjector<RentedFlagNode> getRentedFlagNodeInjector() {
        return this.rentedFlagNodeInjector;
    }

    protected MembersInjector<PropertyWeeklyRentNode> getPropertyWeeklyRentNodeInjector() {
        return this.propertyWeeklyRentNodeInjector;
    }

    protected MembersInjector<PropertyAddressNode> getPropertyAddressNodeInjector() {
        return this.propertyAddressNodeInjector;
    }

    protected MembersInjector<EstimatedMarketValueNode> getEstimatedMarketValueNodeInjector() {
        return this.estimatedMarketValueNodeInjector;
    }

    protected MembersInjector<ContractPriceNode> getContractPriceNodeInjector() {
        return this.contractPriceNodeInjector;
    }

    protected MembersInjector<DefenseServiceFlagNode> getDefenseServiceFlagNodeInjector() {
        return this.defenseServiceFlagNodeInjector;
    }

    protected MembersInjector<PropertyTypeNode> getPropertyTypeNodeInjector() {
        return this.propertyTypeNodeInjector;
    }

    protected MembersInjector<PropertySubTypeNode> getPropertySubTypeNodeInjector() {
        return this.propertySubTypeNodeInjector;
    }

    protected MembersInjector<PropertyPurseNode> getPropertyPurseNodeInjector() {
        return this.propertyPurseNodeInjector;
    }

    protected RentedFlagNode newRentedFlagNode(
        PropertyNode parent,
        String name
    ) {
        return new RentedFlagNode(parent, name);
    }

    protected void configureRentedFlagNode(RentedFlagNode node) {
    }

    protected PropertyWeeklyRentNode newPropertyWeeklyRentNode(
        PropertyNode parent,
        String name
    ) {
        return new PropertyWeeklyRentNode(parent, name);
    }

    protected void configurePropertyWeeklyRentNode(PropertyWeeklyRentNode node) {
    }

    protected PropertyAddressNode newPropertyAddressNode(
        PropertyNode parent,
        String name
    ) {
        return new PropertyAddressNode(parent, name);
    }

    protected void configurePropertyAddressNode(PropertyAddressNode node) {
    }

    protected EstimatedMarketValueNode newEstimatedMarketValueNode(
        PropertyNode parent,
        String name
    ) {
        return new EstimatedMarketValueNode(parent, name);
    }

    protected void configureEstimatedMarketValueNode(EstimatedMarketValueNode node) {
    }

    protected ContractPriceNode newContractPriceNode(
        PropertyNode parent,
        String name
    ) {
        return new ContractPriceNode(parent, name);
    }

    protected void configureContractPriceNode(ContractPriceNode node) {
    }

    protected DefenseServiceFlagNode newDefenseServiceFlagNode(
        PropertyNode parent,
        String name
    ) {
        return new DefenseServiceFlagNode(parent, name);
    }

    protected void configureDefenseServiceFlagNode(DefenseServiceFlagNode node) {
    }

    protected PropertyTypeNode newPropertyTypeNode(
        PropertyNode parent,
        String name
    ) {
        return new PropertyTypeNode(parent, name);
    }

    protected void configurePropertyTypeNode(PropertyTypeNode node) {
    }

    protected PropertySubTypeNode newPropertySubTypeNode(
        PropertyNode parent,
        String name
    ) {
        return new PropertySubTypeNode(parent, name);
    }

    protected void configurePropertySubTypeNode(PropertySubTypeNode node) {
    }

    protected PropertyPurseNode newPropertyPurseNode(
        PropertyNode parent,
        String name
    ) {
        return new PropertyPurseNode(parent, name);
    }

    protected void configurePropertyPurseNode(PropertyPurseNode node) {
    }

    PropertyNodeChildFactory createFactory(PropertyNode parent) {
        return new PropertyNodeChildFactoryImpl(parent);
    }

    private class PropertyNodeChildFactoryImpl implements PropertyNodeChildFactory {

        private final PropertyNode parent;
        
        private PropertyNodeChildFactoryImpl(PropertyNode parent) {
            this.parent = parent;
        }

        @Override
        public RentedFlagNode createRentedFlagNode() {
            RentedFlagNode node = newRentedFlagNode(parent, "rentedFlagNode");
            rentedFlagNodeInjector.injectMembers(node);
            configureRentedFlagNode(node);
            return node;
        }

        @Override
        public PropertyWeeklyRentNode createPropertyWeeklyRentNode() {
            PropertyWeeklyRentNode node = newPropertyWeeklyRentNode(parent, "propertyWeeklyRentNode");
            propertyWeeklyRentNodeInjector.injectMembers(node);
            configurePropertyWeeklyRentNode(node);
            return node;
        }

        @Override
        public PropertyAddressNode createPropertyAddressNode() {
            PropertyAddressNode node = newPropertyAddressNode(parent, "propertyAddressNode");
            propertyAddressNodeInjector.injectMembers(node);
            configurePropertyAddressNode(node);
            return node;
        }

        @Override
        public EstimatedMarketValueNode createEstimatedMarketValueNode() {
            EstimatedMarketValueNode node = newEstimatedMarketValueNode(parent, "estimatedMarketValueNode");
            estimatedMarketValueNodeInjector.injectMembers(node);
            configureEstimatedMarketValueNode(node);
            return node;
        }

        @Override
        public ContractPriceNode createContractPriceNode() {
            ContractPriceNode node = newContractPriceNode(parent, "contractPriceNode");
            contractPriceNodeInjector.injectMembers(node);
            configureContractPriceNode(node);
            return node;
        }

        @Override
        public DefenseServiceFlagNode createDefenseServiceFlagNode() {
            DefenseServiceFlagNode node = newDefenseServiceFlagNode(parent, "defenseServiceFlagNode");
            defenseServiceFlagNodeInjector.injectMembers(node);
            configureDefenseServiceFlagNode(node);
            return node;
        }

        @Override
        public PropertyTypeNode createPropertyTypeNode() {
            PropertyTypeNode node = newPropertyTypeNode(parent, "propertyTypeNode");
            propertyTypeNodeInjector.injectMembers(node);
            configurePropertyTypeNode(node);
            return node;
        }

        @Override
        public PropertySubTypeNode createPropertySubTypeNode() {
            PropertySubTypeNode node = newPropertySubTypeNode(parent, "propertySubTypeNode");
            propertySubTypeNodeInjector.injectMembers(node);
            configurePropertySubTypeNode(node);
            return node;
        }

        @Override
        public PropertyPurseNode createPropertyPurseNode() {
            PropertyPurseNode node = newPropertyPurseNode(parent, "propertyPurseNode");
            propertyPurseNodeInjector.injectMembers(node);
            configurePropertyPurseNode(node);
            return node;
        }

    }
}
