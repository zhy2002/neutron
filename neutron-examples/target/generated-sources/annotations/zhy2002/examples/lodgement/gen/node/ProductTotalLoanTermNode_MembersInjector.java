package zhy2002.examples.lodgement.gen.node;

import dagger.MembersInjector;
import javax.annotation.Generated;
import javax.inject.Provider;
import zhy2002.examples.lodgement.gen.di.ProductTotalLoanTermNodeComponent;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class ProductTotalLoanTermNode_MembersInjector
    implements MembersInjector<ProductTotalLoanTermNode> {
  private final Provider<ProductTotalLoanTermNodeComponent.Builder> builderProvider;

  public ProductTotalLoanTermNode_MembersInjector(
      Provider<ProductTotalLoanTermNodeComponent.Builder> builderProvider) {
    assert builderProvider != null;
    this.builderProvider = builderProvider;
  }

  public static MembersInjector<ProductTotalLoanTermNode> create(
      Provider<ProductTotalLoanTermNodeComponent.Builder> builderProvider) {
    return new ProductTotalLoanTermNode_MembersInjector(builderProvider);
  }

  @Override
  public void injectMembers(ProductTotalLoanTermNode instance) {
    if (instance == null) {
      throw new NullPointerException("Cannot inject members into a null reference");
    }
    instance.createComponent(builderProvider.get());
  }

  public static void injectCreateComponent(
      ProductTotalLoanTermNode instance,
      Provider<ProductTotalLoanTermNodeComponent.Builder> builderProvider) {
    instance.createComponent(builderProvider.get());
  }
}
