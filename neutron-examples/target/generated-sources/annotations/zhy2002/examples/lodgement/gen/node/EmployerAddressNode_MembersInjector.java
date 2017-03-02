package zhy2002.examples.lodgement.gen.node;

import dagger.MembersInjector;
import javax.annotation.Generated;
import javax.inject.Provider;
import zhy2002.examples.lodgement.gen.di.EmployerAddressNodeComponent;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class EmployerAddressNode_MembersInjector
    implements MembersInjector<EmployerAddressNode> {
  private final Provider<AddressNodeChildProvider> providerProvider;

  private final Provider<EmployerAddressNodeComponent.Builder> builderProvider;

  public EmployerAddressNode_MembersInjector(
      Provider<AddressNodeChildProvider> providerProvider,
      Provider<EmployerAddressNodeComponent.Builder> builderProvider) {
    assert providerProvider != null;
    this.providerProvider = providerProvider;
    assert builderProvider != null;
    this.builderProvider = builderProvider;
  }

  public static MembersInjector<EmployerAddressNode> create(
      Provider<AddressNodeChildProvider> providerProvider,
      Provider<EmployerAddressNodeComponent.Builder> builderProvider) {
    return new EmployerAddressNode_MembersInjector(providerProvider, builderProvider);
  }

  @Override
  public void injectMembers(EmployerAddressNode instance) {
    if (instance == null) {
      throw new NullPointerException("Cannot inject members into a null reference");
    }
    ((AddressNode) instance).receiveNodeProvider(providerProvider.get());
    instance.createComponent(builderProvider.get());
  }

  public static void injectCreateComponent(
      EmployerAddressNode instance,
      Provider<EmployerAddressNodeComponent.Builder> builderProvider) {
    instance.createComponent(builderProvider.get());
  }
}
