package zhy2002.examples.lodgement.gen.node;

import dagger.MembersInjector;
import javax.annotation.Generated;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class MotorVehicleListNodeItemProvider_MembersInjector
    implements MembersInjector<MotorVehicleListNodeItemProvider> {
  private final MembersInjector<MotorVehicleNode> motorVehicleNodeInjectorMembersInjector;

  public MotorVehicleListNodeItemProvider_MembersInjector(
      MembersInjector<MotorVehicleNode> motorVehicleNodeInjectorMembersInjector) {
    assert motorVehicleNodeInjectorMembersInjector != null;
    this.motorVehicleNodeInjectorMembersInjector = motorVehicleNodeInjectorMembersInjector;
  }

  public static MembersInjector<MotorVehicleListNodeItemProvider> create(
      MembersInjector<MotorVehicleNode> motorVehicleNodeInjectorMembersInjector) {
    return new MotorVehicleListNodeItemProvider_MembersInjector(
        motorVehicleNodeInjectorMembersInjector);
  }

  @Override
  public void injectMembers(MotorVehicleListNodeItemProvider instance) {
    if (instance == null) {
      throw new NullPointerException("Cannot inject members into a null reference");
    }
    instance.motorVehicleNodeInjector = motorVehicleNodeInjectorMembersInjector;
  }

  public static void injectMotorVehicleNodeInjector(
      MotorVehicleListNodeItemProvider instance,
      MembersInjector<MotorVehicleNode> motorVehicleNodeInjector) {
    instance.motorVehicleNodeInjector = motorVehicleNodeInjector;
  }
}
