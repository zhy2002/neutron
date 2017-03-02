package zhy2002.examples.lodgement.gen.node;

import dagger.MembersInjector;
import javax.annotation.Generated;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class MotorVehicleNodeChildProvider_MembersInjector
    implements MembersInjector<MotorVehicleNodeChildProvider> {
  private final MembersInjector<VehicleYearNode> vehicleYearNodeInjectorMembersInjector;

  private final MembersInjector<VehicleModelNode> vehicleModelNodeInjectorMembersInjector;

  private final MembersInjector<VehicleMarketValueNode>
      vehicleMarketValueNodeInjectorMembersInjector;

  public MotorVehicleNodeChildProvider_MembersInjector(
      MembersInjector<VehicleYearNode> vehicleYearNodeInjectorMembersInjector,
      MembersInjector<VehicleModelNode> vehicleModelNodeInjectorMembersInjector,
      MembersInjector<VehicleMarketValueNode> vehicleMarketValueNodeInjectorMembersInjector) {
    assert vehicleYearNodeInjectorMembersInjector != null;
    this.vehicleYearNodeInjectorMembersInjector = vehicleYearNodeInjectorMembersInjector;
    assert vehicleModelNodeInjectorMembersInjector != null;
    this.vehicleModelNodeInjectorMembersInjector = vehicleModelNodeInjectorMembersInjector;
    assert vehicleMarketValueNodeInjectorMembersInjector != null;
    this.vehicleMarketValueNodeInjectorMembersInjector =
        vehicleMarketValueNodeInjectorMembersInjector;
  }

  public static MembersInjector<MotorVehicleNodeChildProvider> create(
      MembersInjector<VehicleYearNode> vehicleYearNodeInjectorMembersInjector,
      MembersInjector<VehicleModelNode> vehicleModelNodeInjectorMembersInjector,
      MembersInjector<VehicleMarketValueNode> vehicleMarketValueNodeInjectorMembersInjector) {
    return new MotorVehicleNodeChildProvider_MembersInjector(
        vehicleYearNodeInjectorMembersInjector,
        vehicleModelNodeInjectorMembersInjector,
        vehicleMarketValueNodeInjectorMembersInjector);
  }

  @Override
  public void injectMembers(MotorVehicleNodeChildProvider instance) {
    if (instance == null) {
      throw new NullPointerException("Cannot inject members into a null reference");
    }
    instance.vehicleYearNodeInjector = vehicleYearNodeInjectorMembersInjector;
    instance.vehicleModelNodeInjector = vehicleModelNodeInjectorMembersInjector;
    instance.vehicleMarketValueNodeInjector = vehicleMarketValueNodeInjectorMembersInjector;
  }

  public static void injectVehicleYearNodeInjector(
      MotorVehicleNodeChildProvider instance,
      MembersInjector<VehicleYearNode> vehicleYearNodeInjector) {
    instance.vehicleYearNodeInjector = vehicleYearNodeInjector;
  }

  public static void injectVehicleModelNodeInjector(
      MotorVehicleNodeChildProvider instance,
      MembersInjector<VehicleModelNode> vehicleModelNodeInjector) {
    instance.vehicleModelNodeInjector = vehicleModelNodeInjector;
  }

  public static void injectVehicleMarketValueNodeInjector(
      MotorVehicleNodeChildProvider instance,
      MembersInjector<VehicleMarketValueNode> vehicleMarketValueNodeInjector) {
    instance.vehicleMarketValueNodeInjector = vehicleMarketValueNodeInjector;
  }
}
