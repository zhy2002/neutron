package zhy2002.examples.lodgement.gen.rule;

import dagger.MembersInjector;
import dagger.internal.Factory;
import dagger.internal.MembersInjectors;
import javax.annotation.Generated;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class EmployerAddressNodeRuleProvider_Factory
    implements Factory<EmployerAddressNodeRuleProvider> {
  private final MembersInjector<EmployerAddressNodeRuleProvider>
      employerAddressNodeRuleProviderMembersInjector;

  public EmployerAddressNodeRuleProvider_Factory(
      MembersInjector<EmployerAddressNodeRuleProvider>
          employerAddressNodeRuleProviderMembersInjector) {
    assert employerAddressNodeRuleProviderMembersInjector != null;
    this.employerAddressNodeRuleProviderMembersInjector =
        employerAddressNodeRuleProviderMembersInjector;
  }

  @Override
  public EmployerAddressNodeRuleProvider get() {
    return MembersInjectors.injectMembers(
        employerAddressNodeRuleProviderMembersInjector, new EmployerAddressNodeRuleProvider());
  }

  public static Factory<EmployerAddressNodeRuleProvider> create(
      MembersInjector<EmployerAddressNodeRuleProvider>
          employerAddressNodeRuleProviderMembersInjector) {
    return new EmployerAddressNodeRuleProvider_Factory(
        employerAddressNodeRuleProviderMembersInjector);
  }
}
