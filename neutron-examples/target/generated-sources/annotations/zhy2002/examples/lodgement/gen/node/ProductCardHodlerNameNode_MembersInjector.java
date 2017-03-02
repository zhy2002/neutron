package zhy2002.examples.lodgement.gen.node;

import dagger.MembersInjector;
import javax.annotation.Generated;
import javax.inject.Provider;
import zhy2002.examples.lodgement.gen.di.ProductCardHodlerNameNodeComponent;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class ProductCardHodlerNameNode_MembersInjector
    implements MembersInjector<ProductCardHodlerNameNode> {
  private final Provider<ProductCardHodlerNameNodeComponent.Builder> builderProvider;

  public ProductCardHodlerNameNode_MembersInjector(
      Provider<ProductCardHodlerNameNodeComponent.Builder> builderProvider) {
    assert builderProvider != null;
    this.builderProvider = builderProvider;
  }

  public static MembersInjector<ProductCardHodlerNameNode> create(
      Provider<ProductCardHodlerNameNodeComponent.Builder> builderProvider) {
    return new ProductCardHodlerNameNode_MembersInjector(builderProvider);
  }

  @Override
  public void injectMembers(ProductCardHodlerNameNode instance) {
    if (instance == null) {
      throw new NullPointerException("Cannot inject members into a null reference");
    }
    instance.createComponent(builderProvider.get());
  }

  public static void injectCreateComponent(
      ProductCardHodlerNameNode instance,
      Provider<ProductCardHodlerNameNodeComponent.Builder> builderProvider) {
    instance.createComponent(builderProvider.get());
  }
}
