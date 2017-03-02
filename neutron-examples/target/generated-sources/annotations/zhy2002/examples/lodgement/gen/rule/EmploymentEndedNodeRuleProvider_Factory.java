package zhy2002.examples.lodgement.gen.rule;

import dagger.MembersInjector;
import dagger.internal.Factory;
import dagger.internal.MembersInjectors;
import javax.annotation.Generated;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class EmploymentEndedNodeRuleProvider_Factory
    implements Factory<EmploymentEndedNodeRuleProvider> {
  private final MembersInjector<EmploymentEndedNodeRuleProvider>
      employmentEndedNodeRuleProviderMembersInjector;

  public EmploymentEndedNodeRuleProvider_Factory(
      MembersInjector<EmploymentEndedNodeRuleProvider>
          employmentEndedNodeRuleProviderMembersInjector) {
    assert employmentEndedNodeRuleProviderMembersInjector != null;
    this.employmentEndedNodeRuleProviderMembersInjector =
        employmentEndedNodeRuleProviderMembersInjector;
  }

  @Override
  public EmploymentEndedNodeRuleProvider get() {
    return MembersInjectors.injectMembers(
        employmentEndedNodeRuleProviderMembersInjector, new EmploymentEndedNodeRuleProvider());
  }

  public static Factory<EmploymentEndedNodeRuleProvider> create(
      MembersInjector<EmploymentEndedNodeRuleProvider>
          employmentEndedNodeRuleProviderMembersInjector) {
    return new EmploymentEndedNodeRuleProvider_Factory(
        employmentEndedNodeRuleProviderMembersInjector);
  }
}
