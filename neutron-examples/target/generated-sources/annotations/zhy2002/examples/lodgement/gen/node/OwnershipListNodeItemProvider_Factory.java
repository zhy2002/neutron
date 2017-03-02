package zhy2002.examples.lodgement.gen.node;

import dagger.MembersInjector;
import dagger.internal.Factory;
import dagger.internal.MembersInjectors;
import javax.annotation.Generated;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class OwnershipListNodeItemProvider_Factory
    implements Factory<OwnershipListNodeItemProvider> {
  private final MembersInjector<OwnershipListNodeItemProvider>
      ownershipListNodeItemProviderMembersInjector;

  public OwnershipListNodeItemProvider_Factory(
      MembersInjector<OwnershipListNodeItemProvider> ownershipListNodeItemProviderMembersInjector) {
    assert ownershipListNodeItemProviderMembersInjector != null;
    this.ownershipListNodeItemProviderMembersInjector =
        ownershipListNodeItemProviderMembersInjector;
  }

  @Override
  public OwnershipListNodeItemProvider get() {
    return MembersInjectors.injectMembers(
        ownershipListNodeItemProviderMembersInjector, new OwnershipListNodeItemProvider());
  }

  public static Factory<OwnershipListNodeItemProvider> create(
      MembersInjector<OwnershipListNodeItemProvider> ownershipListNodeItemProviderMembersInjector) {
    return new OwnershipListNodeItemProvider_Factory(ownershipListNodeItemProviderMembersInjector);
  }
}
