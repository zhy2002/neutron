package zhy2002.examples.lodgement.gen.node;

import dagger.MembersInjector;
import javax.annotation.Generated;
import javax.inject.Provider;
import zhy2002.examples.lodgement.gen.di.ProductNameNodeComponent;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class ProductNameNode_MembersInjector implements MembersInjector<ProductNameNode> {
  private final Provider<ProductNameNodeComponent.Builder> builderProvider;

  public ProductNameNode_MembersInjector(
      Provider<ProductNameNodeComponent.Builder> builderProvider) {
    assert builderProvider != null;
    this.builderProvider = builderProvider;
  }

  public static MembersInjector<ProductNameNode> create(
      Provider<ProductNameNodeComponent.Builder> builderProvider) {
    return new ProductNameNode_MembersInjector(builderProvider);
  }

  @Override
  public void injectMembers(ProductNameNode instance) {
    if (instance == null) {
      throw new NullPointerException("Cannot inject members into a null reference");
    }
    instance.createComponent(builderProvider.get());
  }

  public static void injectCreateComponent(
      ProductNameNode instance, Provider<ProductNameNodeComponent.Builder> builderProvider) {
    instance.createComponent(builderProvider.get());
  }
}
