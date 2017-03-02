package zhy2002.examples.lodgement.gen.node;

import dagger.MembersInjector;
import javax.annotation.Generated;
import javax.inject.Provider;
import zhy2002.examples.lodgement.gen.di.ProductTotalSecurityAmountNodeComponent;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class ProductTotalSecurityAmountNode_MembersInjector
    implements MembersInjector<ProductTotalSecurityAmountNode> {
  private final Provider<ProductTotalSecurityAmountNodeComponent.Builder> builderProvider;

  public ProductTotalSecurityAmountNode_MembersInjector(
      Provider<ProductTotalSecurityAmountNodeComponent.Builder> builderProvider) {
    assert builderProvider != null;
    this.builderProvider = builderProvider;
  }

  public static MembersInjector<ProductTotalSecurityAmountNode> create(
      Provider<ProductTotalSecurityAmountNodeComponent.Builder> builderProvider) {
    return new ProductTotalSecurityAmountNode_MembersInjector(builderProvider);
  }

  @Override
  public void injectMembers(ProductTotalSecurityAmountNode instance) {
    if (instance == null) {
      throw new NullPointerException("Cannot inject members into a null reference");
    }
    instance.createComponent(builderProvider.get());
  }

  public static void injectCreateComponent(
      ProductTotalSecurityAmountNode instance,
      Provider<ProductTotalSecurityAmountNodeComponent.Builder> builderProvider) {
    instance.createComponent(builderProvider.get());
  }
}
