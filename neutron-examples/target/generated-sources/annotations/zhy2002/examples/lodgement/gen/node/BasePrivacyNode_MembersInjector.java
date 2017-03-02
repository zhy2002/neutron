package zhy2002.examples.lodgement.gen.node;

import dagger.MembersInjector;
import javax.annotation.Generated;
import javax.inject.Provider;
import zhy2002.neutron.ParentUiNode;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class BasePrivacyNode_MembersInjector<P extends ParentUiNode<?>>
    implements MembersInjector<BasePrivacyNode<P>> {
  private final Provider<BasePrivacyNodeChildProvider> providerProvider;

  public BasePrivacyNode_MembersInjector(Provider<BasePrivacyNodeChildProvider> providerProvider) {
    assert providerProvider != null;
    this.providerProvider = providerProvider;
  }

  public static <P extends ParentUiNode<?>> MembersInjector<BasePrivacyNode<P>> create(
      Provider<BasePrivacyNodeChildProvider> providerProvider) {
    return new BasePrivacyNode_MembersInjector<P>(providerProvider);
  }

  @Override
  public void injectMembers(BasePrivacyNode<P> instance) {
    if (instance == null) {
      throw new NullPointerException("Cannot inject members into a null reference");
    }
    instance.receiveNodeProvider(providerProvider.get());
  }

  public static <P extends ParentUiNode<?>> void injectReceiveNodeProvider(
      BasePrivacyNode<P> instance, Provider<BasePrivacyNodeChildProvider> providerProvider) {
    instance.receiveNodeProvider(providerProvider.get());
  }
}
