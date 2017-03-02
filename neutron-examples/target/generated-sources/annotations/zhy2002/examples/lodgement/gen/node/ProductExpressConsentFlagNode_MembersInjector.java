package zhy2002.examples.lodgement.gen.node;

import dagger.MembersInjector;
import javax.annotation.Generated;
import javax.inject.Provider;
import zhy2002.examples.lodgement.gen.di.ProductExpressConsentFlagNodeComponent;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class ProductExpressConsentFlagNode_MembersInjector
    implements MembersInjector<ProductExpressConsentFlagNode> {
  private final Provider<ProductExpressConsentFlagNodeComponent.Builder> builderProvider;

  public ProductExpressConsentFlagNode_MembersInjector(
      Provider<ProductExpressConsentFlagNodeComponent.Builder> builderProvider) {
    assert builderProvider != null;
    this.builderProvider = builderProvider;
  }

  public static MembersInjector<ProductExpressConsentFlagNode> create(
      Provider<ProductExpressConsentFlagNodeComponent.Builder> builderProvider) {
    return new ProductExpressConsentFlagNode_MembersInjector(builderProvider);
  }

  @Override
  public void injectMembers(ProductExpressConsentFlagNode instance) {
    if (instance == null) {
      throw new NullPointerException("Cannot inject members into a null reference");
    }
    instance.createComponent(builderProvider.get());
  }

  public static void injectCreateComponent(
      ProductExpressConsentFlagNode instance,
      Provider<ProductExpressConsentFlagNodeComponent.Builder> builderProvider) {
    instance.createComponent(builderProvider.get());
  }
}
