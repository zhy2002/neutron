package zhy2002.examples.lodgement.gen.node;

import dagger.MembersInjector;
import javax.annotation.Generated;
import javax.inject.Provider;
import zhy2002.examples.lodgement.gen.di.ProductCostRecuctionFlagNodeComponent;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class ProductCostRecuctionFlagNode_MembersInjector
    implements MembersInjector<ProductCostRecuctionFlagNode> {
  private final Provider<ProductCostRecuctionFlagNodeComponent.Builder> builderProvider;

  public ProductCostRecuctionFlagNode_MembersInjector(
      Provider<ProductCostRecuctionFlagNodeComponent.Builder> builderProvider) {
    assert builderProvider != null;
    this.builderProvider = builderProvider;
  }

  public static MembersInjector<ProductCostRecuctionFlagNode> create(
      Provider<ProductCostRecuctionFlagNodeComponent.Builder> builderProvider) {
    return new ProductCostRecuctionFlagNode_MembersInjector(builderProvider);
  }

  @Override
  public void injectMembers(ProductCostRecuctionFlagNode instance) {
    if (instance == null) {
      throw new NullPointerException("Cannot inject members into a null reference");
    }
    instance.createComponent(builderProvider.get());
  }

  public static void injectCreateComponent(
      ProductCostRecuctionFlagNode instance,
      Provider<ProductCostRecuctionFlagNodeComponent.Builder> builderProvider) {
    instance.createComponent(builderProvider.get());
  }
}
