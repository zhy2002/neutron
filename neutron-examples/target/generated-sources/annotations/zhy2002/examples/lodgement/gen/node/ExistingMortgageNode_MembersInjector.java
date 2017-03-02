package zhy2002.examples.lodgement.gen.node;

import dagger.MembersInjector;
import javax.annotation.Generated;
import javax.inject.Provider;
import zhy2002.examples.lodgement.gen.di.ExistingMortgageNodeComponent;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class ExistingMortgageNode_MembersInjector
    implements MembersInjector<ExistingMortgageNode> {
  private final Provider<ExistingMortgageNodeChildProvider> providerProvider;

  private final Provider<ExistingMortgageNodeComponent.Builder> builderProvider;

  public ExistingMortgageNode_MembersInjector(
      Provider<ExistingMortgageNodeChildProvider> providerProvider,
      Provider<ExistingMortgageNodeComponent.Builder> builderProvider) {
    assert providerProvider != null;
    this.providerProvider = providerProvider;
    assert builderProvider != null;
    this.builderProvider = builderProvider;
  }

  public static MembersInjector<ExistingMortgageNode> create(
      Provider<ExistingMortgageNodeChildProvider> providerProvider,
      Provider<ExistingMortgageNodeComponent.Builder> builderProvider) {
    return new ExistingMortgageNode_MembersInjector(providerProvider, builderProvider);
  }

  @Override
  public void injectMembers(ExistingMortgageNode instance) {
    if (instance == null) {
      throw new NullPointerException("Cannot inject members into a null reference");
    }
    instance.receiveNodeProvider(providerProvider.get());
    instance.createComponent(builderProvider.get());
  }

  public static void injectReceiveNodeProvider(
      ExistingMortgageNode instance, Provider<ExistingMortgageNodeChildProvider> providerProvider) {
    instance.receiveNodeProvider(providerProvider.get());
  }

  public static void injectCreateComponent(
      ExistingMortgageNode instance,
      Provider<ExistingMortgageNodeComponent.Builder> builderProvider) {
    instance.createComponent(builderProvider.get());
  }
}
