package zhy2002.examples.lodgement.gen.node;

import dagger.MembersInjector;
import javax.annotation.Generated;
import javax.inject.Provider;
import zhy2002.examples.lodgement.gen.di.ProductTotalLvrLmiNodeComponent;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class ProductTotalLvrLmiNode_MembersInjector
    implements MembersInjector<ProductTotalLvrLmiNode> {
  private final Provider<ProductTotalLvrLmiNodeComponent.Builder> builderProvider;

  public ProductTotalLvrLmiNode_MembersInjector(
      Provider<ProductTotalLvrLmiNodeComponent.Builder> builderProvider) {
    assert builderProvider != null;
    this.builderProvider = builderProvider;
  }

  public static MembersInjector<ProductTotalLvrLmiNode> create(
      Provider<ProductTotalLvrLmiNodeComponent.Builder> builderProvider) {
    return new ProductTotalLvrLmiNode_MembersInjector(builderProvider);
  }

  @Override
  public void injectMembers(ProductTotalLvrLmiNode instance) {
    if (instance == null) {
      throw new NullPointerException("Cannot inject members into a null reference");
    }
    instance.createComponent(builderProvider.get());
  }

  public static void injectCreateComponent(
      ProductTotalLvrLmiNode instance,
      Provider<ProductTotalLvrLmiNodeComponent.Builder> builderProvider) {
    instance.createComponent(builderProvider.get());
  }
}
