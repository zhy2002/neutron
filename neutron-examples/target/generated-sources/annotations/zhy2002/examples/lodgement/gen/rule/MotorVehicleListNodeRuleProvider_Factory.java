package zhy2002.examples.lodgement.gen.rule;

import dagger.MembersInjector;
import dagger.internal.Factory;
import dagger.internal.MembersInjectors;
import javax.annotation.Generated;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class MotorVehicleListNodeRuleProvider_Factory
    implements Factory<MotorVehicleListNodeRuleProvider> {
  private final MembersInjector<MotorVehicleListNodeRuleProvider>
      motorVehicleListNodeRuleProviderMembersInjector;

  public MotorVehicleListNodeRuleProvider_Factory(
      MembersInjector<MotorVehicleListNodeRuleProvider>
          motorVehicleListNodeRuleProviderMembersInjector) {
    assert motorVehicleListNodeRuleProviderMembersInjector != null;
    this.motorVehicleListNodeRuleProviderMembersInjector =
        motorVehicleListNodeRuleProviderMembersInjector;
  }

  @Override
  public MotorVehicleListNodeRuleProvider get() {
    return MembersInjectors.injectMembers(
        motorVehicleListNodeRuleProviderMembersInjector, new MotorVehicleListNodeRuleProvider());
  }

  public static Factory<MotorVehicleListNodeRuleProvider> create(
      MembersInjector<MotorVehicleListNodeRuleProvider>
          motorVehicleListNodeRuleProviderMembersInjector) {
    return new MotorVehicleListNodeRuleProvider_Factory(
        motorVehicleListNodeRuleProviderMembersInjector);
  }
}
