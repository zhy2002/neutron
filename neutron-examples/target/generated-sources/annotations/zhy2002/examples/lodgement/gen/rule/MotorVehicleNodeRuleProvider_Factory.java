package zhy2002.examples.lodgement.gen.rule;

import dagger.MembersInjector;
import dagger.internal.Factory;
import dagger.internal.MembersInjectors;
import javax.annotation.Generated;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class MotorVehicleNodeRuleProvider_Factory
    implements Factory<MotorVehicleNodeRuleProvider> {
  private final MembersInjector<MotorVehicleNodeRuleProvider>
      motorVehicleNodeRuleProviderMembersInjector;

  public MotorVehicleNodeRuleProvider_Factory(
      MembersInjector<MotorVehicleNodeRuleProvider> motorVehicleNodeRuleProviderMembersInjector) {
    assert motorVehicleNodeRuleProviderMembersInjector != null;
    this.motorVehicleNodeRuleProviderMembersInjector = motorVehicleNodeRuleProviderMembersInjector;
  }

  @Override
  public MotorVehicleNodeRuleProvider get() {
    return MembersInjectors.injectMembers(
        motorVehicleNodeRuleProviderMembersInjector, new MotorVehicleNodeRuleProvider());
  }

  public static Factory<MotorVehicleNodeRuleProvider> create(
      MembersInjector<MotorVehicleNodeRuleProvider> motorVehicleNodeRuleProviderMembersInjector) {
    return new MotorVehicleNodeRuleProvider_Factory(motorVehicleNodeRuleProviderMembersInjector);
  }
}
