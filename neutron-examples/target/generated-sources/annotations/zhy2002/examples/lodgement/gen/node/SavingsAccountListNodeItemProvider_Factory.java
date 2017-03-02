package zhy2002.examples.lodgement.gen.node;

import dagger.MembersInjector;
import dagger.internal.Factory;
import dagger.internal.MembersInjectors;
import javax.annotation.Generated;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class SavingsAccountListNodeItemProvider_Factory
    implements Factory<SavingsAccountListNodeItemProvider> {
  private final MembersInjector<SavingsAccountListNodeItemProvider>
      savingsAccountListNodeItemProviderMembersInjector;

  public SavingsAccountListNodeItemProvider_Factory(
      MembersInjector<SavingsAccountListNodeItemProvider>
          savingsAccountListNodeItemProviderMembersInjector) {
    assert savingsAccountListNodeItemProviderMembersInjector != null;
    this.savingsAccountListNodeItemProviderMembersInjector =
        savingsAccountListNodeItemProviderMembersInjector;
  }

  @Override
  public SavingsAccountListNodeItemProvider get() {
    return MembersInjectors.injectMembers(
        savingsAccountListNodeItemProviderMembersInjector,
        new SavingsAccountListNodeItemProvider());
  }

  public static Factory<SavingsAccountListNodeItemProvider> create(
      MembersInjector<SavingsAccountListNodeItemProvider>
          savingsAccountListNodeItemProviderMembersInjector) {
    return new SavingsAccountListNodeItemProvider_Factory(
        savingsAccountListNodeItemProviderMembersInjector);
  }
}
