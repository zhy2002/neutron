package zhy2002.examples.lodgement.gen.node;

import dagger.MembersInjector;
import javax.annotation.Generated;
import javax.inject.Provider;
import zhy2002.neutron.ParentUiNode;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class AddressNode_MembersInjector<P extends ParentUiNode<?>>
    implements MembersInjector<AddressNode<P>> {
  private final Provider<AddressNodeChildProvider> providerProvider;

  public AddressNode_MembersInjector(Provider<AddressNodeChildProvider> providerProvider) {
    assert providerProvider != null;
    this.providerProvider = providerProvider;
  }

  public static <P extends ParentUiNode<?>> MembersInjector<AddressNode<P>> create(
      Provider<AddressNodeChildProvider> providerProvider) {
    return new AddressNode_MembersInjector<P>(providerProvider);
  }

  @Override
  public void injectMembers(AddressNode<P> instance) {
    if (instance == null) {
      throw new NullPointerException("Cannot inject members into a null reference");
    }
    instance.receiveNodeProvider(providerProvider.get());
  }

  public static <P extends ParentUiNode<?>> void injectReceiveNodeProvider(
      AddressNode<P> instance, Provider<AddressNodeChildProvider> providerProvider) {
    instance.receiveNodeProvider(providerProvider.get());
  }
}
