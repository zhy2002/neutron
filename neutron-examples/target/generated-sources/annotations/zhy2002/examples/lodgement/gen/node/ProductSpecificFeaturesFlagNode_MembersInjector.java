package zhy2002.examples.lodgement.gen.node;

import dagger.MembersInjector;
import javax.annotation.Generated;
import javax.inject.Provider;
import zhy2002.examples.lodgement.gen.di.ProductSpecificFeaturesFlagNodeComponent;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class ProductSpecificFeaturesFlagNode_MembersInjector
    implements MembersInjector<ProductSpecificFeaturesFlagNode> {
  private final Provider<ProductSpecificFeaturesFlagNodeComponent.Builder> builderProvider;

  public ProductSpecificFeaturesFlagNode_MembersInjector(
      Provider<ProductSpecificFeaturesFlagNodeComponent.Builder> builderProvider) {
    assert builderProvider != null;
    this.builderProvider = builderProvider;
  }

  public static MembersInjector<ProductSpecificFeaturesFlagNode> create(
      Provider<ProductSpecificFeaturesFlagNodeComponent.Builder> builderProvider) {
    return new ProductSpecificFeaturesFlagNode_MembersInjector(builderProvider);
  }

  @Override
  public void injectMembers(ProductSpecificFeaturesFlagNode instance) {
    if (instance == null) {
      throw new NullPointerException("Cannot inject members into a null reference");
    }
    instance.createComponent(builderProvider.get());
  }

  public static void injectCreateComponent(
      ProductSpecificFeaturesFlagNode instance,
      Provider<ProductSpecificFeaturesFlagNodeComponent.Builder> builderProvider) {
    instance.createComponent(builderProvider.get());
  }
}
