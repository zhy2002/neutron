package zhy2002.examples.lodgement.gen.node;

import dagger.MembersInjector;
import javax.annotation.Generated;
import javax.inject.Provider;
import zhy2002.examples.lodgement.gen.di.CreditHistoryListNodeComponent;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class CreditHistoryListNode_MembersInjector
    implements MembersInjector<CreditHistoryListNode> {
  private final Provider<CreditHistoryListNodeItemProvider> providerProvider;

  private final Provider<CreditHistoryListNodeComponent.Builder> builderProvider;

  public CreditHistoryListNode_MembersInjector(
      Provider<CreditHistoryListNodeItemProvider> providerProvider,
      Provider<CreditHistoryListNodeComponent.Builder> builderProvider) {
    assert providerProvider != null;
    this.providerProvider = providerProvider;
    assert builderProvider != null;
    this.builderProvider = builderProvider;
  }

  public static MembersInjector<CreditHistoryListNode> create(
      Provider<CreditHistoryListNodeItemProvider> providerProvider,
      Provider<CreditHistoryListNodeComponent.Builder> builderProvider) {
    return new CreditHistoryListNode_MembersInjector(providerProvider, builderProvider);
  }

  @Override
  public void injectMembers(CreditHistoryListNode instance) {
    if (instance == null) {
      throw new NullPointerException("Cannot inject members into a null reference");
    }
    instance.receiveNodeProvider(providerProvider.get());
    instance.createComponent(builderProvider.get());
  }

  public static void injectReceiveNodeProvider(
      CreditHistoryListNode instance,
      Provider<CreditHistoryListNodeItemProvider> providerProvider) {
    instance.receiveNodeProvider(providerProvider.get());
  }

  public static void injectCreateComponent(
      CreditHistoryListNode instance,
      Provider<CreditHistoryListNodeComponent.Builder> builderProvider) {
    instance.createComponent(builderProvider.get());
  }
}
