package zhy2002.examples.lodgement.gen.node;

import dagger.MembersInjector;
import javax.annotation.Generated;
import javax.inject.Provider;
import zhy2002.examples.lodgement.gen.di.ProductCardHolderNodeComponent;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class ProductCardHolderNode_MembersInjector
    implements MembersInjector<ProductCardHolderNode> {
  private final Provider<ProductCardHolderNodeChildProvider> providerProvider;

  private final Provider<ProductCardHolderNodeComponent.Builder> builderProvider;

  public ProductCardHolderNode_MembersInjector(
      Provider<ProductCardHolderNodeChildProvider> providerProvider,
      Provider<ProductCardHolderNodeComponent.Builder> builderProvider) {
    assert providerProvider != null;
    this.providerProvider = providerProvider;
    assert builderProvider != null;
    this.builderProvider = builderProvider;
  }

  public static MembersInjector<ProductCardHolderNode> create(
      Provider<ProductCardHolderNodeChildProvider> providerProvider,
      Provider<ProductCardHolderNodeComponent.Builder> builderProvider) {
    return new ProductCardHolderNode_MembersInjector(providerProvider, builderProvider);
  }

  @Override
  public void injectMembers(ProductCardHolderNode instance) {
    if (instance == null) {
      throw new NullPointerException("Cannot inject members into a null reference");
    }
    instance.receiveNodeProvider(providerProvider.get());
    instance.createComponent(builderProvider.get());
  }

  public static void injectReceiveNodeProvider(
      ProductCardHolderNode instance,
      Provider<ProductCardHolderNodeChildProvider> providerProvider) {
    instance.receiveNodeProvider(providerProvider.get());
  }

  public static void injectCreateComponent(
      ProductCardHolderNode instance,
      Provider<ProductCardHolderNodeComponent.Builder> builderProvider) {
    instance.createComponent(builderProvider.get());
  }
}
