package zhy2002.examples.lodgement.gen.node;

import dagger.MembersInjector;
import javax.annotation.Generated;
import javax.inject.Provider;
import zhy2002.examples.lodgement.gen.di.ThirdPartyAddressNodeComponent;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class ThirdPartyAddressNode_MembersInjector
    implements MembersInjector<ThirdPartyAddressNode> {
  private final Provider<AddressNodeChildProvider> providerProvider;

  private final Provider<ThirdPartyAddressNodeComponent.Builder> builderProvider;

  public ThirdPartyAddressNode_MembersInjector(
      Provider<AddressNodeChildProvider> providerProvider,
      Provider<ThirdPartyAddressNodeComponent.Builder> builderProvider) {
    assert providerProvider != null;
    this.providerProvider = providerProvider;
    assert builderProvider != null;
    this.builderProvider = builderProvider;
  }

  public static MembersInjector<ThirdPartyAddressNode> create(
      Provider<AddressNodeChildProvider> providerProvider,
      Provider<ThirdPartyAddressNodeComponent.Builder> builderProvider) {
    return new ThirdPartyAddressNode_MembersInjector(providerProvider, builderProvider);
  }

  @Override
  public void injectMembers(ThirdPartyAddressNode instance) {
    if (instance == null) {
      throw new NullPointerException("Cannot inject members into a null reference");
    }
    ((AddressNode) instance).receiveNodeProvider(providerProvider.get());
    instance.createComponent(builderProvider.get());
  }

  public static void injectCreateComponent(
      ThirdPartyAddressNode instance,
      Provider<ThirdPartyAddressNodeComponent.Builder> builderProvider) {
    instance.createComponent(builderProvider.get());
  }
}
