package zhy2002.examples.lodgement.gen.di;
import dagger.*;
import javax.inject.Named;
import zhy2002.examples.lodgement.gen.*;

@Module(subcomponents = {
})
@PropertyNodeChildScope
public class PropertyNodeChildModule {

    private final PropertyNode parent;

    public PropertyNodeChildModule(PropertyNode parent) {
        this.parent = parent;
    }


    @Provides
    @PropertyNodeChildScope
    @Named("rentedFlagNode")
    RentedFlagNode provideRentedFlagNode(
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
        MembersInjector<PropertyPurseNode> injector
    ) {
        PropertyPurseNode node = new PropertyPurseNode(parent, "propertyPurseNode");

        injector.injectMembers(node);
        return node;
    }

}