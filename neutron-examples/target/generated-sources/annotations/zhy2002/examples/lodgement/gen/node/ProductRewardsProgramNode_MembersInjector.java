package zhy2002.examples.lodgement.gen.node;

import dagger.MembersInjector;
import javax.annotation.Generated;
import javax.inject.Provider;
import zhy2002.examples.lodgement.gen.di.ProductRewardsProgramNodeComponent;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class ProductRewardsProgramNode_MembersInjector
    implements MembersInjector<ProductRewardsProgramNode> {
  private final Provider<ProductRewardsProgramNodeComponent.Builder> builderProvider;

  public ProductRewardsProgramNode_MembersInjector(
      Provider<ProductRewardsProgramNodeComponent.Builder> builderProvider) {
    assert builderProvider != null;
    this.builderProvider = builderProvider;
  }

  public static MembersInjector<ProductRewardsProgramNode> create(
      Provider<ProductRewardsProgramNodeComponent.Builder> builderProvider) {
    return new ProductRewardsProgramNode_MembersInjector(builderProvider);
  }

  @Override
  public void injectMembers(ProductRewardsProgramNode instance) {
    if (instance == null) {
      throw new NullPointerException("Cannot inject members into a null reference");
    }
    instance.createComponent(builderProvider.get());
  }

  public static void injectCreateComponent(
      ProductRewardsProgramNode instance,
      Provider<ProductRewardsProgramNodeComponent.Builder> builderProvider) {
    instance.createComponent(builderProvider.get());
  }
}
