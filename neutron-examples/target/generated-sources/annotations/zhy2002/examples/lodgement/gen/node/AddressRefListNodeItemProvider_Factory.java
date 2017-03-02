package zhy2002.examples.lodgement.gen.node;

import dagger.MembersInjector;
import dagger.internal.Factory;
import dagger.internal.MembersInjectors;
import javax.annotation.Generated;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class AddressRefListNodeItemProvider_Factory
    implements Factory<AddressRefListNodeItemProvider> {
  private final MembersInjector<AddressRefListNodeItemProvider>
      addressRefListNodeItemProviderMembersInjector;

  public AddressRefListNodeItemProvider_Factory(
      MembersInjector<AddressRefListNodeItemProvider>
          addressRefListNodeItemProviderMembersInjector) {
    assert addressRefListNodeItemProviderMembersInjector != null;
    this.addressRefListNodeItemProviderMembersInjector =
        addressRefListNodeItemProviderMembersInjector;
  }

  @Override
  public AddressRefListNodeItemProvider get() {
    return MembersInjectors.injectMembers(
        addressRefListNodeItemProviderMembersInjector, new AddressRefListNodeItemProvider());
  }

  public static Factory<AddressRefListNodeItemProvider> create(
      MembersInjector<AddressRefListNodeItemProvider>
          addressRefListNodeItemProviderMembersInjector) {
    return new AddressRefListNodeItemProvider_Factory(
        addressRefListNodeItemProviderMembersInjector);
  }
}
