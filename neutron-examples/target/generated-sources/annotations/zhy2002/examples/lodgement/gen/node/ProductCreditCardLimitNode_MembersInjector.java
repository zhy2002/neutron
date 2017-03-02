package zhy2002.examples.lodgement.gen.node;

import dagger.MembersInjector;
import javax.annotation.Generated;
import javax.inject.Provider;
import zhy2002.examples.lodgement.gen.di.ProductCreditCardLimitNodeComponent;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class ProductCreditCardLimitNode_MembersInjector
    implements MembersInjector<ProductCreditCardLimitNode> {
  private final Provider<ProductCreditCardLimitNodeComponent.Builder> builderProvider;

  public ProductCreditCardLimitNode_MembersInjector(
      Provider<ProductCreditCardLimitNodeComponent.Builder> builderProvider) {
    assert builderProvider != null;
    this.builderProvider = builderProvider;
  }

  public static MembersInjector<ProductCreditCardLimitNode> create(
      Provider<ProductCreditCardLimitNodeComponent.Builder> builderProvider) {
    return new ProductCreditCardLimitNode_MembersInjector(builderProvider);
  }

  @Override
  public void injectMembers(ProductCreditCardLimitNode instance) {
    if (instance == null) {
      throw new NullPointerException("Cannot inject members into a null reference");
    }
    instance.createComponent(builderProvider.get());
  }

  public static void injectCreateComponent(
      ProductCreditCardLimitNode instance,
      Provider<ProductCreditCardLimitNodeComponent.Builder> builderProvider) {
    instance.createComponent(builderProvider.get());
  }
}
