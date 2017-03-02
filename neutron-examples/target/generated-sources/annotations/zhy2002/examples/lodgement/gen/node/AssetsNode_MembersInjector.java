package zhy2002.examples.lodgement.gen.node;

import dagger.MembersInjector;
import javax.annotation.Generated;
import javax.inject.Provider;
import zhy2002.examples.lodgement.gen.di.AssetsNodeComponent;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class AssetsNode_MembersInjector implements MembersInjector<AssetsNode> {
  private final Provider<AssetsNodeChildProvider> providerProvider;

  private final Provider<AssetsNodeComponent.Builder> builderProvider;

  public AssetsNode_MembersInjector(
      Provider<AssetsNodeChildProvider> providerProvider,
      Provider<AssetsNodeComponent.Builder> builderProvider) {
    assert providerProvider != null;
    this.providerProvider = providerProvider;
    assert builderProvider != null;
    this.builderProvider = builderProvider;
  }

  public static MembersInjector<AssetsNode> create(
      Provider<AssetsNodeChildProvider> providerProvider,
      Provider<AssetsNodeComponent.Builder> builderProvider) {
    return new AssetsNode_MembersInjector(providerProvider, builderProvider);
  }

  @Override
  public void injectMembers(AssetsNode instance) {
    if (instance == null) {
      throw new NullPointerException("Cannot inject members into a null reference");
    }
    instance.receiveNodeProvider(providerProvider.get());
    instance.createComponent(builderProvider.get());
  }

  public static void injectReceiveNodeProvider(
      AssetsNode instance, Provider<AssetsNodeChildProvider> providerProvider) {
    instance.receiveNodeProvider(providerProvider.get());
  }

  public static void injectCreateComponent(
      AssetsNode instance, Provider<AssetsNodeComponent.Builder> builderProvider) {
    instance.createComponent(builderProvider.get());
  }
}
