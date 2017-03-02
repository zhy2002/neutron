package zhy2002.examples.lodgement.gen.rule;

import dagger.MembersInjector;
import dagger.internal.Factory;
import dagger.internal.MembersInjectors;
import javax.annotation.Generated;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class DriversLicenseNodeRuleProvider_Factory
    implements Factory<DriversLicenseNodeRuleProvider> {
  private final MembersInjector<DriversLicenseNodeRuleProvider>
      driversLicenseNodeRuleProviderMembersInjector;

  public DriversLicenseNodeRuleProvider_Factory(
      MembersInjector<DriversLicenseNodeRuleProvider>
          driversLicenseNodeRuleProviderMembersInjector) {
    assert driversLicenseNodeRuleProviderMembersInjector != null;
    this.driversLicenseNodeRuleProviderMembersInjector =
        driversLicenseNodeRuleProviderMembersInjector;
  }

  @Override
  public DriversLicenseNodeRuleProvider get() {
    return MembersInjectors.injectMembers(
        driversLicenseNodeRuleProviderMembersInjector, new DriversLicenseNodeRuleProvider());
  }

  public static Factory<DriversLicenseNodeRuleProvider> create(
      MembersInjector<DriversLicenseNodeRuleProvider>
          driversLicenseNodeRuleProviderMembersInjector) {
    return new DriversLicenseNodeRuleProvider_Factory(
        driversLicenseNodeRuleProviderMembersInjector);
  }
}
