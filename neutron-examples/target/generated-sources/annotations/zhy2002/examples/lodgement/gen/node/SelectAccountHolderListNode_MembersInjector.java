package zhy2002.examples.lodgement.gen.node;

import dagger.MembersInjector;
import javax.annotation.Generated;
import javax.inject.Provider;
import zhy2002.neutron.ObjectUiNode;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class SelectAccountHolderListNode_MembersInjector<P extends ObjectUiNode<?>>
    implements MembersInjector<SelectAccountHolderListNode<P>> {
  private final Provider<SelectAccountHolderListNodeItemProvider> providerProvider;

  public SelectAccountHolderListNode_MembersInjector(
      Provider<SelectAccountHolderListNodeItemProvider> providerProvider) {
    assert providerProvider != null;
    this.providerProvider = providerProvider;
  }

  public static <P extends ObjectUiNode<?>> MembersInjector<SelectAccountHolderListNode<P>> create(
      Provider<SelectAccountHolderListNodeItemProvider> providerProvider) {
    return new SelectAccountHolderListNode_MembersInjector<P>(providerProvider);
  }

  @Override
  public void injectMembers(SelectAccountHolderListNode<P> instance) {
    if (instance == null) {
      throw new NullPointerException("Cannot inject members into a null reference");
    }
    instance.receiveNodeProvider(providerProvider.get());
  }

  public static <P extends ObjectUiNode<?>> void injectReceiveNodeProvider(
      SelectAccountHolderListNode<P> instance,
      Provider<SelectAccountHolderListNodeItemProvider> providerProvider) {
    instance.receiveNodeProvider(providerProvider.get());
  }
}
