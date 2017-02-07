package zhy2002.examples.lodgement.gen.di;
import dagger.Subcomponent;
import javax.inject.Named;
import zhy2002.examples.lodgement.gen.*;

@PropertyNodeChildScope
@Subcomponent(modules = {PropertyNodeChildModule.class})
public interface PropertyNodeChildComponent {

    RentedFlagNode provideRentedFlagNode(@Named("rentedFlagNode") RentedFlagNode impl);
    PropertyWeeklyRentNode providePropertyWeeklyRentNode(@Named("propertyWeeklyRentNode") PropertyWeeklyRentNode impl);
    PropertyAddressNode providePropertyAddressNode(@Named("propertyAddressNode") PropertyAddressNode impl);
    EstimatedMarketValueNode provideEstimatedMarketValueNode(@Named("estimatedMarketValueNode") EstimatedMarketValueNode impl);
    ContractPriceNode provideContractPriceNode(@Named("contractPriceNode") ContractPriceNode impl);
    DefenseServiceFlagNode provideDefenseServiceFlagNode(@Named("defenseServiceFlagNode") DefenseServiceFlagNode impl);
    PropertyTypeNode providePropertyTypeNode(@Named("propertyTypeNode") PropertyTypeNode impl);
    PropertySubTypeNode providePropertySubTypeNode(@Named("propertySubTypeNode") PropertySubTypeNode impl);
    PropertyPurseNode providePropertyPurseNode(@Named("propertyPurseNode") PropertyPurseNode impl);

}
