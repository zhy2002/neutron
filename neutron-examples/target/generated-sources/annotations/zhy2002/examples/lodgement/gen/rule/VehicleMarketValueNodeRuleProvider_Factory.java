package zhy2002.examples.lodgement.gen.rule;

import dagger.MembersInjector;
import dagger.internal.Factory;
import dagger.internal.MembersInjectors;
import javax.annotation.Generated;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class VehicleMarketValueNodeRuleProvider_Factory
    implements Factory<VehicleMarketValueNodeRuleProvider> {
  private final MembersInjector<VehicleMarketValueNodeRuleProvider>
      vehicleMarketValueNodeRuleProviderMembersInjector;

  public VehicleMarketValueNodeRuleProvider_Factory(
      MembersInjector<VehicleMarketValueNodeRuleProvider>
          vehicleMarketValueNodeRuleProviderMembersInjector) {
    assert vehicleMarketValueNodeRuleProviderMembersInjector != null;
    this.vehicleMarketValueNodeRuleProviderMembersInjector =
        vehicleMarketValueNodeRuleProviderMembersInjector;
  }

  @Override
  public VehicleMarketValueNodeRuleProvider get() {
    return MembersInjectors.injectMembers(
        vehicleMarketValueNodeRuleProviderMembersInjector,
        new VehicleMarketValueNodeRuleProvider());
  }

  public static Factory<VehicleMarketValueNodeRuleProvider> create(
      MembersInjector<VehicleMarketValueNodeRuleProvider>
          vehicleMarketValueNodeRuleProviderMembersInjector) {
    return new VehicleMarketValueNodeRuleProvider_Factory(
        vehicleMarketValueNodeRuleProviderMembersInjector);
  }
}
