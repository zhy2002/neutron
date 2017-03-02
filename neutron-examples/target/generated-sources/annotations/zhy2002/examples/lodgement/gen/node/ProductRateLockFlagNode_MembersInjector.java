package zhy2002.examples.lodgement.gen.node;

import dagger.MembersInjector;
import javax.annotation.Generated;
import javax.inject.Provider;
import zhy2002.examples.lodgement.gen.di.ProductRateLockFlagNodeComponent;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class ProductRateLockFlagNode_MembersInjector
    implements MembersInjector<ProductRateLockFlagNode> {
  private final Provider<ProductRateLockFlagNodeComponent.Builder> builderProvider;

  public ProductRateLockFlagNode_MembersInjector(
      Provider<ProductRateLockFlagNodeComponent.Builder> builderProvider) {
    assert builderProvider != null;
    this.builderProvider = builderProvider;
  }

  public static MembersInjector<ProductRateLockFlagNode> create(
      Provider<ProductRateLockFlagNodeComponent.Builder> builderProvider) {
    return new ProductRateLockFlagNode_MembersInjector(builderProvider);
  }

  @Override
  public void injectMembers(ProductRateLockFlagNode instance) {
    if (instance == null) {
      throw new NullPointerException("Cannot inject members into a null reference");
    }
    instance.createComponent(builderProvider.get());
  }

  public static void injectCreateComponent(
      ProductRateLockFlagNode instance,
      Provider<ProductRateLockFlagNodeComponent.Builder> builderProvider) {
    instance.createComponent(builderProvider.get());
  }
}
