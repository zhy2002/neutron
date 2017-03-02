package zhy2002.examples.lodgement.gen.node;

import dagger.MembersInjector;
import javax.annotation.Generated;
import javax.inject.Provider;
import zhy2002.neutron.ParentUiNode;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class BaseResponsibleLendNode_MembersInjector<P extends ParentUiNode<?>>
    implements MembersInjector<BaseResponsibleLendNode<P>> {
  private final Provider<BaseResponsibleLendNodeChildProvider> providerProvider;

  public BaseResponsibleLendNode_MembersInjector(
      Provider<BaseResponsibleLendNodeChildProvider> providerProvider) {
    assert providerProvider != null;
    this.providerProvider = providerProvider;
  }

  public static <P extends ParentUiNode<?>> MembersInjector<BaseResponsibleLendNode<P>> create(
      Provider<BaseResponsibleLendNodeChildProvider> providerProvider) {
    return new BaseResponsibleLendNode_MembersInjector<P>(providerProvider);
  }

  @Override
  public void injectMembers(BaseResponsibleLendNode<P> instance) {
    if (instance == null) {
      throw new NullPointerException("Cannot inject members into a null reference");
    }
    instance.receiveNodeProvider(providerProvider.get());
  }

  public static <P extends ParentUiNode<?>> void injectReceiveNodeProvider(
      BaseResponsibleLendNode<P> instance,
      Provider<BaseResponsibleLendNodeChildProvider> providerProvider) {
    instance.receiveNodeProvider(providerProvider.get());
  }
}
