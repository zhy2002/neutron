package zhy2002.examples.lodgement.gen.node;

import dagger.MembersInjector;
import javax.annotation.Generated;
import javax.inject.Provider;
import zhy2002.examples.lodgement.gen.di.ProductPackageNameNodeComponent;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class ProductPackageNameNode_MembersInjector
    implements MembersInjector<ProductPackageNameNode> {
  private final Provider<ProductPackageNameNodeComponent.Builder> builderProvider;

  public ProductPackageNameNode_MembersInjector(
      Provider<ProductPackageNameNodeComponent.Builder> builderProvider) {
    assert builderProvider != null;
    this.builderProvider = builderProvider;
  }

  public static MembersInjector<ProductPackageNameNode> create(
      Provider<ProductPackageNameNodeComponent.Builder> builderProvider) {
    return new ProductPackageNameNode_MembersInjector(builderProvider);
  }

  @Override
  public void injectMembers(ProductPackageNameNode instance) {
    if (instance == null) {
      throw new NullPointerException("Cannot inject members into a null reference");
    }
    instance.createComponent(builderProvider.get());
  }

  public static void injectCreateComponent(
      ProductPackageNameNode instance,
      Provider<ProductPackageNameNodeComponent.Builder> builderProvider) {
    instance.createComponent(builderProvider.get());
  }
}
