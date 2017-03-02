package zhy2002.examples.lodgement.gen.node;

import dagger.MembersInjector;
import javax.annotation.Generated;
import javax.inject.Provider;
import zhy2002.examples.lodgement.gen.di.ExistingMortgageListNodeComponent;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class ExistingMortgageListNode_MembersInjector
    implements MembersInjector<ExistingMortgageListNode> {
  private final Provider<ExistingMortgageListNodeItemProvider> providerProvider;

  private final Provider<ExistingMortgageListNodeComponent.Builder> builderProvider;

  public ExistingMortgageListNode_MembersInjector(
      Provider<ExistingMortgageListNodeItemProvider> providerProvider,
      Provider<ExistingMortgageListNodeComponent.Builder> builderProvider) {
    assert providerProvider != null;
    this.providerProvider = providerProvider;
    assert builderProvider != null;
    this.builderProvider = builderProvider;
  }

  public static MembersInjector<ExistingMortgageListNode> create(
      Provider<ExistingMortgageListNodeItemProvider> providerProvider,
      Provider<ExistingMortgageListNodeComponent.Builder> builderProvider) {
    return new ExistingMortgageListNode_MembersInjector(providerProvider, builderProvider);
  }

  @Override
  public void injectMembers(ExistingMortgageListNode instance) {
    if (instance == null) {
      throw new NullPointerException("Cannot inject members into a null reference");
    }
    instance.receiveNodeProvider(providerProvider.get());
    instance.createComponent(builderProvider.get());
  }

  public static void injectReceiveNodeProvider(
      ExistingMortgageListNode instance,
      Provider<ExistingMortgageListNodeItemProvider> providerProvider) {
    instance.receiveNodeProvider(providerProvider.get());
  }

  public static void injectCreateComponent(
      ExistingMortgageListNode instance,
      Provider<ExistingMortgageListNodeComponent.Builder> builderProvider) {
    instance.createComponent(builderProvider.get());
  }
}
