package zhy2002.examples.lodgement.gen.node;

import dagger.MembersInjector;
import javax.annotation.Generated;
import javax.inject.Provider;
import zhy2002.examples.lodgement.gen.di.ProductConstructionApplicationFlagNodeComponent;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class ProductConstructionApplicationFlagNode_MembersInjector
    implements MembersInjector<ProductConstructionApplicationFlagNode> {
  private final Provider<ProductConstructionApplicationFlagNodeComponent.Builder> builderProvider;

  public ProductConstructionApplicationFlagNode_MembersInjector(
      Provider<ProductConstructionApplicationFlagNodeComponent.Builder> builderProvider) {
    assert builderProvider != null;
    this.builderProvider = builderProvider;
  }

  public static MembersInjector<ProductConstructionApplicationFlagNode> create(
      Provider<ProductConstructionApplicationFlagNodeComponent.Builder> builderProvider) {
    return new ProductConstructionApplicationFlagNode_MembersInjector(builderProvider);
  }

  @Override
  public void injectMembers(ProductConstructionApplicationFlagNode instance) {
    if (instance == null) {
      throw new NullPointerException("Cannot inject members into a null reference");
    }
    instance.createComponent(builderProvider.get());
  }

  public static void injectCreateComponent(
      ProductConstructionApplicationFlagNode instance,
      Provider<ProductConstructionApplicationFlagNodeComponent.Builder> builderProvider) {
    instance.createComponent(builderProvider.get());
  }
}
