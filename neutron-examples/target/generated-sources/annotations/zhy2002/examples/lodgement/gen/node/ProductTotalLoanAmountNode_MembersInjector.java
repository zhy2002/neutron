package zhy2002.examples.lodgement.gen.node;

import dagger.MembersInjector;
import javax.annotation.Generated;
import javax.inject.Provider;
import zhy2002.examples.lodgement.gen.di.ProductTotalLoanAmountNodeComponent;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class ProductTotalLoanAmountNode_MembersInjector
    implements MembersInjector<ProductTotalLoanAmountNode> {
  private final Provider<ProductTotalLoanAmountNodeComponent.Builder> builderProvider;

  public ProductTotalLoanAmountNode_MembersInjector(
      Provider<ProductTotalLoanAmountNodeComponent.Builder> builderProvider) {
    assert builderProvider != null;
    this.builderProvider = builderProvider;
  }

  public static MembersInjector<ProductTotalLoanAmountNode> create(
      Provider<ProductTotalLoanAmountNodeComponent.Builder> builderProvider) {
    return new ProductTotalLoanAmountNode_MembersInjector(builderProvider);
  }

  @Override
  public void injectMembers(ProductTotalLoanAmountNode instance) {
    if (instance == null) {
      throw new NullPointerException("Cannot inject members into a null reference");
    }
    instance.createComponent(builderProvider.get());
  }

  public static void injectCreateComponent(
      ProductTotalLoanAmountNode instance,
      Provider<ProductTotalLoanAmountNodeComponent.Builder> builderProvider) {
    instance.createComponent(builderProvider.get());
  }
}
