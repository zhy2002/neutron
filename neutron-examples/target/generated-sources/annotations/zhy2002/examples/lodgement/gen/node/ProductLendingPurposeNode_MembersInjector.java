package zhy2002.examples.lodgement.gen.node;

import dagger.MembersInjector;
import javax.annotation.Generated;
import javax.inject.Provider;
import zhy2002.examples.lodgement.gen.di.ProductLendingPurposeNodeComponent;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class ProductLendingPurposeNode_MembersInjector
    implements MembersInjector<ProductLendingPurposeNode> {
  private final Provider<ProductLendingPurposeNodeComponent.Builder> builderProvider;

  public ProductLendingPurposeNode_MembersInjector(
      Provider<ProductLendingPurposeNodeComponent.Builder> builderProvider) {
    assert builderProvider != null;
    this.builderProvider = builderProvider;
  }

  public static MembersInjector<ProductLendingPurposeNode> create(
      Provider<ProductLendingPurposeNodeComponent.Builder> builderProvider) {
    return new ProductLendingPurposeNode_MembersInjector(builderProvider);
  }

  @Override
  public void injectMembers(ProductLendingPurposeNode instance) {
    if (instance == null) {
      throw new NullPointerException("Cannot inject members into a null reference");
    }
    instance.createComponent(builderProvider.get());
  }

  public static void injectCreateComponent(
      ProductLendingPurposeNode instance,
      Provider<ProductLendingPurposeNodeComponent.Builder> builderProvider) {
    instance.createComponent(builderProvider.get());
  }
}
