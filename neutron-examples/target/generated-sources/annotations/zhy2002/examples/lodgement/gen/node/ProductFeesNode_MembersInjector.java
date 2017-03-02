package zhy2002.examples.lodgement.gen.node;

import dagger.MembersInjector;
import javax.annotation.Generated;
import javax.inject.Provider;
import zhy2002.examples.lodgement.gen.di.ProductFeesNodeComponent;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class ProductFeesNode_MembersInjector implements MembersInjector<ProductFeesNode> {
  private final Provider<ProductFeesNodeComponent.Builder> builderProvider;

  public ProductFeesNode_MembersInjector(
      Provider<ProductFeesNodeComponent.Builder> builderProvider) {
    assert builderProvider != null;
    this.builderProvider = builderProvider;
  }

  public static MembersInjector<ProductFeesNode> create(
      Provider<ProductFeesNodeComponent.Builder> builderProvider) {
    return new ProductFeesNode_MembersInjector(builderProvider);
  }

  @Override
  public void injectMembers(ProductFeesNode instance) {
    if (instance == null) {
      throw new NullPointerException("Cannot inject members into a null reference");
    }
    instance.createComponent(builderProvider.get());
  }

  public static void injectCreateComponent(
      ProductFeesNode instance, Provider<ProductFeesNodeComponent.Builder> builderProvider) {
    instance.createComponent(builderProvider.get());
  }
}
