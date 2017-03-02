package zhy2002.examples.lodgement.gen.node;

import dagger.MembersInjector;
import javax.annotation.Generated;
import javax.inject.Provider;
import zhy2002.examples.lodgement.gen.di.ProductsNodeComponent;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class ProductsNode_MembersInjector implements MembersInjector<ProductsNode> {
  private final Provider<ProductsNodeChildProvider> providerProvider;

  private final Provider<ProductsNodeComponent.Builder> builderProvider;

  public ProductsNode_MembersInjector(
      Provider<ProductsNodeChildProvider> providerProvider,
      Provider<ProductsNodeComponent.Builder> builderProvider) {
    assert providerProvider != null;
    this.providerProvider = providerProvider;
    assert builderProvider != null;
    this.builderProvider = builderProvider;
  }

  public static MembersInjector<ProductsNode> create(
      Provider<ProductsNodeChildProvider> providerProvider,
      Provider<ProductsNodeComponent.Builder> builderProvider) {
    return new ProductsNode_MembersInjector(providerProvider, builderProvider);
  }

  @Override
  public void injectMembers(ProductsNode instance) {
    if (instance == null) {
      throw new NullPointerException("Cannot inject members into a null reference");
    }
    instance.receiveNodeProvider(providerProvider.get());
    instance.createComponent(builderProvider.get());
  }

  public static void injectReceiveNodeProvider(
      ProductsNode instance, Provider<ProductsNodeChildProvider> providerProvider) {
    instance.receiveNodeProvider(providerProvider.get());
  }

  public static void injectCreateComponent(
      ProductsNode instance, Provider<ProductsNodeComponent.Builder> builderProvider) {
    instance.createComponent(builderProvider.get());
  }
}
