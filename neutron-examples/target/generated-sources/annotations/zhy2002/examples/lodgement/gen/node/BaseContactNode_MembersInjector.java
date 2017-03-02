package zhy2002.examples.lodgement.gen.node;

import dagger.MembersInjector;
import javax.annotation.Generated;
import javax.inject.Provider;
import zhy2002.neutron.ParentUiNode;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class BaseContactNode_MembersInjector<P extends ParentUiNode<?>>
    implements MembersInjector<BaseContactNode<P>> {
  private final Provider<BaseContactNodeChildProvider> providerProvider;

  public BaseContactNode_MembersInjector(Provider<BaseContactNodeChildProvider> providerProvider) {
    assert providerProvider != null;
    this.providerProvider = providerProvider;
  }

  public static <P extends ParentUiNode<?>> MembersInjector<BaseContactNode<P>> create(
      Provider<BaseContactNodeChildProvider> providerProvider) {
    return new BaseContactNode_MembersInjector<P>(providerProvider);
  }

  @Override
  public void injectMembers(BaseContactNode<P> instance) {
    if (instance == null) {
      throw new NullPointerException("Cannot inject members into a null reference");
    }
    instance.receiveNodeProvider(providerProvider.get());
  }

  public static <P extends ParentUiNode<?>> void injectReceiveNodeProvider(
      BaseContactNode<P> instance, Provider<BaseContactNodeChildProvider> providerProvider) {
    instance.receiveNodeProvider(providerProvider.get());
  }
}
