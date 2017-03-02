package zhy2002.examples.lodgement.gen.node;

import dagger.MembersInjector;
import dagger.internal.Factory;
import dagger.internal.MembersInjectors;
import javax.annotation.Generated;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class ExpenseListNodeItemProvider_Factory
    implements Factory<ExpenseListNodeItemProvider> {
  private final MembersInjector<ExpenseListNodeItemProvider>
      expenseListNodeItemProviderMembersInjector;

  public ExpenseListNodeItemProvider_Factory(
      MembersInjector<ExpenseListNodeItemProvider> expenseListNodeItemProviderMembersInjector) {
    assert expenseListNodeItemProviderMembersInjector != null;
    this.expenseListNodeItemProviderMembersInjector = expenseListNodeItemProviderMembersInjector;
  }

  @Override
  public ExpenseListNodeItemProvider get() {
    return MembersInjectors.injectMembers(
        expenseListNodeItemProviderMembersInjector, new ExpenseListNodeItemProvider());
  }

  public static Factory<ExpenseListNodeItemProvider> create(
      MembersInjector<ExpenseListNodeItemProvider> expenseListNodeItemProviderMembersInjector) {
    return new ExpenseListNodeItemProvider_Factory(expenseListNodeItemProviderMembersInjector);
  }
}
