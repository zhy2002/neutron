package zhy2002.examples.lodgement.gen.node;

import dagger.MembersInjector;
import javax.annotation.Generated;
import javax.inject.Provider;
import zhy2002.examples.lodgement.gen.di.ProductDescriptionNodeComponent;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class ProductDescriptionNode_MembersInjector
    implements MembersInjector<ProductDescriptionNode> {
  private final Provider<ProductDescriptionNodeChildProvider> providerProvider;

  private final Provider<ProductDescriptionNodeComponent.Builder> builderProvider;

  public ProductDescriptionNode_MembersInjector(
      Provider<ProductDescriptionNodeChildProvider> providerProvider,
      Provider<ProductDescriptionNodeComponent.Builder> builderProvider) {
    assert providerProvider != null;
    this.providerProvider = providerProvider;
    assert builderProvider != null;
    this.builderProvider = builderProvider;
  }

  public static MembersInjector<ProductDescriptionNode> create(
      Provider<ProductDescriptionNodeChildProvider> providerProvider,
      Provider<ProductDescriptionNodeComponent.Builder> builderProvider) {
    return new ProductDescriptionNode_MembersInjector(providerProvider, builderProvider);
  }

  @Override
  public void injectMembers(ProductDescriptionNode instance) {
    if (instance == null) {
      throw new NullPointerException("Cannot inject members into a null reference");
    }
    instance.receiveNodeProvider(providerProvider.get());
    instance.createComponent(builderProvider.get());
  }

  public static void injectReceiveNodeProvider(
      ProductDescriptionNode instance,
      Provider<ProductDescriptionNodeChildProvider> providerProvider) {
    instance.receiveNodeProvider(providerProvider.get());
  }

  public static void injectCreateComponent(
      ProductDescriptionNode instance,
      Provider<ProductDescriptionNodeComponent.Builder> builderProvider) {
    instance.createComponent(builderProvider.get());
  }
}
