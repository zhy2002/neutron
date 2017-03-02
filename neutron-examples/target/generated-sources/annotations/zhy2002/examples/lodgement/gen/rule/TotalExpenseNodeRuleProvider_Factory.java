package zhy2002.examples.lodgement.gen.rule;

import dagger.MembersInjector;
import dagger.internal.Factory;
import dagger.internal.MembersInjectors;
import javax.annotation.Generated;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class TotalExpenseNodeRuleProvider_Factory
    implements Factory<TotalExpenseNodeRuleProvider> {
  private final MembersInjector<TotalExpenseNodeRuleProvider>
      totalExpenseNodeRuleProviderMembersInjector;

  public TotalExpenseNodeRuleProvider_Factory(
      MembersInjector<TotalExpenseNodeRuleProvider> totalExpenseNodeRuleProviderMembersInjector) {
    assert totalExpenseNodeRuleProviderMembersInjector != null;
    this.totalExpenseNodeRuleProviderMembersInjector = totalExpenseNodeRuleProviderMembersInjector;
  }

  @Override
  public TotalExpenseNodeRuleProvider get() {
    return MembersInjectors.injectMembers(
        totalExpenseNodeRuleProviderMembersInjector, new TotalExpenseNodeRuleProvider());
  }

  public static Factory<TotalExpenseNodeRuleProvider> create(
      MembersInjector<TotalExpenseNodeRuleProvider> totalExpenseNodeRuleProviderMembersInjector) {
    return new TotalExpenseNodeRuleProvider_Factory(totalExpenseNodeRuleProviderMembersInjector);
  }
}
