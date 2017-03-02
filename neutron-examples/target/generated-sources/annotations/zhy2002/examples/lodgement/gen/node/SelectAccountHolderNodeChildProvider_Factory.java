package zhy2002.examples.lodgement.gen.node;

import dagger.MembersInjector;
import dagger.internal.Factory;
import dagger.internal.MembersInjectors;
import javax.annotation.Generated;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class SelectAccountHolderNodeChildProvider_Factory
    implements Factory<SelectAccountHolderNodeChildProvider> {
  private final MembersInjector<SelectAccountHolderNodeChildProvider>
      selectAccountHolderNodeChildProviderMembersInjector;

  public SelectAccountHolderNodeChildProvider_Factory(
      MembersInjector<SelectAccountHolderNodeChildProvider>
          selectAccountHolderNodeChildProviderMembersInjector) {
    assert selectAccountHolderNodeChildProviderMembersInjector != null;
    this.selectAccountHolderNodeChildProviderMembersInjector =
        selectAccountHolderNodeChildProviderMembersInjector;
  }

  @Override
  public SelectAccountHolderNodeChildProvider get() {
    return MembersInjectors.injectMembers(
        selectAccountHolderNodeChildProviderMembersInjector,
        new SelectAccountHolderNodeChildProvider());
  }

  public static Factory<SelectAccountHolderNodeChildProvider> create(
      MembersInjector<SelectAccountHolderNodeChildProvider>
          selectAccountHolderNodeChildProviderMembersInjector) {
    return new SelectAccountHolderNodeChildProvider_Factory(
        selectAccountHolderNodeChildProviderMembersInjector);
  }
}
