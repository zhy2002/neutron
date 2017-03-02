package zhy2002.examples.lodgement.gen.node;

import dagger.MembersInjector;
import javax.annotation.Generated;
import javax.inject.Provider;
import zhy2002.examples.lodgement.gen.di.ProductNodeComponent;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class ProductNode_MembersInjector implements MembersInjector<ProductNode> {
  private final Provider<ProductNodeChildProvider> providerProvider;

  private final Provider<ProductNodeComponent.Builder> builderProvider;

  public ProductNode_MembersInjector(
      Provider<ProductNodeChildProvider> providerProvider,
      Provider<ProductNodeComponent.Builder> builderProvider) {
    assert providerProvider != null;
    this.providerProvider = providerProvider;
    assert builderProvider != null;
    this.builderProvider = builderProvider;
  }

  public static MembersInjector<ProductNode> create(
      Provider<ProductNodeChildProvider> providerProvider,
      Provider<ProductNodeComponent.Builder> builderProvider) {
    return new ProductNode_MembersInjector(providerProvider, builderProvider);
  }

  @Override
  public void injectMembers(ProductNode instance) {
    if (instance == null) {
      throw new NullPointerException("Cannot inject members into a null reference");
    }
    instance.receiveNodeProvider(providerProvider.get());
    instance.createComponent(builderProvider.get());
  }

  public static void injectReceiveNodeProvider(
      ProductNode instance, Provider<ProductNodeChildProvider> providerProvider) {
    instance.receiveNodeProvider(providerProvider.get());
  }

  public static void injectCreateComponent(
      ProductNode instance, Provider<ProductNodeComponent.Builder> builderProvider) {
    instance.createComponent(builderProvider.get());
  }
}
