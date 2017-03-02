package zhy2002.examples.lodgement.gen.node;

import dagger.MembersInjector;
import javax.annotation.Generated;
import javax.inject.Provider;
import zhy2002.examples.lodgement.gen.di.ProductDissatisfactionFlagNodeComponent;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class ProductDissatisfactionFlagNode_MembersInjector
    implements MembersInjector<ProductDissatisfactionFlagNode> {
  private final Provider<ProductDissatisfactionFlagNodeComponent.Builder> builderProvider;

  public ProductDissatisfactionFlagNode_MembersInjector(
      Provider<ProductDissatisfactionFlagNodeComponent.Builder> builderProvider) {
    assert builderProvider != null;
    this.builderProvider = builderProvider;
  }

  public static MembersInjector<ProductDissatisfactionFlagNode> create(
      Provider<ProductDissatisfactionFlagNodeComponent.Builder> builderProvider) {
    return new ProductDissatisfactionFlagNode_MembersInjector(builderProvider);
  }

  @Override
  public void injectMembers(ProductDissatisfactionFlagNode instance) {
    if (instance == null) {
      throw new NullPointerException("Cannot inject members into a null reference");
    }
    instance.createComponent(builderProvider.get());
  }

  public static void injectCreateComponent(
      ProductDissatisfactionFlagNode instance,
      Provider<ProductDissatisfactionFlagNodeComponent.Builder> builderProvider) {
    instance.createComponent(builderProvider.get());
  }
}
