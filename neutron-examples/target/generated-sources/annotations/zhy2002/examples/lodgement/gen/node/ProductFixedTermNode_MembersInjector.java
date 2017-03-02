package zhy2002.examples.lodgement.gen.node;

import dagger.MembersInjector;
import javax.annotation.Generated;
import javax.inject.Provider;
import zhy2002.examples.lodgement.gen.di.ProductFixedTermNodeComponent;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class ProductFixedTermNode_MembersInjector
    implements MembersInjector<ProductFixedTermNode> {
  private final Provider<ProductFixedTermNodeComponent.Builder> builderProvider;

  public ProductFixedTermNode_MembersInjector(
      Provider<ProductFixedTermNodeComponent.Builder> builderProvider) {
    assert builderProvider != null;
    this.builderProvider = builderProvider;
  }

  public static MembersInjector<ProductFixedTermNode> create(
      Provider<ProductFixedTermNodeComponent.Builder> builderProvider) {
    return new ProductFixedTermNode_MembersInjector(builderProvider);
  }

  @Override
  public void injectMembers(ProductFixedTermNode instance) {
    if (instance == null) {
      throw new NullPointerException("Cannot inject members into a null reference");
    }
    instance.createComponent(builderProvider.get());
  }

  public static void injectCreateComponent(
      ProductFixedTermNode instance,
      Provider<ProductFixedTermNodeComponent.Builder> builderProvider) {
    instance.createComponent(builderProvider.get());
  }
}
