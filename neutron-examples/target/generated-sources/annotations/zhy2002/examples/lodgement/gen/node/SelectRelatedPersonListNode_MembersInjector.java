package zhy2002.examples.lodgement.gen.node;

import dagger.MembersInjector;
import javax.annotation.Generated;
import javax.inject.Provider;
import zhy2002.neutron.ObjectUiNode;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class SelectRelatedPersonListNode_MembersInjector<P extends ObjectUiNode<?>>
    implements MembersInjector<SelectRelatedPersonListNode<P>> {
  private final Provider<SelectRelatedPersonListNodeItemProvider> providerProvider;

  public SelectRelatedPersonListNode_MembersInjector(
      Provider<SelectRelatedPersonListNodeItemProvider> providerProvider) {
    assert providerProvider != null;
    this.providerProvider = providerProvider;
  }

  public static <P extends ObjectUiNode<?>> MembersInjector<SelectRelatedPersonListNode<P>> create(
      Provider<SelectRelatedPersonListNodeItemProvider> providerProvider) {
    return new SelectRelatedPersonListNode_MembersInjector<P>(providerProvider);
  }

  @Override
  public void injectMembers(SelectRelatedPersonListNode<P> instance) {
    if (instance == null) {
      throw new NullPointerException("Cannot inject members into a null reference");
    }
    instance.receiveNodeProvider(providerProvider.get());
  }

  public static <P extends ObjectUiNode<?>> void injectReceiveNodeProvider(
      SelectRelatedPersonListNode<P> instance,
      Provider<SelectRelatedPersonListNodeItemProvider> providerProvider) {
    instance.receiveNodeProvider(providerProvider.get());
  }
}
