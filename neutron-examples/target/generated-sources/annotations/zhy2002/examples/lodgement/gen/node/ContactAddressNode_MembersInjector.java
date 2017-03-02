package zhy2002.examples.lodgement.gen.node;

import dagger.MembersInjector;
import javax.annotation.Generated;
import javax.inject.Provider;
import zhy2002.examples.lodgement.gen.di.ContactAddressNodeComponent;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class ContactAddressNode_MembersInjector
    implements MembersInjector<ContactAddressNode> {
  private final Provider<AddressNodeChildProvider> providerProvider;

  private final Provider<ContactAddressNodeComponent.Builder> builderProvider;

  public ContactAddressNode_MembersInjector(
      Provider<AddressNodeChildProvider> providerProvider,
      Provider<ContactAddressNodeComponent.Builder> builderProvider) {
    assert providerProvider != null;
    this.providerProvider = providerProvider;
    assert builderProvider != null;
    this.builderProvider = builderProvider;
  }

  public static MembersInjector<ContactAddressNode> create(
      Provider<AddressNodeChildProvider> providerProvider,
      Provider<ContactAddressNodeComponent.Builder> builderProvider) {
    return new ContactAddressNode_MembersInjector(providerProvider, builderProvider);
  }

  @Override
  public void injectMembers(ContactAddressNode instance) {
    if (instance == null) {
      throw new NullPointerException("Cannot inject members into a null reference");
    }
    ((AddressNode) instance).receiveNodeProvider(providerProvider.get());
    instance.createComponent(builderProvider.get());
  }

  public static void injectCreateComponent(
      ContactAddressNode instance, Provider<ContactAddressNodeComponent.Builder> builderProvider) {
    instance.createComponent(builderProvider.get());
  }
}
