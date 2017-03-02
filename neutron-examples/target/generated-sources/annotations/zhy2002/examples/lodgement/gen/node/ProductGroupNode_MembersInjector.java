package zhy2002.examples.lodgement.gen.node;

import dagger.MembersInjector;
import javax.annotation.Generated;
import javax.inject.Provider;
import zhy2002.examples.lodgement.gen.di.ProductGroupNodeComponent;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class ProductGroupNode_MembersInjector implements MembersInjector<ProductGroupNode> {
  private final Provider<ProductGroupNodeComponent.Builder> builderProvider;

  public ProductGroupNode_MembersInjector(
      Provider<ProductGroupNodeComponent.Builder> builderProvider) {
    assert builderProvider != null;
    this.builderProvider = builderProvider;
  }

  public static MembersInjector<ProductGroupNode> create(
      Provider<ProductGroupNodeComponent.Builder> builderProvider) {
    return new ProductGroupNode_MembersInjector(builderProvider);
  }

  @Override
  public void injectMembers(ProductGroupNode instance) {
    if (instance == null) {
      throw new NullPointerException("Cannot inject members into a null reference");
    }
    instance.createComponent(builderProvider.get());
  }

  public static void injectCreateComponent(
      ProductGroupNode instance, Provider<ProductGroupNodeComponent.Builder> builderProvider) {
    instance.createComponent(builderProvider.get());
  }
}
