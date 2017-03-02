package zhy2002.examples.lodgement.gen.node;

import dagger.MembersInjector;
import javax.annotation.Generated;
import javax.inject.Provider;
import zhy2002.examples.lodgement.gen.di.ProductCreditCardFlagNodeComponent;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class ProductCreditCardFlagNode_MembersInjector
    implements MembersInjector<ProductCreditCardFlagNode> {
  private final Provider<ProductCreditCardFlagNodeComponent.Builder> builderProvider;

  public ProductCreditCardFlagNode_MembersInjector(
      Provider<ProductCreditCardFlagNodeComponent.Builder> builderProvider) {
    assert builderProvider != null;
    this.builderProvider = builderProvider;
  }

  public static MembersInjector<ProductCreditCardFlagNode> create(
      Provider<ProductCreditCardFlagNodeComponent.Builder> builderProvider) {
    return new ProductCreditCardFlagNode_MembersInjector(builderProvider);
  }

  @Override
  public void injectMembers(ProductCreditCardFlagNode instance) {
    if (instance == null) {
      throw new NullPointerException("Cannot inject members into a null reference");
    }
    instance.createComponent(builderProvider.get());
  }

  public static void injectCreateComponent(
      ProductCreditCardFlagNode instance,
      Provider<ProductCreditCardFlagNodeComponent.Builder> builderProvider) {
    instance.createComponent(builderProvider.get());
  }
}
