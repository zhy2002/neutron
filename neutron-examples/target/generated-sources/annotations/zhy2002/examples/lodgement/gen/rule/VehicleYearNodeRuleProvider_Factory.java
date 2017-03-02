package zhy2002.examples.lodgement.gen.rule;

import dagger.MembersInjector;
import dagger.internal.Factory;
import dagger.internal.MembersInjectors;
import javax.annotation.Generated;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class VehicleYearNodeRuleProvider_Factory
    implements Factory<VehicleYearNodeRuleProvider> {
  private final MembersInjector<VehicleYearNodeRuleProvider>
      vehicleYearNodeRuleProviderMembersInjector;

  public VehicleYearNodeRuleProvider_Factory(
      MembersInjector<VehicleYearNodeRuleProvider> vehicleYearNodeRuleProviderMembersInjector) {
    assert vehicleYearNodeRuleProviderMembersInjector != null;
    this.vehicleYearNodeRuleProviderMembersInjector = vehicleYearNodeRuleProviderMembersInjector;
  }

  @Override
  public VehicleYearNodeRuleProvider get() {
    return MembersInjectors.injectMembers(
        vehicleYearNodeRuleProviderMembersInjector, new VehicleYearNodeRuleProvider());
  }

  public static Factory<VehicleYearNodeRuleProvider> create(
      MembersInjector<VehicleYearNodeRuleProvider> vehicleYearNodeRuleProviderMembersInjector) {
    return new VehicleYearNodeRuleProvider_Factory(vehicleYearNodeRuleProviderMembersInjector);
  }
}
