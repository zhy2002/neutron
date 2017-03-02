package zhy2002.examples.lodgement.gen.node;

import dagger.MembersInjector;
import javax.annotation.Generated;
import javax.inject.Provider;
import zhy2002.examples.lodgement.gen.di.ProductFeaturesNodeComponent;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class ProductFeaturesNode_MembersInjector
    implements MembersInjector<ProductFeaturesNode> {
  private final Provider<ProductFeaturesNodeChildProvider> providerProvider;

  private final Provider<ProductFeaturesNodeComponent.Builder> builderProvider;

  public ProductFeaturesNode_MembersInjector(
      Provider<ProductFeaturesNodeChildProvider> providerProvider,
      Provider<ProductFeaturesNodeComponent.Builder> builderProvider) {
    assert providerProvider != null;
    this.providerProvider = providerProvider;
    assert builderProvider != null;
    this.builderProvider = builderProvider;
  }

  public static MembersInjector<ProductFeaturesNode> create(
      Provider<ProductFeaturesNodeChildProvider> providerProvider,
      Provider<ProductFeaturesNodeComponent.Builder> builderProvider) {
    return new ProductFeaturesNode_MembersInjector(providerProvider, builderProvider);
  }

  @Override
  public void injectMembers(ProductFeaturesNode instance) {
    if (instance == null) {
      throw new NullPointerException("Cannot inject members into a null reference");
    }
    instance.receiveNodeProvider(providerProvider.get());
    instance.createComponent(builderProvider.get());
  }

  public static void injectReceiveNodeProvider(
      ProductFeaturesNode instance, Provider<ProductFeaturesNodeChildProvider> providerProvider) {
    instance.receiveNodeProvider(providerProvider.get());
  }

  public static void injectCreateComponent(
      ProductFeaturesNode instance,
      Provider<ProductFeaturesNodeComponent.Builder> builderProvider) {
    instance.createComponent(builderProvider.get());
  }
}
