package zhy2002.examples.lodgement.gen.node;

import dagger.MembersInjector;
import dagger.internal.Factory;
import dagger.internal.MembersInjectors;
import javax.annotation.Generated;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class MotorVehicleListNodeItemProvider_Factory
    implements Factory<MotorVehicleListNodeItemProvider> {
  private final MembersInjector<MotorVehicleListNodeItemProvider>
      motorVehicleListNodeItemProviderMembersInjector;

  public MotorVehicleListNodeItemProvider_Factory(
      MembersInjector<MotorVehicleListNodeItemProvider>
          motorVehicleListNodeItemProviderMembersInjector) {
    assert motorVehicleListNodeItemProviderMembersInjector != null;
    this.motorVehicleListNodeItemProviderMembersInjector =
        motorVehicleListNodeItemProviderMembersInjector;
  }

  @Override
  public MotorVehicleListNodeItemProvider get() {
    return MembersInjectors.injectMembers(
        motorVehicleListNodeItemProviderMembersInjector, new MotorVehicleListNodeItemProvider());
  }

  public static Factory<MotorVehicleListNodeItemProvider> create(
      MembersInjector<MotorVehicleListNodeItemProvider>
          motorVehicleListNodeItemProviderMembersInjector) {
    return new MotorVehicleListNodeItemProvider_Factory(
        motorVehicleListNodeItemProviderMembersInjector);
  }
}
