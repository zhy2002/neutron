package zhy2002.examples.lodgement.gen.node;

import dagger.MembersInjector;
import dagger.internal.Factory;
import dagger.internal.MembersInjectors;
import javax.annotation.Generated;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class OwnershipNodeChildProvider_Factory
    implements Factory<OwnershipNodeChildProvider> {
  private final MembersInjector<OwnershipNodeChildProvider>
      ownershipNodeChildProviderMembersInjector;

  public OwnershipNodeChildProvider_Factory(
      MembersInjector<OwnershipNodeChildProvider> ownershipNodeChildProviderMembersInjector) {
    assert ownershipNodeChildProviderMembersInjector != null;
    this.ownershipNodeChildProviderMembersInjector = ownershipNodeChildProviderMembersInjector;
  }

  @Override
  public OwnershipNodeChildProvider get() {
    return MembersInjectors.injectMembers(
        ownershipNodeChildProviderMembersInjector, new OwnershipNodeChildProvider());
  }

  public static Factory<OwnershipNodeChildProvider> create(
      MembersInjector<OwnershipNodeChildProvider> ownershipNodeChildProviderMembersInjector) {
    return new OwnershipNodeChildProvider_Factory(ownershipNodeChildProviderMembersInjector);
  }
}
