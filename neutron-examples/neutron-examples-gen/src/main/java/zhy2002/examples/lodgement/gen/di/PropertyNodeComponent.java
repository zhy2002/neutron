package zhy2002.examples.lodgement.gen.di;
import dagger.Subcomponent;
import zhy2002.neutron.di.ComponentScope;
import zhy2002.examples.lodgement.gen.node.*;
import zhy2002.neutron.RuleProvider;
import java.util.*;


@ComponentScope
@Subcomponent(modules = {PropertyNodeModule.class})
public interface PropertyNodeComponent {

    List<RuleProvider<PropertyNode>> provideRuleProviders();

    RentedFlagNode createRentedFlagNode();
    PropertyWeeklyRentNode createPropertyWeeklyRentNode();
    PropertyAddressNode createPropertyAddressNode();
    EstimatedMarketValueNode createEstimatedMarketValueNode();
    ContractPriceNode createContractPriceNode();
    DefenseServiceFlagNode createDefenseServiceFlagNode();
    PropertyTypeNode createPropertyTypeNode();
    PropertySubTypeNode createPropertySubTypeNode();
    PropertyPurseNode createPropertyPurseNode();
    PropertyOwnershipListNode createPropertyOwnershipListNode();

    @Subcomponent.Builder
    interface Builder {

        Builder setPropertyNodeModule(PropertyNodeModule module);

        PropertyNodeComponent build();
    }

}
