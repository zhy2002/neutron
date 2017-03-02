package zhy2002.examples.lodgement.gen.node;

import dagger.MembersInjector;
import dagger.internal.Factory;
import dagger.internal.MembersInjectors;
import javax.annotation.Generated;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class SelectAccountHolderListNodeItemProvider_Factory
    implements Factory<SelectAccountHolderListNodeItemProvider> {
  private final MembersInjector<SelectAccountHolderListNodeItemProvider>
      selectAccountHolderListNodeItemProviderMembersInjector;

  public SelectAccountHolderListNodeItemProvider_Factory(
      MembersInjector<SelectAccountHolderListNodeItemProvider>
          selectAccountHolderListNodeItemProviderMembersInjector) {
    assert selectAccountHolderListNodeItemProviderMembersInjector != null;
    this.selectAccountHolderListNodeItemProviderMembersInjector =
        selectAccountHolderListNodeItemProviderMembersInjector;
  }

  @Override
  public SelectAccountHolderListNodeItemProvider get() {
    return MembersInjectors.injectMembers(
        selectAccountHolderListNodeItemProviderMembersInjector,
        new SelectAccountHolderListNodeItemProvider());
  }

  public static Factory<SelectAccountHolderListNodeItemProvider> create(
      MembersInjector<SelectAccountHolderListNodeItemProvider>
          selectAccountHolderListNodeItemProviderMembersInjector) {
    return new SelectAccountHolderListNodeItemProvider_Factory(
        selectAccountHolderListNodeItemProviderMembersInjector);
  }
}
