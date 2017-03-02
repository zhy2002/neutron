package zhy2002.examples.lodgement.gen.node;

import dagger.MembersInjector;
import javax.annotation.Generated;
import javax.inject.Provider;
import zhy2002.examples.lodgement.gen.di.ProductCreditCardTypeNodeComponent;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class ProductCreditCardTypeNode_MembersInjector
    implements MembersInjector<ProductCreditCardTypeNode> {
  private final Provider<ProductCreditCardTypeNodeComponent.Builder> builderProvider;

  public ProductCreditCardTypeNode_MembersInjector(
      Provider<ProductCreditCardTypeNodeComponent.Builder> builderProvider) {
    assert builderProvider != null;
    this.builderProvider = builderProvider;
  }

  public static MembersInjector<ProductCreditCardTypeNode> create(
      Provider<ProductCreditCardTypeNodeComponent.Builder> builderProvider) {
    return new ProductCreditCardTypeNode_MembersInjector(builderProvider);
  }

  @Override
  public void injectMembers(ProductCreditCardTypeNode instance) {
    if (instance == null) {
      throw new NullPointerException("Cannot inject members into a null reference");
    }
    instance.createComponent(builderProvider.get());
  }

  public static void injectCreateComponent(
      ProductCreditCardTypeNode instance,
      Provider<ProductCreditCardTypeNodeComponent.Builder> builderProvider) {
    instance.createComponent(builderProvider.get());
  }
}
