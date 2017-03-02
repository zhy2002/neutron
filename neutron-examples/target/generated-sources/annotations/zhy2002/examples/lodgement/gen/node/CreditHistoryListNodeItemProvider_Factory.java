package zhy2002.examples.lodgement.gen.node;

import dagger.MembersInjector;
import dagger.internal.Factory;
import dagger.internal.MembersInjectors;
import javax.annotation.Generated;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class CreditHistoryListNodeItemProvider_Factory
    implements Factory<CreditHistoryListNodeItemProvider> {
  private final MembersInjector<CreditHistoryListNodeItemProvider>
      creditHistoryListNodeItemProviderMembersInjector;

  public CreditHistoryListNodeItemProvider_Factory(
      MembersInjector<CreditHistoryListNodeItemProvider>
          creditHistoryListNodeItemProviderMembersInjector) {
    assert creditHistoryListNodeItemProviderMembersInjector != null;
    this.creditHistoryListNodeItemProviderMembersInjector =
        creditHistoryListNodeItemProviderMembersInjector;
  }

  @Override
  public CreditHistoryListNodeItemProvider get() {
    return MembersInjectors.injectMembers(
        creditHistoryListNodeItemProviderMembersInjector, new CreditHistoryListNodeItemProvider());
  }

  public static Factory<CreditHistoryListNodeItemProvider> create(
      MembersInjector<CreditHistoryListNodeItemProvider>
          creditHistoryListNodeItemProviderMembersInjector) {
    return new CreditHistoryListNodeItemProvider_Factory(
        creditHistoryListNodeItemProviderMembersInjector);
  }
}
