package zhy2002.examples.lodgement.gen.node;

import dagger.MembersInjector;
import javax.annotation.Generated;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class ProductNodeChildProvider_MembersInjector
    implements MembersInjector<ProductNodeChildProvider> {
  private final MembersInjector<ProductDescriptionNode>
      productDescriptionNodeInjectorMembersInjector;

  private final MembersInjector<ProductFeaturesNode> productFeaturesNodeInjectorMembersInjector;

  public ProductNodeChildProvider_MembersInjector(
      MembersInjector<ProductDescriptionNode> productDescriptionNodeInjectorMembersInjector,
      MembersInjector<ProductFeaturesNode> productFeaturesNodeInjectorMembersInjector) {
    assert productDescriptionNodeInjectorMembersInjector != null;
    this.productDescriptionNodeInjectorMembersInjector =
        productDescriptionNodeInjectorMembersInjector;
    assert productFeaturesNodeInjectorMembersInjector != null;
    this.productFeaturesNodeInjectorMembersInjector = productFeaturesNodeInjectorMembersInjector;
  }

  public static MembersInjector<ProductNodeChildProvider> create(
      MembersInjector<ProductDescriptionNode> productDescriptionNodeInjectorMembersInjector,
      MembersInjector<ProductFeaturesNode> productFeaturesNodeInjectorMembersInjector) {
    return new ProductNodeChildProvider_MembersInjector(
        productDescriptionNodeInjectorMembersInjector, productFeaturesNodeInjectorMembersInjector);
  }

  @Override
  public void injectMembers(ProductNodeChildProvider instance) {
    if (instance == null) {
      throw new NullPointerException("Cannot inject members into a null reference");
    }
    instance.productDescriptionNodeInjector = productDescriptionNodeInjectorMembersInjector;
    instance.productFeaturesNodeInjector = productFeaturesNodeInjectorMembersInjector;
  }

  public static void injectProductDescriptionNodeInjector(
      ProductNodeChildProvider instance,
      MembersInjector<ProductDescriptionNode> productDescriptionNodeInjector) {
    instance.productDescriptionNodeInjector = productDescriptionNodeInjector;
  }

  public static void injectProductFeaturesNodeInjector(
      ProductNodeChildProvider instance,
      MembersInjector<ProductFeaturesNode> productFeaturesNodeInjector) {
    instance.productFeaturesNodeInjector = productFeaturesNodeInjector;
  }
}
