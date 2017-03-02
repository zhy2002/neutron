package zhy2002.examples.lodgement.gen.node;

import dagger.MembersInjector;
import javax.annotation.Generated;
import javax.inject.Provider;
import zhy2002.examples.lodgement.gen.di.ProductPaymentTypeNodeComponent;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class ProductPaymentTypeNode_MembersInjector
    implements MembersInjector<ProductPaymentTypeNode> {
  private final Provider<ProductPaymentTypeNodeComponent.Builder> builderProvider;

  public ProductPaymentTypeNode_MembersInjector(
      Provider<ProductPaymentTypeNodeComponent.Builder> builderProvider) {
    assert builderProvider != null;
    this.builderProvider = builderProvider;
  }

  public static MembersInjector<ProductPaymentTypeNode> create(
      Provider<ProductPaymentTypeNodeComponent.Builder> builderProvider) {
    return new ProductPaymentTypeNode_MembersInjector(builderProvider);
  }

  @Override
  public void injectMembers(ProductPaymentTypeNode instance) {
    if (instance == null) {
      throw new NullPointerException("Cannot inject members into a null reference");
    }
    instance.createComponent(builderProvider.get());
  }

  public static void injectCreateComponent(
      ProductPaymentTypeNode instance,
      Provider<ProductPaymentTypeNodeComponent.Builder> builderProvider) {
    instance.createComponent(builderProvider.get());
  }
}
