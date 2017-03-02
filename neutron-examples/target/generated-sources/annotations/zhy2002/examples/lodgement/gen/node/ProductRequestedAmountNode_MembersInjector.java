package zhy2002.examples.lodgement.gen.node;

import dagger.MembersInjector;
import javax.annotation.Generated;
import javax.inject.Provider;
import zhy2002.examples.lodgement.gen.di.ProductRequestedAmountNodeComponent;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class ProductRequestedAmountNode_MembersInjector
    implements MembersInjector<ProductRequestedAmountNode> {
  private final Provider<ProductRequestedAmountNodeComponent.Builder> builderProvider;

  public ProductRequestedAmountNode_MembersInjector(
      Provider<ProductRequestedAmountNodeComponent.Builder> builderProvider) {
    assert builderProvider != null;
    this.builderProvider = builderProvider;
  }

  public static MembersInjector<ProductRequestedAmountNode> create(
      Provider<ProductRequestedAmountNodeComponent.Builder> builderProvider) {
    return new ProductRequestedAmountNode_MembersInjector(builderProvider);
  }

  @Override
  public void injectMembers(ProductRequestedAmountNode instance) {
    if (instance == null) {
      throw new NullPointerException("Cannot inject members into a null reference");
    }
    instance.createComponent(builderProvider.get());
  }

  public static void injectCreateComponent(
      ProductRequestedAmountNode instance,
      Provider<ProductRequestedAmountNodeComponent.Builder> builderProvider) {
    instance.createComponent(builderProvider.get());
  }
}
