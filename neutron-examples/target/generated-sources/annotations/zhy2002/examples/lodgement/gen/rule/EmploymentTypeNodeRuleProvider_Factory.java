package zhy2002.examples.lodgement.gen.rule;

import dagger.MembersInjector;
import dagger.internal.Factory;
import dagger.internal.MembersInjectors;
import javax.annotation.Generated;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class EmploymentTypeNodeRuleProvider_Factory
    implements Factory<EmploymentTypeNodeRuleProvider> {
  private final MembersInjector<EmploymentTypeNodeRuleProvider>
      employmentTypeNodeRuleProviderMembersInjector;

  public EmploymentTypeNodeRuleProvider_Factory(
      MembersInjector<EmploymentTypeNodeRuleProvider>
          employmentTypeNodeRuleProviderMembersInjector) {
    assert employmentTypeNodeRuleProviderMembersInjector != null;
    this.employmentTypeNodeRuleProviderMembersInjector =
        employmentTypeNodeRuleProviderMembersInjector;
  }

  @Override
  public EmploymentTypeNodeRuleProvider get() {
    return MembersInjectors.injectMembers(
        employmentTypeNodeRuleProviderMembersInjector, new EmploymentTypeNodeRuleProvider());
  }

  public static Factory<EmploymentTypeNodeRuleProvider> create(
      MembersInjector<EmploymentTypeNodeRuleProvider>
          employmentTypeNodeRuleProviderMembersInjector) {
    return new EmploymentTypeNodeRuleProvider_Factory(
        employmentTypeNodeRuleProviderMembersInjector);
  }
}
