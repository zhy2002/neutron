package zhy2002.examples.lodgement.gen.node;

import dagger.MembersInjector;
import javax.annotation.Generated;
import javax.inject.Provider;
import zhy2002.examples.lodgement.gen.di.CreditCardListNodeComponent;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class CreditCardListNode_MembersInjector
    implements MembersInjector<CreditCardListNode> {
  private final Provider<CreditCardListNodeItemProvider> providerProvider;

  private final Provider<CreditCardListNodeComponent.Builder> builderProvider;

  public CreditCardListNode_MembersInjector(
      Provider<CreditCardListNodeItemProvider> providerProvider,
      Provider<CreditCardListNodeComponent.Builder> builderProvider) {
    assert providerProvider != null;
    this.providerProvider = providerProvider;
    assert builderProvider != null;
    this.builderProvider = builderProvider;
  }

  public static MembersInjector<CreditCardListNode> create(
      Provider<CreditCardListNodeItemProvider> providerProvider,
      Provider<CreditCardListNodeComponent.Builder> builderProvider) {
    return new CreditCardListNode_MembersInjector(providerProvider, builderProvider);
  }

  @Override
  public void injectMembers(CreditCardListNode instance) {
    if (instance == null) {
      throw new NullPointerException("Cannot inject members into a null reference");
    }
    instance.receiveNodeProvider(providerProvider.get());
    instance.createComponent(builderProvider.get());
  }

  public static void injectReceiveNodeProvider(
      CreditCardListNode instance, Provider<CreditCardListNodeItemProvider> providerProvider) {
    instance.receiveNodeProvider(providerProvider.get());
  }

  public static void injectCreateComponent(
      CreditCardListNode instance, Provider<CreditCardListNodeComponent.Builder> builderProvider) {
    instance.createComponent(builderProvider.get());
  }
}
