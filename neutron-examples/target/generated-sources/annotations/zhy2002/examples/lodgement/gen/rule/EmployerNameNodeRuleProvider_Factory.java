package zhy2002.examples.lodgement.gen.rule;

import dagger.MembersInjector;
import dagger.internal.Factory;
import dagger.internal.MembersInjectors;
import javax.annotation.Generated;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class EmployerNameNodeRuleProvider_Factory
    implements Factory<EmployerNameNodeRuleProvider> {
  private final MembersInjector<EmployerNameNodeRuleProvider>
      employerNameNodeRuleProviderMembersInjector;

  public EmployerNameNodeRuleProvider_Factory(
      MembersInjector<EmployerNameNodeRuleProvider> employerNameNodeRuleProviderMembersInjector) {
    assert employerNameNodeRuleProviderMembersInjector != null;
    this.employerNameNodeRuleProviderMembersInjector = employerNameNodeRuleProviderMembersInjector;
  }

  @Override
  public EmployerNameNodeRuleProvider get() {
    return MembersInjectors.injectMembers(
        employerNameNodeRuleProviderMembersInjector, new EmployerNameNodeRuleProvider());
  }

  public static Factory<EmployerNameNodeRuleProvider> create(
      MembersInjector<EmployerNameNodeRuleProvider> employerNameNodeRuleProviderMembersInjector) {
    return new EmployerNameNodeRuleProvider_Factory(employerNameNodeRuleProviderMembersInjector);
  }
}
