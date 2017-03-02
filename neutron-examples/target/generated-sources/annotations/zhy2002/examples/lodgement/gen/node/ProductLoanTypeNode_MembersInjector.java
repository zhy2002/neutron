package zhy2002.examples.lodgement.gen.node;

import dagger.MembersInjector;
import javax.annotation.Generated;
import javax.inject.Provider;
import zhy2002.examples.lodgement.gen.di.ProductLoanTypeNodeComponent;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class ProductLoanTypeNode_MembersInjector
    implements MembersInjector<ProductLoanTypeNode> {
  private final Provider<ProductLoanTypeNodeComponent.Builder> builderProvider;

  public ProductLoanTypeNode_MembersInjector(
      Provider<ProductLoanTypeNodeComponent.Builder> builderProvider) {
    assert builderProvider != null;
    this.builderProvider = builderProvider;
  }

  public static MembersInjector<ProductLoanTypeNode> create(
      Provider<ProductLoanTypeNodeComponent.Builder> builderProvider) {
    return new ProductLoanTypeNode_MembersInjector(builderProvider);
  }

  @Override
  public void injectMembers(ProductLoanTypeNode instance) {
    if (instance == null) {
      throw new NullPointerException("Cannot inject members into a null reference");
    }
    instance.createComponent(builderProvider.get());
  }

  public static void injectCreateComponent(
      ProductLoanTypeNode instance,
      Provider<ProductLoanTypeNodeComponent.Builder> builderProvider) {
    instance.createComponent(builderProvider.get());
  }
}
