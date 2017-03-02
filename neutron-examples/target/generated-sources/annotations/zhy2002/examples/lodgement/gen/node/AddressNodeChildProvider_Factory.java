package zhy2002.examples.lodgement.gen.node;

import dagger.MembersInjector;
import dagger.internal.Factory;
import dagger.internal.MembersInjectors;
import javax.annotation.Generated;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class AddressNodeChildProvider_Factory implements Factory<AddressNodeChildProvider> {
  private final MembersInjector<AddressNodeChildProvider> addressNodeChildProviderMembersInjector;

  public AddressNodeChildProvider_Factory(
      MembersInjector<AddressNodeChildProvider> addressNodeChildProviderMembersInjector) {
    assert addressNodeChildProviderMembersInjector != null;
    this.addressNodeChildProviderMembersInjector = addressNodeChildProviderMembersInjector;
  }

  @Override
  public AddressNodeChildProvider get() {
    return MembersInjectors.injectMembers(
        addressNodeChildProviderMembersInjector, new AddressNodeChildProvider());
  }

  public static Factory<AddressNodeChildProvider> create(
      MembersInjector<AddressNodeChildProvider> addressNodeChildProviderMembersInjector) {
    return new AddressNodeChildProvider_Factory(addressNodeChildProviderMembersInjector);
  }
}
