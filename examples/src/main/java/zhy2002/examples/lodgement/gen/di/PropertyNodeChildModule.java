package zhy2002.examples.lodgement.gen.di;
import dagger.*;
import javax.inject.Named;
import zhy2002.examples.lodgement.gen.*;

@Module(subcomponents = {
})
@PropertyNodeChildScope
public class PropertyNodeChildModule {


    @Provides
    @PropertyNodeChildScope
    @Named("rentedFlagNode")
    RentedFlagNode provideRentedFlagNode(
        PropertyNode parent,
        MembersInjector<RentedFlagNode> injector
    ) {
        RentedFlagNode node = new RentedFlagNode(parent, "rentedFlagNode");

        injector.injectMembers(node);
        return node;
    }

    @Provides
    @PropertyNodeChildScope
    @Named("propertyWeeklyRentNode")
    PropertyWeeklyRentNode providePropertyWeeklyRentNode(
        PropertyNode parent,
        MembersInjector<PropertyWeeklyRentNode> injector
    ) {
        PropertyWeeklyRentNode node = new PropertyWeeklyRentNode(parent, "propertyWeeklyRentNode");

        injector.injectMembers(node);
        return node;
    }

    @Provides
    @PropertyNodeChildScope
    @Named("propertyAddressNode")
    PropertyAddressNode providePropertyAddressNode(
        PropertyNode parent,
        MembersInjector<PropertyAddressNode> injector
    ) {
        PropertyAddressNode node = new PropertyAddressNode(parent, "propertyAddressNode");

        injector.injectMembers(node);
        return node;
    }

    @Provides
    @PropertyNodeChildScope
    @Named("estimatedMarketValueNode")
    EstimatedMarketValueNode provideEstimatedMarketValueNode(
        PropertyNode parent,
        MembersInjector<EstimatedMarketValueNode> injector
    ) {
        EstimatedMarketValueNode node = new EstimatedMarketValueNode(parent, "estimatedMarketValueNode");

        injector.injectMembers(node);
        return node;
    }

    @Provides
    @PropertyNodeChildScope
    @Named("contractPriceNode")
    ContractPriceNode provideContractPriceNode(
        PropertyNode parent,
        MembersInjector<ContractPriceNode> injector
    ) {
        ContractPriceNode node = new ContractPriceNode(parent, "contractPriceNode");

        injector.injectMembers(node);
        return node;
    }

    @Provides
    @PropertyNodeChildScope
    @Named("defenseServiceFlagNode")
    DefenseServiceFlagNode provideDefenseServiceFlagNode(
        PropertyNode parent,
        MembersInjector<DefenseServiceFlagNode> injector
    ) {
        DefenseServiceFlagNode node = new DefenseServiceFlagNode(parent, "defenseServiceFlagNode");

        injector.injectMembers(node);
        return node;
    }

    @Provides
    @PropertyNodeChildScope
    @Named("propertyTypeNode")
    PropertyTypeNode providePropertyTypeNode(
        PropertyNode parent,
        MembersInjector<PropertyTypeNode> injector
    ) {
        PropertyTypeNode node = new PropertyTypeNode(parent, "propertyTypeNode");

        injector.injectMembers(node);
        return node;
    }

    @Provides
    @PropertyNodeChildScope
    @Named("propertySubTypeNode")
    PropertySubTypeNode providePropertySubTypeNode(
        PropertyNode parent,
        MembersInjector<PropertySubTypeNode> injector
    ) {
        PropertySubTypeNode node = new PropertySubTypeNode(parent, "propertySubTypeNode");

        injector.injectMembers(node);
        return node;
    }

    @Provides
    @PropertyNodeChildScope
    @Named("propertyPurseNode")
    PropertyPurseNode providePropertyPurseNode(
        PropertyNode parent,
        MembersInjector<PropertyPurseNode> injector
    ) {
        PropertyPurseNode node = new PropertyPurseNode(parent, "propertyPurseNode");

        injector.injectMembers(node);
        return node;
    }

}