package zhy2002.examples.lodgement.gen.node;

import dagger.MembersInjector;
import javax.annotation.Generated;
import javax.inject.Provider;
import zhy2002.neutron.ParentUiNode;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class BaseTrustNode_MembersInjector<P extends ParentUiNode<?>>
    implements MembersInjector<BaseTrustNode<P>> {
  private final Provider<BaseTrustNodeChildProvider> providerProvider;

  public BaseTrustNode_MembersInjector(Provider<BaseTrustNodeChildProvider> providerProvider) {
    assert providerProvider != null;
    this.providerProvider = providerProvider;
  }

  public static <P extends ParentUiNode<?>> MembersInjector<BaseTrustNode<P>> create(
      Provider<BaseTrustNodeChildProvider> providerProvider) {
    return new BaseTrustNode_MembersInjector<P>(providerProvider);
  }

  @Override
  public void injectMembers(BaseTrustNode<P> instance) {
    if (instance == null) {
      throw new NullPointerException("Cannot inject members into a null reference");
    }
    instance.receiveNodeProvider(providerProvider.get());
  }

  public static <P extends ParentUiNode<?>> void injectReceiveNodeProvider(
      BaseTrustNode<P> instance, Provider<BaseTrustNodeChildProvider> providerProvider) {
    instance.receiveNodeProvider(providerProvider.get());
  }
}
