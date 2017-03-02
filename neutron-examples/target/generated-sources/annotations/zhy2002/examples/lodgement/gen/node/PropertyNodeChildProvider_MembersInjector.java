package zhy2002.examples.lodgement.gen.node;

import dagger.MembersInjector;
import javax.annotation.Generated;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class PropertyNodeChildProvider_MembersInjector
    implements MembersInjector<PropertyNodeChildProvider> {
  private final MembersInjector<PropertyPurseNode> propertyPurseNodeInjectorMembersInjector;

  private final MembersInjector<EstimatedMarketValueNode>
      estimatedMarketValueNodeInjectorMembersInjector;

  private final MembersInjector<PropertyWeeklyRentNode>
      propertyWeeklyRentNodeInjectorMembersInjector;

  private final MembersInjector<PropertyAddressNode> propertyAddressNodeInjectorMembersInjector;

  private final MembersInjector<PropertyOwnershipListNode>
      propertyOwnershipListNodeInjectorMembersInjector;

  private final MembersInjector<RentedFlagNode> rentedFlagNodeInjectorMembersInjector;

  private final MembersInjector<DefenseServiceFlagNode>
      defenseServiceFlagNodeInjectorMembersInjector;

  private final MembersInjector<PropertyTypeNode> propertyTypeNodeInjectorMembersInjector;

  private final MembersInjector<ContractPriceNode> contractPriceNodeInjectorMembersInjector;

  private final MembersInjector<PropertySubTypeNode> propertySubTypeNodeInjectorMembersInjector;

  public PropertyNodeChildProvider_MembersInjector(
      MembersInjector<PropertyPurseNode> propertyPurseNodeInjectorMembersInjector,
      MembersInjector<EstimatedMarketValueNode> estimatedMarketValueNodeInjectorMembersInjector,
      MembersInjector<PropertyWeeklyRentNode> propertyWeeklyRentNodeInjectorMembersInjector,
      MembersInjector<PropertyAddressNode> propertyAddressNodeInjectorMembersInjector,
      MembersInjector<PropertyOwnershipListNode> propertyOwnershipListNodeInjectorMembersInjector,
      MembersInjector<RentedFlagNode> rentedFlagNodeInjectorMembersInjector,
      MembersInjector<DefenseServiceFlagNode> defenseServiceFlagNodeInjectorMembersInjector,
      MembersInjector<PropertyTypeNode> propertyTypeNodeInjectorMembersInjector,
      MembersInjector<ContractPriceNode> contractPriceNodeInjectorMembersInjector,
      MembersInjector<PropertySubTypeNode> propertySubTypeNodeInjectorMembersInjector) {
    assert propertyPurseNodeInjectorMembersInjector != null;
    this.propertyPurseNodeInjectorMembersInjector = propertyPurseNodeInjectorMembersInjector;
    assert estimatedMarketValueNodeInjectorMembersInjector != null;
    this.estimatedMarketValueNodeInjectorMembersInjector =
        estimatedMarketValueNodeInjectorMembersInjector;
    assert propertyWeeklyRentNodeInjectorMembersInjector != null;
    this.propertyWeeklyRentNodeInjectorMembersInjector =
        propertyWeeklyRentNodeInjectorMembersInjector;
    assert propertyAddressNodeInjectorMembersInjector != null;
    this.propertyAddressNodeInjectorMembersInjector = propertyAddressNodeInjectorMembersInjector;
    assert propertyOwnershipListNodeInjectorMembersInjector != null;
    this.propertyOwnershipListNodeInjectorMembersInjector =
        propertyOwnershipListNodeInjectorMembersInjector;
    assert rentedFlagNodeInjectorMembersInjector != null;
    this.rentedFlagNodeInjectorMembersInjector = rentedFlagNodeInjectorMembersInjector;
    assert defenseServiceFlagNodeInjectorMembersInjector != null;
    this.defenseServiceFlagNodeInjectorMembersInjector =
        defenseServiceFlagNodeInjectorMembersInjector;
    assert propertyTypeNodeInjectorMembersInjector != null;
    this.propertyTypeNodeInjectorMembersInjector = propertyTypeNodeInjectorMembersInjector;
    assert contractPriceNodeInjectorMembersInjector != null;
    this.contractPriceNodeInjectorMembersInjector = contractPriceNodeInjectorMembersInjector;
    assert propertySubTypeNodeInjectorMembersInjector != null;
    this.propertySubTypeNodeInjectorMembersInjector = propertySubTypeNodeInjectorMembersInjector;
  }

  public static MembersInjector<PropertyNodeChildProvider> create(
      MembersInjector<PropertyPurseNode> propertyPurseNodeInjectorMembersInjector,
      MembersInjector<EstimatedMarketValueNode> estimatedMarketValueNodeInjectorMembersInjector,
      MembersInjector<PropertyWeeklyRentNode> propertyWeeklyRentNodeInjectorMembersInjector,
      MembersInjector<PropertyAddressNode> propertyAddressNodeInjectorMembersInjector,
      MembersInjector<PropertyOwnershipListNode> propertyOwnershipListNodeInjectorMembersInjector,
      MembersInjector<RentedFlagNode> rentedFlagNodeInjectorMembersInjector,
      MembersInjector<DefenseServiceFlagNode> defenseServiceFlagNodeInjectorMembersInjector,
      MembersInjector<PropertyTypeNode> propertyTypeNodeInjectorMembersInjector,
      MembersInjector<ContractPriceNode> contractPriceNodeInjectorMembersInjector,
      MembersInjector<PropertySubTypeNode> propertySubTypeNodeInjectorMembersInjector) {
    return new PropertyNodeChildProvider_MembersInjector(
        propertyPurseNodeInjectorMembersInjector,
        estimatedMarketValueNodeInjectorMembersInjector,
        propertyWeeklyRentNodeInjectorMembersInjector,
        propertyAddressNodeInjectorMembersInjector,
        propertyOwnershipListNodeInjectorMembersInjector,
        rentedFlagNodeInjectorMembersInjector,
        defenseServiceFlagNodeInjectorMembersInjector,
        propertyTypeNodeInjectorMembersInjector,
        contractPriceNodeInjectorMembersInjector,
        propertySubTypeNodeInjectorMembersInjector);
  }

  @Override
  public void injectMembers(PropertyNodeChildProvider instance) {
    if (instance == null) {
      throw new NullPointerException("Cannot inject members into a null reference");
    }
    instance.propertyPurseNodeInjector = propertyPurseNodeInjectorMembersInjector;
    instance.estimatedMarketValueNodeInjector = estimatedMarketValueNodeInjectorMembersInjector;
    instance.propertyWeeklyRentNodeInjector = propertyWeeklyRentNodeInjectorMembersInjector;
    instance.propertyAddressNodeInjector = propertyAddressNodeInjectorMembersInjector;
    instance.propertyOwnershipListNodeInjector = propertyOwnershipListNodeInjectorMembersInjector;
    instance.rentedFlagNodeInjector = rentedFlagNodeInjectorMembersInjector;
    instance.defenseServiceFlagNodeInjector = defenseServiceFlagNodeInjectorMembersInjector;
    instance.propertyTypeNodeInjector = propertyTypeNodeInjectorMembersInjector;
    instance.contractPriceNodeInjector = contractPriceNodeInjectorMembersInjector;
    instance.propertySubTypeNodeInjector = propertySubTypeNodeInjectorMembersInjector;
  }

  public static void injectPropertyPurseNodeInjector(
      PropertyNodeChildProvider instance,
      MembersInjector<PropertyPurseNode> propertyPurseNodeInjector) {
    instance.propertyPurseNodeInjector = propertyPurseNodeInjector;
  }

  public static void injectEstimatedMarketValueNodeInjector(
      PropertyNodeChildProvider instance,
      MembersInjector<EstimatedMarketValueNode> estimatedMarketValueNodeInjector) {
    instance.estimatedMarketValueNodeInjector = estimatedMarketValueNodeInjector;
  }

  public static void injectPropertyWeeklyRentNodeInjector(
      PropertyNodeChildProvider instance,
      MembersInjector<PropertyWeeklyRentNode> propertyWeeklyRentNodeInjector) {
    instance.propertyWeeklyRentNodeInjector = propertyWeeklyRentNodeInjector;
  }

  public static void injectPropertyAddressNodeInjector(
      PropertyNodeChildProvider instance,
      MembersInjector<PropertyAddressNode> propertyAddressNodeInjector) {
    instance.propertyAddressNodeInjector = propertyAddressNodeInjector;
  }

  public static void injectPropertyOwnershipListNodeInjector(
      PropertyNodeChildProvider instance,
      MembersInjector<PropertyOwnershipListNode> propertyOwnershipListNodeInjector) {
    instance.propertyOwnershipListNodeInjector = propertyOwnershipListNodeInjector;
  }

  public static void injectRentedFlagNodeInjector(
      PropertyNodeChildProvider instance, MembersInjector<RentedFlagNode> rentedFlagNodeInjector) {
    instance.rentedFlagNodeInjector = rentedFlagNodeInjector;
  }

  public static void injectDefenseServiceFlagNodeInjector(
      PropertyNodeChildProvider instance,
      MembersInjector<DefenseServiceFlagNode> defenseServiceFlagNodeInjector) {
    instance.defenseServiceFlagNodeInjector = defenseServiceFlagNodeInjector;
  }

  public static void injectPropertyTypeNodeInjector(
      PropertyNodeChildProvider instance,
      MembersInjector<PropertyTypeNode> propertyTypeNodeInjector) {
    instance.propertyTypeNodeInjector = propertyTypeNodeInjector;
  }

  public static void injectContractPriceNodeInjector(
      PropertyNodeChildProvider instance,
      MembersInjector<ContractPriceNode> contractPriceNodeInjector) {
    instance.contractPriceNodeInjector = contractPriceNodeInjector;
  }

  public static void injectPropertySubTypeNodeInjector(
      PropertyNodeChildProvider instance,
      MembersInjector<PropertySubTypeNode> propertySubTypeNodeInjector) {
    instance.propertySubTypeNodeInjector = propertySubTypeNodeInjector;
  }
}
