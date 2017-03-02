package zhy2002.examples.lodgement.gen.rule;

import dagger.MembersInjector;
import dagger.internal.Factory;
import dagger.internal.MembersInjectors;
import javax.annotation.Generated;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class CurrentEmploymentListNodeRuleProvider_Factory
    implements Factory<CurrentEmploymentListNodeRuleProvider> {
  private final MembersInjector<CurrentEmploymentListNodeRuleProvider>
      currentEmploymentListNodeRuleProviderMembersInjector;

  public CurrentEmploymentListNodeRuleProvider_Factory(
      MembersInjector<CurrentEmploymentListNodeRuleProvider>
          currentEmploymentListNodeRuleProviderMembersInjector) {
    assert currentEmploymentListNodeRuleProviderMembersInjector != null;
    this.currentEmploymentListNodeRuleProviderMembersInjector =
        currentEmploymentListNodeRuleProviderMembersInjector;
  }

  @Override
  public CurrentEmploymentListNodeRuleProvider get() {
    return MembersInjectors.injectMembers(
        currentEmploymentListNodeRuleProviderMembersInjector,
        new CurrentEmploymentListNodeRuleProvider());
  }

  public static Factory<CurrentEmploymentListNodeRuleProvider> create(
      MembersInjector<CurrentEmploymentListNodeRuleProvider>
          currentEmploymentListNodeRuleProviderMembersInjector) {
    return new CurrentEmploymentListNodeRuleProvider_Factory(
        currentEmploymentListNodeRuleProviderMembersInjector);
  }
}
