package zhy2002.examples.lodgement.gen.node;

import dagger.MembersInjector;
import javax.annotation.Generated;
import javax.inject.Provider;
import zhy2002.examples.lodgement.gen.di.PropertyAddressNodeComponent;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class PropertyAddressNode_MembersInjector
    implements MembersInjector<PropertyAddressNode> {
  private final Provider<AddressNodeChildProvider> providerProvider;

  private final Provider<PropertyAddressNodeComponent.Builder> builderProvider;

  public PropertyAddressNode_MembersInjector(
      Provider<AddressNodeChildProvider> providerProvider,
      Provider<PropertyAddressNodeComponent.Builder> builderProvider) {
    assert providerProvider != null;
    this.providerProvider = providerProvider;
    assert builderProvider != null;
    this.builderProvider = builderProvider;
  }

  public static MembersInjector<PropertyAddressNode> create(
      Provider<AddressNodeChildProvider> providerProvider,
      Provider<PropertyAddressNodeComponent.Builder> builderProvider) {
    return new PropertyAddressNode_MembersInjector(providerProvider, builderProvider);
  }

  @Override
  public void injectMembers(PropertyAddressNode instance) {
    if (instance == null) {
      throw new NullPointerException("Cannot inject members into a null reference");
    }
    ((AddressNode) instance).receiveNodeProvider(providerProvider.get());
    instance.createComponent(builderProvider.get());
  }

  public static void injectCreateComponent(
      PropertyAddressNode instance,
      Provider<PropertyAddressNodeComponent.Builder> builderProvider) {
    instance.createComponent(builderProvider.get());
  }
}
