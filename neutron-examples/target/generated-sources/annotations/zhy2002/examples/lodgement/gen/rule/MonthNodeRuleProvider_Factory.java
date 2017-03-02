package zhy2002.examples.lodgement.gen.rule;

import dagger.MembersInjector;
import dagger.internal.Factory;
import dagger.internal.MembersInjectors;
import javax.annotation.Generated;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class MonthNodeRuleProvider_Factory implements Factory<MonthNodeRuleProvider> {
  private final MembersInjector<MonthNodeRuleProvider> monthNodeRuleProviderMembersInjector;

  public MonthNodeRuleProvider_Factory(
      MembersInjector<MonthNodeRuleProvider> monthNodeRuleProviderMembersInjector) {
    assert monthNodeRuleProviderMembersInjector != null;
    this.monthNodeRuleProviderMembersInjector = monthNodeRuleProviderMembersInjector;
  }

  @Override
  public MonthNodeRuleProvider get() {
    return MembersInjectors.injectMembers(
        monthNodeRuleProviderMembersInjector, new MonthNodeRuleProvider());
  }

  public static Factory<MonthNodeRuleProvider> create(
      MembersInjector<MonthNodeRuleProvider> monthNodeRuleProviderMembersInjector) {
    return new MonthNodeRuleProvider_Factory(monthNodeRuleProviderMembersInjector);
  }
}
