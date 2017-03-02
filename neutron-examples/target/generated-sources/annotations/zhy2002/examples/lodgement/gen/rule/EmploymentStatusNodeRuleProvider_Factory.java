package zhy2002.examples.lodgement.gen.rule;

import dagger.MembersInjector;
import dagger.internal.Factory;
import dagger.internal.MembersInjectors;
import javax.annotation.Generated;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class EmploymentStatusNodeRuleProvider_Factory
    implements Factory<EmploymentStatusNodeRuleProvider> {
  private final MembersInjector<EmploymentStatusNodeRuleProvider>
      employmentStatusNodeRuleProviderMembersInjector;

  public EmploymentStatusNodeRuleProvider_Factory(
      MembersInjector<EmploymentStatusNodeRuleProvider>
          employmentStatusNodeRuleProviderMembersInjector) {
    assert employmentStatusNodeRuleProviderMembersInjector != null;
    this.employmentStatusNodeRuleProviderMembersInjector =
        employmentStatusNodeRuleProviderMembersInjector;
  }

  @Override
  public EmploymentStatusNodeRuleProvider get() {
    return MembersInjectors.injectMembers(
        employmentStatusNodeRuleProviderMembersInjector, new EmploymentStatusNodeRuleProvider());
  }

  public static Factory<EmploymentStatusNodeRuleProvider> create(
      MembersInjector<EmploymentStatusNodeRuleProvider>
          employmentStatusNodeRuleProviderMembersInjector) {
    return new EmploymentStatusNodeRuleProvider_Factory(
        employmentStatusNodeRuleProviderMembersInjector);
  }
}
