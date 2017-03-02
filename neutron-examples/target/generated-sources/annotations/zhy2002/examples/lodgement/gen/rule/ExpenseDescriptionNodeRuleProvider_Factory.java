package zhy2002.examples.lodgement.gen.rule;

import dagger.MembersInjector;
import dagger.internal.Factory;
import dagger.internal.MembersInjectors;
import javax.annotation.Generated;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class ExpenseDescriptionNodeRuleProvider_Factory
    implements Factory<ExpenseDescriptionNodeRuleProvider> {
  private final MembersInjector<ExpenseDescriptionNodeRuleProvider>
      expenseDescriptionNodeRuleProviderMembersInjector;

  public ExpenseDescriptionNodeRuleProvider_Factory(
      MembersInjector<ExpenseDescriptionNodeRuleProvider>
          expenseDescriptionNodeRuleProviderMembersInjector) {
    assert expenseDescriptionNodeRuleProviderMembersInjector != null;
    this.expenseDescriptionNodeRuleProviderMembersInjector =
        expenseDescriptionNodeRuleProviderMembersInjector;
  }

  @Override
  public ExpenseDescriptionNodeRuleProvider get() {
    return MembersInjectors.injectMembers(
        expenseDescriptionNodeRuleProviderMembersInjector,
        new ExpenseDescriptionNodeRuleProvider());
  }

  public static Factory<ExpenseDescriptionNodeRuleProvider> create(
      MembersInjector<ExpenseDescriptionNodeRuleProvider>
          expenseDescriptionNodeRuleProviderMembersInjector) {
    return new ExpenseDescriptionNodeRuleProvider_Factory(
        expenseDescriptionNodeRuleProviderMembersInjector);
  }
}
