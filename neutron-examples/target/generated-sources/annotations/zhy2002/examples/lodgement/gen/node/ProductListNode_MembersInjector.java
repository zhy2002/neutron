package zhy2002.examples.lodgement.gen.node;

import dagger.MembersInjector;
import javax.annotation.Generated;
import javax.inject.Provider;
import zhy2002.examples.lodgement.gen.di.ProductListNodeComponent;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class ProductListNode_MembersInjector implements MembersInjector<ProductListNode> {
  private final Provider<ProductListNodeItemProvider> providerProvider;

  private final Provider<ProductListNodeComponent.Builder> builderProvider;

  public ProductListNode_MembersInjector(
      Provider<ProductListNodeItemProvider> providerProvider,
      Provider<ProductListNodeComponent.Builder> builderProvider) {
    assert providerProvider != null;
    this.providerProvider = providerProvider;
    assert builderProvider != null;
    this.builderProvider = builderProvider;
  }

  public static MembersInjector<ProductListNode> create(
      Provider<ProductListNodeItemProvider> providerProvider,
      Provider<ProductListNodeComponent.Builder> builderProvider) {
    return new ProductListNode_MembersInjector(providerProvider, builderProvider);
  }

  @Override
  public void injectMembers(ProductListNode instance) {
    if (instance == null) {
      throw new NullPointerException("Cannot inject members into a null reference");
    }
    instance.receiveNodeProvider(providerProvider.get());
    instance.createComponent(builderProvider.get());
  }

  public static void injectReceiveNodeProvider(
      ProductListNode instance, Provider<ProductListNodeItemProvider> providerProvider) {
    instance.receiveNodeProvider(providerProvider.get());
  }

  public static void injectCreateComponent(
      ProductListNode instance, Provider<ProductListNodeComponent.Builder> builderProvider) {
    instance.createComponent(builderProvider.get());
  }
}
