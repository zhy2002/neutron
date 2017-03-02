package zhy2002.examples.lodgement.gen.node;

import dagger.MembersInjector;
import dagger.internal.Factory;
import dagger.internal.MembersInjectors;
import javax.annotation.Generated;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class SavingsAccountNodeChildProvider_Factory
    implements Factory<SavingsAccountNodeChildProvider> {
  private final MembersInjector<SavingsAccountNodeChildProvider>
      savingsAccountNodeChildProviderMembersInjector;

  public SavingsAccountNodeChildProvider_Factory(
      MembersInjector<SavingsAccountNodeChildProvider>
          savingsAccountNodeChildProviderMembersInjector) {
    assert savingsAccountNodeChildProviderMembersInjector != null;
    this.savingsAccountNodeChildProviderMembersInjector =
        savingsAccountNodeChildProviderMembersInjector;
  }

  @Override
  public SavingsAccountNodeChildProvider get() {
    return MembersInjectors.injectMembers(
        savingsAccountNodeChildProviderMembersInjector, new SavingsAccountNodeChildProvider());
  }

  public static Factory<SavingsAccountNodeChildProvider> create(
      MembersInjector<SavingsAccountNodeChildProvider>
          savingsAccountNodeChildProviderMembersInjector) {
    return new SavingsAccountNodeChildProvider_Factory(
        savingsAccountNodeChildProviderMembersInjector);
  }
}
