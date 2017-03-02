package zhy2002.examples.lodgement.gen.node;

import dagger.MembersInjector;
import javax.annotation.Generated;
import javax.inject.Provider;
import zhy2002.examples.lodgement.gen.di.OwnershipNodeComponent;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class OwnershipNode_MembersInjector implements MembersInjector<OwnershipNode> {
  private final Provider<OwnershipNodeChildProvider> providerProvider;

  private final Provider<OwnershipNodeComponent.Builder> builderProvider;

  public OwnershipNode_MembersInjector(
      Provider<OwnershipNodeChildProvider> providerProvider,
      Provider<OwnershipNodeComponent.Builder> builderProvider) {
    assert providerProvider != null;
    this.providerProvider = providerProvider;
    assert builderProvider != null;
    this.builderProvider = builderProvider;
  }

  public static MembersInjector<OwnershipNode> create(
      Provider<OwnershipNodeChildProvider> providerProvider,
      Provider<OwnershipNodeComponent.Builder> builderProvider) {
    return new OwnershipNode_MembersInjector(providerProvider, builderProvider);
  }

  @Override
  public void injectMembers(OwnershipNode instance) {
    if (instance == null) {
      throw new NullPointerException("Cannot inject members into a null reference");
    }
    instance.receiveNodeProvider(providerProvider.get());
    instance.createComponent(builderProvider.get());
  }

  public static void injectReceiveNodeProvider(
      OwnershipNode instance, Provider<OwnershipNodeChildProvider> providerProvider) {
    instance.receiveNodeProvider(providerProvider.get());
  }

  public static void injectCreateComponent(
      OwnershipNode instance, Provider<OwnershipNodeComponent.Builder> builderProvider) {
    instance.createComponent(builderProvider.get());
  }
}
