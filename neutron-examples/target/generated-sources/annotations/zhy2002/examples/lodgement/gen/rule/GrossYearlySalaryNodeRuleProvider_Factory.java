package zhy2002.examples.lodgement.gen.rule;

import dagger.MembersInjector;
import dagger.internal.Factory;
import dagger.internal.MembersInjectors;
import javax.annotation.Generated;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class GrossYearlySalaryNodeRuleProvider_Factory
    implements Factory<GrossYearlySalaryNodeRuleProvider> {
  private final MembersInjector<GrossYearlySalaryNodeRuleProvider>
      grossYearlySalaryNodeRuleProviderMembersInjector;

  public GrossYearlySalaryNodeRuleProvider_Factory(
      MembersInjector<GrossYearlySalaryNodeRuleProvider>
          grossYearlySalaryNodeRuleProviderMembersInjector) {
    assert grossYearlySalaryNodeRuleProviderMembersInjector != null;
    this.grossYearlySalaryNodeRuleProviderMembersInjector =
        grossYearlySalaryNodeRuleProviderMembersInjector;
  }

  @Override
  public GrossYearlySalaryNodeRuleProvider get() {
    return MembersInjectors.injectMembers(
        grossYearlySalaryNodeRuleProviderMembersInjector, new GrossYearlySalaryNodeRuleProvider());
  }

  public static Factory<GrossYearlySalaryNodeRuleProvider> create(
      MembersInjector<GrossYearlySalaryNodeRuleProvider>
          grossYearlySalaryNodeRuleProviderMembersInjector) {
    return new GrossYearlySalaryNodeRuleProvider_Factory(
        grossYearlySalaryNodeRuleProviderMembersInjector);
  }
}
