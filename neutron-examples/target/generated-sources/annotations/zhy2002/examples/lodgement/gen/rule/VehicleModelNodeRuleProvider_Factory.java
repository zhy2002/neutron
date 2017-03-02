package zhy2002.examples.lodgement.gen.rule;

import dagger.MembersInjector;
import dagger.internal.Factory;
import dagger.internal.MembersInjectors;
import javax.annotation.Generated;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class VehicleModelNodeRuleProvider_Factory
    implements Factory<VehicleModelNodeRuleProvider> {
  private final MembersInjector<VehicleModelNodeRuleProvider>
      vehicleModelNodeRuleProviderMembersInjector;

  public VehicleModelNodeRuleProvider_Factory(
      MembersInjector<VehicleModelNodeRuleProvider> vehicleModelNodeRuleProviderMembersInjector) {
    assert vehicleModelNodeRuleProviderMembersInjector != null;
    this.vehicleModelNodeRuleProviderMembersInjector = vehicleModelNodeRuleProviderMembersInjector;
  }

  @Override
  public VehicleModelNodeRuleProvider get() {
    return MembersInjectors.injectMembers(
        vehicleModelNodeRuleProviderMembersInjector, new VehicleModelNodeRuleProvider());
  }

  public static Factory<VehicleModelNodeRuleProvider> create(
      MembersInjector<VehicleModelNodeRuleProvider> vehicleModelNodeRuleProviderMembersInjector) {
    return new VehicleModelNodeRuleProvider_Factory(vehicleModelNodeRuleProviderMembersInjector);
  }
}
