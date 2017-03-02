package zhy2002.examples.lodgement.gen.node;

import dagger.MembersInjector;
import javax.annotation.Generated;
import javax.inject.Provider;
import zhy2002.examples.lodgement.gen.di.CreditCardNodeComponent;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class CreditCardNode_MembersInjector implements MembersInjector<CreditCardNode> {
  private final Provider<CreditCardNodeChildProvider> providerProvider;

  private final Provider<CreditCardNodeComponent.Builder> builderProvider;

  public CreditCardNode_MembersInjector(
      Provider<CreditCardNodeChildProvider> providerProvider,
      Provider<CreditCardNodeComponent.Builder> builderProvider) {
    assert providerProvider != null;
    this.providerProvider = providerProvider;
    assert builderProvider != null;
    this.builderProvider = builderProvider;
  }

  public static MembersInjector<CreditCardNode> create(
      Provider<CreditCardNodeChildProvider> providerProvider,
      Provider<CreditCardNodeComponent.Builder> builderProvider) {
    return new CreditCardNode_MembersInjector(providerProvider, builderProvider);
  }

  @Override
  public void injectMembers(CreditCardNode instance) {
    if (instance == null) {
      throw new NullPointerException("Cannot inject members into a null reference");
    }
    instance.receiveNodeProvider(providerProvider.get());
    instance.createComponent(builderProvider.get());
  }

  public static void injectReceiveNodeProvider(
      CreditCardNode instance, Provider<CreditCardNodeChildProvider> providerProvider) {
    instance.receiveNodeProvider(providerProvider.get());
  }

  public static void injectCreateComponent(
      CreditCardNode instance, Provider<CreditCardNodeComponent.Builder> builderProvider) {
    instance.createComponent(builderProvider.get());
  }
}
