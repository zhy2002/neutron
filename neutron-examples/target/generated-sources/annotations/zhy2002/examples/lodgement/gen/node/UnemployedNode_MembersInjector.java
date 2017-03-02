package zhy2002.examples.lodgement.gen.node;

import dagger.MembersInjector;
import javax.annotation.Generated;
import javax.inject.Provider;
import zhy2002.examples.lodgement.gen.di.UnemployedNodeComponent;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class UnemployedNode_MembersInjector implements MembersInjector<UnemployedNode> {
  private final Provider<UnemployedNodeChildProvider> providerProvider;

  private final Provider<UnemployedNodeComponent.Builder> builderProvider;

  public UnemployedNode_MembersInjector(
      Provider<UnemployedNodeChildProvider> providerProvider,
      Provider<UnemployedNodeComponent.Builder> builderProvider) {
    assert providerProvider != null;
    this.providerProvider = providerProvider;
    assert builderProvider != null;
    this.builderProvider = builderProvider;
  }

  public static MembersInjector<UnemployedNode> create(
      Provider<UnemployedNodeChildProvider> providerProvider,
      Provider<UnemployedNodeComponent.Builder> builderProvider) {
    return new UnemployedNode_MembersInjector(providerProvider, builderProvider);
  }

  @Override
  public void injectMembers(UnemployedNode instance) {
    if (instance == null) {
      throw new NullPointerException("Cannot inject members into a null reference");
    }
    instance.receiveNodeProvider(providerProvider.get());
    instance.createComponent(builderProvider.get());
  }

  public static void injectReceiveNodeProvider(
      UnemployedNode instance, Provider<UnemployedNodeChildProvider> providerProvider) {
    instance.receiveNodeProvider(providerProvider.get());
  }

  public static void injectCreateComponent(
      UnemployedNode instance, Provider<UnemployedNodeComponent.Builder> builderProvider) {
    instance.createComponent(builderProvider.get());
  }
}
