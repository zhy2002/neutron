package zhy2002.examples.lodgement.gen.node;

import dagger.MembersInjector;
import javax.annotation.Generated;
import javax.inject.Provider;
import zhy2002.examples.lodgement.gen.di.ProductTotalLoanLmiAmountNodeComponent;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class ProductTotalLoanLmiAmountNode_MembersInjector
    implements MembersInjector<ProductTotalLoanLmiAmountNode> {
  private final Provider<ProductTotalLoanLmiAmountNodeComponent.Builder> builderProvider;

  public ProductTotalLoanLmiAmountNode_MembersInjector(
      Provider<ProductTotalLoanLmiAmountNodeComponent.Builder> builderProvider) {
    assert builderProvider != null;
    this.builderProvider = builderProvider;
  }

  public static MembersInjector<ProductTotalLoanLmiAmountNode> create(
      Provider<ProductTotalLoanLmiAmountNodeComponent.Builder> builderProvider) {
    return new ProductTotalLoanLmiAmountNode_MembersInjector(builderProvider);
  }

  @Override
  public void injectMembers(ProductTotalLoanLmiAmountNode instance) {
    if (instance == null) {
      throw new NullPointerException("Cannot inject members into a null reference");
    }
    instance.createComponent(builderProvider.get());
  }

  public static void injectCreateComponent(
      ProductTotalLoanLmiAmountNode instance,
      Provider<ProductTotalLoanLmiAmountNodeComponent.Builder> builderProvider) {
    instance.createComponent(builderProvider.get());
  }
}
