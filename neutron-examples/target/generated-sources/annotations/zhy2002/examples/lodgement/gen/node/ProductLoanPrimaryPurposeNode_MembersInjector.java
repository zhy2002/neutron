package zhy2002.examples.lodgement.gen.node;

import dagger.MembersInjector;
import javax.annotation.Generated;
import javax.inject.Provider;
import zhy2002.examples.lodgement.gen.di.ProductLoanPrimaryPurposeNodeComponent;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class ProductLoanPrimaryPurposeNode_MembersInjector
    implements MembersInjector<ProductLoanPrimaryPurposeNode> {
  private final Provider<ProductLoanPrimaryPurposeNodeComponent.Builder> builderProvider;

  public ProductLoanPrimaryPurposeNode_MembersInjector(
      Provider<ProductLoanPrimaryPurposeNodeComponent.Builder> builderProvider) {
    assert builderProvider != null;
    this.builderProvider = builderProvider;
  }

  public static MembersInjector<ProductLoanPrimaryPurposeNode> create(
      Provider<ProductLoanPrimaryPurposeNodeComponent.Builder> builderProvider) {
    return new ProductLoanPrimaryPurposeNode_MembersInjector(builderProvider);
  }

  @Override
  public void injectMembers(ProductLoanPrimaryPurposeNode instance) {
    if (instance == null) {
      throw new NullPointerException("Cannot inject members into a null reference");
    }
    instance.createComponent(builderProvider.get());
  }

  public static void injectCreateComponent(
      ProductLoanPrimaryPurposeNode instance,
      Provider<ProductLoanPrimaryPurposeNodeComponent.Builder> builderProvider) {
    instance.createComponent(builderProvider.get());
  }
}
