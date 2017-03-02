package zhy2002.examples.lodgement.gen.node;

import dagger.MembersInjector;
import dagger.internal.Factory;
import dagger.internal.MembersInjectors;
import javax.annotation.Generated;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class MotorVehicleNodeChildProvider_Factory
    implements Factory<MotorVehicleNodeChildProvider> {
  private final MembersInjector<MotorVehicleNodeChildProvider>
      motorVehicleNodeChildProviderMembersInjector;

  public MotorVehicleNodeChildProvider_Factory(
      MembersInjector<MotorVehicleNodeChildProvider> motorVehicleNodeChildProviderMembersInjector) {
    assert motorVehicleNodeChildProviderMembersInjector != null;
    this.motorVehicleNodeChildProviderMembersInjector =
        motorVehicleNodeChildProviderMembersInjector;
  }

  @Override
  public MotorVehicleNodeChildProvider get() {
    return MembersInjectors.injectMembers(
        motorVehicleNodeChildProviderMembersInjector, new MotorVehicleNodeChildProvider());
  }

  public static Factory<MotorVehicleNodeChildProvider> create(
      MembersInjector<MotorVehicleNodeChildProvider> motorVehicleNodeChildProviderMembersInjector) {
    return new MotorVehicleNodeChildProvider_Factory(motorVehicleNodeChildProviderMembersInjector);
  }
}
