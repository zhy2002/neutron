package zhy2002.examples.lodgement.gen.rule;

import dagger.MembersInjector;
import dagger.internal.Factory;
import dagger.internal.MembersInjectors;
import javax.annotation.Generated;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class CurrentEmploymentNodeRuleProvider_Factory
    implements Factory<CurrentEmploymentNodeRuleProvider> {
  private final MembersInjector<CurrentEmploymentNodeRuleProvider>
      currentEmploymentNodeRuleProviderMembersInjector;

  public CurrentEmploymentNodeRuleProvider_Factory(
      MembersInjector<CurrentEmploymentNodeRuleProvider>
          currentEmploymentNodeRuleProviderMembersInjector) {
    assert currentEmploymentNodeRuleProviderMembersInjector != null;
    this.currentEmploymentNodeRuleProviderMembersInjector =
        currentEmploymentNodeRuleProviderMembersInjector;
  }

  @Override
  public CurrentEmploymentNodeRuleProvider get() {
    return MembersInjectors.injectMembers(
        currentEmploymentNodeRuleProviderMembersInjector, new CurrentEmploymentNodeRuleProvider());
  }

  public static Factory<CurrentEmploymentNodeRuleProvider> create(
      MembersInjector<CurrentEmploymentNodeRuleProvider>
          currentEmploymentNodeRuleProviderMembersInjector) {
    return new CurrentEmploymentNodeRuleProvider_Factory(
        currentEmploymentNodeRuleProviderMembersInjector);
  }
}
