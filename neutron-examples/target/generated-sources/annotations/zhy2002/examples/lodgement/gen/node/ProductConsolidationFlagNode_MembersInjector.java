package zhy2002.examples.lodgement.gen.node;

import dagger.MembersInjector;
import javax.annotation.Generated;
import javax.inject.Provider;
import zhy2002.examples.lodgement.gen.di.ProductConsolidationFlagNodeComponent;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class ProductConsolidationFlagNode_MembersInjector
    implements MembersInjector<ProductConsolidationFlagNode> {
  private final Provider<ProductConsolidationFlagNodeComponent.Builder> builderProvider;

  public ProductConsolidationFlagNode_MembersInjector(
      Provider<ProductConsolidationFlagNodeComponent.Builder> builderProvider) {
    assert builderProvider != null;
    this.builderProvider = builderProvider;
  }

  public static MembersInjector<ProductConsolidationFlagNode> create(
      Provider<ProductConsolidationFlagNodeComponent.Builder> builderProvider) {
    return new ProductConsolidationFlagNode_MembersInjector(builderProvider);
  }

  @Override
  public void injectMembers(ProductConsolidationFlagNode instance) {
    if (instance == null) {
      throw new NullPointerException("Cannot inject members into a null reference");
    }
    instance.createComponent(builderProvider.get());
  }

  public static void injectCreateComponent(
      ProductConsolidationFlagNode instance,
      Provider<ProductConsolidationFlagNodeComponent.Builder> builderProvider) {
    instance.createComponent(builderProvider.get());
  }
}
