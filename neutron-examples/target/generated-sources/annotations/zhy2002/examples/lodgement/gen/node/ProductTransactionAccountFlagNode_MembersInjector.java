package zhy2002.examples.lodgement.gen.node;

import dagger.MembersInjector;
import javax.annotation.Generated;
import javax.inject.Provider;
import zhy2002.examples.lodgement.gen.di.ProductTransactionAccountFlagNodeComponent;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class ProductTransactionAccountFlagNode_MembersInjector
    implements MembersInjector<ProductTransactionAccountFlagNode> {
  private final Provider<ProductTransactionAccountFlagNodeComponent.Builder> builderProvider;

  public ProductTransactionAccountFlagNode_MembersInjector(
      Provider<ProductTransactionAccountFlagNodeComponent.Builder> builderProvider) {
    assert builderProvider != null;
    this.builderProvider = builderProvider;
  }

  public static MembersInjector<ProductTransactionAccountFlagNode> create(
      Provider<ProductTransactionAccountFlagNodeComponent.Builder> builderProvider) {
    return new ProductTransactionAccountFlagNode_MembersInjector(builderProvider);
  }

  @Override
  public void injectMembers(ProductTransactionAccountFlagNode instance) {
    if (instance == null) {
      throw new NullPointerException("Cannot inject members into a null reference");
    }
    instance.createComponent(builderProvider.get());
  }

  public static void injectCreateComponent(
      ProductTransactionAccountFlagNode instance,
      Provider<ProductTransactionAccountFlagNodeComponent.Builder> builderProvider) {
    instance.createComponent(builderProvider.get());
  }
}
