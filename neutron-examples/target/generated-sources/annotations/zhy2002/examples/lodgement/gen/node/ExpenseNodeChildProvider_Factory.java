package zhy2002.examples.lodgement.gen.node;

import dagger.MembersInjector;
import dagger.internal.Factory;
import dagger.internal.MembersInjectors;
import javax.annotation.Generated;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class ExpenseNodeChildProvider_Factory implements Factory<ExpenseNodeChildProvider> {
  private final MembersInjector<ExpenseNodeChildProvider> expenseNodeChildProviderMembersInjector;

  public ExpenseNodeChildProvider_Factory(
      MembersInjector<ExpenseNodeChildProvider> expenseNodeChildProviderMembersInjector) {
    assert expenseNodeChildProviderMembersInjector != null;
    this.expenseNodeChildProviderMembersInjector = expenseNodeChildProviderMembersInjector;
  }

  @Override
  public ExpenseNodeChildProvider get() {
    return MembersInjectors.injectMembers(
        expenseNodeChildProviderMembersInjector, new ExpenseNodeChildProvider());
  }

  public static Factory<ExpenseNodeChildProvider> create(
      MembersInjector<ExpenseNodeChildProvider> expenseNodeChildProviderMembersInjector) {
    return new ExpenseNodeChildProvider_Factory(expenseNodeChildProviderMembersInjector);
  }
}
