package zhy2002.examples.lodgement.gen.rule;

import dagger.MembersInjector;
import dagger.internal.Factory;
import dagger.internal.MembersInjectors;
import javax.annotation.Generated;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class EmployerPhoneNodeRuleProvider_Factory
    implements Factory<EmployerPhoneNodeRuleProvider> {
  private final MembersInjector<EmployerPhoneNodeRuleProvider>
      employerPhoneNodeRuleProviderMembersInjector;

  public EmployerPhoneNodeRuleProvider_Factory(
      MembersInjector<EmployerPhoneNodeRuleProvider> employerPhoneNodeRuleProviderMembersInjector) {
    assert employerPhoneNodeRuleProviderMembersInjector != null;
    this.employerPhoneNodeRuleProviderMembersInjector =
        employerPhoneNodeRuleProviderMembersInjector;
  }

  @Override
  public EmployerPhoneNodeRuleProvider get() {
    return MembersInjectors.injectMembers(
        employerPhoneNodeRuleProviderMembersInjector, new EmployerPhoneNodeRuleProvider());
  }

  public static Factory<EmployerPhoneNodeRuleProvider> create(
      MembersInjector<EmployerPhoneNodeRuleProvider> employerPhoneNodeRuleProviderMembersInjector) {
    return new EmployerPhoneNodeRuleProvider_Factory(employerPhoneNodeRuleProviderMembersInjector);
  }
}
