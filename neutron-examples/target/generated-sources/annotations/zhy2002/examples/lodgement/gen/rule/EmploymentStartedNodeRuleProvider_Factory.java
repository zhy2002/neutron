package zhy2002.examples.lodgement.gen.rule;

import dagger.MembersInjector;
import dagger.internal.Factory;
import dagger.internal.MembersInjectors;
import javax.annotation.Generated;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class EmploymentStartedNodeRuleProvider_Factory
    implements Factory<EmploymentStartedNodeRuleProvider> {
  private final MembersInjector<EmploymentStartedNodeRuleProvider>
      employmentStartedNodeRuleProviderMembersInjector;

  public EmploymentStartedNodeRuleProvider_Factory(
      MembersInjector<EmploymentStartedNodeRuleProvider>
          employmentStartedNodeRuleProviderMembersInjector) {
    assert employmentStartedNodeRuleProviderMembersInjector != null;
    this.employmentStartedNodeRuleProviderMembersInjector =
        employmentStartedNodeRuleProviderMembersInjector;
  }

  @Override
  public EmploymentStartedNodeRuleProvider get() {
    return MembersInjectors.injectMembers(
        employmentStartedNodeRuleProviderMembersInjector, new EmploymentStartedNodeRuleProvider());
  }

  public static Factory<EmploymentStartedNodeRuleProvider> create(
      MembersInjector<EmploymentStartedNodeRuleProvider>
          employmentStartedNodeRuleProviderMembersInjector) {
    return new EmploymentStartedNodeRuleProvider_Factory(
        employmentStartedNodeRuleProviderMembersInjector);
  }
}
