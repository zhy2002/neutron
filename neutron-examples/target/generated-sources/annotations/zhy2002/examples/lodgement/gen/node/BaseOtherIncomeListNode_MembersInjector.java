package zhy2002.examples.lodgement.gen.node;

import dagger.MembersInjector;
import javax.annotation.Generated;
import javax.inject.Provider;
import zhy2002.neutron.ObjectUiNode;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class BaseOtherIncomeListNode_MembersInjector<P extends ObjectUiNode<?>>
    implements MembersInjector<BaseOtherIncomeListNode<P>> {
  private final Provider<BaseOtherIncomeListNodeItemProvider> providerProvider;

  public BaseOtherIncomeListNode_MembersInjector(
      Provider<BaseOtherIncomeListNodeItemProvider> providerProvider) {
    assert providerProvider != null;
    this.providerProvider = providerProvider;
  }

  public static <P extends ObjectUiNode<?>> MembersInjector<BaseOtherIncomeListNode<P>> create(
      Provider<BaseOtherIncomeListNodeItemProvider> providerProvider) {
    return new BaseOtherIncomeListNode_MembersInjector<P>(providerProvider);
  }

  @Override
  public void injectMembers(BaseOtherIncomeListNode<P> instance) {
    if (instance == null) {
      throw new NullPointerException("Cannot inject members into a null reference");
    }
    instance.receiveNodeProvider(providerProvider.get());
  }

  public static <P extends ObjectUiNode<?>> void injectReceiveNodeProvider(
      BaseOtherIncomeListNode<P> instance,
      Provider<BaseOtherIncomeListNodeItemProvider> providerProvider) {
    instance.receiveNodeProvider(providerProvider.get());
  }
}
