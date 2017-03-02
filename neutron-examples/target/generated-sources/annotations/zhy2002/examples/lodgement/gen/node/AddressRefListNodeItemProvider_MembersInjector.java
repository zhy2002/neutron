package zhy2002.examples.lodgement.gen.node;

import dagger.MembersInjector;
import javax.annotation.Generated;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class AddressRefListNodeItemProvider_MembersInjector
    implements MembersInjector<AddressRefListNodeItemProvider> {
  private final MembersInjector<AddressRefNode> addressRefNodeInjectorMembersInjector;

  public AddressRefListNodeItemProvider_MembersInjector(
      MembersInjector<AddressRefNode> addressRefNodeInjectorMembersInjector) {
    assert addressRefNodeInjectorMembersInjector != null;
    this.addressRefNodeInjectorMembersInjector = addressRefNodeInjectorMembersInjector;
  }

  public static MembersInjector<AddressRefListNodeItemProvider> create(
      MembersInjector<AddressRefNode> addressRefNodeInjectorMembersInjector) {
    return new AddressRefListNodeItemProvider_MembersInjector(
        addressRefNodeInjectorMembersInjector);
  }

  @Override
  public void injectMembers(AddressRefListNodeItemProvider instance) {
    if (instance == null) {
      throw new NullPointerException("Cannot inject members into a null reference");
    }
    instance.addressRefNodeInjector = addressRefNodeInjectorMembersInjector;
  }

  public static void injectAddressRefNodeInjector(
      AddressRefListNodeItemProvider instance,
      MembersInjector<AddressRefNode> addressRefNodeInjector) {
    instance.addressRefNodeInjector = addressRefNodeInjector;
  }
}
